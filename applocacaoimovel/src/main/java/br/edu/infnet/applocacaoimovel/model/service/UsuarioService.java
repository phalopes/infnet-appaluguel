package br.edu.infnet.applocacaoimovel.model.service;

import br.edu.infnet.applocacaoimovel.clients.IEnderecoClient;
import br.edu.infnet.applocacaoimovel.model.domain.Endereco;
import br.edu.infnet.applocacaoimovel.model.domain.Usuario;
import br.edu.infnet.applocacaoimovel.model.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Collection;

@Service
public class UsuarioService {
    @Autowired
    private UsuarioRepository usuarioRepository;
    @Autowired
    private IEnderecoClient enderecoClient;

    public void incluir(Usuario usuario){
        usuarioRepository.save(usuario);
    }

    public Collection<Usuario> obterLista(){
        return (Collection<Usuario>) usuarioRepository.findAll();
    }

    public void excluir(Integer id) {
        usuarioRepository.deleteById(id);
    }

    public Usuario validar(String email, String senha){
        Usuario usuario = usuarioRepository.findByEmail(email);

        if(usuario == null || !senha.equals(usuario.getSenha())){
            return null;
        }

        return usuario;
    }

    public Endereco obterCep(String cep){
        return enderecoClient.buscarCep(cep);
    }
}
