<%@page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<div class="table-responsive">
	<table class="table table-striped table-bordered table-hover">
		<thead>
			<tr>
				<th style="font-size: 14px;">NO RM</th>
				<th style="font-size: 14px;">Nama Pasien</th>
				<th style="font-size: 14px;">Jenis Kelamin</th>
				<th style="font-size: 14px;">Alamat</th>
				<th style="font-size: 14px;">No Telp</th>
				<th style="font-size: 14px;">Aksi</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="tempPasien" items="${pasiens}">
					<tr>
						<td style="font-size: 12px;"> ${tempPasien.pasienNorm} </td>
						<td style="font-size: 12px;"> ${tempPasien.pasienNama } </td>
						<td style="font-size: 12px;"> ${tempPasien.pasienKelamin } </td> 
						<td style="font-size: 12px;"> ${tempPasien.pasienAlamat } </td>
						<td style="font-size: 12px;"> ${tempPasien.pasienNotelp } </td> 
						<td style="font-size: 12px;"> 
							<a class="btn btn-warning" href="/pasien/delete/${tempPasien.pasienID}">Delete</a>
							<a class="btn btn-info" href="/pasien/update/${tempPasien.pasienID}">Update</a>
						</td>
					</tr>
				</c:forEach>
		</tbody>
	</table>
</div>