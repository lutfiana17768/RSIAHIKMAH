<%@page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
            <c:set var="req" value="${pageContext.request}" />
            <c:set var="url">${req.requestURL}</c:set>
            <c:set var="uri" value="${req.requestURI}" />
            <c:set var="baseURL" value="${fn:substring(url, 0, fn:length(url) - fn:length(uri))}${req.contextPath}/" />
                <div class="table-responsive">
                    <table class="table table-striped table-bordered table-hover">
                        <thead>
                            <tr>
                                <th>File</th>
                                <th>Nama Pemeriksaan</th>
                                <th>Hasil</th>
                                <th>Jumlah</th>
                                <th>Harga</th>
                                <th>Sub Total</th>
                                <th>Action</th>
                            </tr>
                        </thead>
                        <tbody id="pelayanan-penunjangFile-list" class="table-form">
                            <c:forEach var="pf" items="${pelayananModel.pmedisfile}" varStatus="loop">
                                <tr id="penunjangFile_${loop.index+1}">
                                    <td><a href="<c:url value='${baseURL}resources/uploads/images/radiologi/${pf.pmedisfileBerkas}' />" class="btn btn-secondary btn-sm" target="_blank" download>download</a></td>
                                    <td data-used="1" data-save="1" data-name="pmedisfilePemeriksaan" data-kolom-id="penunjangFileNama">${pf.pmedisfilePemeriksaan}</td>
                                    <td data-used="1" data-save="1" data-name="pmedisfileHasil" data-kolom-id="penunjangFileHasil">${pf.pmedisfileHasil}</td>
                                    <td data-used="1" data-save="1" data-name="pmedisfileJumlah" data-kolom-id="penunjangFileJumlah">${pf.pmedisfileJumlah}</td>
                                    <td data-used="1" data-save="1" data-name="pmedisfileHarga" data-kolom-id="penunjangFileHarga">${pf.pmedisfileHarga}</td>
                                    <td>${pf.pmedisfileJumlah*pf.pmedisfileHarga}</td>
                                    <td>
                                        <button type="button" class="btn btn-danger btn-sm" onclick="deletePenunjangFile(${loop.index+1})">Delete</button>&nbsp;
                                        <button type="button" class="btn btn-primary btn-sm" onclick="editPenunjangFile(${loop.index+1})">Edit</button>
                                    </td>
                                    <td style="display:none;" data-used="1" data-save="1" data-name="pmedisfileBerkas" data-kolom-id="penunjangFileBerkas">${pf.pmedisfileBerkas}</td>
                                    <td style="display:none;" data-used="1" data-save="1" data-name="pmedisfileID" data-kolom-id="penunjangFileID">${pf.pmedisfileID}</td>

                                </tr>
                            </c:forEach>
                        </tbody>
                    </table>
                </div>