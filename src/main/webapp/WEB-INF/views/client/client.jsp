<%@ include file="/WEB-INF/views/includes/includes.jsp"%>
<!DOCTYPE html>
<html lang="fr">

<head>

<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta name="description" content="">
<meta name="author" content="">

<title>Page des clients</title>

<!-- Custom fonts for this template-->
<link
	href="<%=request.getContextPath()%>/resources/vendor/fontawesome-free/css/all.min.css"
	rel="stylesheet" type="text/css">
<link
	href="https://fonts.googleapis.com/css?family=Nunito:200,200i,300,300i,400,400i,600,600i,700,700i,800,800i,900,900i"
	rel="stylesheet">

<!-- Custom styles for this template -->
<link href="<%=request.getContextPath()%>/resources/css/sb-admin-2.min.css" rel="stylesheet">

<!-- Custom styles for this page -->
<link href="<%=request.getContextPath()%>/resources/vendor/datatables/dataTables.bootstrap4.min.css" rel="stylesheet">

	<script type="text/javascript">
		function confirmDelete() {
			var del = confirm("Voulez-vous supprimer cet enregistrement ? \nAttention suppression irr�versible!!!");
			if(del) {
				alert(" Suppression r�ussie");
			} else {
				alert("Suppression annul�e");
			}
		}
	</script>
	
</head>

