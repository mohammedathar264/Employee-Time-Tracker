<%@ page import="java.sql.*"%>
<html>
 <head>
  <script src='/employee-time-tracker/JS/script.js'></script>
  <link href='/employee-time-tracker/CSS/style.css' rel='stylesheet'>
  <link href='/employee-time-tracker/CSS/bootstrap.min.css' rel='stylesheet'>
 </head>
 <body bgcolor='cyan'>
   <hr style='border:2px solid green'>
    <nav class='navbar navbar-expand navbar-light bg-light'>
     <ul class='nav nav-pills mx-auto'>
      <li><a id="home" class='nav-link lau' href='/employee-time-tracker/home'>Home</a>
      <li><a id='add' class='nav-link lau' href='/employee-time-tracker/add'>Add employee</a>
      <li><a id='out' class='nav-link lau' href='/employee-time-tracker/out'>Time Out</a>
      <li><a id='in' class='nav-link lau' href='/employee-time-tracker/in'>Time In</a>
      <li><a id='datewise' class='nav-link lau' href='/employee-time-tracker/datewise/report'>Date wise report</a>
      <li><a id='empwise' class='nav-link lau' href=''>Employee wise report</a>
     </ul>
    </nav>
   <hr style='border:2px solid green'>
 </body>
</html>