<%@page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<table class="table table-striped table-bordered table-hover">
    <thead>
        <tr>
            <th>Pegawai No</th>
            <th>Nama</th>
            <th>Jabatan</th>
            <th>Jenis Kelamin</th>
            <th>Fungsional</th>
            <th>Medis</th>
            <th>Email</th>
            <th>No Hp</th>
            <th colspan="2">Action</th>
        </tr>
    </thead>
    <tbody>
        <c:forEach var="tempPegawai" items="${pegawai}">
           	<c:url var="updateLink" value="form-update">
           		<c:param name="pegawaiId" value="${tempPegawai.pegawai_id}" />
           	</c:url>
           	<c:url var="deleteLink" value="delete">
           		<c:param name="pegawaiId" value="${tempPegawai.pegawai_id}" />
           	</c:url>
           	<tr>
           		<td> ${tempPegawai.pegawaiNo } </td>
           		<td> ${tempPegawai.pegawaiNama } </td>
           		<td> ${tempPegawai.pegawaiJabatanNama } </td>
           		<td> ${tempPegawai.pegawaiKelamin } </td>
           		<td> ${tempPegawai.pegawaiFungsional } </td>
           		<td> ${tempPegawai.pegawaiMedis } </td>
           		<td> ${tempPegawai.pegawaiEmail } </td>
           		<td> ${tempPegawai.pegawaiNoHp } </td>
           		<td> <a href="${updateLink }" class="btn btn-info">Update</a>
           		 <a href="${deleteLink }" class="btn btn-warning">Delete</a></td>
           	</tr>
        
        </c:forEach>
    </tbody>
</table>