<%-- 
    Document   : calendrier
    Created on : 2019-10-24, 13:35:59
    Author     : dd
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
   
<!DOCTYPE html>

<div class="contentcalendar">
  <div class="calendar-container">
    <div class="calendar"> 
      <div class="year-header"> 
        <span class="left-button" id="prev"> &lang; </span> 
        <span class="year" id="label"></span> 
        <span class="right-button" id="next"> &rang; </span>
      </div> 
      <table class="months-table"> 
        <tbody>
          <tr class="months-row">
            <td class="month">Jan</td> 
            <td class="month">Fev</td> 
            <td class="month">Mar</td> 
            <td class="month">Avr</td> 
            <td class="month">Mai</td> 
            <td class="month">Jun</td> 
            <td class="month">Jul</td>
            <td class="month">Aou</td> 
            <td class="month">Sep</td> 
            <td class="month">Oct</td>          
            <td class="month">Nov</td>
            <td class="month">Dec</td>
          </tr>
        </tbody>
      </table> 

      <table class="days-table"> 
        <td class="day">Dim</td> 
        <td class="day">Lun</td> 
        <td class="day">Mar</td> 
        <td class="day">Mer</td> 
        <td class="day">Jeu</td> 
        <td class="day">Ven</td> 
        <td class="day">Sam</td>
      </table> 
      <div class="frame"> 
        <table class="dates-table"> 
            <tbody class="tbody">             
            </tbody> 
        </table>
      </div> 
    <c:if test="${sessionScope.connected != null && sessionScope.connected != false}">
      <button class="buttoncalendar" id="add-button">Ajout</button>
    </c:if>
    </div>
  </div>
  <div class="events-container">
  </div>
  
    
  <div class="dialog" id="dialog">
      <h2 class="dialog-header"> Ajouter événement</h2>
      <form class="form" id="form">
        <div class="form-container" align="center">
          <label class="form-label" id="valueFromMyButton" for="name">Nom de l'événement</label>
          <input class="input" type="text" id="name" maxlength="36">
          <label class="form-label" id="valueFromMyButton" for="count">Nombre de membres invités</label>
          <input class="input" type="number" id="count" min="0" max="1000000" maxlength="7">
          <input type="button" value="Cancel" class="buttoncalendar" id="cancel-button">
          <input type="button" value="OK" class="buttoncalendar" id="ok-button">
        </div>
      </form>
    </div>
  
</div>
