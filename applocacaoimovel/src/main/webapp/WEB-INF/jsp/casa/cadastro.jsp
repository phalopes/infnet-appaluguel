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
    <title>Locação Imóvel - Cadastro Casa</title>
</head>
<body>

<c:import url="/WEB-INF/jsp/menu.jsp"/>

<div class="container">
    <h2>Cadastro Casa:</h2>
    <form action="/casa/incluir" method="post">
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
            <label for="quintal">Quintal:</label>
            <input type="checkbox" class="form-control" id="quintal" name="quintal">
        </div>
        <div class="form-group">
            <label for="quartos">Quartos:</label>
            <input type="number" class="form-control" id="quartos" placeholder="Entre com o número de quartos" name="quartos">
        </div>
        <div class="form-group">
            <label for="cor">Cor da casa:</label>
            <input type="text" class="form-control" id="cor" placeholder="Entre com a cor da casa" name="cor">
        </div>
        <button type="submit" class="btn btn-default">Cadastrar</button>
    </form>
</div>

</body>
</html>