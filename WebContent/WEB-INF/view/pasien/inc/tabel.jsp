<%@page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<div class="table-responsive">
	<table class="table table-striped table-bordered table-hover">
		<thead>
			<tr>
				<th>NO RM</th>
				<th>Nama Pasien</th>
				<th>Jenis Kelamin</th>
				<th>Alamat</th>
				<th>No Telp</th>
				<th>Aksi</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="tempPasien" items="${pasiens}">
					<tr>
						<td> ${tempPasien.pasien_norm} </td>
						<td> ${tempPasien.pasien_nama } </td>
						<td> ${tempPasien.pasien_kelamin } </td> 
						<td> ${tempPasien.pasien_alamat } </td>
						<td> ${tempPasien.pasien_notelp } </td> 
						<td> 
							<a class="btn btn-warning" href="/pasien/delete/${tempPasien.pasien_id}">Delete</a>
							<a class="btn btn-info" href="/pasien/update/${tempPasien.pasien_id}">Update</a>
						</td>
					</tr>
				</c:forEach>
		</tbody>
	</table>
</div>