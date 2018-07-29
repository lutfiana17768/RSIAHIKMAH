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
            <th valign="middle">No Order</th>
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
              <td> ${temp.terimaNo } </td>
              <td> ${temp.terimaTanggal } </td>
              <td> ${temp.terimaOrderId} </td>
              <td> ${temp.terimaPerusahaanId} </td>
              <td> ${temp.terimaTotalPPN } </td>
              <td> ${temp.terimaTotal } </td>
              <td> ${temp.terimaKeterangan } </td>
              <td> <a href="/terima/form-update?Id=${temp.terimaId}" class="btn btn-info">Update</a>
               <a href="/terima/delete?Id=${temp.terimaId}" class="btn btn-warning">Delete</a></td>
            </tr>
        </c:forEach>
    </tbody>
</table>