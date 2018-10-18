<%@page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>


<table class="table table-sm table-striped table-bordered table-hover">
	<thead>
		<tr>
			<th>Kode</th>
			<th>Nama Barang</th>
			<th>Harga Jual(Rp)</th>
			<th> Action </th>
		</tr>
	</thead>
	<tbody>
		<c:forEach var="temp" items="${result}">
            <tr>
              <td> ${temp.barang.barangKode } </td>
              <td> ${temp.barang.barangNama } </td>
              <td> ${temp.barangHJHJ} </td>
              <%--<td> ${tempBarang.HargaJual } </td>--%>
              <td> <a href="/barang/form-update/${temp.barangHJId}" class="btn btn-info">Update</a>
            </tr>
        </c:forEach>
	</tbody>
</table>