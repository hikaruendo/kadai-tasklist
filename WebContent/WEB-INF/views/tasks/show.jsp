<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<c:import url="../layout/app.jsp">
    <c:param name = "content">
        <c:choose>
            <c:when test="${task != null}">

        <h2> id : detail of ${task.id}</h2>

        <table>
                    <tbody>

                        <tr>
                            <th>content</th>
                            <td><c:out value="${task.content}" /></td>
                        </tr>
                        <tr>
                            <th>create_time</th>
                            <td><fmt:formatDate value="${task.created_at}" pattern="yyyy-MM-dd HH:mm:ss" /></td>
                        </tr>
                        <tr>
                            <th>update_time</th>
                            <td><fmt:formatDate value="${task.updated_at}" pattern="yyyy-MM-dd HH:mm:ss" /></td>
                        </tr>

                    </tbody>
         </table>

        <p><a href="${pageContext.request.contextPath}/index">Back to List</a></p>
        <p><a href="${pageContext.request.contextPath}/edit?id=${task.id}">Edit Task</a></p>
        </c:when>
            <c:otherwise>
                <h2>Could't find that data.</h2>
            </c:otherwise>
        </c:choose>
    </c:param>
</c:import>
