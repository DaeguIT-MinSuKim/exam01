<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
    String pp = request.getParameter("pp");
    if (pp == null) {
        pp = "join";
    }
%>
<jsp:include page="top.jsp"></jsp:include>
<jsp:include page="nav.jsp"></jsp:include>
<jsp:include page='<%=pp + ".jsp"%>'></jsp:include>
<jsp:include page="footer.jsp"></jsp:include>