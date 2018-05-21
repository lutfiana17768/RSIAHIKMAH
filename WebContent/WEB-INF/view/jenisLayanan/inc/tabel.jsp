<%@page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <div class="table-responsive">
        <table class="table table-striped table-bordered table-hover">
            <thead>
                <tr>
                    <th>Nomor Jenis Layanan</th>
                    <th>Nama Jenis Layanan</th>
                    <th>Kategori</th>
                    <th colspan="2">Action</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach var="jenislayanan" items="${jenislayanans}">
                
                	<tr>
                		<td> ${jenislayanan.jenislayanan_nomor } </td>
                		<td> ${jenislayanan.jenislayanan_nama } </td>
                		<td> ${jenislayanan.jenislayanan_kategori } </td>
                		<td>  </td>
                		<td> <a href="/jenis-layanan/update/${jenislayanan.jenislayanan_id }" class="btn btn-info rounded-0">Update</a>
                         <a href="/jenis-layanan/delete/${jenislayanan.jenislayanan_id }" class="btn btn-warning rounded-0">Delete</a></td>
                	</tr>
                
                </c:forEach>
            </tbody>
        </table>
    </div>