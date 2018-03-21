<%-- 
    Document   : page
    Created on : Mar 8, 2018, 11:21:59 PM
    Author     : chamath
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<spring:url var="css" value="/resources/css" />
<spring:url var="js" value="/resources/js" />
<spring:url var="images" value="/resources/images" />

<!--for getting context root-->
<c:set var="contextRoot" value="${pageContext.request.contextPath}"/>

<!DOCTYPE html>
<html lang="en">

    <head>

        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <meta name="description" content="">
        <meta name="author" content="">

        <!--title come from the controller-->
        <title>Online Shopping | ${title}</title>

        <script>
            window.menu = '${title}';
        </script>



        <!-- Bootstrap Core CSS -->

        <link href="${css}/bootstrap.min.css" rel="stylesheet">
        

        <!-- Custom CSS -->
        <link href="${css}/shop-homepage.css" rel="stylesheet">

        <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
        <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
        <!--[if lt IE 9]>
            <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
            <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
        <![endif]-->

    </head>

    <body>

        <div class="wrapper">


            <!-- Navigation -->
		<%@include file="include/navigationBar.jsp"%>
		<!-- Page Content -->
            <div class="content">
                      
                <!--home container-->
                <!--this content must loaded only when the user click home-->
                <c:if test="${userClickHome == true}">
                    <%@include file="home.jsp" %>
                </c:if>

                <c:if test="${userClickAbout == true}">
                    <%@include file="about.jsp" %>
                </c:if>

                <c:if test="${userClickContact == true}">
                    <%@include file="contact.jsp" %>
                </c:if>


            </div>

            <!--footer comes here-->
            <%@include file="include/footer.jsp" %>


        </div>





    </body>
    <!-- jQuery -->
    <script src="${js}/jquery.js"></script>

    <!-- Bootstrap Core JavaScript -->
    <script src="${js}/bootstrap.min.js"></script>
    <script src="${js}/myjs.js"></script>

</html>
