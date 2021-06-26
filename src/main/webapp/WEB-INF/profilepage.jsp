<%--
  Created by IntelliJ IDEA.
  User: Alex
  Date: 26-06-2021
  Time: 11:52
  To change this template use File | Settings | File Templates.
--%>
<%@page contentType="text/html" pageEncoding="UTF-8" %>
<%@taglib prefix="t" tagdir="/WEB-INF/tags" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<t:genericpage>
    <jsp:attribute name="header">
         Profile page
    </jsp:attribute>
    <jsp:attribute name="footer">
    </jsp:attribute>

    <jsp:body>
        <h1>Hello ${sessionScope.user.name} </h1>

        <table class="table">
            <thead>
            <tr>
                <th scope="col">#</th>
                <th scope="col">Email</th>
                <th scope="col">Phone</th>
                <th scope="col">Street</th>
                <th scope="col">Town</th>
                <th scope="col">Zipcode</th>

            </tr>
            </thead>
            <tbody>
            <tr>
                <th scope="row">1</th>
                <td>${sessionScope.user.name}</td>
                <td>${sessionScope.user.phone}</td>
                <td>${sessionScope.user.street}</td>
                <td>${sessionScope.user.town}</td>
                <td>${sessionScope.user.zipCode}</td>
            </tr>
            </tbody>
        </table>

        <b>Here you can review your profile data</b>

    </jsp:body>

</t:genericpage>

