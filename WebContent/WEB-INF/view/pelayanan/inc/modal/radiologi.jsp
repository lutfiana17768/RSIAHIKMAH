<%@page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
    <%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>
        <%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
            <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

                <div class="modal fade" id="modal-pelayanan-penunjangFile">
                    <div class="modal-dialog modal-lg">
                        <div class="modal-content">
                            <div class="modal-header">
                                <h4 class="modal-title">Tambah Radiologi</h4>
                                <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                                    <span aria-hidden="true">X</span>
                                    <span class="sr-only">Close</span>
                                </button>
                            </div>
                            <div class="modal-body">
                                <form id="form-pelayanan-penunjangFile" class="from-horizontal">
                                    <div class="form-group">
                                        <label>Upload Berkas</label>
                                        <input type="file" id="penunjangFileUpload" name="files">
                                    </div>
                                    <div class="form-group">
                                        <label>Nama Pemeriksaan</label>
                                        <input type="text" id="penunjangFileNama" name="penunjangFileNama" class="form-control boxed">
                                    </div><div class="form-group">
                                        <label>Hasil</label>
                                        <input type="text" id="penunjangFileHasil" name="penunjangFileHasil" class="form-control boxed">
                                    </div>
                                    <div class="form-group">
                                        <label>Jumlah</label>
                                        <input type="text" id="penunjangFileJumlah" name="penunjangFileJumlah" class="form-control boxed">
                                    </div>
                                    <div class="form-group">
                                        <label>Harga</label>
                                        <input type="text" id="penunjangFileHarga" name="penunjangFileHarga" class="form-control boxed">
                                    </div>
                                    <input type="hidden" name="penunjangFileID" id="penunjangFileID">
                                    <input type="hidden" name="penunjangFileBerkas" id="penunjangFileBerkas">
                                    <input type="hidden" name="penunjangFile_mode" id="penunjangFile_mode">
                                    <input type="hidden" name="penunjangFile_edit" id="penunjangFile_edit">
                                </form>
                            </div>
                            <div class="modal-footer">
                                <button type="button" class="btn btn-secondary rounded-0" data-dismiss="modal">Close</button>
                                <button type="button" id="simpan-penunjangFile" class="btn btn-primary rounded-0">Simpan</button>
                            </div>
                        </div>
                        <!-- /.modal-content -->
                    </div>
                    <!-- /.modal-dialog -->
                </div>