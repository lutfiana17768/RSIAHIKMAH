<%@page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>


        <div class="modal fade" id="modal-pelayanan-resep">
            <div class="modal-dialog modal-lg">
                <div class="modal-content">
                    <div class="modal-header">
                        <h4 class="modal-title">Tambah Resep</h4>
                        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                            <span aria-hidden="true">X</span>
                            <span class="sr-only">Close</span>
                        </button>
                    </div>
                    <div class="modal-body">
                        <form id="form-pelayanan-resep" class="from-horizontal">
                            <div class="form-group">
                                <label>Barang</label>
                                <input type="text" name="resep_barang" id="resep_barang" class="form-control boxed">
                            </div>
                            <div class="form-group">
                                <label>Satuan</label>
                                <input type="text" name="resep_satuan" id="resep_satuan" class="form-control boxed">
                            </div>
                            <div class="form-group">
                                <label>Jumlah</label>
                                <input type="text" name="resep_jumlah" id="resep_jumlah" class="form-control boxed">
                            </div>
                            <div class="form-group">
                                <label>Aturan Pakai</label>
                                <input type="text" name="resep_aturan" id="resep_aturan" class="form-control boxed">
                            </div>
                            <div class="form-group">
                                <label>Keterangan</label>
                                <input type="text" name="resep_keterangan" id="resep_keterangan" class="form-control boxed">
                            </div>
                            <input type="hidden" name="resep_id" id="resep_id">
                            <input type="hidden" name="resep_mode" id="resep_mode">
                            <input type="hidden" name="resep_edit" id="resep_edit">
                        </form>
                    </div>
                    <div class="modal-footer">
                        <button type="button" class="btn btn-secondary rounded-0" data-dismiss="modal">Close</button>
                        <button type="button" id="simpan-resep" class="btn btn-primary rounded-0">Simpan</button>
                    </div>
                </div>
                <!-- /.modal-content -->
            </div>
            <!-- /.modal-dialog -->
        </div>