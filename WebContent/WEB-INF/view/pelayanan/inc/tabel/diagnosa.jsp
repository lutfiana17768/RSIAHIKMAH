<%@page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>


                    <div class="table-responsive">
                        <table class="table table-striped table-bordered table-hover">
                            <thead>
                                <tr>
                                    <th>Nama Diagnosa</th>
                                    <th>Jenis Diagnosa</th>
                                    <th>Kasus</th>
                                    <th>Keterangan</th>
                                    <th>Tanggal</th>
                                    <th>Action</th>
                                </tr>
                            </thead>
                            <tbody id="pelayanan-diagnosapasien-list" class="table-form">
                            	<c:forEach var="dp" items="${pelayananModel.diagnosapasien}" varStatus="loop">
									<tr id="diagnosapasien_${loop.index+1}">
                                            <td data-used="1" data-save="1" data-name="icd.icd_id" data-kolom-id="icd">${dp.icd.icd}</td>
                                            <td data-used="1" data-save="1" data-name="diagnosapasien_jenis" data-kolom-id="diagnosapasien_jenis">${dp.diagnosapasien_jenis}</td>
                                            <td data-used="1" data-save="1" data-name="diagnosapasien_kasus" data-kolom-id="diagnosapasien_kasus">${dp.diagnosapasien_kasus}</td>
                                            <td data-used="1" data-save="1" data-name="diagnosapasien_keterangan" data-kolom-id="diagnosapasien_keterangan">${dp.diagnosapasien_keterangan}</td>
                                            <td data-used="1" data-save="1" data-name="diagnosapasien_tanggal" data-kolom-id="diagnosapasien_tanggal">${dp.diagnosapasien_tanggal}</td>
                                            <td>
									        <button type="button" class="btn btn-danger btn-sm" onclick="deleteDiagnosapasien(${loop.index+1})">Delete</button>&nbsp;
									        <button type="button" class="btn btn-primary btn-sm" onclick="editDiagnosapasien(${loop.index+1})">Edit</button>
									    </td>
                                        <td style="display:none" data-used="1" data-save="1" data-name="m_icd" data-kolom-id="m_icd">${dp.m_icd}</td>
                                        <td style="display:none" data-used="1" data-save="1" data-name="diagnosapasien_id" data-kolom-id="diagnosapasien_id">${dp.diagnosapasien_id}</td>
									</tr>
								</c:forEach>

                            </tbody>
                        </table>
                    </div>