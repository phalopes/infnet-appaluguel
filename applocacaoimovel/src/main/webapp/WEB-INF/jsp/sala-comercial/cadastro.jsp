<%@ page language="java" contentType="text/html; ISO-8859-1" pageEncoding="ISO-8859-1" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!doctype html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
    <title>Locação Imóvel - Cadastro Sala Comercial</title>
</head>
<body>

<c:import url="/WEB-INF/jsp/menu.jsp"/>

<div class="container">
    <h2>Cadastro Sala Comercial:</h2>
    <form action="/sala-comercial/incluir" method="post">
        <div class="form-group">
            <label for="endereco">Endereço:</label>
            <input type="text" class="form-control" id="endereco" placeholder="Entre com seu endereço" name="endereco">
        </div>
        <div class="form-group">
            <label for="valor">Valor:</label>
            <input type="text" class="form-control" id="valor" placeholder="Entre com o valor" name="valor">
        </div>
        <div class="form-group">
            <label for="metragem">Metragem:</label>
            <input type="text" class="form-control" id="metragem" placeholder="Entre com a metragem" name="metragem">
        </div>
        <div class="form-group">
            <label for="acessivel">Acessível:</label>
            <input type="checkbox" class="form-control" id="acessivel" name="acessivel">
        </div>
        <div class="form-group">
            <label for="codigo">Código do Imóvel:</label>
            <input type="text" class="form-control" id="codigo" placeholder="Entre com o código" name="codigo">
        </div>
        <div class="form-group">
            <label for="elevadores">Elevadores:</label>
            <input type="number" class="form-control" id="elevadores" placeholder="Entre com o número de elevadores" name="elevadores">
        </div>
        <div class="form-group">
            <label for="recepcao">Recepção:</label>
            <input type="checkbox" class="form-control" id="recepcao" name="recepcao">
        </div>
        <div class="form-group">
            <label for="condominio">Valor Condomínio:</label>
            <input type="text" class="form-control" id="condominio" placeholder="Entre com o valor do Condomínio" name="condominio">
        </div>
        <button type="submit" class="btn btn-default">Cadastrar</button>
    </form>
</div>

</body>
</html>