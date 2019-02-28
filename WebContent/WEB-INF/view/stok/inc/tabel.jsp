<%@page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>


<table class="table table-sm table-striped table-bordered table-hover" id="stok-table">
	<thead>
		<tr>
			<th> Kode </th>
			<th> Nama Barang </th>
			<th> Tanggal Kadaluarsa </th>
			<th> Stok </th>
			<th> Kartu Stok </th>
		</tr>
	</thead>
	<tbody>
		<c:forEach var="temp" items="${result}">
            <tr <c:if test="${temp.stokObatJumlah <= 3 }"> style="background:red;" </c:if>
            	<c:if test="${temp.stokObatJumlah > 3 && temp.stokObatJumlah <= 10 }"> style="background:yellow;" </c:if>
            >
              <td> ${temp.barang.barangKode } </td>
              <td> ${temp.barang.barangNama } </td>
              <td> ${temp.stokObatKadaluarsa } </td> 
              <td> ${temp.stokObatJumlah } </td>
              <td> <butt class="btn btn-info kartu-stok" barang-id="${temp.barang.barangId }">Print</a>
            </tr>
        </c:forEach>
	</tbody>
</table>