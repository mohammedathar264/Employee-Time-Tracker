<%@page import="java.time.LocalDate"%>
<%@ include file="../../navbar.jsp" %>
<html>
  <body onload="makeActive('datewise')">
  <div class='dvv'>
    <label class='lahu'>View date wise report</label>
  </div>
   <table class='ta'>
    <tr>
     <td class='pd'>
      <form action='report/current' method="post">
       <table class='cdta'>
        <tr>
         <td>Current date</td>
         <td align="right"><button class='cdbt'>GO</button></td>
        </tr>
       </table>
      </form>
     </td>
    </tr>
    <tr>
     <td class='pd'>
      <form action='report/any' method="post">
       <table class='cdta'>
        <tr>
         <td>Any date</td>
         <td><input type='date' class='tb' max="${cdate}" name='date' style='width:15vw' required></td>
         <td align="right"><button class='cdbt'>GO</button></td>
        </tr>
       </table>
      </form>
     </td>
    </tr>
    <tr>
     <td class='pd'>
      <form action="report/date-between" method="post">
       <table class='cdta'>
        <tr>
         <td>Date between&nbsp;&nbsp;&nbsp;&nbsp;</td>
         <td><input type='date' class='tb' id='date1' max="${cdate}" name="date1" style='width:15vw' required></td>
         <td><input type='date' class='tb' id='date2' max="${cdate}" name="date2" style='width:15vw' required></td>
         <td align="right"><button class='cdbt' onclick='return compareDate()'>GO</button></td>
        </tr>
       </table>
      </form>
     </td>
    </tr>
   </table>
 </body>
</html>