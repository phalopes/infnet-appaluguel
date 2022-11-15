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
    <title>Locação Imóvel - Cadastro Aluguel</title>
</head>
<body>

<c:import url="/WEB-INF/jsp/menu.jsp"/>

<div class="container">
    <h2>Cadastro Aluguel:</h2>
    <form action="/aluguel/incluir" method="post">
        <div class="form-group">
            <label>Período (em meses):</label>
            <input type="number" class="form-control" name="periodo">
        </div>
        <div class="form-group">
            <label>Data Início:</label>
            <input type="date" class="form-control" name="dataInicio">
        </div>
        <div class="form-group">
            <label>Data Requisição:</label>
            <input type="datetime-local" class="form-control" name="dataRequisicao">
        </div>
        <div class="form-group">
            <label>Solicitação:</label>
            <div class="form-check">
                <input type="radio" class="form-check-input" name="web" value="true"> Web
                <label class="form-check-label"></label>
            </div>
            <div class="form-check">
                <input type="radio" class="form-check-input" name="web" value="false"> Corretor
                <label class="form-check-label"></label>
            </div>
        </div>

        <div class="form-group">
            <label>Cliente:</label>
            <select name="cliente" class="form-control">
                <c:forEach var="c" items="${clientes}">
                    <option value="${c.id}">${c.nome}</option>
                </c:forEach>
            </select>
        </div>

        <div class="form-group">
            <label>Imóveis:</label>
            <c:forEach var="i" items="${imoveis}">
                <div class="form-check">
                    <input class="form-check-input" type="checkbox" name="imoveis" value="${i.id}">
                    <label class="form-check-label"> ${i.codigo} - ${i.endereco}</label>
                </div>
            </c:forEach>
        </div>

        <button type="submit" class="btn btn-default">Cadastrar</button>
    </form>
</div>

</body>
</html>