<%@ page language = "java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="whatsapp.*" %>
<!DOCTYPE html>
<html lang="es">
  <head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <meta name="author" content="UNAI" />
    <title>Analizador de Chat WhatsApp</title>
    <style>
      /* --- Estilos Generales --- */
      body {
        font-family: -apple-system, BlinkMacSystemFont, "Segoe UI", Roboto, Helvetica, Arial, sans-serif;
        background-color: #efeae2; /* Fondo clásico de WhatsApp */
        margin: 0;
        padding: 0;
        display: flex;
        flex-direction: column;
        align-items: center;
      }

      /* --- Cabecera Fija --- */
      header {
        background-color: #008069; /* Verde WhatsApp */
        color: white;
        width: 100%;
        padding: 15px 0;
        text-align: center;
        box-shadow: 0 2px 4px rgba(0,0,0,0.1);
        position: sticky;
        top: 0;
        z-index: 100;
      }

      header h1 {
        margin: 0;
        font-size: 1.4rem;
        font-weight: 500;
      }

      /* --- Panel de Métricas --- */
      .dashboard {
        width: 100%;
        max-width: 600px;
        padding: 20px 20px 0 20px;
        box-sizing: border-box;
      }

      .dashboard-title {
        font-size: 1.1rem;
        color: #111b21;
        margin-bottom: 12px;
        font-weight: 600;
      }

      .metrics-grid {
        display: grid;
        grid-template-columns: repeat(3, 1fr);
        gap: 12px;
        margin-bottom: 15px;
      }

      .metric-card {
        background-color: white;
        padding: 15px;
        border-radius: 10px;
        box-shadow: 0 1px 3px rgba(0,0,0,0.1);
        border-left: 5px solid #008069; /* Detalle verde al lado */
      }

      .metric-label {
        font-size: 0.8rem;
        color: #667781;
        text-transform: uppercase;
        letter-spacing: 0.5px;
        margin-bottom: 4px;
      }

      .metric-value {
        font-size: 1.3rem;
        font-weight: bold;
        color: #111b21;
      }

      /* --- Lista de Usuarios Modernos --- */
      .users-list {
        display: flex;
        flex-wrap: wrap;
        gap: 8px;
        margin-top: 8px;
      }

      .user-badge {
        background-color: #34b7f1; /* Azul WhatsApp */
        color: white;
        padding: 6px 12px;
        border-radius: 20px;
        font-size: 0.85rem;
        font-weight: bold;
        box-shadow: 0 1px 2px rgba(0,0,0,0.15);
      }

      /* --- Separador de Secciones --- */
      .section-divider {
        width: 100%;
        max-width: 560px;
        border: 0;
        border-radius:8px;
        height: 5px;
        background: #ccc6bd;
        margin: 25px 0 20px 0;
      }

      /* --- Contenedor del Chat --- */
      .chat-container {
        width: 100%;
        max-width: 600px;
        padding: 0 20px 40px 20px;
        box-sizing: border-box;
        display: flex;
        flex-direction: column;
        gap: 12px;
      }

      /* --- Burbujas de Mensaje --- */
      .chat {
        background-color: white;
        padding: 8px 14px;
        border-radius: 8px;
        box-shadow: 0 1px 0.5px rgba(0,0,0,0.13);
        max-width: 85%;
        width: fit-content;
        position: relative;
        display: flex;
        flex-direction: column;
      }

      /* --- Nombre de Usuario --- */
      .chat-user {
        font-weight: bold;
        font-size: 0.85rem;
        color: #e53935; 
        margin-bottom: 4px;
      }

      /* --- Texto del Mensaje --- */
      .chat-message {
        font-size: 0.95rem;
        color: #111b21;
        line-height: 1.4;
        word-break: break-word;
      }

      /* --- Fecha y Hora --- */
      .chat-meta {
        font-size: 0.70rem;
        color: #667781;
        align-self: flex-end;
        margin-top: 12px;
      }
    </style>
  </head>
  <body>

    <header>
      <h1>WhatsApp Chat Analyzer</h1>
    </header>

    <% Chat chat = new Chat("C:\\xampp\\tomcat\\webapps\\ROOT\\chat.txt"); %>

    <!-- SECCIÓN DE MÉTRICAS -->
    <div class="dashboard">
      <div class="dashboard-title">Estadísticas Globales</div>
      
      <div class="metrics-grid">
        <div class="metric-card">
          <div class="metric-label">Letras Totales</div>
          <div class="metric-value"><%= chat.getNumLetras() %></div>
        </div>
        
        <div class="metric-card">
          <div class="metric-label">Palabras Totales</div>
          <div class="metric-value"><%= chat.getNumPalabras() %></div>
        </div>

        <div class="metric-card">
          <div class="metric-label">Lineas Totales</div>
          <div class="metric-value"><%= chat.numLineas() %></div>
        </div>
      </div>

      <!-- LISTA AUTOMÁTICA DE PARTICIPANTES -->
      <div class="dashboard-title" style="margin-top: 20px;">Participantes en el Chat</div>
      <div class="users-list">
        <% 
        String[] participantes = chat.getParticipantes();
        for (String usuario : participantes) { 
          if (usuario != null && !usuario.trim().isEmpty()) {
        %>
            <div class="user-badge">👤 <%= usuario %></div>
        <% 
          }
        } 
        %>
      </div>

    </div>

    <hr class="section-divider">

    <!-- SECCIÓN DEL CHAT -->
    <div class="chat-container">
      <% 
      out.println(chat);
      %>
    </div>
 
  </body>
</html>
