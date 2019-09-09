<%@ include file="/WEB-INF/views/includes/includes.jsp"%>
<!DOCTYPE html>
<html lang="fr">

<head>

<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta path="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta path="description" content="">
<meta path="author" content="">

<title>Page des clients</title>

<!-- Custom fonts for this template-->
<link
	href="<%=request.getContextPath()%>/resources/vendor/fontawesome-free/css/all.min.css"
	rel="stylesheet" type="text/css">
<link
	href="https://fonts.googleapis.com/css?family=Nunito:200,200i,300,300i,400,400i,600,600i,700,700i,800,800i,900,900i"
	rel="stylesheet">

<!-- Custom styles for this template -->
<link
	href="<%=request.getContextPath()%>/resources/css/sb-admin-2.min.css"
	rel="stylesheet">

<!-- Custom styles for this page -->
<link
	href="<%=request.getContextPath()%>/resources/vendor/datatables/dataTables.bootstrap4.min.css"
	rel="stylesheet">

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

					<div class="row">
						<div class="col-2"></div>
						<div class="col-8">
							<div class="card">
								<div class="card-header bg-primary text-light py-3">
									<h6 class="m-0 font-weight-bold">
										<fmt:message key="client.nouveau" />
									</h6>
								</div>
								<c:url value="/client/enregistrer" var="urlEnregistrer" />
								<f:form modelAttribute="client" method="POST" action="${urlEnregistrer }" enctype="multipart/form-data" role="form" >
									<div class="card-body">
									
										<f:input type="hidden" path="idClient" id="idClient"/>
										
										<div class="form-group">
											<label for="nom"><fmt:message key="common.nom" /></label> 
											<f:input type="text" path="nom" id="nom" class="form-control" placeholder="" />
											<div class="has-error"> <f:errors path="nom" class="help-inline"/> </div>
										</div>
										<div class="form-group">
											<label for="prenom"><fmt:message key="common.prenom" /></label>
											<f:input type="text" path="prenom" id="prenom" class="form-control" placeholder="" />
											<div class="has-error"> <f:errors path="prenom" class="help-inline"/> </div>
										</div>
										<div class="form-group">
											<label for="adresse"><fmt:message key="common.adresse" /></label> 
											<f:input type="text" path="adresse" id="adresse" class="form-control" placeholder="" />
											<div class="has-error"> <f:errors path="adresse" class="help-inline"/> </div>
										</div>
										<div class="form-group">
											<label for="mail"><fmt:message key="common.mail" /></label>
											<div class="input-group mb-2 mr-sm-2">
												<div class="input-group-prepend">
													<div class="input-group-text">@</div>
												</div>
												<f:input type="text" path="mail" id="mail" class="form-control" placeholder="" />
												<div class="has-error"> <f:errors path="mail" class="help-inline"/> </div>
											</div>
										</div>
										<%-- <div class="form-group">
											<label for="photo"><fmt:message key="common.photo" /></label>
											<f:input path="photo" type="file" class="form-control" id="photo" /> 	
										 </div> --%>
										 
										 <div class="custom-file">
											<f:input path="photo" type="file" class="custom-file-input" id="customFile" />
										    <label class="custom-file-label" for="customFile">Choisir une photo</label>
										    <div class="has-error"> <f:errors path="photo" class="help-inline"/> </div>
										 </div>
									 	
									</div>
									<div class="card-footer">
										<button type="submit" class="btn btn-outline-primary mb-2">
											<i class="fas fa-save"></i>&nbsp;<fmt:message key="common.enregistrer" />
										</button>
										<button type="reset" class="btn btn-outline-warning mb-2">
											<i class="fas fa-undo-alt"></i>&nbsp;<fmt:message key="common.reinitialiser" />
										</button>
										<a href="<c:url value="/client/" />" class="btn btn-outline-danger mb-2"> 
											<i class="fas fa-chevron-circle-left"></i>&nbsp;<fmt:message key="common.annuler" />
										</a>
									</div>
								</f:form>
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
	<script src="<%=request.getContextPath()%>/resources/vendor/jquery/jquery.min.js"></script>
	<script src="<%=request.getContextPath()%>/resources/vendor/bootstrap/js/bootstrap.bundle.min.js"></script>

	<!-- Core plugin JavaScript-->
	<script src="<%=request.getContextPath()%>/resources/vendor/jquery-easing/jquery.easing.min.js"></script>

	<!-- Custom scripts for all pages-->
	<script src="<%=request.getContextPath()%>/resources/js/sb-admin-2.min.js"></script>

	<!-- Page level plugins -->
	<script src="<%=request.getContextPath()%>/resources/vendor/datatables/jquery.dataTables.min.js"></script>
	<script src="<%=request.getContextPath()%>/resources/vendor/datatables/dataTables.bootstrap4.min.js"></script>

	<!-- Page level custom scripts -->
	<script src="<%=request.getContextPath()%>/resources/js/demo/datatables-demo.js"></script>

	<!-- Add the following script if you want the name of the file appear on select -->
	<script>
		$(".custom-file-input").on("change", function() {
			  var fileName = $(this).val().split("\\").pop();
			  $(this).siblings(".custom-file-label").addClass("selected").html(fileName);
		});
	</script>

</body>

</html>