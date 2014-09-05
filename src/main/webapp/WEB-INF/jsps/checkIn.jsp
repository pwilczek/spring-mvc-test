<?xml version="1.0" encoding="UTF-8" ?>
<taglib xmlns="http://java.sun.com/xml/ns/javaee" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
    xsi:schemaLocation="http://java.sun.com/xml/ns/javaee http://java.sun.com/xml/ns/javaee/web-jsptaglibrary_2_1.xsd"
    version="2.1">

    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
    <%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

    <a href="?Lang=en">EN</a> || <a href="?Lang=pl">PL</a>

    <script type="text/javascript" src="jquery-1.11.1.js"></script>

    <script type="text/javascript">
        $( document ).ready(function(){
            $.ajax({
                url : 'http://localhost:8080/spring-mvc-test/availableRooms.json',
                success : function(data){
                    var html='<select>';
                    for(var i=0; i<data.length; i++){
                        var v=data[i].standard+' standard, '+data[i].beds+' bed(s)';
                        html+='<option value='+v+'>'+v+'</option>'
                    }
                    html+='</select>';
                    $('#availableRooms').html(html);
                    //window.alert(data);
                }
            })();
        });
    </script>

    <form:form commandName="guest">
        <table>
            <tr>
                <td><spring:message code="forName.text"/></td>
                <td><form:input path="name"/></td>
                <td><form:errors path="name"/></td>
                <td><div id='availableRooms'/></td>
                <td><input type="submit" value="Reserve"</td>
            </tr>
        </table>
    </form:form>

</taglib>