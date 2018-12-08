<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Browser Lab</title>

<link rel="stylesheet"
	href="${pageContext.request.contextPath}/styles/css/bootstrap.css">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/styles/css/main.css">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/styles/css/digi.css">

<!-- <script type="text/javascript" src="http://www.google.com/jsapi"></script>
<script type="text/javascript"
	src="https://www.gstatic.com/charts/loader.js"></script> -->
	
<script src="${pageContext.request.contextPath}/js/highchart.js"></script>
<script src="${pageContext.request.contextPath}/js/exporting.js"></script> 
	

<script language="Javascript">

var data=${marketBrowserData};
var osData=${marketOsData};
var windowsDistribution=${windowsDistribution};
var mobileDistribution=${mobileDistribution};

window.onload = function () {
    Highcharts.chart('container', {
    		
    	        chart: {
    	            type: 'column'
    	        },
    	       
    	        xAxis: {
    	            categories: data.categories ,
    	            crosshair: true
    	        },
    	        yAxis: {
    	            min: 0,
    	             title: {
    	                text: 'Percentage'
    	            } 
    	        },
    	        tooltip: {
    	            headerFormat: '<span style="font-size:10px">{point.key}</span><table>',
    	            pointFormat: '<tr><td style="color:{series.color};padding:0">{series.name}: </td>' +
    	                '<td style="padding:0"><b>{point.y:.1f} %</b></td></tr>',
    	            footerFormat: '</table>',
    	            shared: true,
    	            useHTML: true
    	        },
    	        plotOptions: {
    	            column: {
    	                pointPadding: 0.2,
    	                borderWidth: 0
    	            }
    	        },
    	        series:data.series
    	    });
    	  

   Highcharts.getOptions().plotOptions.pie.colors = (function () {
        var colors = [],
            base = Highcharts.getOptions().colors[0],
            i;

        for (i = 0; i < 10; i += 1) {
            // Start out with a darkened base color (negative brighten), and end
            // up with a much brighter color
            colors.push(Highcharts.Color(base).brighten((i - 7) / 12).get());
        }
        return colors;
    }());

    Highcharts.chart('windowsDistribution', {
        chart: {
            plotBackgroundColor: null,
            plotBorderWidth: null,
            plotShadow: false,
            type: 'pie'
        },
       
        tooltip: {
            pointFormat: '{name}: <b>{point.percentage:.1f}%</b>'
        },
        plotOptions: {
            pie: {
                allowPointSelect: true,
                cursor: 'pointer',
                dataLabels: {
                    enabled: true
                },
                showInLegend: true,
                
            }
            },
      
        series: [{
           
            colorByPoint: true,
            data: windowsDistribution
        }]
    });  
    
    Highcharts.chart('container3', {
		
        chart: {
            type: 'column'
        },
       
        xAxis: {
            categories: osData.categories ,
            crosshair: true
        },
        yAxis: {
            min: 0,
             title: {
                text: 'Percentage'
            } 
        },
        tooltip: {
            headerFormat: '<span style="font-size:10px">{point.key}</span><table>',
            pointFormat: '<tr><td style="color:{series.color};padding:0">{series.name}: </td>' +
                '<td style="padding:0"><b>{point.y:.1f} %</b></td></tr>',
            footerFormat: '</table>',
            shared: true,
            useHTML: true
        },
        plotOptions: {
            column: {
                pointPadding: 0.2,
                borderWidth: 0
            }
        },
        series: osData.series
    });
  
    
    
     Highcharts.chart('container4', {
        chart: {
            plotBackgroundColor: null,
            plotBorderWidth: null,
            plotShadow: false,
            type: 'pie'
        },
       
        tooltip: {
            pointFormat: '{name}: <b>{point.percentage:.1f}%</b>'
        },
        plotOptions: {
            pie: {
                allowPointSelect: true,
                cursor: 'pointer',
                dataLabels: {
                    enabled: true
                },
                showInLegend: true
            }
        },
        series: [{
           
            colorByPoint: true,
            data: mobileDistribution
        }]
    }); 
};

</script>




<script
	src="${pageContext.request.contextPath}/vendor/jquery/dist/jquery.js"></script>
<script
	src="${pageContext.request.contextPath}/vendor/angular/angular.js"></script>
<script
	src="${pageContext.request.contextPath}/vendor/angular-ui-router/release/angular-ui-router.js"></script>
