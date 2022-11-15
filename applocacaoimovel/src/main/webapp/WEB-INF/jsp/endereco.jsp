<%@ page language="java" contentType="text/html; ISO-8859-1" pageEncoding="ISO-8859-1" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<div class="form-group">
    <label for="endereco.cep">CEP:</label>
    <input type="text" class="form-control" id="endereco.cep" value="${endereco.cep}" placeholder="Entre com seu CEP" name="endereco.cep">
</div>
<div class="form-group">
    <label for="endereco.logradouro">Logradouro:</label>
    <input type="text" class="form-control" id="endereco.logradouro" value="${endereco.logradouro}" placeholder="Entre com seu Logradouro" name="endereco.logradouro">
</div>
<div class="form-group">
    <label for="endereco.complemento">Complemento:</label>
    <input type="text" class="form-control" id="endereco.complemento" value="${endereco.complemento}" placeholder="Entre com seu Complemento" name="endereco.complemento">
</div>
<div class="form-group">
    <label for="endereco.bairro">Bairro:</label>
    <input type="text" class="form-control" id="endereco.bairro" value="${endereco.bairro}" placeholder="Entre com seu Bairro" name="endereco.bairro">
</div>
<div class="form-group">
    <label for="endereco.localidade">Localidade:</label>
    <input type="text" class="form-control" id="endereco.localidade" value="${endereco.localidade}" placeholder="Entre com sua Localidade" name="endereco.localidade">
</div>
<div class="form-group">
    <label for="endereco.uf">UF:</label>
    <input type="text" class="form-control" id="endereco.uf" value="${endereco.uf}" placeholder="Entre com seu UF" name="endereco.uf">
</div>