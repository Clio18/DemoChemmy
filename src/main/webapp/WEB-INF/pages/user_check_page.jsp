<%@ taglib prefix="spring" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType = "text/html;charset = UTF-8" language = "java" %>
<html>
<head>
    <meta charset="UTF-8" />
        <meta name="viewport" content="width=device-width, initial-scale=1.0" />
        <title>Document</title>
    <!--  <link href="https://unpkg.com/bootstrap@4.3.1/dist/css/bootstrap.min.css" rel="stylesheet"/> -->
    <!-- -->
      <link href="${pageContext.request.contextPath}/resources/bootstrap/bootstrap.css" rel="stylesheet" >
      <link href="${pageContext.request.contextPath}/resources/style.css" rel="stylesheet" >
</head>

<body>

<div class="container bg-light">
  <nav class="navbar navbar-expand-lg navbar-light bg-light bg-light">
    <nav class="navbar navbar-light bg-light">
      <a class="navbar-brand" href="#">
        <img src="${pageContext.request.contextPath}/resources/img/logo2.jpg" class="d-inline-block align-center" alt="">
        <b>Chemmy</b>
      </a>
    </nav>
    <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>

    <div class="collapse navbar-collapse" id="navbarSupportedContent">
      <ul class="navbar-nav mr-auto">
        <li class="nav-item">
        <a href="https://pubchem.ncbi.nlm.nih.gov/" target="_blank">
         <img src="${pageContext.request.contextPath}/resources/img/pub.png" class="d-inline-block align-center" alt="">
        </a>
        </li>
        <li class="nav-item">
                <a href="http://www.chemspider.com/" target="_blank">
                 <img src="${pageContext.request.contextPath}/resources/img/spider.jpg" class="d-inline-block align-center" alt="">
                </a>
        </li>
        <li class="nav-item">
                <a href="https://www.drugbank.ca/" target="_blank">
                 <img src="${pageContext.request.contextPath}/resources/img/drug.png" class="d-inline-block align-center" alt="">
                </a>
        </li>
      </ul>
    </div>
  </nav>

    <div class="container bg-light">
    <form>
          <form modelAttribute="userFromServer" method="post" action="/users-system/users/check">
            <div class="form-row">
                <div class="col">
                    <input type="text" class="form-control" placeholder="Name" name="name" path="name">
                </div>
                <div class="col">
                    <input type="text" class="form-control" placeholder="Password" name="password" path = "password">
                </div>
            </div>
            <br>
            <button type="submit" class="btn btn-dark">Sign in</button>
         </form>
     </div>
</div>
</body>
</html>