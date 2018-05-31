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
								<form:hidden path="pasienID" />
								<form:hidden path="pasienCreatedDate" />
								<form:hidden path="pasienCreatedBy" />
								<form:hidden path="pasienAktif" />
								<div class="form-group">
				<div class="row sameheight-container" style="background: white">
					<div class="col-md-6 d_pasien-content">
						<div class="card card-block sameheight-item d_pasien-form">
								<form:hidden path="pasienID" />
								<div class="form-group">
                                    <label>No RM</label>
                                    <form:input path="pasienNorm" placeholder="Masukan No RM" class="form-control" readonly="true"/>
                                 </div>		                                         
                                 
                                <div class="form-group">
                                    <label>NIK</label>
                                    <form:input path="Pasien_nik" placeholder="Masukan NIK" class="form-control"/>
                                </div>

                                <div class="form-group">
                                    <label>Sebutan</label>
                                    <form:input path="pasienSebut" placeholder="Tuan/Nona/Nyonya/Anak" class="form-control" maxlength="5"/>
                                </div>

                                <div class="form-group">
                                    <label>Nama</label>
                                    <form:input path="pasienNama" placeholder="Masukan Nama" class="form-control"/>
                                </div>
								
								<div class="form-group">
									<label>Kelamin</label>
									<div class="select2-wrapper">	
										<form:select path="pasienKelamin" items="${Jeniskelamin}" class="form-control"/>
									</div>
                                </div>
                                
                                <div class="form-group">
                                    <label>Alamat</label>
                                    <form:input path="pasienAlamat" placeholder="Masukan Alamat" class="form-control"/>
                                </div>
								
								<div class="form-group">
									<label>Provinsi</label>
									<div class="select2-wrapper">	
										<form:select path="m_propinsiID" class="form-control input-lg select2-single">
											<c:forEach var="prov" items="${provinsi}">
	                                         	<form:option value="${prov.propinsi_id }" label="${prov.propinsiNama }" />
	                                         </c:forEach>
										</form:select>
									</div>
                                </div>
                                
								<div class="form-group">
									<label>Kota</label>
									<div class="select2-wrapper">
										<form:select path="m_kotaID" class="form-control input-lg select2-single">
											<c:forEach var="tempKota" items="${Kota}">
	                                         	<form:option value="${tempKota.kota_id }" label="${tempKota.kotaNama }" />
	                                         </c:forEach>
										</form:select>
									</div>
                                </div>
								
								<div class="form-group">
									<label>Kecamatan</label>
									<div class="select2-wrapper">
										<form:select path="m_kecamatanID" class="form-control input-lg select2-single">
											<c:forEach var="Kecamatan" items="${Kecamatan}">
	                                         	<form:option value="${Kecamatan.kecamatan_id }" label="${Kecamatan.kecamatanNama }" />
	                                         </c:forEach>
										</form:select>
									</div>
                                </div>

								<div class="form-group">
									<label>Kelurahan</label>
									<div class="select2-wrapper">
										<form:select path="m_kelurahanID" class="form-control input-lg select2-single">
											<c:forEach var="kelurahan" items="${Kelurahan}">
	                                         	<form:option value="${kelurahan.kelurahan_id }" label="${kelurahan.kelurahanNama }" />
	                                         </c:forEach>
										</form:select>
									</div>
                                </div>
                                
                                <div class="form-group">
									<label>Telepon</label>
                                    <form:input path="pasienNotelp" placeholder="Telepon" class="form-control"/>
                                </div>
								
								 <div class="form-group">
									<label>HP</label>
                                    <form:input path="pasienNohp" placeholder="HP" class="form-control"/>
                                </div>
                                
                                <div class="form-group">
									<label>Golongan Darah</label>
									<div class="select2-wrapper">	
										<form:select path="pasienGoldarah" items="${Goldar}" class="form-control"/>
									</div>
                                </div>

								<div class="form-group">
                                    <label>BB</label>
                                    <form:input path="pasienBb" placeholder="Masukan BB" class="form-control"/>
                                </div>

                                <div class="form-group">
                                    <label>TB</label>
                                    <form:input path="pasienTb" placeholder="Masukan TB" class="form-control"/>
                                </div>
                                
                                												
								<div class="form-group">
									<label for="exampleInputPassword1">Kota Lahir</label>
									<div class="select2-wrapper">
										<form:select path="m_kotaID_tempatlahir" class="form-control input-lg select2-single">
											<c:forEach var="tempKota" items="${Kota}">
	                                         	<form:option value="${tempKota.kota_id }" label="${tempKota.kotaNama }" />
	                                         </c:forEach>
										</form:select>
									</div>
                                </div>
                                
                                <div class="form-group">
                                    <label>Domisili</label>
                                    <form:input path="pasienDomisili" placeholder="Masukan Domisili" class="form-control"/>
                                </div>
                                
                                
                                <div class="form-group">
                                    <label>Keterangan</label>
                                    <form:input path="pasienKeterangan" placeholder="Masukan Keterangan" class="form-control"/>
                                </div>	
                                
                                <div class="form-group">
                                    <label>Status Pekerjaan</label>
                                    <form:input path="pasienPekerjaan" placeholder="Masukan Pekerjaan" class="form-control"/>
                                </div>
                                
								<div class="form-group">
                                    <label>Status Nikah</label>
                                    <form:input path="pasienStatusnikah" placeholder="Masukan Status Nikah" class="form-control"/>
                                </div>
                                
                                <div class="form-group">
									<label class="control-label" id="m_pendidikanID">Pekerjaan</label>
									<div class="select2-wrapper">
										<form:select path="m_pekerjaanID" class="form-control input-lg select2-single">
											<c:forEach var="pend" items="${Pendidikan}">
	                                         	<form:option value="${pend.pendidikanID }" label="${pend.pendidikanNama }" />
	                                         </c:forEach>
										</form:select>
									</div>
								</div>
								
								<div class="form-group">
									<label for="exampleInputPassword1">Agama</label>
									<div class="select2-wrapper">
										<form:select path="m_agamaID" items="${Agama}" class="form-control"/>
									</div>
                                </div>

								<div class="form-group">
									<label class="control-label" id="m_pendidikanID">Pendidikan</label>
									<div class="select2-wrapper">
										<form:select path="m_pendidikanID" class="form-control input-lg select2-single">
											<c:forEach var="pend" items="${Pendidikan}">
	                                         	<form:option value="${pend.pendidikanID }" label="${pend.pendidikanNama }" />
	                                         </c:forEach>
										</form:select>
									</div>
								</div>
								
								<div class="form-group">
                                    <label>Alergi</label>
                                    <form:input path="pasienAlergi" placeholder="Masukan Alergi" class="form-control"/>
                                </div>	  
								
								<div class="card-header" style="min-height: 0">
						<div class="header-block" style="padding: 5px 20px">
							<p class="title">Wali Pasien</p>
						</div>
					</div>
					<div class="card-block" style="background-color: #f4f4f4">
						<div class="form-group">
							<label>Nama Wali</label>
							<form:input path="waliNama" placeholder="Masukan Nama Wali"
								class="form-control" />
						</div>

						<div class="form-group">
							<label>Tanggal Lahir</label>
							<!-- 
								<form:input path="waliTgllahir"
									class="form-control" type='date'/>
								 -->
						</div>

						<div class="form-group">
							<label>Kelamin</label>
							<div class="select2-wrapper">
								<form:select path="waliKelamin" items="${Jeniskelamin}"
									class="form-control" />

							</div>
						</div>

						<div class="form-group">
							<label>No. Telpon</label>
							<form:input path="waliTelepon" placeholder="Masukan No Telp"
								class="form-control" />
						</div>

						<div class="form-group">
							<label>Alamat</label>
							<form:input path="waliAlamat" placeholder="Masukan Alamat"
								class="form-control" />
						</div>

						<div class="form-group">
							<label>Hubungan</label>
							<form:input path="waliHubungan"
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