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
    <title>Loca��o Im�vel - Requisi��es de Aluguel</title>
</head>
<body>

<c:import url="/WEB-INF/jsp/menu.jsp"/>

<div class="container mt-3">
    <h3>Alugu�is: ${listagem.size()}</h3>
    <h4><a href="/aluguel">+ Cadastrar Aluguel</a></h4>
    <c:choose>
        <c:when test="${listagem.size() == 0}">
            <p>Ainda n�o h� Alugu�is solicitados no sistema.</p>
        </c:when>
        <c:otherwise>
            <p>Abaixo seguem as solicita��es de Alugu�is efetuadas pelos clientes:</p>
        </c:otherwise>
    </c:choose>

    <table class="table table-striped">
        <thead>
        <tr>
            <th>ID</th>
            <th>Cliente</th>
            <th>Im�veis Inclusos na Proposta</th>
            <th>Per�odo</th>
            <th>Data In�cio</th>
            <th>Data Requisi��o</th>
            <th>Solicita��o via Web</th>
            <th></th>
        </tr>
        </thead>
        <tbody>
        <c:forEach var="item" items="${listagem}">
            <tr>
                <td>${item.id}</td>
                <td>${item.cliente.nome}</td>
                <td>| <c:forEach var="imovel" items="${item.imoveis}">${imovel.codigo} | </c:forEach></td>
                <td>${item.periodo}</td>
                <td>${item.dataInicio}</td>
                <td>${item.dataRequisicao}</td>
                <td><c:choose><c:when test="${item.web}">Sim</c:when><c:otherwise>N�o</c:otherwise></c:choose></td>
                <td><a href="/aluguel/${item.id}/excluir" class="btn btn-danger">Excluir</a></td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</div>
</body>
</html>