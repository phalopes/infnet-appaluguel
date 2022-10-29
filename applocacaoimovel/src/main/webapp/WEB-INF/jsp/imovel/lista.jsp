<%@ page language="java" contentType="text/html; ISO-8859-1" pageEncoding="ISO-8859-1" %>

<!doctype html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/css/bootstrap.min.css" rel="stylesheet">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/js/bootstrap.bundle.min.js"></script>
    <title>Locação Imóvel - Cadastramento de Imóveis</title>
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
                    <a class="nav-link" href="/cliente/lista">Cliente</a>
                </li>

                <%-- TODO: Escolher tipo de menu de acordo com as funcionalidades necessárias --%>
                <li class="nav-item">
                    <a class="nav-link active" href="/imovel/lista">Imóvel</a>
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
<%--                <li class="nav-item dropdown">--%>
<%--                    <a class="nav-link dropdown-toggle" href="/imovel/lista" role="button" data-bs-toggle="dropdown">Imóvel</a>--%>
<%--                    <ul class="dropdown-menu">--%>
<%--                        <li><a class="dropdown-item" href="/sala-comercial/lista">Sala Comercial</a></li>--%>
<%--                        <li><a class="dropdown-item" href="/studio/lista">Studio</a></li>--%>
<%--                        <li><a class="dropdown-item" href="/casa/lista">Casa</a></li>--%>
<%--                    </ul>--%>
<%--                </li>--%>
            </ul>
        </div>
    </div>
</nav>
<div class="container mt-3">
    <h3>Imóveis</h3>
</div>
</body>
</html>