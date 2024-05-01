<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="constants.ForwardConst" %>

<c:set var="action" value="${ForwardConst.ACT_REP.getValue()}" />
<c:set var="commIdx" value="${ForwardConst.CMD_INDEX.getValue()}" />
<c:set var="commCrt" value="${ForwardConst.CMD_CREATE.getValue()}" />
<c:set var="commGood" value="${ForwardConst.CMD_GOOD.getValue()}" />
<c:set var="commGood_Del" value="${ForwardConst.CMD_GOOD_DEL.getValue()}" />

<c:import url="/WEB-INF/views/layout/app.jsp">
    <c:param name="content">
        <c:if test="${good}">
            <div id="good">
            <c:out value="${flush}"></c:out>
            </div>
        </c:if>
        <c:if test="${good_deleted}">
            <div id="good_delete">
            <c:out value="${flush}"></c:out>
            </div>
        </c:if>



        <p><a href="<c:url value='?action=${action}&command=${commIdx}' />">一覧に戻る</a></p>
    </c:param>
</c:import>