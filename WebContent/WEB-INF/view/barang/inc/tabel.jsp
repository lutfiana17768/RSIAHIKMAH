<%@page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<table class="table table-striped table-bordered" id="BarangTbl" style="width: 100%;">
	<thead>
		<tr>
			<th>Jenis Barang</th>
			<th>Kode</th>
			<th>Nama Barang</th>
			<th>Satuan Default</th>
			<th>Profit</th>
			<th>Harga HET(Rp)</th>
			<%--<th>Harga Jual(Rp)</th>--%>
			<th> Action </th>
		</tr>
	</thead>
	<tbody id="brgTblBody" >
		<c:forEach var="tempBarang" items="${result}">
            <tr>
              <td> ${tempBarang.barangJenis.barangJenisNama } </td>
              <td> ${tempBarang.barangKode } </td>
              <td> ${tempBarang.barangNama } </td>
              <td> ${tempBarang.satuan.satuanKode } </td>
              <td> ${tempBarang.barangProfit } </td>
              <td> ${tempBarang.barangHet } </td>
              <%--<td> ${tempBarang.HargaJual } </td>--%>
              <td> <a href="/barang/form-update/${tempBarang.barangId}" class="btn btn-info">Update</a>
               <a href="/barang/delete/${tempBarang.barangId}" class="btn btn-warning">Delete</a></td>
            </tr>
        </c:forEach>
	</tbody>
</table>