<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<nav class="navbar navbar-inverse">
    <div class="container-fluid">
        <div class="navbar-header">
            <a class="navbar-brand" href="/">AppAluguel</a>
        </div>
            <ul class="nav navbar-nav">
                <li class="nav-item">
                    <a class="nav-link" href="/">Home</a>
                </li>
                <c:if test="${not empty user}">
                    <li class="nav-item">
                        <a class="nav-link" href="/usuario/lista">Usu&aacute;rio</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="/aluguel/lista">Aluguel</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="/cliente/lista">Cliente</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="/imovel/lista">Im&oacute;vel</a>
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
                </c:if>
            </ul>
        <ul class="nav navbar-nav navbar-right">
            <c:if test="${not empty user}">
                <li><a href="/logout"><span class="glyphicon glyphicon-log-out"></span> Logout ${user.nome}</a></li>
            </c:if>
            <c:if test="${empty user}">
                <li><a href="/usuario/cadastro"><span class="glyphicon glyphicon-user"></span> Sign Up</a></li>
                <li><a href="/login"><span class="glyphicon glyphicon-log-in"></span> Login</a></li>
            </c:if>
        </ul>
    </div>
</nav>