<script
	src="${pageContext.request.contextPath}/vendor/angular-route/angular-route.js"></script>
<script
	src="${pageContext.request.contextPath}/vendor/angular-ui-bootstrap-bower/ui-bootstrap.js"></script>
<script
	src="${pageContext.request.contextPath}/vendor/angular-ui-bootstrap-bower/ui-bootstrap-tpls.js"
	type="text/javascript"></script>
<script
	src="${pageContext.request.contextPath}/vendor/bootstrap/dist/js/bootstrap.js"></script>
<script src="${pageContext.request.contextPath}/js/app/app.js"></script>
<script src="${pageContext.request.contextPath}/js/main.js"></script>
<script type="text/javascript">


       // Function to start seetest URL in New Tab
      function runSeeTest() {
    	  
		window.open('http://10.102.22.86', '_blank');
	}

       /* function sendMail() {
              window.open('mailto:gaurav.dua@capgemini.com');
       } */
</script>


</head>
<body>


	 
		<!-- Header and Navigation Bar -->

		<jsp:include page="../../../common/logo.jsp"></jsp:include>
		<div class="marginTop65px"></div>
		<div class="row borderBottom" >
			<div class="col-md-4 col-lg-4 marginTop15px">
			<label class="font24px">Browser Lab</label>
			</div>
			<div class="col-md-3 col-lg-4"></div>
			<div class="col-md-5 col-lg-4 marginTop15px" >
			
			<a href="../../mobileLab/mobileLab.jsp"><button 
					class="btn btn-primary sideButton"
					>Help</button></a>
				<button type="button" 
					class="btn btn-primary pull-right" onclick="runSeeTest()"
					title="Start Testing">
					Start Testing <span class="glyphicon glyphicon-plus"></span>
				</button>
				<a href="../../mobileLab/downloadExcelUtility" ><button 
					type="button"  class="btn btn-primary sideButton">
					Download TestPlan <img
						src="${pageContext.request.contextPath}/styles/images/download.png"
						height="20" width="20"
						title="Download TestPlan">
				</button> 
				</a> 
			</div>
			     
		</div>
		

		
		
		
		<ul class="nav nav-tabs marginLeft15px marginTop15px" >
			<%-- <li>
				<a class="dropdown-toggle buttonlink"
					href="${pageContext.request.contextPath}/digitalQAService/accessibilityTesting/viewAllocatedBatch"
					data-toggle="dropdown"><b>Market Trends <span class="caret"></span></b>
				</a>
				<ul class="dropdown-menu">
				<c:if test="${not empty marketNames }">
				<c:forEach var="marketData" items="${marketNames }">
				
				<li><a
						href="../../mobileLab/deviceSelectionMatrix/browserTrend?market=${marketData.marketid }">${marketData.marketname}</a></li>
				</c:forEach>
				</c:if>
					
				</ul>
			</li> --%>
			<li  class="dropdown">
					
					<a class="dropdown-toggle buttonlink" href="${pageContext.request.contextPath}/digitalQAService/accessibilityTesting/viewAllocatedBatch"
					data-toggle="dropdown"><b>Market Trends<span class="caret"></span></b></a>
				<ul class="dropdown-menu">
				<%-- <c:forEach var="marketData" items="${marketNames }">
				<li ><a
						href="../../mobileLab/deviceSelectionMatrix/recommendDevice?market=${marketData.marketname }&count=20">${marketData.marketname}</a></li>
				</c:forEach> --%>
					<li><a
						href="../../mobileLab/deviceSelectionMatrix/browserTrend?market=1">Global</a></li>
					<li><a
						href="../../mobileLab/deviceSelectionMatrix/browserTrend?market=2">UK</a></li>
					<li><a
						href="../../mobileLab/deviceSelectionMatrix/browserTrend?market=3">US</a></li>
					<!-- <li><a
						href="../../mobileLab/deviceSelectionMatrix/browserTrend?market=4">Australia</a></li> -->			
				</ul>
				</li>
			<li class="active dropdown">
				<a class="dropdown-toggle buttonlink"
					href="${pageContext.request.contextPath}/digitalQAService/accessibilityTesting/viewAllocatedBatch"
					data-toggle="dropdown"><b><button
							class="btn mobileLabMenu">User Trends<span class="caret"></span></button></b>
				</a>
				<ul class="dropdown-menu">
					<li class="active"><a
						href="../../mobileLab/deviceSelectionMatrix/browserUserTrends">Application1</a></li>
				</ul>
			</li>
			
			<li  class="dropdown">
					
					<a class="dropdown-toggle buttonlink" href="${pageContext.request.contextPath}/digitalQAService/accessibilityTesting/viewAllocatedBatch"
					data-toggle="dropdown"><b>Browser Recommendation<span class="caret"></span></b></a>
				<ul class="dropdown-menu">
				<%-- <c:forEach var="marketData" items="${marketNames }">
				<li ><a
						href="../../mobileLab/deviceSelectionMatrix/recommendDevice?market=${marketData.marketname }&count=20">${marketData.marketname}</a></li>
				</c:forEach> --%>
					<li><a
						href="${pageContext.request.contextPath}/integratedQALabs/mobileLab/deviceSelectionMatrix/recommendBrowser?market=GLOBAL&count=20">Global</a></li>
					<li><a
						href="${pageContext.request.contextPath}/integratedQALabs/mobileLab/deviceSelectionMatrix/recommendBrowser?market=US&count=20">US</a></li>
					<li><a
						href="${pageContext.request.contextPath}/integratedQALabs/mobileLab/deviceSelectionMatrix/recommendBrowser?market=UK&count=20">UK</a></li>
					<%-- <li><a
						href="${pageContext.request.contextPath}/integratedQALabs/mobileLab/deviceSelectionMatrix/recommendBrowser?market=Australia&count=20">Australia</a></li> --%>
				
				
			
				</ul>
				</li>			
		</ul>

	<div class="container">
		<div class="row">
			<div class="marginTop15px"></div>
			<div class="col-md-7 col-lg-7 graphPartition">
				<h3 class="labelForGraph">Web Browser Distribution detail</h3>
