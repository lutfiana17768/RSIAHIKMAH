<!DOCTYPE html>
<html>

<head>
    <title>RSIA HIKMAH SAWI</title>
    <link rel="stylesheet" href="css/vendor.css">
    <link rel="stylesheet" href="css/app.css">
    <link rel="stylesheet" href="css/style.css">
</head>

<body>
    <div class="main-wrapper">
        <div class="app" id="app">
            <header class="header">
                <div class="nav-title">
                    <h3 class="title">Master Paket</h3>
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
                        <div class="col-12" id="add_paket_form" style="display: none;">
                            <div class="card card-success">
                                <div class="card-header" style="min-height:0">
                                    <div class="header-block row" style="padding: 5px 20px">
                                        <p class="title"> Tambah Paket </p>
                                    </div>
                                </div>
                                <div class="card-block row" style="background-color: #f4f4f4">
                                <div class="col-4">
                                    <div class="form-group">
                                        <label class="control-label">Jenis Paket</label>
                                        <select class="form-control boxed form-control-sm">
												<option>Option one</option>
												<option>Option two</option>
												<option>Option three</option>
												<option>Option four</option>
											</select>
                                    </div>
                                    <div class="form-group">
                                        <label for="exampleInputEmail1">Nama Paket</label>
                                        <input type="text" class="form-control boxed form-control-sm" id="exampleInputEmail1" placeholder="">
                                    </div>
                                    <div class="form-group">
                                        <label class="control-label">Kelas Paket</label>
                                        <select class="form-control boxed form-control-sm">
												<option>Option one</option>
												<option>Option two</option>
												<option>Option three</option>
												<option>Option four</option>
											</select>
                                    </div>
                                    <div class="form-group">
                                        <label for="exampleInputEmail1">Harga Paket</label>
                                        <input type="text" class="form-control boxed form-control-sm" id="exampleInputEmail1" placeholder="">
                                    </div>
                                    <div class="form-group">
                                        <label for="exampleInputEmail1">Keterangan</label>
                                        <input type="text" class="form-control boxed form-control-sm" id="exampleInputEmail1" placeholder="">
                                    </div>
                                </div>
                                <div class="col-8">
                                    <div class="col col-12" style="padding:0">
                                        <div class="card sameheight-item" data-exclude="xs" id="dashboard-history">
                                            <div class="card-header card-header-sm bordered">
                                                <ul class="nav nav-tabs" role="tablist">
                                                    <li class="nav-item">
                                                        <a class="nav-link active" href="#ruangan" role="tab" data-toggle="tab">Ruangan</a>
                                                    </li>
                                                    <li class="nav-item">
                                                        <a class="nav-link" href="#tindakan" role="tab" data-toggle="tab">Tindakan</a>
                                                    </li>
                                                     <li class="nav-item">
                                                        <a class="nav-link" href="#penunjang" role="tab" data-toggle="tab">Penunjang</a>
                                                    </li>
                                                     <li class="nav-item">
                                                        <a class="nav-link" href="#obatalkes" role="tab" data-toggle="tab">Obat/Alkes</a>
                                                    </li>
                                                </ul>
                                            </div>
                                            <div class="card-block">
                                                <div class="tab-content">
                                                    <div role="tabpanel" class="tab-pane active fade show" id="ruangan">
                                                        <div class="container-fluid" style="padding:0">
                                                            <div class="card-header card-header-sm bordered" style="background-color: #f0f0f0">
                                                                <div class="header-block">
                                                                    <button type="button" class="btn btn-success btn-sm">Tambah</button>
                                                                </div>
                                                            </div>
                                                            <div class="card-block" style="background-color: #f4f4f4">
                                                                <div class="table-responsive" style="overflow-y: auto;">
                                                                    <table class="table table-striped table-bordered table-hover">
                                                                        <thead>
                                                                            <tr>
                                                                                <th>Nama Ruangan</th>
                                                                                <th>Harga</th>
                                                                                <th>Aksi</th>
                                                                                 
                                                                            </tr>
                                                                        </thead>
                                                                        <tbody>
                                                                            <tr>
                                                                                <td>Table cell</td>
                                                                                <td>Table cell</td>
                                                                                <td>
                                                                                <button type="button" class="fa fa-trash-o"></button>&nbsp
                                                                                <button type="button" class="fa fa-pencil"></button>
                                                                                </td>
                                                                            </tr>
                                                                           
                                                                        </tbody>
                                                                    </table>
                                                                </div>
                                                            </div>
                                                        </div>
                                                    </div>
                                                    <div role="tabpanel" class="tab-pane fade" id="tindakan">
                                                        <div class="container-fluid" style="padding:0">
                                                            <div class="card-header card-header-sm bordered" style="background-color: #f0f0f0">
                                                                <div class="header-block">
                                                                    <button type="button" class="btn btn-success btn-sm">Tambah</button> 
                                                                </div>
                                                            </div>
                                                            <div class="card-block" style="background-color: #f4f4f4">
                                                                <div class="table-responsive" style="overflow-y: auto;">
                                                                    <table class="table table-striped table-bordered table-hover">
                                                                        <thead>
                                                                            <tr>
                                                                                <th>Nama Tindakan</th>
                                                                                <th>Jumlah</th>
                                                                                <th>Harga</th>
                                                                                <th>Sub harga</th>
                                                                                <th>Aksi</th>
                                                                                
                                                                            </tr>
                                                                        </thead>
                                                                        <tbody>
                                                                            <tr>
                                                                                <td>Table cell</td>
                                                                                <td>Table cell</td>
                                                                                <td>Table cell</td>
                                                                                <td>Table cell</td>
                                                                                <td> <button type="button" class="fa fa-trash-o"></button>&nbsp
                                                                                <button type="button" class="fa fa-pencil"></button></td>
                                                                            </tr>
                                                                           
                                                                        </tbody>
                                                                    </table>
                                                                </div>
                                                            </div>
                                                        </div>
                                                    </div>
                                                    <div role="tabpanel" class="tab-pane fade" id="penunjang">
                                                        <div class="container-fluid" style="padding:0">
                                                            <div class="card-header card-header-sm bordered" style="background-color: #f0f0f0">
                                                                <div class="header-block">
                                                                    <button type="button" class="btn btn-success btn-sm">Tambah</button> 
                                                                </div>
                                                            </div>
                                                            <div class="card-block" style="background-color: #f4f4f4">
                                                                <div class="table-responsive" style="overflow-y: auto;">
                                                                    <table class="table table-striped table-bordered table-hover">
                                                                        <thead>
                                                                            <tr>
                                                                                <th>Nama Pemeriksaan</th>
                                                                                <th>Jumlah</th>
                                                                                <th>Harga</th>
                                                                                <th>Sub harga</th>
                                                                                <th>Aksi</th>
                                                                                
                                                                            </tr>
                                                                        </thead>
                                                                        <tbody>
                                                                            <tr>
                                                                                <td>Table cell</td>
                                                                                <td>Table cell</td>
                                                                                <td>Table cell</td>
                                                                                <td>Table cell</td>
                                                                                <td> <button type="button" class="fa fa-trash-o"></button>&nbsp
                                                                                <button type="button" class="fa fa-pencil"></button></td>
                                                                            </tr>
                                                                           
                                                                        </tbody>
                                                                    </table>
                                                                </div>
                                                            </div>
                                                        </div>
                                                    </div>
                                                    <div role="tabpanel" class="tab-pane fade" id="obatalkes">
                                                        <div class="container-fluid" style="padding:0">
                                                            <div class="card-header card-header-sm bordered" style="background-color: #f0f0f0">
                                                                <div class="header-block">
                                                                    <button type="button" class="btn btn-success btn-sm">Tambah</button> 
                                                                </div>
                                                            </div>
                                                            <div class="card-block" style="background-color: #f4f4f4">
                                                                <div class="table-responsive" style="overflow-y: auto;">
                                                                    <table class="table table-striped table-bordered table-hover">
                                                                        <thead>
                                                                            <tr>
                                                                                <th>Nama Obat/Alkes</th>
                                                                                <th>Satuan</th>
                                                                                <th>Jumlah</th>
                                                                                <th>Harga</th>
                                                                                <th>Sub harga</th>
                                                                                <th>Aksi</th>
                                                                                
                                                                            </tr>
                                                                        </thead>
                                                                        <tbody>
                                                                            <tr>
                                                                                <td>Table cell</td>
                                                                                <td>Table cell</td>
                                                                                <td>Table cell</td>
                                                                                <td>Table cell</td>
                                                                                <td>Table cell</td>
                                                                               <td> <button type="button" class="fa fa-trash-o"></button>&nbsp
                                                                                <button type="button" class="fa fa-pencil"></button></td>
                                                                            </tr>
                                                                           
                                                                        </tbody>
                                                                    </table>
                                                                </div>
                                                            </div>
                                                        </div>
                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                                    <div class="container form-group" style="float: right;">
                                        <button type="submit" class="btn btn-primary d_pasien-button">Simpan</button>
                                    </div>
                                </div>
                            </div>
                            <div class="container">

                            </div>
                        </div>
                        <div class="container">
                            <div class="form-group">
                                <button type="button" class="btn btn-sm btn-primary" id="add_paket">Tambah</button>
                            </div>
                        </div>
                        <div class="container">
                            <div class="card card-success">
                                <div class="card-header" style="min-height:0">
                                    <div class="header-block" style="padding: 5px 20px">
                                        <p class="title"> Data Paket </p>
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
    <script src="js/vendor.js"></script>
    <script src="js/app.js"></script>
    <script type="text/javascript">
        $(document).ready(function(){
        				$("#add_paket").click(function(){
        				    $("#add_paket_form").slideToggle('slow');
        				});
        			});
    </script>
</body>

</html>