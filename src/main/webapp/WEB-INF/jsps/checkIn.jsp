<?xml version="1.0" encoding="UTF-8" ?>
<taglib xmlns="http://java.sun.com/xml/ns/javaee" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
    xsi:schemaLocation="http://java.sun.com/xml/ns/javaee http://java.sun.com/xml/ns/javaee/web-jsptaglibrary_2_1.xsd"
    version="2.1">

    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

    <form:form commandName="guest">
        <table>
            <tr>
                <td><form:input path="name"/>
                <td><input type="submit" value="Reserve"</td>
            <tr>
        </table>
    </form:form>

</taglib>