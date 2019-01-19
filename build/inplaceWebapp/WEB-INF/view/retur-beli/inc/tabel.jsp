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
            <th valign="middle">No Terima</th>
            <th valign="middle">Nama PBF / Supplier</th>
            <th valign="middle">Total PPN</th>
            <th valign="middle">Total</th>
            <th valign="middle">Keterangan</th>
            <th colspan="2">Action</th>
        </tr>
    </thead>
    <tbody>
         <c:forEach var="temp" items="${result}">
            <tr>
              <td> ${temp.returBeliNo } </td>
              <td> ${temp.returBeliTanggal } </td>
              <td> ${temp.terima.terimaNo} </td>
              <td> ${temp.perusahaan.perusahaanNama} </td>
              <td> ${temp.returBeliTotalPPN } </td>
              <td> ${temp.returBeliTotal } </td>
              <td> ${temp.returBeliKeterangan } </td>
              <td> <a href="/retur-beli/edit?Id=${temp.returBeliId}" class="btn btn-info">Update</a>
               <a href="/retur-beli/delete?Id=${temp.returBeliId}" class="btn btn-warning">Delete</a></td>
            </tr>
        </c:forEach>
    </tbody>
</table>