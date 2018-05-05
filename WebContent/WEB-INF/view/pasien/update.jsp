<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<jsp:include page="../app/header.jsp" />
	<section class="section">
		<div class="container"   id="add_passien_form">
			<div class="card card-primary  col-md-10">
				<div class="row card-header" style="min-height:0; padding:-10px">
					<div class="header-block" style="padding: 5px 20px">
						<p class="title"> Tambah Pasien </p>
					</div>
				</div>
				<form:form modelAttribute="pasienModel" method="POST" action="/pasien/update">
								<form:hidden path="pasien_id" />
								<form:hidden path="pasien_created_date" />
								<form:hidden path="pasien_created_by" />
								<form:hidden path="pasien_aktif" />
								<div class="form-group">
				<div class="row sameheight-container" style="background: white">
					<div class="col-md-6 d_pasien-content">
						<div class="card card-block sameheight-item d_pasien-form">
								<form:hidden path="pasien_id" />
								<div class="form-group">
                                    <label>No RM</label>
                                    <form:input path="pasien_norm" placeholder="Masukan No RM" class="form-control" readonly="true"/>
                                 </div>		                                         
                                 
                                <div class="form-group">
                                    <label>NIK</label>
                                    <form:input path="Pasien_nik" placeholder="Masukan NIK" class="form-control"/>
                                </div>

                                <div class="form-group">
                                    <label>Sebutan</label>
                                    <form:input path="pasien_sebut" placeholder="Tuan/Nona/Nyonya/Anak" class="form-control" maxlength="5"/>
                                </div>

                                <div class="form-group">
                                    <label>Nama</label>
                                    <form:input path="pasien_nama" placeholder="Masukan Nama" class="form-control"/>
                                </div>
								
								<div class="form-group">
									<label>Kelamin</label>
									<div class="select2-wrapper">	
										<form:select path="pasien_kelamin" items="${Jeniskelamin}" class="form-control"/>
									</div>
                                </div>
                                
                                <div class="form-group">
                                    <label>Alamat</label>
                                    <form:input path="pasien_alamat" placeholder="Masukan Alamat" class="form-control"/>
                                </div>
								
								<div class="form-group">
									<label>Provinsi</label>
									<div class="select2-wrapper">	
										<form:select path="m_propinsi_id" class="form-control input-lg select2-single">
											<c:forEach var="prov" items="${provinsi}">
	                                         	<form:option value="${prov.propinsi_id }" label="${prov.propinsiNama }" />
	                                         </c:forEach>
										</form:select>
									</div>
                                </div>
                                
								<div class="form-group">
									<label>Kota</label>
									<div class="select2-wrapper">
										<form:select path="m_kota_id" class="form-control input-lg select2-single">
											<c:forEach var="tempKota" items="${Kota}">
	                                         	<form:option value="${tempKota.kota_id }" label="${tempKota.kotaNama }" />
	                                         </c:forEach>
										</form:select>
									</div>
                                </div>
								
								<div class="form-group">
									<label>Kecamatan</label>
									<div class="select2-wrapper">
										<form:select path="m_kecamatan_id" class="form-control input-lg select2-single">
											<c:forEach var="Kecamatan" items="${Kecamatan}">
	                                         	<form:option value="${Kecamatan.kecamatan_id }" label="${Kecamatan.kecamatanNama }" />
	                                         </c:forEach>
										</form:select>
									</div>
                                </div>

								<div class="form-group">
									<label>Kelurahan</label>
									<div class="select2-wrapper">
										<form:select path="m_kelurahan_id" class="form-control input-lg select2-single">
											<c:forEach var="kelurahan" items="${Kelurahan}">
	                                         	<form:option value="${kelurahan.kelurahan_id }" label="${kelurahan.kelurahanNama }" />
	                                         </c:forEach>
										</form:select>
									</div>
                                </div>
                                
                                <div class="form-group">
									<label>Telepon</label>
                                    <form:input path="pasien_notelp" placeholder="Telepon" class="form-control"/>
                                </div>
								
								 <div class="form-group">
									<label>HP</label>
                                    <form:input path="pasien_nohp" placeholder="HP" class="form-control"/>
                                </div>
                                
                                <div class="form-group">
									<label>Golongan Darah</label>
									<div class="select2-wrapper">	
										<form:select path="pasien_goldarah" items="${Goldar}" class="form-control"/>
									</div>
                                </div>

								<div class="form-group">
                                    <label>BB</label>
                                    <form:input path="pasien_bb" placeholder="Masukan BB" class="form-control"/>
                                </div>

                                <div class="form-group">
                                    <label>TB</label>
                                    <form:input path="pasien_tb" placeholder="Masukan TB" class="form-control"/>
                                </div>
                                
                                												
								<div class="form-group">
									<label for="exampleInputPassword1">Kota Lahir</label>
									<div class="select2-wrapper">
										<form:select path="m_kota_id_tempatlahir" class="form-control input-lg select2-single">
											<c:forEach var="tempKota" items="${Kota}">
	                                         	<form:option value="${tempKota.kota_id }" label="${tempKota.kotaNama }" />
	                                         </c:forEach>
										</form:select>
									</div>
                                </div>
                                
                                <div class="form-group">
                                    <label>Domisili</label>
                                    <form:input path="pasien_domisili" placeholder="Masukan Domisili" class="form-control"/>
                                </div>
                                
                                
                                <div class="form-group">
                                    <label>Keterangan</label>
                                    <form:input path="pasien_keterangan" placeholder="Masukan Keterangan" class="form-control"/>
                                </div>	
                                
                                <div class="form-group">
                                    <label>Status Pekerjaan</label>
                                    <form:input path="pasien_pekerjaan" placeholder="Masukan Pekerjaan" class="form-control"/>
                                </div>
                                
								<div class="form-group">
                                    <label>Status Nikah</label>
                                    <form:input path="pasien_statusnikah" placeholder="Masukan Status Nikah" class="form-control"/>
                                </div>
                                
                                <div class="form-group">
									<label class="control-label" id="m_pendidikan_id">Pekerjaan</label>
									<div class="select2-wrapper">
										<form:select path="m_pekerjaan_id" class="form-control input-lg select2-single">
											<c:forEach var="pend" items="${Pendidikan}">
	                                         	<form:option value="${pend.pendidikan_id }" label="${pend.pendidikanNama }" />
	                                         </c:forEach>
										</form:select>
									</div>
								</div>
								
								<div class="form-group">
									<label for="exampleInputPassword1">Agama</label>
									<div class="select2-wrapper">
										<form:select path="m_agama_id" items="${Agama}" class="form-control"/>
									</div>
                                </div>

								<div class="form-group">
									<label class="control-label" id="m_pendidikan_id">Pendidikan</label>
									<div class="select2-wrapper">
										<form:select path="m_pendidikan_id" class="form-control input-lg select2-single">
											<c:forEach var="pend" items="${Pendidikan}">
	                                         	<form:option value="${pend.pendidikan_id }" label="${pend.pendidikanNama }" />
	                                         </c:forEach>
										</form:select>
									</div>
								</div>
								
								<div class="form-group">
                                    <label>Alergi</label>
                                    <form:input path="pasien_alergi" placeholder="Masukan Alergi" class="form-control"/>
                                </div>	  
								
								<div class="card-header" style="min-height: 0">
						<div class="header-block" style="padding: 5px 20px">
							<p class="title">Wali Pasien</p>
						</div>
					</div>
					<div class="card-block" style="background-color: #f4f4f4">
						<div class="form-group">
							<label>Nama Wali</label>
							<form:input path="wali_nama" placeholder="Masukan Nama Wali"
								class="form-control" />
						</div>

						<div class="form-group">
							<label>Tanggal Lahir</label>
							<!-- 
								<form:input path="wali_tgllahir"
									class="form-control" type='date'/>
								 -->
						</div>

						<div class="form-group">
							<label>Kelamin</label>
							<div class="select2-wrapper">
								<form:select path="wali_kelamin" items="${Jeniskelamin}"
									class="form-control" />

							</div>
						</div>

						<div class="form-group">
							<label>No. Telpon</label>
							<form:input path="wali_telepon" placeholder="Masukan No Telp"
								class="form-control" />
						</div>

						<div class="form-group">
							<label>Alamat</label>
							<form:input path="wali_alamat" placeholder="Masukan Alamat"
								class="form-control" />
						</div>

						<div class="form-group">
							<label>Hubungan</label>
							<form:input path="wali_hubungan"
								placeholder="Masukan Hubungan" class="form-control" />
						</div>
								
                               
                                
                                <div class="form-group">
									<button type="submit" class="btn btn-primary d_pasien-button">Simpan</button>
									<button type="button" class="btn btn-danger d_pasien-button"><a href="http://localhost:8080/com.rsia.modura/Pasien/list"/>Batal</a></button>
								</div>                                     
						</div>
					</div>
				</div>
				</form:form>
			</div>
		</div>	
	</section>
<jsp:include page="../app/footer.jsp" />