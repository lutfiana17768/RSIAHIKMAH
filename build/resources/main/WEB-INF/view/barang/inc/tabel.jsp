<%@page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>


<table class="table table-sm table-striped table-bordered table-hover">
	<thead>
		<tr>
			<th>Kode</th>
			<th>Nama Barang</th>
			<th>Jenis Barang</th>
			<th>Satuan Default</th>
			<th>Profit</th>
			<th>Harga HET(Rp)</th>
			<th>Harga Jual(Rp)</th>
		</tr>
	</thead>
	<tbody>
		<c:forEach var="tempBarang" items="${result}">
            <tr>
              <td> ${tempBarang.KodeBarang } </td>
              <td> ${tempBarang.NamaBarang } </td>
              <td> ${tempBarang.JenisBarang } </td>
              <td> ${tempBarang.IdSatuanBarang } </td>
              <td> ${tempBarang.ProfitBarang } </td>
              <td> ${tempBarang.HetBarang } </td>
              <td> ${tempBarang.HargaJual } </td>
              <td> <a href="/barang/update/${tempBarang.IdBarang}" class="btn btn-info">Update</a>
               <a href="/barang/delete/${tempBarang.IdBarang}" class="btn btn-warning">Delete</a></td>
            </tr>
        </c:forEach>
	</tbody>
</table>