<%@page contentType="text/html" pageEncoding="UTF-8" %>
<%@taglib prefix="t" tagdir="/WEB-INF/tags" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<t:genericpage>

    <jsp:attribute name="header">
         Forside
    </jsp:attribute>

    <jsp:attribute name="footer">
        <c:set var="addHomeLink" value="${false}" scope="request"/>
    </jsp:attribute>

    <jsp:body>
        <head>
            <style>
                * {
                    box-sizing: border-box;
                }

                .column {
                    float: left;
                    width: 33%;
                    padding: 5px;
                }

                /* Clearfix (clear floats) */
                .row::after {
                    content: "";
                    clear: both;
                    display: table;
                }

                #example1 {
                    background: url() right bottom no-repeat, url(paper.gif) left top repeat;
                    padding: 15px;
                }
            </style>
        </head>

        <div>
            <h2>KomputerKomputer</h2>
            <p><b>Vi laver komputere</b></p>

            <div class="row">
                <div class="column">
                    <img style="width: 100%" src="<c:url value="/images/KomputerKomputer.png"/>" alt="logo">
                    <p><b>Tryk videre rundt på siderne og se om jeg kan hjælpe dig med din komputer:</b>
                    <p style="color: blue"><b>Diagnostisering
                    <p style="color: green"></b><b>100,-</b></p></p></b></p> </b></p>

                </div>

                <div class="column">

                    <img src="<c:url value="/images/Komputer.jpg"/>" alt="logo">

                </div>

                <div class="column">

                    <img style="width: 100%;" src="<c:url value="/images/Forsidebilled.jpg"/>" alt="Komputer">

                </div>
            </div>

                <%--            <div style="margin-top: 3em;margin-bottom: 3em; display: block; margin-left: auto; margin-right: auto; width: 33%;">--%>
                <%--                <img src="<c:url value="/images/Alexinc.png"/>" alt="logo">--%>
                <%--            </div>--%>

                <%--                <img style="width: 800px;" src="<c:url value="/images/Forsidebilled.jpg"/>" alt="logo">--%>


            <c:if test="${sessionScope.role == 'employee' }">
            <p style="font-size: larger">This is what you can do,
                since your are logged in as an employee</p>
            <p><a href="fc/employeepage">Employee Page</a>
                </c:if>

                <c:if test="${sessionScope.role == 'customer' }">
            <p style="font-size: larger">This is what you can do, since your
                are logged in as a customer</p>
            <p><a href="fc/customerpage">Customer Page</a>
                </c:if>

        </div>
        </div>
    </jsp:body>
</t:genericpage>