<%@page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

                    <div class="table-responsive">
                        <table class="table table-striped table-bordered table-hover">
                            <thead>
                                <tr>
                                    <th>Kode IDC X</th>
                                    <th>Nama Diagnosa</th>
                                    <th>Keterangan</th>
                                    <th>Tanggal</th>
                                    <th>Action</th>
                                </tr>
                            </thead>
                            <tbody id="pelayanan-diagnosa9-list" class="table-form">
                                <c:forEach var="dp" items="${pelayananModel.diagnosa9}" varStatus="loop">
                                    <tr id="diagnosa9_${loop.index+1}">
                                        <td data-used="1" data-save="1" data-name="diagnosa9_icd9_id" data-kolom-id="diagnosa9_icd9_id">${diagnosa9_icd9_id}</td>
                                        <td data-used="1" data-save="1" data-name="diagnosa9_nama" data-kolom-id="diagnosa9_nama">${dp.diagnosa9_icd9_id}</td>
                                        <td data-used="1" data-save="1" data-name="diagnosa9_jenis" data-kolom-id="diagnosa9_jenis">${dp.diagnosa9_jenis}</td>
                                        <td data-used="1" data-save="1" data-name="diagnosa9_kasus" data-kolom-id="diagnosa9_kasus">${dp.diagnosa9_kasus}</td>
                                        <td data-used="1" data-save="1" data-name="diagnosa9_keterangan" data-kolom-id="diagnosa9_keterangan">${dp.diagnosa9_keterangan}</td>
                                        <td data-used="1" data-save="1" data-name="diagnosa9_tanggal" data-kolom-id="diagnosa9_tanggal">${dp.diagnosa9_tanggal}</td>
                                        <td>
                                            <button type="button" class="btn btn-danger btn-sm" onclick="deleteDiagnosa9(${loop.index+1})">Delete</button>&nbsp;
                                            <button type="button" class="btn btn-primary btn-sm" onclick="editDiagnosa9(${loop.index+1})">Edit</button>
                                        </td>
                                        <td style="display:none" data-used="1" data-save="1" data-name="diagnosa9_id" data-kolom-id="diagnosa9_id">${dp.diagnosa9_id}</td>
                                    </tr>
                                </c:forEach>
                            </tbody>
                        </table>
                    </div>