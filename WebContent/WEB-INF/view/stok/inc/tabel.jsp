<%@page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>


<table class="table table-sm table-striped table-bordered table-hover">
	<thead>
		<tr>
			<th> Kode </th>
			<th> Nama Barang </th>
			<th> Tanggal Kadaluarsa </th>
			<th> Stok </th>
		</tr>
	</thead>
	<tbody>
		<c:forEach var="temp" items="${result}">
            <tr>
              <td> ${temp.barang.barangKode } </td>
              <td> ${temp.barang.barangNama } </td>
              <td> ${temp.stokObatKadaluarsa } </td> 
              <td> ${temp.stokObatJumlah } </td>
            </tr>
        </c:forEach>
	</tbody>
</table>