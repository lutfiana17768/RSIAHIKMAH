<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link href="<c:url value="/resources/css/app.css "/>" rel="stylesheet"
	type="text/css" />
<link href="<c:url value="/resources/css/vendor.css "/>"
	rel="stylesheet" type="text/css" />
<link href="<c:url value="/resources/css/bootstrap.min.css "/>"
	rel="stylesheet" type="text/css" />
<link href="<c:url value="/resources/css/select2.css "/>"
	rel="stylesheet" type="text/css" />
<link href="<c:url value="/resources/css/gh-pages.css "/>"
	rel="stylesheet" type="text/css" />
<link href="<c:url value="/resources/css/select2.min.css "/>"
	rel="stylesheet" type="text/css" />
<link rel="stylesheet"
	href="//select2.github.io/select2/select2-3.5.2/select2.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script type="text/javascript">
		$(document).ready(function(){
			$("#add_kamar").click(function(){
			    $("#add_kamar_form").slideToggle('slow');
			});
		});
		</script>
</head>

<body>
	<div class="main-wrapper">
		<div class="app" id="app">
			<header class="header">
				<div class="nav-title">
					<h3 class="title">Master Pendaftaran</h3>
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
					<div class="container">
						<div class="col-12" id="add_Pendaftaran_form" style="display: none;">
							<div class="card card-success">
								<div class="card-header" style="min-height:0">
									<div class="header-block row" style="padding: 5px 20px">
										<p class="title"> Tambah Pendaftaran </p>
									</div>
								</div>
								<!-- 
								<div style="padding-top: 1rem;padding-left: 5px;background-color: #f4f4f4">
									<a href="v_pasien.html">
									<button type="button" class="btn btn-sm btn-primary" id="add_passien" ">Tambah Pasien Baru </button>
									</a>
								</div>
								-->
								
								<div class="card-block row" style="background-color: #f4f4f4">
								<div class="col-6">
									
									<form:form modelAttribute="PendaftaranModel" method="POST" action="store">
										<div class="form-group">
											<label>Nomor Rekam Medis</label>
											<div class="select2-wrapper">
												<form:select path="m_pasien_id"
													class="form-control input-lg select2-single">
													<c:forEach var="pasien" items="${Pasien}">
														<form:option value="${pasien.pasien_id}"
															label="${pasien.pasien_norm} - ${pasien.pasien_nama}"/>
													</c:forEach>
												</form:select>
											</div>
										</div>
										
										<div class="form-group">
											<label class="control-label">Kondisi Pasien</label>
											<div class="select2-wrapper">
												<form:select path="m_pasien_id"
													class="form-control input-lg select2-single">
													<c:forEach var="kondisipasien" items="${Kondisipasien}">
														<form:option value="${kondisipasien.kondisi_id}"
															label="${kondisipasien.kondisi_nama}"/>
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
										
										<div class="form-group" id="rujukan_id">
											<label>Rujukan</label>
											<div class="select2-wrapper">
												<form:select path="m_rujukan_id"
													class="form-control input-lg select2-single">
													<c:forEach var="rujukan" items="${Rujukan}">
														<form:option value="${rujukan.rujukan_id}"
															label="${rujukan.rujukan_nama}"/>
													</c:forEach>
												</form:select>
											</div> 
											
											<label>Tindakan</label>
											<div class="select2-wrapper">
												<form:select path="m_rujukan_id"
													class="form-control input-lg select2-single">
													<c:forEach var="tindakan" items="${Tindakan}">
														<form:option value="${tindakan.tindakan_id}"
															label="${tindakan.tindakan_nama}"/>
													</c:forEach>
												</form:select>
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
											<label class="control-label">Dokter</label>
											<select class="form-control boxed form-control-sm">
													<option>Rahayu</option>
													<option>Sri</option>
												</select>
										</div>
										
										<div class="form-group">
											<label class="control-label">Jenis Pendaftaran</label>
											<select class="form-control boxed form-control-sm">
													<option>Rawat Inap</option>
													<option>Rawat Jalan</option>
												</select>
										</div>
										
										<div class="form-group">
											<label class="control-label">Paket</label>
											<div class="select2-wrapper">
												<form:select path="m_pasien_id"
													class="form-control input-lg select2-single">
													<c:forEach var="paket" items="${Paket}">
														<form:option value="${paket.paket_id}"
															label="${paket.paket_nama}"/>
													</c:forEach>
												</form:select>
											</div>
										</div>
										
										<div class="form-group">
											<button type="submit" class="btn btn-primary d_pasien-button">Simpan</button>
											<button type="button" class="btn btn-danger d_pasien-button">
												<a href="http://localhost:8080/com.rsia.modura/Pasien/list" />Batal</a>
											</button>
										</div>
									</form:form>
									
									
								   <div class="form-group">
										<label for="exampleInputEmail1">Nomor Rekam medis</label>
										<input type="text" class="form-control boxed form-control-sm" id="exampleInputEmail1" placeholder="Cari Nomer Rekan Medis">
									</div>
									<div class="form-group">
										<label for="exampleInputEmail1">Nama Pasien</label>
										<input type="text" class="form-control boxed form-control-sm" id="exampleInputEmail1" placeholder="">
									</div>
									<div class="form-group">
										<label for="exampleInputEmail1">Tanggal Lahir</label>
										<input type="text" class="form-control boxed form-control-sm" id="exampleInputEmail1" placeholder="">
									</div>
									 <div class="form-group">
										<label for="exampleInputEmail1">Alamat</label>
										<input type="text" class="form-control boxed form-control-sm" id="exampleInputEmail1" placeholder="">
									</div>
									 <div class="form-group">
										<label for="exampleInputEmail1">L/P</label>
										<input type="text" class="form-control boxed form-control-sm" id="exampleInputEmail1" placeholder="">
									</div>
									 <div class="form-group">
										<label for="exampleInputEmail1">No. Telp</label>
										<input type="text" class="form-control boxed form-control-sm" id="exampleInputEmail1" placeholder="">
									</div>
									<div class="form-group">
										<label class="control-label">Cara Masuk Pasien</label>
										<select class="form-control boxed form-control-sm">
												<option>Dari Kondisi Pasien</option>
												<option>Datang Sendiri</option>
												<option>Tidak Sadar</option>
												<option>Rujukan</option>
												<option>Dibawa Polisi</option>
											</select>
									</div>
									<div class="form-group">
										<label for="exampleInputEmail1">Keterangan</label>
										<input type="text" class="form-control boxed form-control-sm" id="exampleInputEmail1" placeholder="">
									</div>
								</div>
								<div class="col-6">
									<div class="form-group">
										<label for="exampleInputEmail1">Tgl MRS</label>
										<input type="text" class="form-control boxed form-control-sm" id="exampleInputEmail1" placeholder="">
									</div>
									<div class="form-group">
										<label for="exampleInputEmail1">Jam MRS</label>
										<input type="text" class="form-control boxed form-control-sm" id="exampleInputEmail1" placeholder="">
									</div>
									<div class="form-group">
										<label class="control-label">Jenis Pendaftaran</label>
										<select class="form-control boxed form-control-sm">
												<option>RJ</option>
												<option>RI</option>
											</select>
									</div>
									<div class="form-group">
										<label class="control-label">Kelas Pendaftaran</label>
										<select class="form-control boxed form-control-sm">
												<option>I</option>
												<option>II</option>
												<option>III</option>
												<option>VIP</option>
												<option>VVIP</option>
											</select>
									</div>
									<div class="form-group">
										<label class="control-label">Dokter</label>
										<select class="form-control boxed form-control-sm">
												<option>A</option>
												<option>B</option>
												<option>C</option>
												<option>D</option>
												<option>E</option>
											</select>
									</div>
									<div class="form-group">
										<label for="exampleInputEmail1">Paket Pelayanan</label>
										<input type="text" class="form-control boxed form-control-sm" id="exampleInputEmail1" placeholder="">
									</div>
									<div class="form-group">
										<label for="exampleInputEmail1">Harga Pendaftaran</label>
										<input type="text" class="form-control boxed form-control-sm" id="exampleInputEmail1" placeholder="">
									</div>
								</div>
									<div class="container form-group" style="float: right;">
										<button type="submit" class="btn btn-primary d_pasien-button">Simpan</button>
									</div>
								</div>
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
													<th>#</th>
													<th>Table heading</th>
													<th>Table heading</th>
													<th>Table heading</th>
													<th>Table heading</th>
													<th>Table heading</th>
													<th>Table heading</th>
												</tr>
											</thead>
											<tbody>
												<tr>
													<td>Table cell</td>
													<td>Table cell</td>
													<td>Table cell</td>
													<td>Table cell</td>
													<td>Table cell</td>
													<td>Table cell</td>
													<td>Table cell</td>
												</tr>
												<tr>
													<td>Table cell</td>
													<td>Table cell</td>
													<td>Table cell</td>
													<td>Table cell</td>
													<td>Table cell</td>
													<td>Table cell</td>
													<td>Table cell</td>
												</tr>
											   
											</tbody>
										</table>
									</div>
								</div>
							</div>
						</div>
						
					</div>
				</section>
			</article>
			<footer class="footer">

			</footer>
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
	
	<script type="text/javascript">
		$(document).ready(function(){
			$("#add_Pendaftaran").click(function(){
				$("#add_Pendaftaran_form").slideToggle('slow');
			});
			
			$('#rujukan_id').hide();
		});
		
		function getDataPasien(id) {
			console.log();	
		}
		
		$('#kondisi_pasien').on('change', function() {
		  var kondisi_datang = this.value ;
		  
		  if (kondisi_datang == 'D') {
			  $('#rujukan_id').hide();
		  } else {
			  $('#rujukan_id').show();
		  }
		})
		
	</script>
</body>

</html>