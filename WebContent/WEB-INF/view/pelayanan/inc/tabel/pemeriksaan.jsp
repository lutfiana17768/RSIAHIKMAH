<%@page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

                    <div class="table-responsive">
                        <table class="table table-striped table-bordered table-hover">
                            <thead>
                                <tr>
                                    <th>Kode</th>
                                    <th>Nama Pemeriksaan</th>
                                    <th>Standar</th>
                                    <th>Nilai</th>
                                    <th>Dokter</th>
                                    <th>Keterangan</th>
                                    <th>Tanggal</th>
                                </tr>
                            </thead>
                            <tbody id="pelayanan-periksapasien-list" class="table-form">
                                <c:forEach var="pp" items="${pelayananModel.periksapasien}" varStatus="loop">
                                    <tr id="riwayatperiksa_${loop.index+1}">
                                            <td data-used="1" data-save="1" data-name="periksapasien_periksa_kode" data-kolom-id="periksapasien_periksa_kode">${pp.periksapasien_periksa_kode}</td>
                                            <td data-used="1" data-save="1" data-name="periksapasien_periksa_nama" data-kolom-id="periksapasien_periksa_nama">${pp.periksapasien_periksa_nama}</td>
                                            <td data-used="1" data-save="1" data-name="periksapasien_periksa_standar" data-kolom-id="periksapasien_periksa_standar">${pp.periksapasien_periksa_standar}</td>
                                            <td data-used="1" data-save="1" data-name="periksapasien_periksa_nilai" data-kolom-id="periksapasien_periksa_nilai">${pp.periksapasien_periksa_nilai}</td>
                                            <td data-used="1" data-save="1" data-name="periksapasien_dokter_id" data-kolom-id="periksapasien_dokter_id">${pp.periksapasien_dokter_id}</td>
                                            <td data-used="1" data-save="1" data-name="periksapasien_periksa_keterangan" data-kolom-id="periksapasien_periksa_keterangan">${pp.periksapasien_periksa_keterangan}</td>
                                            <td data-used="1" data-save="1" data-name="periksapasien_tanggal" data-kolom-id="periksapasien_tanggal">${pp.periksapasien_tanggal}</td>
                                        <td>
                                            <button type="button" class="btn btn-danger btn-sm" onclick="deleteRiwayatperiksa(${loop.index+1})">Delete</button>
                                            <button type="button" class="btn btn-primary btn-sm" onclick="editRiwayatperiksa(${loop.index+1})">Edit</button>
                                        </td>
                                        <td style="display:none" data-used="1" data-save="1" data-name="periksa_id" data-kolom-id="periksa_id">${rp.periksa_id}</td>
                                    </tr>
                                </c:forEach>
                            </tbody>
                        </table>
                    </div>