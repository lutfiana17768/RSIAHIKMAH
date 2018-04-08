<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<jsp:include page="templatehead.jsp"></jsp:include>
<script type="text/javascript">
		$(document).ready(function(){
			$("#add_kamar").click(function(){
			    $("#add_kamar_form").slideToggle('slow');
			});
		});
		</script>
<body>
	<div class="main-wrapper">
		<div class="app" id="app">
			<header class="header">
			<div class="nav-title">
				<h3 class="title">Paket</h3>
			</div>
			<jsp:include page="templateheader.jsp"></jsp:include>
			</header>
			<jsp:include page="templatesidebar.jsp"></jsp:include>

			<div class="card card-success">
				<div class="card-header" style="min-height: 0">
					<div class="header-block" style="padding: 5px 20px">
						<p class="title">Data Paket</p>
					</div>
				</div>
				<div class="card-block" style="background-color: #f4f4f4">
					<div class="col-md-4">
						asdfasd
					</div>
					<div class="col-md-8">
						<ul class="nav nav-tabs">
			              <li class="active"><a href="#tab_1" data-toggle="tab">Tab 1</a></li>
			              <li><a href="#tab_2" data-toggle="tab">Tab 2</a></li>
			              <li><a href="#tab_3" data-toggle="tab">Tab 3</a></li>
		              	</ul>
			            <div class="tab-content">
			              <div class="tab-pane fade in active" id="tab_1">
			                <b>How to use:</b>
			
			                <p>Exactly like the original bootstrap tabs except you should use
			                  the custom wrapper <code>.nav-tabs-custom</code> to achieve this style.</p>
			                A wonderful serenity has taken possession of my entire soul,
			                like these sweet mornings of spring which I enjoy with my whole heart.
			                I am alone, and feel the charm of existence in this spot,
			                which was created for the bliss of souls like mine. I am so happy,
			                my dear friend, so absorbed in the exquisite sense of mere tranquil existence,
			                that I neglect my talents. I should be incapable of drawing a single stroke
			                at the present moment; and yet I feel that I never was a greater artist than now.
			              </div>
			              <!-- /.tab-pane -->
			              <div class="tab-pane fade" id="tab_2">
			                The European languages are members of the same family. Their separate existence is a myth.
			                For science, music, sport, etc, Europe uses the same vocabulary. The languages only differ
			                in their grammar, their pronunciation and their most common words. Everyone realizes why a
			                new common language would be desirable: one could refuse to pay expensive translators. To
			                achieve this, it would be necessary to have uniform grammar, pronunciation and more common
			                words. If several languages coalesce, the grammar of the resulting language is more simple
			                and regular than that of the individual languages.
			              </div>
			              <!-- /.tab-pane -->
			              <div class="tab-pane fade" id="tab_3">
			                Lorem Ipsum is simply dummy text of the printing and typesetting industry.
			                Lorem Ipsum has been the industry's standard dummy text ever since the 1500s,
			                when an unknown printer took a galley of type and scrambled it to make a type specimen book.
			                It has survived not only five centuries, but also the leap into electronic typesetting,
			                remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset
			                sheets containing Lorem Ipsum passages, and more recently with desktop publishing software
			                like Aldus PageMaker including versions of Lorem Ipsum.
			              </div>
			              <!-- /.tab-pane -->
			            </div>
					</div>
				</div>
			</div>

			</section> </article>
			<footer class="footer"> </footer>
		</div>
	</div>
	<jsp:include page="templatefooter.jsp"></jsp:include>
</body>
</html>