<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link href="<c:url value="/resources/css/app.css "/>" rel="stylesheet" type="text/css"/>
<link href="<c:url value="/resources/css/vendor.css "/>" rel="stylesheet" type="text/css"/>
<link href="<c:url value="/resources/css/bootstrap.min.css "/>" rel="stylesheet" type="text/css"/>
<link href="<c:url value="/resources/css/select2.css "/>" rel="stylesheet" type="text/css"/>
<link href="<c:url value="/resources/css/gh-pages.css "/>" rel="stylesheet" type="text/css"/>
<link href="<c:url value="/resources/css/select2.min.css "/>" rel="stylesheet" type="text/css"/>
<link rel="stylesheet" href="//select2.github.io/select2/select2-3.5.2/select2.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
		<script type="text/javascript">
		$(document).ready(function(){
			$("#add_pasien").click(function(){
			    $("#add_pasien_form").slideToggle('slow');
			});
		});
		</script>
</head>
<body>
		<div class="main-wrapper">
			<div class="app" id="app">
				<header class="header">
					<div class="nav-title">
						<h3 class="title">Pendaftaran Pasien</h3>
					</div>
					<div class="header-block header-block-collapse d-lg-none d-xl-none">
						<button class="collapse-btn" id="sidebar-collapse-btn">
							<i class="fa fa-bars"></i>
						</button>
					</div>
					<div class="header-block header-block-nav">
						<ul class="nav-profile">
							<li class="notifications new">
								<a href="" data-toggle="dropdown">
									<i class="fa fa-bell-o"></i>
									<sup>
										<span class="counter">8</span>
									</sup>
								</a>
								<div class="dropdown-menu notifications-dropdown-menu">
									<ul class="notifications-container">
										<li>
											<a href="" class="notification-item">
												<div class="img-col">
													<div class="img" style="background-image: url('assets/faces/3.jpg')"></div>
												</div>
												<div class="body-col">
													<p>
														<span class="accent">Zack Alien</span> pushed new commit:
														<span class="accent">Fix page load performance issue</span>. </p>
												</div>
											</a>
										</li>
									</ul>
									<footer>
										<ul>
											<li>
												<a href=""> View All </a>
											</li>
										</ul>
									</footer>
								</div>
							</li>
							<li class="profile dropdown">
								<a class="nav-link dropdown-toggle" data-toggle="dropdown" href="#" role="button" aria-haspopup="true" aria-expanded="false">
									<div class="img" style="background-image: url('https://avatars3.githubusercontent.com/u/3959008?v=3&s=40')"> </div>
									<span class="name"> John Doe </span>
								</a>
								<div class="dropdown-menu profile-dropdown-menu" aria-labelledby="dropdownMenu1">
									<a class="dropdown-item" href="#">
										<i class="fa fa-user icon"></i> Profile </a>
									<a class="dropdown-item" href="#">
										<i class="fa fa-bell icon"></i> Notifications </a>
									<a class="dropdown-item" href="#">
										<i class="fa fa-gear icon"></i> Settings </a>
									<div class="dropdown-divider"></div>
									<a class="dropdown-item" href="login.html">
										<i class="fa fa-power-off icon"></i> Logout </a>
								</div>
							</li>
						</ul>
					</div>
				</header>
				<aside class="sidebar">
                    <div class="sidebar-container">
                        <div class="sidebar-header">
                            <div class="brand">
                                <div class="logo">
                                    <span class="l l1"></span>
                                    <span class="l l2"></span>
                                    <span class="l l3"></span>
                                    <span class="l l4"></span>
                                    <span class="l l5"></span>
                                </div> RSIA Hikmah </div>
                        </div>
                        <nav class="menu">
                            <ul class="sidebar-menu metismenu" id="sidebar-menu">
                                <li>
                                    <a href="">
                                        <i class="fa fa-desktop"></i> Transaksi
                                        <i class="fa arrow"></i>
                                    </a>
                                    <ul class="sidebar-nav">
                                        <li>
                                            <a href="pendaftaran.html">
                                            <i class="fa fa-users"></i> Pendaftaran
                                            </a>
                                        </li>
                                        <li>
                                            <a href="pelayanan.html">
                                                <i class="fa fa-user-md"></i> &nbsp;Pelayanan
                                            </a>
                                        </li>
                                        <li>
                                            <a href="#" class="fa fa-user-md"> &nbsp;Pembayaran
                                                <i class="fa arrow"></i>
                                            </a>
                                            <ul class="sidebar-nav">
                                                <li>
                                                    <a href="#"> Kasir </a>
                                                </li>
                                                <li>
                                                    <a href="#"> Gaji </a>
                                                </li>
                                            </ul>
                                        </li>
                                    </ul>
                                </li>
                                <li>
                                    <a href="">
                                        <i class="fa fa-medkit"></i> Master Rekam Medis
                                        <i class="fa arrow"></i>
                                    </a>
                                    <ul class="sidebar-nav">
                                        <li>
                                            <a href="/com.rsia.modura/Pasien/tambah">
                                            <i class="fa fa-users"></i> Pasien
                                            </a>
                                        </li>
                                        <li>
                                            <a href="/com.rsia.modura/Tindakan/tambah">
                                            <i class="fa fa-users"></i> Tindakan
                                            </a>
                                        </li>
                                        <li>
                                            <a href="/com.rsia.modura/Kamar/list">
                                            <i class="fa fa-users"></i> Kamar
                                            </a>
                                        </li>
                                        <li>
                                            <a href="/com.rsia.modura/Ruang/list">
                                            <i class="fa fa-users"></i> Ruang
                                            </a>
                                        </li>
                                        <li>
                                            <a href="/com.rsia.modura/Paket/list">
                                            <i class="fa fa-users"></i> Paket
                                            </a>
                                        </li>
                                        <li>
                                            <a href="/com.rsia.modura/Rujukan/tambah">
                                            <i class="fa fa-users"></i> Rujukan
                                            </a>
                                        </li>
                                        <li>
                                            <a href="/com.rsia.modura/History/list">
                                            <i class="fa fa-users"></i> History Pasien
                                            </a>
                                        </li>
                                    </ul>
                                </li>
                                <li>
                                    <a href="">
                                        <i class="fa fa-map-marker"></i> Master Wilayah
                                        <i class="fa arrow"></i>
                                    </a>
                                    <ul class="sidebar-nav">
                                        <li>
                                            <a href="/com.rsia.modura/provinsi/tambah/?page=1&limit=10">
                                            <i class="fa fa-users"></i> Propinsi
                                            </a>
                                        </li>
                                        <li>
                                            <a href="/com.rsia.modura/kota/tambah/?page=1&limit=10">
                                            <i class="fa fa-users"></i> Kota
                                            </a>
                                        </li>
                                        <li>
                                            <a href="/com.rsia.modura/kecamatan/tambah/?page=1&limit=10">
                                            <i class="fa fa-users"></i> Kecamatan
                                            </a>
                                        </li>
                                        <li>
                                            <a href="/com.rsia.modura/kelurahan/tambah/?page=1&limit=10">
                                            <i class="fa fa-users"></i> Kelurahan
                                            </a>
                                        </li>
                                    </ul>
                                </li>
                                <li>
                                    <a href="">
                                        <i class="fa fa-plus-square"></i> Master Pelengkap
                                        <i class="fa arrow"></i>
                                    </a>
                                    <ul class="sidebar-nav">
                                        <li>
                                            <a href="/com.rsia.modura/Kondisi/list">
                                            <i class="fa fa-users"></i> Kondisi Pasien
                                            </a>
                                        </li>
                                        <li>
                                            <a href="/com.rsia.modura/pegawai/tambah">
                                            <i class="fa fa-users"></i> Pegawai
                                            </a>
                                        </li>
                                        <li>
                                            <a href="/com.rsia.modura/Agama/list">
                                            <i class="fa fa-users"></i> Agama
                                            </a>
                                        </li>
                                        <li>
                                            <a href="/com.rsia.modura/Kelas/list">
                                            <i class="fa fa-users"></i> Kelas
                                            </a>
                                        </li>
                                    </ul>
                                </li>
                            </ul>
                        </nav>
                    </div>
                    
                </aside>
				<div class="sidebar-overlay" id="sidebar-overlay"></div>
				<div class="sidebar-mobile-menu-handle" id="sidebar-mobile-menu-handle"></div>
				<div class="mobile-menu-handle"></div>
				<article class="content forms-page">
					<section class="section">
						<div class="container"   id="add_passien_form">
							<div class="card card-primary  col-md-10">
								<div class="row card-header" style="min-height:0; padding:-10px">
									<div class="header-block" style="padding: 5px 20px">
										<p class="title"> Tambah Pasien </p>
									</div>
								</div>
								<form:form modelAttribute="pasienModel" method="POST" action="update">
								<div class="row sameheight-container" style="background: white">
									<div class="col-md-6 d_pasien-content">
										<div class="card card-block sameheight-item d_pasien-form">

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
				</article>
			</div>
		</div>
		<!-- Reference block for JS -->
		<div class="ref" id="ref">
			<div class="color-primary"></div>
			<div class="chart">
				<div class="color-primary"></div>
				<div class="color-secondary"></div>
			</div>
		</div>

		<script>
			(function(i, s, o, g, r, a, m)
			{
				i['GoogleAnalyticsObject'] = r;
				i[r] = i[r] || function()
				{
					(i[r].q = i[r].q || []).push(arguments)
				}, i[r].l = 1 * new Date();
				a = s.createElement(o),
					m = s.getElementsByTagName(o)[0];
				a.async = 1;
				a.src = g;
				m.parentNode.insertBefore(a, m)
			})(window, document, 'script', 'https://www.google-analytics.com/analytics.js', 'ga');
			ga('create', 'UA-80463319-4', 'auto');
			ga('send', 'pageview');
		</script>
		<script src="<c:url value="/resources/js/vendor.js" />"></script>
		<script src="<c:url value="/resources/js/app.js" />"></script>
		<script src="<c:url value="/resources/js/jquery.js" />"></script>
	</body>
</html>