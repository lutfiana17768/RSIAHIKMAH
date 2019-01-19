<%@page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<table class="table table-striped table-bordered table-hover">
    <thead>
        <tr>
            <th valign="middle">Nama PBF / Supplier</th>
            <th valign="middle">Kode PBF / Supplier</th>
            <th valign="middle">Alamat PBF / Supplier</th>
            <th valign="middle">Telepon PBF / Supplier</th>
            <%--<th valign="middle">Fax PBF / Supplier</th>
            <th valign="middle">Email PBF / Supplier</th>--%>
            <th valign="middle">Bidang PBF / Supplier</th>
            <th valign="middle">Contact Person</th>
            <th valign="middle">Keterangan</th>
        </tr>
    </thead>
    <tbody>
         <c:forEach var="tempResult" items="${result}">
            <tr>
            <c:url var="updateLink" value="/perusahaan/form-update">
           		<c:param name="perusahaanId" value="${tempResult.perusahaan_id}" />
           	</c:url>
           	<c:url var="deleteLink" value="/perusahaan/delete">
           		<c:param name="perusahaanId" value="${tempResult.perusahaan_id}" />
           	</c:url>
              <td> ${tempResult.perusahaanNama } </td>
              <td> ${tempResult.perusahaanKode } </td>
              <td> ${tempResult.perusahaanAlamat } </td>
              <td> ${tempResult.perusahaanNoTelp } </td>
<%--              <td> ${tempResult.perusahaanFax } </td>
              <td> ${tempResult.perusahaanEmail } </td>
--%>
              <td> ${tempResult.perusahaanBidang } </td>
              <td> ${tempResult.perusahaanContactPerson } </td>
              <td> ${tempResult.perusahaanKeterangan}</td>
              <td> <a href="${updateLink }" class="btn btn-info">Update</a>
               <a href="${deleteLink }" class="btn btn-warning">Delete</a></td>
            </tr>
        </c:forEach>
    </tbody>
</table>