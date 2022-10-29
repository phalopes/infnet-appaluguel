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
    <title>Locação Imóvel - Cadastramento de Clientes</title>
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
                    <a class="nav-link" href="/aluguel/lista">Aluguel</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link active" href="/cliente/lista">Cliente</a>
                </li>

                <%-- TODO: Escolher tipo de menu de acordo com as funcionalidades necessárias --%>
                <li class="nav-item">
                    <a class="nav-link" href="/imovel/lista">Imóvel</a>
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
    <h3>Clientes</h3>
    <p>Abaixo seguem os clientes cadastrados no Sistema:</p>
    <table class="table table-striped">
        <thead>
        <tr>
            <th>Nome</th>
            <th>CPF</th>
            <th>Telefone</th>
            <th></th>
        </tr>
        </thead>
        <tbody>
        <c:forEach var="item" items="${listagem}">
            <tr>
                <td>${item.nome}</td>
                <td>${item.cpf}</td>
                <td>${item.telefone}</td>
                <td></td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</div>
</body>
</html>