<c:if test="${not empty marketBrowserData}">					
	
<div id="container" class="graphDiv"></div>

</c:if>				<!-- <div id="chart" class="chart" style="float: left;"></div> -->

				<c:if test="${empty marketBrowserData}">
					<center>
						<b><font color="red" size="2"> No Records found...</font></b>
					</center>
				</c:if>
			</div>

			<div class="col-md-5 col-lg-5">
				<h3 class="labelForGraph">Windows OS distribution by version</h3>
					
 	<c:if test="${not empty windowsDistribution}">

<div id="windowsDistribution" class="graphDiv"></div>				
			
</c:if>
				<c:if test="${empty windowsDistribution}">
					<center>
						<b><font color="red" size="2"> No Records found...</font></b>
					</center>
				</c:if>
			</div>

		</div>
		<div class="row">
			<div class="col-md-12 col-lg-12">
				<div class="marginTop15px"></div>
				<div class="horizontalLine"></div>
			</div>
		</div>

		<div class="row">
			<div class="marginTop15px"></div>
			 <div class="col-md-7 col-lg-7 graphPartition">
				<div class="marginTop15px"></div>
				<h3 class="labelForGraph">Mobile Web Browser Distribution</h3>
					<c:if test="${not empty marketOsData}">
<div id="container3" class="graphDiv"></div>	
</c:if>					
					
				<c:if test="${empty marketOsData}">
					<center>
						<b><font color="red" size="2"> No Records found...</font></b>
					</center>
				</c:if>
			</div>
			<div class="col-md-5 col-lg-5">
				<div class="marginTop15px"></div>
				<h3 class="labelForGraph">Mobile OS Distribution</h3>
					<c:if test="${not empty mobileDistribution}">
<div id="container4" class="graphDiv"></div>	
</c:if>
				<c:if test="${empty mobileDistribution}">
					<center>
						<b><font color="red" size="2"> No Records found...</font></b>
					</center>
				</c:if>
			</div> 
			<div class="marginTop15px"></div>
		</div>
		<div class="row">
			<div class="col-md-12 col-lg-12">
				<div class="marginTop15px"></div>
			</div>
		</div>
	</div>





	<!-- <div class="marginTop15px"></div> -->


<div>
		<!-- Footer -->
		<jsp:include page="../../../common/footer.jsp"></jsp:include>
		<!--     <div ng-include="'common/footer.html'" a></div> -->
</div>
</body>
</html>
