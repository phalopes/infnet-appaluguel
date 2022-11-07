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
    <title>Locação Imóvel - Studios</title>
</head>
<body>

<c:import url="/WEB-INF/jsp/menu.jsp"/>

<div class="container mt-3">
    <h3>Studios: ${listagem.size()}</h3>
    <h4><a href="/studio">+ Cadastrar Studio</a></h4>
    <c:choose>
        <c:when test="${listagem.size() == 0}">
            <p>Ainda não há Studios cadastrados no sistema.</p>
        </c:when>
        <c:otherwise>
            <p>Abaixo seguem os Studios disponíveis para Aluguel:</p>
        </c:otherwise>
    </c:choose>

    <table class="table table-striped">
        <thead>
        <tr>
            <th>ID</th>
            <th>Código</th>
            <th>Valor</th>
            <th>M<sup>2</sup></th>
            <th>Endereço</th>
            <th>Acessível</th>
            <th>Andar</th>
            <th>Possui Portaria</th>
            <th>Valor Condomínio</th>
            <th></th>
        </tr>
        </thead>
        <tbody>
        <c:forEach var="item" items="${listagem}">
            <tr>
                <td>${item.id}</td>
                <td>${item.codigo}</td>
                <td>${item.valor}</td>
                <td>${item.metragem}</td>
                <td>${item.endereco}</td>
                <td><c:choose><c:when test="${item.acessivel}">Sim</c:when><c:otherwise>Não</c:otherwise></c:choose></td>
                <td>${item.andar}</td>
                <td><c:choose><c:when test="${item.portaria}">Sim</c:when><c:otherwise>Não</c:otherwise></c:choose></td>
                <td>${item.condominio}</td>
                <td><a href="/studio/${item.id}/excluir" class="btn btn-danger">Excluir</a></td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</div>
</body>
</html>