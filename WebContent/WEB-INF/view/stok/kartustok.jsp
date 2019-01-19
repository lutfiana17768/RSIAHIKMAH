<%@page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<jsp:include page="../app/header.jsp" />
    <section class="section">
        <div class="row">
            <div class="col-md-12">
                <div class="card">
                    <div class="card-block">
                        <div class="card-title-block">
                            <h3 class="title"> Stok Barang</h3>
                        </div>
                        <section class="example">
                            <table class="table table-sm table-striped table-bordered table-hover">
                                <thead>
                                    <tr>
                                        <th> Tanggal </th>
                                        <th> Nama Barang </th>
                                        <th> Masuk </th>
                                        <th> Keluar </th>
                                    </tr>
                                </thead>
                                <tbody>
                                    <c:forEach var="temp" items="${result}">
                                        <tr>
                                          <td> ${temp.kartuStokTanggal } </td>
                                          <td> ${temp.barang.barangNama } </td>
                                          <td> ${temp.kartuStokMasuk } </td> 
                                          <td> ${temp.kartuStokKeluar } </td>
                                        </tr>
                                    </c:forEach>
                                </tbody>
                            </table>
                            <div class="fixed-table-pagination" style="display: block; margin-top:25px">
                                 <form action="" method="get">
                                        <div class="pull-right pagination" style="margin-right: 20px;">
                                             
                                        </div>
                                  </form>
                            </div>
                        </section>
                    </div>
                </div>
            </div>
        </div>
    </section>
<jsp:include page="../app/footer.jsp" />