<%@page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>
<c:set var="req" value="${pageContext.request}" />
<c:set var="url">${req.requestURL}</c:set>
<c:set var="uri" value="${req.requestURI}" />
<c:set var="baseURL" value="${fn:substring(url, 0, fn:length(url) - fn:length(uri))}${req.contextPath}/" />
<jsp:useBean id="now" class="java.util.Date"/>    

<!doctype html>
<html>
<head>
    <meta charset="utf-8">
    <title>RSIA - Kartu Stok</title>
    <link rel="stylesheet" type="text/css" href="<c:url value='${baseURL}resources/css/bootstrap.min.css'/>"/>
    <style>
    .invoice-box {
        max-width: 900px;
        margin: auto;
        padding: 3em;
        border: 1px solid #eee;
        box-shadow: 0 0 10px rgba(0, 0, 0, .15);
        font-size: 16px;
        line-height: 24px; 
        font-weight: 600;
        font-family: sans-serif;
        color: black;
        font-style: italic;
        font-weight: bold;
    }
    
    .invoice-box table {
        width: 100%;
        line-height: inherit;
        text-align: left;
    }
    
    .invoice-box table td {
        padding: 5px;
        vertical-align: top;
    }
    
    .invoice-box table tr td:nth-child(2) {
        text-align: right;
    }
    
    .invoice-box table tr.top table td {
        padding-bottom: 20px;
    }
    
    .invoice-box table tr.top table td.title {
        font-size: 45px;
        line-height: 45px;
        color: #333;
    }
    
    .invoice-box table tr.information table td {
        /*padding-bottom: 40px;*/
    }
    
    .invoice-box table tr.heading td {
        background: #eee;
        border-bottom: 1px solid #ddd;
        font-weight: bold;
    }
    
    .invoice-box table tr.details td {
        padding-bottom: 20px;
    }
    
    .invoice-box table tr.item td{
        border-bottom: 1px solid #eee;
    }
    
    .invoice-box table tr.item.last td {
        border-bottom: none;
    }
    
    .invoice-box table tr.total td:nth-child(2) {
        border-top: 2px solid #eee;
        font-weight: bold;
    }
    
    @media only screen and (max-width: 600px) {
        .invoice-box table tr.top table td {
            width: 100%;
            display: block;
            text-align: center;
        }
        
        .invoice-box table tr.information table td {
            width: 100%;
            display: block;
            text-align: center;
        }
    }
    
    /** RTL **/
    .rtl {
        direction: rtl;
        font-family: Tahoma, 'Helvetica Neue', 'Helvetica', Helvetica, Arial, sans-serif;
    }
    
    .rtl table {
        text-align: right;
    }
    
    .rtl table tr td:nth-child(2) {
        text-align: left;
    }
    </style>
    <script type="text/javascript">
    	var BASE_URL = "${baseURL}";
    </script>
</head>

<body>
    <div class="col-md-3">
        <table class="table">
            <thead>
                <tr>
                    <th> Tanggal </th>
                    <th> Nama Barang </th>
                    <th> Masuk </th>
                    <th> Keluar </th>
                </tr>
            </thead>

            <tbody>
                <c:forEach var="temp" items="${result}">
                    <tr>
                      <td> <fmt:formatDate value="${temp.kartuStokTanggal }" pattern="dd MMMM yyyy"/> </td>
                      <td> ${temp.barang.barangNama } </td>
                      <td> ${temp.kartuStokMasuk } </td> 
                      <td> ${temp.kartuStokKeluar } </td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
    </div>

    <div class="col-md-3">
        <table class="table">
            <thead>
                <tr>
                    <th> Tanggal </th>
                    <th> Nama Barang </th>
                    <th> Masuk </th>
                    <th> Keluar </th>
                </tr>
            </thead>

            <tbody>
                <c:forEach var="temp" items="${resultLast}">
                    <tr>
                      <td> <fmt:formatDate value="${temp.kartuStokTanggal }" pattern="dd MMMM yyyy"/> </td>
                      <td> ${temp.barang.barangNama } </td>
                      <td> ${temp.kartuStokMasuk } </td> 
                      <td> ${temp.kartuStokKeluar } </td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
    </div>
    <!-- <script>
		window.onafterprint = function(){
		   window.location.href = BASE_URL+'kasir/pembayaran?pendaftaran=${transaksiModel.pendaftaran.pendaftaranID}';
		}
		window.print();
    </script> -->
</body>
</html>