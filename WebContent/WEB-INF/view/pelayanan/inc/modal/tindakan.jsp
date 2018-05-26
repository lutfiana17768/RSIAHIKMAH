<%@page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

        <div class="modal fade" id="modal-pelayanan-tindakan">
            <div class="modal-dialog modal-lg">
                <div class="modal-content">
                    <div class="modal-header">
                        <h4 class="modal-title">Tambah Tindakan</h4>
                        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                            <span aria-hidden="true">X</span>
                            <span class="sr-only">Close</span>
                        </button>
                    </div>
                    <div class="modal-body">
                        <form id="form-pelayanan-tindakan" class="from-horizontal">
                            <div class="form-group">
                                <label>Tindakan</label>
                                <select name="tindakan_id" id="tindakan_id" class="form-control boxed">
                                	<option>1</option>
                                	<option>2</option>
                                	<option>3</option>
                                </select>
                            </div>
                            <div class="form-group">
                                <label>Pelaksana</label>
                                <select name="pegawai_id" id="pegawai_id" class="form-control boxed">
                                	<option>1</option>
                                	<option>2</option>
                                	<option>3</option>
                                </select>
                            </div>
                            <div class="form-group">
                                <label>Harga</label>
                                <input type="text" name="tindakanpasien_harga" id="tindakanpasien_harga" class="form-control boxed">
                            </div>
                            <input type="hidden" name="tindakan_id" id="tindakan_id">
                            <input type="hidden" name="tindakan_mode" id="tindakan_mode">
                            <input type="hidden" name="tindakan_edit" id="tindakan_edit">
                        </form>
                    </div>
                    <div class="modal-footer">
                        <button type="button" class="btn btn-secondary rounded-0" data-dismiss="modal">Close</button>
                        <button type="button" id="simpan-tindakan" class="btn btn-primary rounded-0">Simpan</button>
                    </div>
                </div>
                <!-- /.modal-content -->
            </div>
            <!-- /.modal-dialog -->
        </div>