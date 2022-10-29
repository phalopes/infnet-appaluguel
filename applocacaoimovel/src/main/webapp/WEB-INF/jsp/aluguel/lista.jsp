<%@ page language="java" contentType="text/html; ISO-8859-1" pageEncoding="ISO-8859-1" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!doctype html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/css/bootstrap.min.css" rel="stylesheet">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/js/bootstrap.bundle.min.js"></script>
    <title>Loca��o Im�vel - Cadastramento de Alugu�is</title>
</head>
<body>
<nav class="navbar navbar-expand-sm bg-dark navbar-dark">
    <div class="container-fluid">
        <a class="navbar-brand" href="/">AppAluguel</a>
        <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#collapsibleNavbar">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="container-fluid">
            <ul class="navbar-nav">
                <li class="nav-item">
                    <a class="nav-link active" href="/aluguel/lista">Aluguel</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="/cliente/lista">Cliente</a>
                </li>

                <%-- TODO: Escolher tipo de menu de acordo com as funcionalidades necess�rias --%>
                <li class="nav-item">
                    <a class="nav-link" href="/imovel/lista">Im�vel</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="/sala-comercial/lista">Sala Comercial</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="/studio/lista">Studio</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="/casa/lista">Casa</a>
                </li>
            </ul>
        </div>
    </div>
</nav>
<div class="container mt-3">
    <h3>Alugu�is: ${listagem.size()}</h3>
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
                <td>${item.inicio}</td>
                <td><c:choose><c:when test="${item.web}">Sim</c:when><c:otherwise>N�o</c:otherwise></c:choose></td>
                <td><a href="/aluguel/${item.id}/excluir" class="btn btn-danger">Excluir</a></td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</div>
</body>
</html>