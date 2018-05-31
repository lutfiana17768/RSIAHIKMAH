<%@page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<jsp:include page="../app/header.jsp" />
                <section class="section">
                    <div class="container">
                        <div class="col-12" id="add_Pendaftaran_form" style="display: none;">
                            <div class="card card-success">
                                <div class="card-header" style="min-height:0">
                                    <div class="header-block row" style="padding: 5px 20px">
                                        <p class="title"> Tambah Pendaftaran </p>
                                    </div>
                                </div>
                                
                                <form:form modelAttribute="PendaftaranModel" method="POST" action="/pendaftaran/store">
                                    <div class="card-block row" style="background-color: #f4f4f4">
                                        <div class="col-6">
                                            <div class="form-group">
                                                <label>Nomor Rekam Medis</label>
                                                <div class="select2-wrapper">
                                                    <form:select path="pasien.pasienID"
                                                        class="form-control input-lg select2-single">
                                                        <c:forEach var="pasien" items="${pasiens}">
                                                            <form:option value="${pasien.pasienID}"
                                                                label="${pasien.pasienNorm} - ${pasien.pasienNama}"/>
                                                        </c:forEach>
                                                    </form:select>
                                                </div>
                                            </div>
                                            
                                            <div class="form-group">
                                                <label class="control-label">Kondisi Pasien</label>
                                                <div class="select2-wrapper">
                                                    <form:select path="kondisi.kondisiID"
                                                        class="form-control input-lg select2-single">
                                                        <c:forEach var="kondisipasien" items="${kondisipasiens}">
                                                            <form:option value="${kondisipasien.kondisiID}"
                                                                label="${kondisipasien.kondisiNama}"/>
                                                        </c:forEach>
                                                    </form:select>
                                                </div>
                                            </div>
                                            
                                            
                                            <div class="form-group">
                                                <label class="control-label">Kondisi Kedatangan Pasien</label>
                                                <select class="form-control boxed form-control-sm" id="kondisi_pasien">
                                                    <option value="D">Datang Sendiri</option>
                                                    <option value="R">Rujukan</option>
                                                </select>
                                            </div>
                                            
                                            <div id="form-rujukan">
                                                <div class="form-group">
                                                    <label>Rujukan</label>
                                                    <div class="select2-wrapper">
                                                        <form:select path="rujukan.rujukanID"
                                                            class="form-control input-lg select2-single">
                                                            <c:forEach var="rujukan" items="${rujukans}">
                                                                <form:option value="${rujukan.rujukanID}"
                                                                    label="${rujukan.rujukanNama}"/>
                                                            </c:forEach>
                                                        </form:select>
                                                    </div>
                                                </div>
                                                <div class="form-group">
                                                    <label>Tindakan</label>
                                                    <div class="select2-wrapper">
                                                        <form:select path="tindakan.tindakanID"
                                                            class="form-control input-lg select2-single">
                                                            <c:forEach var="tindakan" items="${tindakans}">
                                                                <form:option value="${tindakan.tindakanID}"
                                                                    label="${tindakan.tindakanNama}"/>
                                                            </c:forEach>
                                                        </form:select>
                                                    </div>
                                                </div>
                                            </div>
                                            
                                            <div class="form-group">
                                                <label class="control-label">Poli</label>
                                                <select class="form-control boxed form-control-sm">
                                                    <option value=O">Obyn</option>
                                                    <option value="A">Anak</option>
                                                </select>
                                            </div>
                                            
                                            <div class="form-group">
                                                <label class="control-label">Jenis Pendaftaran</label>
                                                <form:select path="pendaftaranJenis" class="form-control boxed form-control-sm">
                                                    <option>Rawat Inap</option>
                                                    <option>Rawat Jalan</option>
                                                </form:select>
                                            </div>
                                            
                                            <div class="form-group">
                                                <label class="control-label">Paket</label>
                                                <div class="select2-wrapper">
                                                    <select class="form-control input-lg select2-single">
                                                        <c:forEach var="paket" items="${pakets}">
                                                            <form:option value="${paket.paketID}"
                                                                label="${paket.paketNama}"/>
                                                        </c:forEach>
                                                    </select>
                                                </div>
                                            </div>
                                            
                                            <div class="form-group">
                                                <button type="submit" class="btn btn-primary d_pasien-button">Simpan</button>
                                                <button type="button" class="btn btn-danger d_pasien-button">
                                                    <a href="/pasien/list" />Batal</a>
                                                </button>
                                            </div>
                                        </div>
                                        <div class="col-6">
                                            <div class="form-group">
                                                <label>Tgl MRS</label>
                                                <form:input path="pendaftaranMrs" placeholder="Masukan Kode" class="form-control boxed form-control-sm" />
                                            </div>
                                            <div class="form-group">
                                                <label>Jam MRS</label>
                                                <input type="text" class="form-control boxed form-control-sm" placeholder="">
                                            </div>
                                            <div class="form-group">
                                                <label class="control-label">Jenis Pendaftaran</label>
                                                <form:select path="pendaftaranJenis" class="form-control boxed form-control-sm">
                                                    <option>RJ</option>
                                                    <option>RI</option>
                                                </form:select>
                                            </div>
                                            <div class="form-group">
                                                <label class="control-label">Kelas Pendaftaran</label>
                                                <form:select path="pendaftaranJenis" class="form-control boxed form-control-sm">
                                                        <option>I</option>
                                                        <option>II</option>
                                                        <option>III</option>
                                                        <option>VIP</option>
                                                        <option>VVIP</option>
                                                </form:select>
                                            </div>
                                            <div class="form-group">
                                                <label class="control-label">Dokter</label>
                                                <form:select path="pendaftaranJenis" class="form-control boxed form-control-sm">
                                                    <option value="">--- Pilih Dokter ---</option>
                                                    <c:forEach var="pegawai" items="${pegawais}">
                                                        <option value="${pegawai.pegawaiID }">
                                                            ${pegawai.pegawaiNama }
                                                        </option>
                                                    </c:forEach>
                                                </form:select>
                                            </div>
                                            <div class="container form-group" style="float: right;">
                                                <button type="submit" class="btn btn-primary d_pasien-button">Simpan</button>
                                            </div>
                                        </div>
                                    </div>
                                </form:form>
                            </div>
                        </div>
                        <div class="container">
                            <div class="form-group">
                                <button type="button" class="btn btn-sm btn-primary" id="add_Pendaftaran">Tambah</button>
                            </div>
                        </div>
                        <div class="container">
                            <div class="card card-success">
                                <div class="card-header" style="min-height:0">
                                    <div class="header-block" style="padding: 5px 20px">
                                        <p class="title"> Data Pendaftaran </p>
                                    </div>
                                </div>
                                <div class="card-block" style="background-color: #f4f4f4">
                                    <div class="table-responsive">
                                        <table class="table table-striped table-bordered table-hover">
                                            <thead>
                                                <tr>
                                                    <th>Nomor RM</th>
                                                    <th>Nama</th>
                                                    <th>Alamat</th>
                                                    <!-- <th>Aksi</th> -->
                                                </tr>
                                            </thead>
                                            <tbody>
                                                <c:forEach var="pendaftaran" items="${pendaftarans}">
                                                    <tr>
                                                        <td>${pendaftaran.pasien.pasienNorm}</td>
                                                        <td>${pendaftaran.pasien.pasienNama}</td>
                                                        <td>${pendaftaran.pasien.pasienAlamat}</td>
                                                        <!-- <td>
                                                            <a href="/pendaftaran/update/${pendaftaran.pendaftaranID}" class="btn btn-info rounded-0">Update</a>
                                                            <a href="/pendaftaran/delete/${pendaftaran.pendaftaranID}" class="btn btn-warning rounded-0">Delete</a>
                                                        </td> -->
                                                    </tr>
                                                </c:forEach>
                                            </tbody>
                                        </table>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </section>
<jsp:include page="../app/footer.jsp" />
