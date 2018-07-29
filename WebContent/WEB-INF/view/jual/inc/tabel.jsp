<%@page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<div class="table-responsive" style="overflow-y: auto;">
    <table class="table table-striped table-bordered table-hover">
    <thead>
        <tr>
            <th valign="middle">No</th>
            <th valign="middle">Tanggal</th>
            <th valign="middle">No Pendaftaran</th>
            <th valign="middle">Nama Pembeli</th>
            <th valign="middle">Jumlah</th>
            <th valign="middle">Diskon</th>
            <th valign="middle">Total</th>
            <th valign="middle">Bayar</th>
            <th valign="middle">Keterangan</th>
            <th colspan="2">Action</th>
        </tr>
    </thead>
    <tbody>
         <c:forEach var="temp" items="${result}">
            <tr>
              <td> ${temp.jualNo } </td>
              <td> ${temp.jual_tanggal } </td>
              <td> ${temp.jualPendaftaranId} </td>
              <td> ${temp.jualPasienId} </td>
              <td> ${temp.jualTotal } </td>
              <td> ${temp.jualDiskon } </td>
              <td> ${temp.jualTotalBulat } </td>
              <td> ${temp.jualBayarJumlah } </td>
              <td> ${temp.jualKeterangan } </td>
              <td> <a href="/jual/edit?Id=${temp.jualId}" class="btn btn-info">Update</a>
               <a href="/jual/delete?Id=${temp.jualId}" class="btn btn-warning">Delete</a></td>
            </tr>
        </c:forEach>
    </tbody>
</table>