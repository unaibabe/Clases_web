<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="catalogo.Catalogo" %>
<%
String rutaReal = application.getRealPath("/WEB-INF/catalogoCursos.csv");
Catalogo catalogo = new Catalogo(rutaReal);
%>
<%= catalogo.toString() %>