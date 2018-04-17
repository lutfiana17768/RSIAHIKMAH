<%@page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <div class="table-responsive">
        <table class="table table-striped table-bordered table-hover">
            <thead>
                <tr>
                    <th>Kode</th>
                    <th>Nama</th>
                    <th>Keterangan</th>
                    <th colspan="2">Action</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach var="tempKondisi" items="${kondisi}">
                        <tr>
                            <td> ${tempKondisi.kondisi_kode } </td>
                            <td> ${tempKondisi.kondisi_nama } </td>
                            <td> ${tempKondisi.kondisi_keterangan } </td>
                            <td> <a href="/kondisi/update/${tempKondisi.kondisi_id}" class="btn btn-info">Update</a>
                             <a href="/kondisi/delete/${tempKondisi.kondisi_id}" class="btn btn-warning">Delete</a></td>
                        </tr>
                </c:forEach>
            </tbody>
        </table>
    </div>