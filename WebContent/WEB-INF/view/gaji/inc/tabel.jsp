<%@page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<table class="table table-striped table-bordered table-hover">
    <thead>
        <tr>
            <th>No Gaji</th>
            <th>Tanggal Bayar Gaji</th>
            <th>Gaji Bulanan</th>
            <th>Gaji Tahunan</th>
            <th>Gaji Pokok</th>
            <th>Pendapatan Gaji</th>
            <th>Bonus Gaji</th>
            <th>Keterangan</th>
            <th colspan="2">Action</th>
        </tr>
    </thead>
    <tbody>
         <c:forEach var="tempgaji" items="${gaji}">
            <tr>
              <td> ${tempgaji.gajiNo } </td>
              <td> ${tempgaji.gajiTglBayar } </td>
              <td> ${tempgaji.gajiBulan } </td>
              <td> ${tempgaji.gajiTahun } </td>
              <td> ${tempgaji.gajiPokok } </td>
              <td> ${tempgaji.gajiPendapatan } </td>
              <td> ${tempgaji.gajiBonus } </td>
              <td> ${tempgaji.gajiKeterangan } </td>
              <td> <a href="/gaji/update/${tempgaji.gaji_id}" class="btn btn-info">Update</a>
               <a href="/gaji/delete/${tempgaji.gaji_id}" class="btn btn-warning">Delete</a></td>
            </tr>
        </c:forEach>
    </tbody>
</table>