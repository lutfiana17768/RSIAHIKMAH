<%@page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

        <div class="modal fade" id="modal-pelayanan-terapi">
            <div class="modal-dialog modal-lg">
                <div class="modal-content">
                    <div class="modal-header">
                        <h4 class="modal-title">Tambah Terapi</h4>
                        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                            <span aria-hidden="true">X</span>
                            <span class="sr-only">Close</span>
                        </button>
                    </div>
                    <div class="modal-body">
                        <form id="form-pelayanan-terapi" class="from-horizontal">
                            <div class="form-group">
                                <label>Tanggal</label>
                                <input type="text" name="terapiTanggal" id="terapiTanggal" class="form-control boxed datetimepicker">
                            </div>
                            <div class="form-group">
                                <label>Barang</label>
                                <div class="select2-wrapper">
                                    <select name="terapiBarang" id="terapiBarang" class="form-control boxed select2-single">
                                        <option value="">--- Pilih Barang ---</option>
                                        <c:forEach var="barang" items="${barangs}">
                                            <option value="${barang.barangId }">
                                                ${barang.barangNama }
                                            </option>
                                        </c:forEach>
                                    </select>
                                </div>
                            </div>
                            <div class="form-group">
                                <label>Dosis</label>
                            <input type="text" name="terapiDosis" id="terapiDosis" class="form-control boxed">
                            </div>
                            <div class="form-group">
                                <label>Jumlah</label>
                                <input type="text" name="terapiJumlah" id="terapiJumlah" class="form-control boxed">
                            </div>
                            <div class="form-group">
                                <label>Harga</label>
                                <input type="text" name="terapiHarga" id="terapiHarga" class="form-control boxed">
                            </div>
                            <div class="form-group">
                                <label>Keterangan</label>
                                <input type="text" name="terapiKeterangan" id="terapiKeterangan" class="form-control boxed">
                            </div>

                            <input type="hidden" name="terapiPetugas" id="terapiPetugas"  data-value="${user.pegawai.pegawaiNama}">
                            <input type="hidden" name="terapiID" id="terapiID">
                            <input type="hidden" name="terapi_mode" id="terapi_mode">
                            <input type="hidden" name="terapi_edit" id="terapi_edit">
                        </form>
                    </div>
                    <div class="modal-footer">
                        <button type="button" class="btn btn-secondary rounded-0" data-dismiss="modal">Close</button>
                        <button type="button" id="simpan-terapi" class="btn btn-primary rounded-0">Simpan</button>
                    </div>
                </div>
                <!-- /.modal-content -->
            </div>
            <!-- /.modal-dialog -->
        </div>