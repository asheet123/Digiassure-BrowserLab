<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="${pageContext.request.contextPath}/styles/css/bootstrap.css">
<link rel="stylesheet" href="${pageContext.request.contextPath}/styles/css/main.css">
<link rel="stylesheet" href="${pageContext.request.contextPath}/styles/css/digi.css">

<script src="${pageContext.request.contextPath}/vendor/jquery/dist/jquery.js"></script>
<script src="${pageContext.request.contextPath}/vendor/angular/angular.js"></script>
<script
	src="${pageContext.request.contextPath}/vendor/angular-ui-router/release/angular-ui-router.js"></script>
<script src="${pageContext.request.contextPath}/vendor/angular-route/angular-route.js"></script>
<script src="${pageContext.request.contextPath}/vendor/angular-ui-bootstrap-bower/ui-bootstrap.js"></script>
<script
	src="${pageContext.request.contextPath}/vendor/angular-ui-bootstrap-bower/ui-bootstrap-tpls.js"
	type="text/javascript"></script>
<script src="${pageContext.request.contextPath}/vendor/bootstrap/dist/js/bootstrap.js"></script>
<script src="${pageContext.request.contextPath}/js/app/app.js"></script>
<script src="${pageContext.request.contextPath}/js/main.js"></script>
<script type="text/javascript">

// Function to start seetest URL in New Tab
function runSeeTest(){
	window.open('http://igteblrwfmobt:9191','_blank');
}

//function calling DigiAssure Controller method for Downloading Excel Template
function downloadExcelTemplate(){
	//window.location.href = 'downloadExcelUtility';
        alert("Click Ok to Download Template");
        $.ajax({  
            type : 'GET',  
            url : "downloadExcelUtility",  
        });
        alert("Download Success");
    }
    
function sendMail(){
	window.open('mailto:gaurav.dua@capgemini.com');
}

</script>
</head>
<body onload="changeAccordion('securityTesting','digitalQAService')">

	<div>
		<!-- Header and Navigation Bar -->
	 
		<jsp:include page="../../common/logo.jsp"></jsp:include>
		<%-- <jsp:include page="../../common/nav.jsp"></jsp:include> --%>
		
		
		<div class="marginTop15px"></div>
		<!-- <div class="container" style="background-color: #fa565a;"> -->
		<div class="container">
			<div class="">
				<div class="col-sm-4 col-md-3 marginTop50px">
					<jsp:include page="../../accordion/accordion.jsp"></jsp:include>
				</div>
				<div class="col-sm-8 col-md-9 verticalLine">
					<div class="marginTop65px">
						<div class="page-header">
							<h1 class="greyTextColor">Security Testing - Coming Soon</h1>
						</div>

						<div class="panel panel-default">
							<div class="panel-heading"
								data-ng-click="digitalQALabObjective()" data-toggle="collapse">
								<b>Objective</b>
							</div>
							<div class="panel-body">
								<ul>
									<li>Validation of  application on multiple devices and platform Combinations from Security perspective</li>
									<li>Testing applications for major Security vulnerabilities using techniques such as Penetration testing, scanning etc</li>
									<li>Combination of Manual and Automated testing for E-2-E Security Test Execution</li>
								</ul>
							</div>
						</div>

						<div class="marginTop15px">
							<div class="panel panel-default">
								<div class="panel-heading">
									<b>Pre-requisites</b>
								</div>
								<div class="panel-body">
									<ul>
										<li>Setup the appropriate tool with the required configuration. DigiAssure provides the tools for Client and Server Side Security Testing. If you do not have credentials, Contact Us 
											<a onclick="sendMail()">
												<i class="glyphicon glyphicon-envelope"></i>
											</a>
										</li>
										<li>Download and Install the latest build for Mobile/Web Application </li>
										
									</ul>
								</div>
							</div>
						</div>

						<div class="marginTop15px">
							<div class="panel panel-default">
								<div class="panel-heading">
									<b>Approach</b>
								</div>
								<div class="panel-body">
									<ol>
										<li>Login to DigiAssure </li>  
										<li>Select the Security testing Tool</li>
										<li>Install your application on Desktop & Mobile Devices as per the requirement</li>
										<li>Scan the application with the tool</li>
										<li>Go through the tool report to filter out valid Security vulnerabilities</li>
										<li>Reports to be viewed and downloaded from Dashboard</li>
									</ol>
								</div>
							</div>
						</div>
						<%-- <span class="marginLeft20px"> 
							<a href='${pageContext.request.contextPath}/console/runHome?toolName=Cafe_Seetest'><button class="btn btn-primary">Cafe Seetest</button></a>
							<a href='${pageContext.request.contextPath}/console/runHome?toolName=Cafe_Perfecto'><button class="btn btn-primary">Cafe Perfecto</button></a>
							<a href='${pageContext.request.contextPath}/console/runHome?toolName=Sprintest_Appium'><button class="btn btn-primary">Cafe Appium</button></a>
							<a href='${pageContext.request.contextPath}/console/runHome?toolName=Sprintest_Optik'><button class="btn btn-primary">Cafe Optik</button></a>
							<a href='${pageContext.request.contextPath}/console/runHome?toolName=Cukes_Digital'><button class="btn btn-primary">Cukes Digital</button></a>
							<!-- <button class="btn btn-primary" onclick="downloadExcelTemplate()">Download Template</button> -->
						</span> --%>
						<div class="marginTop15px">
							<div class="panel panel-default">
								<div class="panel-heading">
									<b>Artifacts</b>
								</div>
								<div class="panel-body">
									<ul>
										<!-- <li>Test lab User Manual</li> -->
										<!-- <li><i class="glyphicon glyphicon-file"> </i><a href="javascript:void(0);" onclick="javascipt:window.open('../../userManual/Mobile_Lab_User_Manual.pdf');" class="popup"><b>Mobile Lab User Manual</b></a></li> -->
										<!-- <li>Device Adoption Strategy</li> -->
										<li>Security Testing tool User manual</li>
										<!-- <li>Policies around Lab/Grid Usage</li> -->
									</ul>
								</div>
							</div>
						</div>
						<div class="marginTop15px"></div>
					</div>
				</div>
			</div>
		</div>
		<!-- Footer -->
		<jsp:include page="../../common/footer.jsp"></jsp:include>
		<!--     <div ng-include="'common/footer.html'"></div> -->
	</div>
</body>
</html>