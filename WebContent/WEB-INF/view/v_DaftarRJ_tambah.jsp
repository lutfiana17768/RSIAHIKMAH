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
</head>
<body>
		<div class="main-wrapper">
			<div class="app" id="app">
				<header class="header">
					<div class="nav-title">
						<h3 class="title">Rawat Jalan</h3>
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
									<a href="index.html">
										<i class="fa fa-home"></i> Dashboard
									</a>
								</li>
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
                                            <a href="pembayaran.html">
                                            	<i class="fa fa-money"></i> Pembayaran
                                            </a>
                                        </li>
                                    </ul>
                                </li>
								<li>
                                    <a href="">
                                        <i class="fa fa-hdd-o"></i> Master
                                        <i class="fa arrow"></i>
                                    </a>
                                    <ul class="sidebar-nav">
                                        <li>
                                            <a href="v_kelas.html"> Kelas </a>
                                        </li>
                                        <li>
                                            <a href="v_agama.html"> Agama </a>
                                        </li>
                                        <li>
                                            <a href="v_pasien.html"> Pasien </a>
                                        </li>
                                        <li>
                                            <a href="v_tindakan.html"> Tindakan </a>
                                        </li>
                                        <li>
                                            <a href="v_paket.html"> Paket </a>
                                        </li>
                                        <li class="active">
                                            <a href="v_kamar.html"> Kamar </a>
                                        </li>
                                        <li>
                                            <a href="v_kondisi_pasien.html"> Kondisi Pasien </a>
                                        </li>
                                        <li>
                                            <a href="v_jenis_rujukan.html"> Jenis Rujukan </a>
                                        </li>
                                        <li>
                                            <a href="v_rujukan.html"> Rujukan </a>
                                        </li>
                                        <li>
                                            <a href="v_rujukan.html"> History Pasien </a>
                                        </li>
                                    </ul>
                                </li>
							</ul>
						</nav>
					</div>
					<footer class="sidebar-footer">
						<ul class="sidebar-menu metismenu" id="customize-menu">
							<li>
								<ul>
									<li class="customize">
										<div class="customize-item">
											<div class="row customize-header">
												<div class="col-4"> </div>
												<div class="col-4">
													<label class="title">fixed</label>
												</div>
												<div class="col-4">
													<label class="title">static</label>
												</div>
											</div>
											<div class="row">
												<div class="col-4">
													<label class="title">Sidebar:</label>
												</div>
												<div class="col-4">
													<label>
														<input class="radio" type="radio" name="sidebarPosition" value="sidebar-fixed">
														<span></span>
													</label>
												</div>
												<div class="col-4">
													<label>
														<input class="radio" type="radio" name="sidebarPosition" value="">
														<span></span>
													</label>
												</div>
											</div>
											<div class="row">
												<div class="col-4">
													<label class="title">Header:</label>
												</div>
												<div class="col-4">
													<label>
														<input class="radio" type="radio" name="headerPosition" value="header-fixed">
														<span></span>
													</label>
												</div>
												<div class="col-4">
													<label>
														<input class="radio" type="radio" name="headerPosition" value="">
														<span></span>
													</label>
												</div>
											</div>
											<div class="row">
												<div class="col-4">
													<label class="title">Footer:</label>
												</div>
												<div class="col-4">
													<label>
														<input class="radio" type="radio" name="footerPosition" value="footer-fixed">
														<span></span>
													</label>
												</div>
												<div class="col-4">
													<label>
														<input class="radio" type="radio" name="footerPosition" value="">
														<span></span>
													</label>
												</div>
											</div>
										</div>
										<div class="customize-item">
											<ul class="customize-colors">
												<li>
													<span class="color-item color-red" data-theme="red"></span>
												</li>
												<li>
													<span class="color-item color-orange" data-theme="orange"></span>
												</li>
												<li>
													<span class="color-item color-green active" data-theme=""></span>
												</li>
												<li>
													<span class="color-item color-seagreen" data-theme="seagreen"></span>
												</li>
												<li>
													<span class="color-item color-blue" data-theme="blue"></span>
												</li>
												<li>
													<span class="color-item color-purple" data-theme="purple"></span>
												</li>
											</ul>
										</div>
									</li>
								</ul>
								<a href="">
									<i class="fa fa-cog"></i> Customize </a>
							</li>
						</ul>
					</footer>
				</aside>
				<div class="sidebar-overlay" id="sidebar-overlay"></div>
				<div class="sidebar-mobile-menu-handle" id="sidebar-mobile-menu-handle"></div>
				<div class="mobile-menu-handle"></div>
				<article class="content forms-page">
					<section class="section">
						<div class="container">
							<div class="container" >
								<div class="card card-success">
									<div class="card-header" style="min-height:0">
										<div class="header-block" style="padding: 5px 20px">
											<p class="title"> Tambah Tindakan </p>
										</div>
									</div>
									<div class="row card-block" style="background-color: #f4f4f4;margin:0;">
										<div class="col-5" style="padding: 15px;border: grey 1px solid;">
											<div class="form-group">
												<label for="exampleInputEmail1">Pasien</label>
												<input type="text" class="form-control boxed form-control-sm" id="exampleInputEmail1" placeholder="Nama / No. Kamar">
											</div>
                                            <button type="button" class="btn btn-secondary btn-sm">Cari Pasien</button>
										</div>
										<div class="col-6" style="margin-left:10px ;padding: 15px;border: grey 1px solid;">
											<div class="form-group">
												<label for="exampleInputEmail1">Tanggal</label>
												<input type="text" class="form-control boxed form-control-sm" id="exampleInputEmail1" placeholder="Tanggal">
											</div>
											<div class="form-group">
												<label for="exampleInputEmail1">Jam</label>
												<input type="text" class="form-control boxed form-control-sm" id="exampleInputEmail1" placeholder="Jam">
											</div>
										</div>
									</div>
									<div class="row card-block" style="background-color: #f4f4f4;margin:0;">
										<div class="col-5" style="padding: 0">
											<div class="col-12" style="padding: 15px;border: grey 1px solid;">
												<table>
													<tr>
														<td>No. RM</td>
														<td>:</td>
														<td></td>
													</tr>
													<tr>
														<td>NIK</td>
														<td>:</td>
														<td></td>
													</tr>
													<tr>
														<td>Nama</td>
														<td>:</td>
														<td></td>
													</tr>
													<tr>
														<td>Tgl. Lahir</td>
														<td>:</td>
														<td></td>
													</tr>
													<tr>
														<td>Alamat</td>
														<td>:</td>
														<td></td>
													</tr>
													<tr>
														<td>L/P</td>
														<td>:</td>
														<td></td>
													</tr>
													<tr>
														<td>No. Telp</td>
														<td>:</td>
														<td></td>
													</tr>
													<tr>
														<td>Jenis Pasien</td>
														<td>:</td>
														<td></td>
													</tr>
												</table>
											</div>
										</div>
										<div class="col-6" style="margin-left:10px ;padding: 15px;border: grey 1px solid;">
											<div class="form-group">
												<label class="control-label">Pembayaran<span style="color:red">*</span></label>
												<select class="form-control boxed form-control-sm">
													<option>Option one</option>
													<option>Option two</option>
													<option>Option three</option>
													<option>Option four</option>
												</select>
											</div>
											<div class="form-group">
												<label class="control-label">Kelas<span style="color:red">*</span></label>
												<select class="form-control boxed form-control-sm">
													<option>Option one</option>
													<option>Option two</option>
													<option>Option three</option>
													<option>Option four</option>
												</select>
											</div>
											<div class="form-group">
												<label class="control-label">Unit/Klinik<span style="color:red">*</span></label>
												<select class="form-control boxed form-control-sm">
													<option>Option one</option>
													<option>Option two</option>
													<option>Option three</option>
													<option>Option four</option>
												</select>
											</div>
											<div class="form-group">
												<label class="control-label">Dokter<span style="color:red">*</span></label>
												<select class="form-control boxed form-control-sm">
													<option>Option one</option>
													<option>Option two</option>
													<option>Option three</option>
													<option>Option four</option>
												</select>
											</div>
											<div class="form-group">
												<label class="control-label">Paket<span style="color:red">*</span></label>
												<select class="form-control boxed form-control-sm">
													<option>Option one</option>
													<option>Option two</option>
													<option>Option three</option>
													<option>Option four</option>
												</select>
											</div>
											<div class="form-group">
												<label class="control-label">Cara Masuk<span style="color:red">*</span></label>
												<select class="form-control boxed form-control-sm">
													<option>Option one</option>
													<option>Option two</option>
													<option>Option three</option>
													<option>Option four</option>
												</select>
											</div>
											<div class="form-group">
												<label for="exampleInputEmail1">Tarif</label>
												<input type="text" class="form-control boxed form-control-sm" id="exampleInputEmail1" placeholder="0" disabled="">
											</div>
										</div>
									</div>
									<div class="container form-group"  style="padding-right:8.5%; background-color: #f5f5f5;margin-bottom: 0">
										<button type="button" class="btn btn-danger d_pasien-button">Batal</button>
										<button type="button" class="btn btn-primary d_pasien-button">Simpan</button>
									</div>
								</div>
							</div>
							<div class="container">
								<div class="form-group">
									<button type="button" class="btn btn-sm btn-primary" id="add_tindakan">Add</button>
									<button type="button" class="btn btn-sm btn-danger" id="add_tindakan">Hapus</button>
								</div>
							</div>
							<div class="container">
								<div class="card card-success">
									<div class="card-header" style="min-height:0">
										<div class="header-block" style="padding: 5px 20px">
											<p class="title"> Data Tindakan </p>
										</div>
									</div>
									<div class="card-block" style="background-color: #f4f4f4">
										<div class="table-responsive">
										<table class="table table-striped table-bordered">
											<tr>
												<td><a href="#">Refresh</a></td>
												<td><a href="#">Edit</a></td>
												<td><a href="#">Batal</a></td>
												<td><a href="#">Nota</a></td>
												<td><a href="#">ID Card</a></td>
												<td><a href="#">Status</a></td>
												<td><a href="#">Blanko</a></td>
												<td><a href="#">Info/Help</a></td>
											</tr>
										</table>
											<table class="table table-striped table-bordered table-hover">
												<thead>
													<tr>
														<th>#</th>
														<th>No. RM</th>
														<th>Nama Pasien</th>
														<th>Alamat</th>
														<th>Pembayaran</th>
														<th>Status</th>
													</tr>
												</thead>
												<tbody>
													<tr>
														<td>1</td>
														<td>087263746723</td>
														<td>Ayub Bhay</td>
														<td>Kedondong Kidul 4/10a, Surabaya</td>
														<td>BCA - debit</td>
														<td>Dilayani</td>
													</tr>
													<tr>
														<td>2</td>
														<td>Table cell</td>
														<td>Table cell</td>
														<td>Table cell</td>
														<td>Table cell</td>
														<td>Table cell</td>
													</tr>
													<tr>
														<td>3</td>
														<td>Table cell</td>
														<td>Table cell</td>
														<td>Table cell</td>
														<td>Table cell</td>
														<td>Table cell</td>
													</tr>
													<tr>
														<td>4</td>
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
							<div class="container">
								<div class="form-group" style="float: right;">
									<button type="button" class="btn btn-sm btn-danger">Hapus</button>
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
				<!-- /.modal -->
				<div class="modal fade" id="confirm-modal">
					<div class="modal-dialog" role="document">
						<div class="modal-content">
							<div class="modal-header">
								<h4 class="modal-title">
									<i class="fa fa-warning"></i> Alert</h4>
								<button type="button" class="close" data-dismiss="modal" aria-label="Close">
									<span aria-hidden="true">&times;</span>
								</button>
							</div>
							<div class="modal-body">
								<p>Are you sure want to do this?</p>
							</div>
							<div class="modal-footer">
								<button type="button" class="btn btn-primary" data-dismiss="modal">Yes</button>
								<button type="button" class="btn btn-secondary" data-dismiss="modal">No</button>
							</div>
						</div>
						<!-- /.modal-content -->
					</div>
					<!-- /.modal-dialog -->
				</div>
				<!-- /.modal -->
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
		<script src="<c:url value="/resources/js/app.js "/>" /></script>
   <script src="<c:url value="/resources/js/vendor.js "/>" /></script>
		
	</body>
</html>