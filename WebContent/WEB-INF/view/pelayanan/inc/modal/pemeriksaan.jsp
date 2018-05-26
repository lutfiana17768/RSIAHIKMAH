<%@page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
       <div class="modal fade" id="modal-pelayanan-periksapasien">
            <div class="modal-dialog modal-lg">
                <div class="modal-content">
                    <div class="modal-header">
                        <h4 class="modal-title">Tambah Fisik</h4>
                        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                            <span aria-hidden="true">X</span>
                            <span class="sr-only">Close</span>
                        </button>
                    </div>
                    <div class="modal-body">
                        <form id="form-pelayanan-periksapasien" class="from-horizontal">
                            <div class="form-group">
                                <label>Kode</label>
                                <input type="text" name="periksapasien_periksa_kode" id="periksapasien_periksa_kode" class="form-control boxed">
                            </div>
                            <div class="form-group">
                                <label>Nama Pemeriksaan</label>
                                <input type="text" name="periksapasien_periksa_nama" id="periksapasien_periksa_nama" class="form-control boxed">
                            </div>
                            <div class="form-group">
                                <label>Standar</label>
                                <input type="text" name="periksapasien_periksa_standar" id="periksapasien_periksa_standar" class="form-control boxed">
                            </div>
                            <div class="form-group">
                                <label>Nilai</label>
                                <input type="text" name="periksapasien_periksa_nilai" id="periksapasien_periksa_nilai" class="form-control boxed">
                            </div>
                            <div class="form-group">
                                <label>Dokter</label>
                                <input type="text" name="periksapasien_dokter_id" id="periksapasien_dokter_id" class="form-control boxed">
                            </div>
                            <div class="form-group">
                                <label>Keterangan</label>
                                <input type="text" name="periksapasien_periksa_keterangan" id="periksapasien_periksa_keterangan" class="form-control boxed">
                            </div>
                            <div class="form-group">
                                <label>Tanggal</label>
                                <input type="text" name="periksapasien_tanggal" id="periksapasien_tanggal" class="form-control boxed datepicker">
                            </div>
                            <input type="hidden" name="periksapasien_id" id="periksapasien_id">
                            <input type="hidden" name="periksapasien_mode" id="periksapasien_mode">
                            <input type="hidden" name="periksapasien_edit" id="periksapasien_edit">
                        </form>
                    </div>
                    <div class="modal-footer">
                        <button type="button" class="btn btn-secondary rounded-0" data-dismiss="modal">Close</button>
                        <button type="button" id="simpan-periksapasien" class="btn btn-primary rounded-0">Simpan</button>
                    </div>
                </div>
                <!-- /.modal-content -->
            </div>
            <!-- /.modal-dialog -->
        </div>