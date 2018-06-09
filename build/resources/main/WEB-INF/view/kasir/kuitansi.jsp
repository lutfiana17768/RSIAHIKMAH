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
<!doctype html>
<html>
<head>
    <meta charset="utf-8">
    <title>A simple, clean, and responsive HTML invoice template</title>
    
    <style>
    .invoice-box {
        max-width: 800px;
        margin: auto;
        padding: 30px;
        border: 1px solid #eee;
        box-shadow: 0 0 10px rgba(0, 0, 0, .15);
        font-size: 16px;
        line-height: 24px;
        font-family: 'Helvetica Neue', 'Helvetica', Helvetica, Arial, sans-serif;
        color: #555;
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
        padding-bottom: 40px;
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
    <div class="invoice-box">
        <table cellpadding="0" cellspacing="0">
            <tr class="top">
                <td colspan="2">
                    <table>
                        <tr>
                            <td class="title">
                                <img src="https://www.sparksuite.com/images/logo.png" style="width:100%; max-width:300px;">
                            </td>
                            
                            <td>
                                Rumah Sakit Al-Hikmah<br>
                                Jl. Baru no 112 B<br>
                                Telp. (031) 0222, Fax (031) 01212
                            </td>
                        </tr>
                    </table>
                </td>
            </tr>
            
            <tr>
                <table>
                    <tbody>
                        <tr>
                            <td>No. Kuitansi</td>
                            <td>:</td>
                            <td>KUI-11</td>
                        </tr>
                        <tr>
                            <td>Terima dari</td>
                            <td>:</td>
                            <td>${transaksiModel.pendaftaran.pasien.pasienNama}, ${transaksiModel.pendaftaran.pasien.pasienSebut} ( No. RM ${transaksiModel.pendaftaran.pasien.pasienNorm } ${transaksiModel.pendaftaran.pasien.pasienAlamat} )</td>
                        </tr>
                        <tr>
                            <td>Untuk pembayaran</td>
                            <td>:</td>
                            <td>${transaksiModel.pendaftaran.pendaftaranJenis}</td>
                        </tr>
                        <tr>
                            <td>Dokter</td>
                            <td>:</td>
                            <td>${transaksiModel.pendaftaran.pegawai.pegawaiNama}</td>
                        </tr>
                    </tbody>
                </table>
            </tr>
            <tr>
                <td>
                    <table>
                        <tbody>
                            <tr>
                                <td colspan="2">
                                	Jumlah # <fmt:formatNumber value = "${transaksiModel.bayar[transaksiModel.bayar.size()-1].transaksiBayarNominal}" maxFractionDigits = "3"/>
                                </td>
                                <td>
                                Surabaya, 12 Mei 2012<br/>
                                Telah bayar <br/>
                                Kasir <br/><br/><br/>    
                                </td>
                            </tr>
                            <tr align="right">
                            	<td colspan="2">(Keluarga)</td>
                                <td>dr. Udin</td>
                             </tr>
                        </tbody>
                    </table>
                </td>
            </tr>
        </table>
    </div>
    <script>
		window.onafterprint = function(){
		   window.location.href = BASE_URL+'kasir/pembayaran?pendaftaran=${transaksiModel.pendaftaran.pendaftaranID}';
		}
		window.print();
    </script>
</body>
</html>