<body id="page-top">

	<!-- Page Wrapper -->
	<div id="wrapper">

		<!-- Sidebar -->
		<%@ include file="/WEB-INF/views/menu_left/leftMenu.jsp"%>


		<!-- Content Wrapper -->
		<div id="content-wrapper" class="d-flex flex-column">

			<!-- Main Content -->
			<div id="content">

				<!-- Topbar -->
				<%@ include file="/WEB-INF/views/menu_top/topMenu.jsp"%>

				<!-- Begin Page Content -->
				<div class="container-fluid">

					<!-- Page Heading -->
					<h1 class="h3 mb-4 text-gray-800">Clients</h1>

					<div class="row">
						<div class="col-lg-12">
							<nav aria-label="breadcrumb">
								<ol class="breadcrumb py-1">
									<li class="breadcrumb-item ml-0"><a href="<c:url value="/client/nouveau" />" class="text-success"><i class="fas fa-plus-square">&nbsp;<fmt:message key="common.ajouter"/></i></a></li>
									<li class="breadcrumb-item"><a href="#" class="text-info"><i class="fas fa-file-download">&nbsp;<fmt:message key="common.importer"/></i></a></li>
									<li class="breadcrumb-item"><a href="#" class="text-primary"><i class="fas fa-file-upload">&nbsp;<fmt:message key="common.exporter"/></i></a></li>
								</ol>
							</nav>
						</div>
					</div>

					<div class="card mb-4">
						<div class="card-header bg-primary text-light py-3">
							<h6 class="m-0 font-weight-bold">
								<fmt:message key="client.liste" />
							</h6>
						</div>
						<div class="card-body">
							<div class="table-responsive">
								<table class="table table-bordered table-hover text-sm table-sm w-100" id="dataTable" cellspacing="0">
									<thead>
										<tr>
											<th><fmt:message key="common.photo" /></th>
											<th><fmt:message key="common.nom" /></th>
											<th><fmt:message key="common.prenom" /></th>
											<th><fmt:message key="common.adresse" /></th>
											<th><fmt:message key="common.mail" /></th>
											<th><fmt:message key="common.telephone" /></th>
											<th><fmt:message key="common.actions" /></th>
										</tr>
									</thead>
									<tfoot>
										<tr>
											<th><fmt:message key="common.photo" /></th>
											<th><fmt:message key="common.nom" /></th>
											<th><fmt:message key="common.prenom" /></th>
											<th><fmt:message key="common.adresse" /></th>
											<th><fmt:message key="common.mail" /></th>
											<th><fmt:message key="common.telephone" /></th>
											<th><fmt:message key="common.actions" /></th>
										</tr>
									</tfoot>
									<tbody>
										<c:forEach items="${clients}" var="client">
											<tr>
												<td>
													<c:out value="${client.getUploadFiles().get}" />
													<img src="${client.getUploadFiles()}" class="rounded img-thumbnail mx-auto d-block" width="50px" height="50px" />
												</td>
												<%-- src="<%=request.getContextPath()%>/resources/img/undraw_posting_photo.svg" --%>
												<td>${client.getNom() }</td>
												<td>${client.getPrenom() }</td>
												<td>${client.getAdresse() }</td>
												<td>${client.getMail() }</td>
												<td>${client.getTelephone() }</td>
												<td>
													<ul class="nav nav-pills">
														<li class="nav-item p-auto m-auto">
															<c:url value="/client/modifier/${client.getIdClient() }" var="urlModif"/>
															<a class="nav-link text-warning p-1" href="${urlModif }"> <i class="fas fa-edit"></i></a>
														</li>
														<li class="text-secondary p-auto m-auto">|</li>
														<li class="nav-item p-auto m-auto" onclick="confirmDelete()">
															<c:url value="/client/supprimer/${client.getIdClient() }" var="urlSuppr"/>
															<a class="nav-link text-danger p-1" href="${urlSuppr }"> <i class="fas fa-trash-alt"></i></a>
														</li>
													</ul>
												</td>
											</tr>
										</c:forEach>
										<tr>
											<td>Garrett Winters</td>
											<td>Accountant</td>
											<td>Tokyo</td>
											<td>63</td>
											<td>2011/07/25</td>
											<td>$12345/td>
										</tr>
										<tr>
											<td>Ashton Cox</td>
											<td>Junior Technical Author</td>
											<td>San Francisco</td>
											<td>66</td>
											<td>2009/01/12</td>
											<td>$12345</td>
										</tr>
										<tr>
											<td>Cedric Kelly</td>
											<td>Senior Javascript Developer</td>
											<td>Edinburgh</td>
											<td>22</td>
											<td>2012/03/29</td>
											<td>$433,060</td>
										</tr>
										<tr>
											<td>Airi Satou</td>
											<td>Accountant</td>
											<td>Tokyo</td>
											<td>33</td>
											<td>2008/11/28</td>
											<td>$162,700</td>
										</tr>
										<tr>
											<td>Brielle Williamson</td>
											<td>Integration Specialist</td>
											<td>New York</td>
											<td>61</td>
											<td>2012/12/02</td>
											<td>$372,000</td>
										</tr>
										<tr>
											<td>Herrod Chandler</td>
											<td>Sales Assistant</td>
											<td>San Francisco</td>
											<td>59</td>
											<td>2012/08/06</td>
											<td>$137,500</td>
										</tr>
										<tr>
											<td>Rhona Davidson</td>
											<td>Integration Specialist</td>
											<td>Tokyo</td>
											<td>55</td>
											<td>2010/10/14</td>
											<td>$327,900</td>
										</tr>
										<tr>
											<td>Colleen Hurst</td>
											<td>Javascript Developer</td>
											<td>San Francisco</td>
											<td>39</td>
											<td>2009/09/15</td>
											<td>$205,500</td>
										</tr>
										<tr>
											<td>Sonya Frost</td>
											<td>Software Engineer</td>
											<td>Edinburgh</td>
											<td>23</td>
											<td>2008/12/13</td>
											<td>$103,600</td>
										</tr>
										<tr>
											<td>Jena Gaines</td>
											<td>Office Manager</td>
											<td>London</td>
											<td>30</td>
											<td>2008/12/19</td>
											<td>$90,560</td>
										</tr>
										<tr>
											<td>Quinn Flynn</td>
											<td>Support Lead</td>
											<td>Edinburgh</td>
											<td>22</td>
											<td>2013/03/03</td>
											<td>$342,000</td>
										</tr>
										<tr>
											<td>Charde Marshall</td>
											<td>Regional Director</td>
											<td>San Francisco</td>
											<td>36</td>
											<td>2008/10/16</td>
											<td>$470,600</td>
										</tr>
										<tr>
											<td>Haley Kennedy</td>
											<td>Senior Marketing Designer</td>
											<td>London</td>
											<td>43</td>
											<td>2012/12/18</td>
											<td>$313,500</td>
										</tr>
										<tr>
											<td>Tatyana Fitzpatrick</td>
											<td>Regional Director</td>
											<td>London</td>
											<td>19</td>
											<td>2010/03/17</td>
											<td>$385,750</td>
										</tr>
										<tr>
											<td>Michael Silva</td>
											<td>Marketing Designer</td>
											<td>London</td>
											<td>66</td>
											<td>2012/11/27</td>
											<td>$198,500</td>
										</tr>
										<tr>
											<td>Paul Byrd</td>
											<td>Chief Financial Officer (CFO)</td>
											<td>New York</td>
											<td>64</td>
											<td>2010/06/09</td>
											<td>$725,000</td>
										</tr>
										<tr>
											<td>Gloria Little</td>
											<td>Systems Administrator</td>
											<td>New York</td>
											<td>59</td>
											<td>2009/04/10</td>
											<td>$237,500</td>
										</tr>
										<tr>
											<td>Bradley Greer</td>
											<td>Software Engineer</td>
											<td>London</td>
											<td>41</td>
											<td>2012/10/13</td>
											<td>$132,000</td>
										</tr>
										<tr>
											<td>Dai Rios</td>
											<td>Personnel Lead</td>
											<td>Edinburgh</td>
											<td>35</td>
											<td>2012/09/26</td>
											<td>$217,500</td>
										</tr>
										<tr>
											<td>Jenette Caldwell</td>
											<td>Development Lead</td>
											<td>New York</td>
											<td>30</td>
											<td>2011/09/03</td>
											<td>$345,000</td>
										</tr>
										<tr>
											<td>Yuri Berry</td>
											<td>Chief Marketing Officer (CMO)</td>
											<td>New York</td>
											<td>40</td>
											<td>2009/06/25</td>
											<td>$675,000</td>
										</tr>
										<tr>
											<td>Caesar Vance</td>
											<td>Pre-Sales Support</td>
											<td>New York</td>
											<td>21</td>
											<td>2011/12/12</td>
											<td>$106,450</td>
										</tr>
										<tr>
											<td>Doris Wilder</td>
											<td>Sales Assistant</td>
											<td>Sidney</td>
											<td>23</td>
											<td>2010/09/20</td>
											<td>$85,600</td>
										</tr>
										<tr>
											<td>Angelica Ramos</td>
											<td>Chief Executive Officer (CEO)</td>
											<td>London</td>
											<td>47</td>
											<td>2009/10/09</td>
											<td>$1,200,000</td>
										</tr>
									</tbody>
								</table>
							</div>
						</div>
					</div>
				</div>
				<!-- /.container-fluid -->

			</div>
			<!-- End of Main Content -->

			<!-- Footer -->
			<%@ include file="/WEB-INF/views/footer/footer.jsp"%>


		</div>
		<!-- End of Content Wrapper -->

	</div>
	<!-- End of Page Wrapper -->

	<!-- Scroll to Top Button-->
	<a class="scroll-to-top rounded" href="#page-top"> <i
		class="fas fa-angle-up"></i>
	</a>

	<!-- Logout Modal-->
	<%@ include file="/WEB-INF/views/logout/logout.jsp"%>

	<!-- Bootstrap core JavaScript-->
	<script
		src="<%=request.getContextPath()%>/resources/vendor/jquery/jquery.min.js"></script>
	<script
		src="<%=request.getContextPath()%>/resources/vendor/bootstrap/js/bootstrap.bundle.min.js"></script>

	<!-- Core plugin JavaScript-->
	<script
		src="<%=request.getContextPath()%>/resources/vendor/jquery-easing/jquery.easing.min.js"></script>

	<!-- Custom scripts for all pages-->
	<script
		src="<%=request.getContextPath()%>/resources/js/sb-admin-2.min.js"></script>

	<!-- Page level plugins -->
	<script
		src="<%=request.getContextPath()%>/resources/vendor/datatables/jquery.dataTables.min.js"></script>
	<script
		src="<%=request.getContextPath()%>/resources/vendor/datatables/dataTables.bootstrap4.min.js"></script>

	<!-- Page level custom scripts -->
	<script src="<%=request.getContextPath()%>/resources/js/demo/datatables-demo.js"></script>
	
</body>

</html>