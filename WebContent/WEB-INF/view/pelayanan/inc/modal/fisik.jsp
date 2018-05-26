<%@page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

		<div class="modal fade" id="modal-pelayanan-riwayatperiksa">
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
						<form id="form-pelayanan-riwayatperiksa" class="from-horizontal">
							<div class="form-group">
								<label>TInggi</label>
								<input type="text" name="periksa_tb" id="periksa_tb" class="form-control boxed">
							</div>
                            <div class="form-group">
                                <label>Berat</label>
                                <input type="text" name="periksa_bb" id="periksa_bb" class="form-control boxed">
                            </div>
                            <div class="form-group">
                                <label>Detak Jantung</label>
                                <input type="text" name="periksa_jantung" id="periksa_jantung" class="form-control boxed">
                            </div>
                            <div class="form-group">
                                <label>Tekanan Darah </label>
                                <input type="text" name="periksa_darah" id="periksa_darah" class="form-control boxed">
                            </div>
                            <div class="form-group">
                                <label>Suhu</label>
                                <input type="text" name="periksa_suhu" id="periksa_suhu" class="form-control boxed">
                            </div>
                            <div class="form-group">
                                <label>Nafas</label>
                                <input type="text" name="periksa_nafas" id="periksa_nafas" class="form-control boxed">
                            </div>
                            <div class="form-group">
                                <label>Keluhan</label>
                                <input type="text" name="periksa_keluhan" id="periksa_keluhan" class="form-control boxed">
                            </div>
                            <div class="form-group">
                                <label>Pemeriksa</label>
                                <input type="text" name="periksa_pemeriksa" id="periksa_pemeriksa" class="form-control boxed">
                            </div>
                            <div class="form-group">
                                <label>Tanggal</label>
                                <input type="text" name="periksa_tanggal" id="periksa_tanggal" class="form-control boxed">
                            </div>
                            <input type="hidden" name="periksa_id" id="periksa_id">
							<input type="hidden" name="riwayatperiksa_mode" id="riwayatperiksa_mode">
							<input type="hidden" name="riwayatperiksa_edit" id="riwayatperiksa_edit">
						</form>
					</div>
					<div class="modal-footer">
						<button type="button" class="btn btn-secondary rounded-0" data-dismiss="modal">Close</button>
						<button type="button" id="simpan-riwayatperiksa" class="btn btn-primary rounded-0">Simpan</button>
					</div>
				</div>
				<!-- /.modal-content -->
			</div>
			<!-- /.modal-dialog -->
		</div>