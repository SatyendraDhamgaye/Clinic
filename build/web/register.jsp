<%-- 
    Document   : register
    Created on : 9 Jul, 2019, 6:22:06 PM
    Author     : LENOVO
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
    <title>clinic</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">



    <style type=text/css> .ddd { float: left; } .ddd{ padding : 1%; color: white; width: 70%; color: black; } .dddd { float: left; } .dddd{ padding : 1%; color: white; background-color: lightgrey; width: 30%; color: black; } </style> <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        </head>
    
    
    <body>
        <img src="DSC%20clinicnow.jpg" width="100%" height="30%">
    <nav class="navbar navbar-expand-lg navbar-light bg-dark">
  <!-- Navbar content -->
     
        <a class="navbar-brand" style="color: white" >Caring For Life</a>
  <button  class="navbar-toggler" style="color: white" type="button" data-toggle="collapse" data-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
    <span style="color: white" class="navbar-toggler-icon"></span>
  </button>
  <div class="collapse navbar-collapse" id="navbarNav">
    <ul class="navbar-nav">
      <li class="nav-item active">
        <a class="nav-link" href="index.jsp" style="color: white">Home <span class="sr-only">(current)</span></a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="about.jsp" style="color: white">About</a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="gallery.jsp" style="color: white">Gallery</a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="register.jsp" style="color: white">Register</a>
      </li>
        <li class="nav-item">
        <a class="nav-link" href="login.jsp" style="color: white">Login</a>
      </li>
        <li class="nav-item">
        <a class="nav-link" href="contact.jsp" style="color: white">Contact</a>
      </li>
    </ul>
  </div>

</nav>
    
   <div class="ddd"> 
         <h2>Registeration Form</h2> 
         
       <div class="col">
       
       </div>
         <form action="ClinicControler" method="get">
       <input type="hidden" name="action" value="insert">
  <div class="form-group">
    <label for="exampleInputEmail1">Name</label>
    <input type="name" name="name" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" placeholder="Enter name">
    
  </div>
        <div class="form-group">
    <label for="exampleInputEmail1">Email</label>
    <input type="email" name="email" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" placeholder="Enter email">
  
  </div> <div class="form-group">
    <label for="exampleInputEmail1">Mobile</label>
    <input type="name" name="mobile" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" placeholder="Enter Ph.No.">
   
  </div> <div class="form-group">
    <label for="exampleInputEmail1">Username</label>
    <input type="name" name="username" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" placeholder="Enter username">
    
  </div>
  <div class="form-group">
    <label for="exampleInputPassword1">Password</label>
    <input type="password" name="password" class="form-control" id="exampleInputPassword1" placeholder="Password">
  </div>
       <div class="form-group">
    <label for="exampleInputPassword1">Confirm Password</label>
    <input type="password" name="conpass" class="form-control" id="exampleInputPassword1" placeholder="Password1">
  </div>
  <div class="form-group form-check">
    <input type="checkbox" class="form-check-input" id="exampleCheck1">
    <label class="form-check-label" for="exampleCheck1"><a href="#">Terms</a> and <a href="#">Condition</a></label>
  </div>
       <input type="submit" value="Insert" name="action" class="btn btn-outline-success">
</form>
    </div>
    
 <div class="dddd"> 
         <h1>Latest Clinic News</h1> 
     <h5 style="color: green">22.05.2019</h5>
     <p><b>Doctor Appointment</b> When a patientbooks an appointment with the doctor can approve the appointment.</p>    <h5 style="color: green">20.05.2019</h5>
     <p><b>Appointment Booking</b> The doctor will always approve the request for the appointment ,until and unless he?she has a valid reason not to.</p>
<h5 style="color: green">21.05.2019</h5>
         <p><b>Doctor Schedule</b> Due to some reason, a patient who has made an appointment, cannot attend the doctor that day
      </p> 
      </div> 

    
    
    










    <script src=" https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
</body>
</html>
