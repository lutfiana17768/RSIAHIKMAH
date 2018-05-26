<%@page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

        <div class="modal fade" id="modal-pelayanan-penunjangtrans">
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
                        <form id="form-pelayanan-penunjangtrans" class="from-horizontal">
                            <div class="form-group">
                                <label>Nama Pemeriksaan</label>
                                <input type="text" name="penunjangtrans.penunjang_id" id="penunjang_id" class="form-control boxed">
                            </div>
                            <div class="form-group">
                                <label>Hasil</label>
                                <input type="text" name="penunjangtrans_hasil" id="penunjangtrans_hasil" class="form-control boxed">
                            </div>
                            <div class="form-group">
                                <label>Nilai Normal</label>
                                <input type="text" name="penunjangtrans_standar" id="penunjangtrans_standar" class="form-control boxed">
                            </div>
                            <div class="form-group">
                                <label>Satuan</label>
                                <input type="text" name="penunjangtrans_satuan" id="penunjangtrans_satuan" class="form-control boxed">
                            </div>
                            <div class="form-group">
                                <label>Jumlah</label>
                                <input type="text" name="penunjangtrans_jumlah" id="penunjangtrans_jumlah" class="form-control boxed">
                            </div>
                            <div class="form-group">
                                <label>Harga</label>
                                <input type="text" name="penunjangtrans_harga" id="penunjangtrans_harga" class="form-control boxed">
                            </div>
                            <div class="form-group">
                                <label>Sub Total</label>
                                <input type="text" name="penunjangtrans_subtotal" id="penunjangtrans_subtotal" class="form-control boxed">
                            </div>
                            <input type="hidden" name="penunjangtrans_id" id="penunjangtrans_id">
                            <input type="hidden" name="penunjangtrans_mode" id="penunjangtrans_mode">
                            <input type="hidden" name="penunjangtrans_edit" id="penunjangtrans_edit">
                        </form>
                    </div>
                    <div class="modal-footer">
                        <button type="button" class="btn btn-secondary rounded-0" data-dismiss="modal">Close</button>
                        <button type="button" id="simpan-penunjangtrans" class="btn btn-primary rounded-0">Simpan</button>
                    </div>
                </div>
                <!-- /.modal-content -->
            </div>
            <!-- /.modal-dialog -->
        </div>