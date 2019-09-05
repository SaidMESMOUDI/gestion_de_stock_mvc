<ul
	class="navbar-nav bg-gradient-primary sidebar sidebar-dark accordion"
	id="accordionSidebar">

	<!-- Sidebar - Brand -->
	<c:url value="/home/" var="home" /> 
	<a href="${home}" class="sidebar-brand d-flex align-items-center justify-content-center">
		<div class="sidebar-brand-icon rotate-n-15">
			<i class="fas fa-tasks"></i>
		</div>
		<div class="sidebar-brand-text mx-3">
			Gestion de stock
		</div>
	</a>

	<!-- Divider -->
	<hr class="sidebar-divider my-0">

	<!-- Nav Item - Dashboard -->
	<c:url value="/home/" var="home" />
	<li class="nav-item active">
		<a class="nav-link" href="${home}">
			<i class="fas fa-fw fa-tachometer-alt"></i> 
			<span> <fmt:message key="common.dashboard" />  </span>
		</a>
	</li>

	<!-- Divider -->
	<hr class="sidebar-divider my-0">
	
	<!-- Heading -->
	<!-- <div class="sidebar-heading">Articles</div> -->

	<!-- Nav Item - Articles Collapse Menu -->
	<c:url value="/articles/" var="articles" /> 
	<li class="nav-item">
		<a class="nav-link collapsed" href="${articles}" > 
			<i class="fas fa-fw fa-boxes"></i> 
			<span> <fmt:message key="common.article" /> </span>
		</a>
	</li>
	
	<!-- Divider -->
	<hr class="sidebar-divider my-0">
	
	<!-- Heading -->
	<!-- <div class="sidebar-heading">Clients</div> -->

	<!-- Nav Item - Clients Collapse Menu -->
	<li class="nav-item">
		<a class="nav-link collapsed" href="#"
			data-toggle="collapse" data-target="#collapseClients"
			aria-expanded="true" aria-controls="collapseClients"> 
			<i class="fas fa-fw fa-users"></i> 
			<span> <fmt:message key="common.client" /> </span>
		</a>
		<div id="collapseClients" class="collapse"
			aria-labelledby="headingClients" data-parent="#accordionSidebar">
			<div class="bg-white py-2 collapse-inner rounded">
				<h6 class="collapse-header"> <fmt:message key="common.client" />/<fmt:message key="common.client.commande" />:</h6>
				<c:url value="/client" var="client" />
				<a class="collapse-item"  href="${client}"> <fmt:message key="common.client" /> </a> 
				<c:url value="/commandeclient/" var="cmdeClient" />
				<a class="collapse-item" href="${cmdeClient}"> <fmt:message key="common.client.commande" /> </a> 
			</div>
		</div>
	</li>

	<!-- Divider -->
	<hr class="sidebar-divider my-0">

	<!-- Heading -->
	<!-- <div class="sidebar-heading">Fournisseurs</div> -->

	<!-- Nav Item - Fournisseurs Collapse Menu -->
	<li class="nav-item">
		<a class="nav-link collapsed" href="#"
			data-toggle="collapse" data-target="#collapseFournisseurs"
			aria-expanded="true" aria-controls="collapseFournisseurs"> 
			<i class="fas fa-fw fa-user-tie"></i> 
			<span> <fmt:message key="common.fournisseur" /> </span>
		</a>
		<div id="collapseFournisseurs" class="collapse"
			aria-labelledby="headingFournisseurs" data-parent="#accordionSidebar">
			<div class="bg-white py-2 collapse-inner rounded">
				<c:url value="/fournisseur/" var="fournisseur" />
				<a class="collapse-item" href="${fournisseur}"> <fmt:message key="common.fournisseur" /> </a> 
				
				<c:url value="/commandefournisseur/" var="cmdeFournisseur" />
				<a class="collapse-item" href="${cmdeFournisseur}"> <fmt:message key="common.fournisseur.commande" /> </a> 
			</div>
		</div>
	</li>
	
	<!-- Divider -->
	<hr class="sidebar-divider my-0">
	
	<!-- Nav Item - Stock -->
	<c:url value="/stock/" var="stock" /> 
	<li class="nav-item">
		<a class="nav-link" href="${stock}"> 
			<i class="fas fa-fw fa-cubes"></i> 
			<span><fmt:message key="common.stock" /></span>
		</a>
	</li>
	
	<!-- Divider -->
	<hr class="sidebar-divider my-0">
	
	<!-- Nav Item - Ventes -->
	<c:url value="/vente/" var="vente" /> 
	<li class="nav-item">
		<a class="nav-link" href="${vente}"> 
			<i class="fas fa-fw fa-coins"></i> 
			<span><fmt:message key="common.vente" /></span>
		</a>
	</li>
	
	<!-- Divider -->
	<hr class="sidebar-divider my-0">
	
	<!-- Nav Item - Parametrage Utilisateurs/Categories Collapse Menu -->
	<li class="nav-item">
		<a class="nav-link collapsed" href="#"
			data-toggle="collapse" data-target="#collapseParametrage"
			aria-expanded="true" aria-controls="collapseParametrage"> 
			<i class="fas fa-fw fa-cog"></i> 
			<span> <fmt:message key="common.parametrage" /> </span>
		</a>
		<div id="collapseParametrage" class="collapse"
			aria-labelledby="headingParametrage" data-parent="#accordionSidebar">
			<div class="bg-white py-2 collapse-inner rounded">
				<c:url value="/utilisateur/" var="utilisateur" /> 
				<a class="collapse-item" href="${utilisateur}"> 
					<i class="fas fa-fw fa-user-cog"> </i> 
					<fmt:message key="common.parametrage.utilisateur" /> 
				</a> 
				
				<c:url value="/categorie/" var="categorie" /> 
				<a class="collapse-item" href="${categorie}"> 
					<i class="fas fa-list-alt"> </i> 
					<fmt:message key="common.parametrage.categorie" /> 
				</a> 
			</div>
		</div>
	</li>
	
	<!-- Divider -->
	<hr class="sidebar-divider d-none d-md-block" />

	<!-- Sidebar Toggler (Sidebar) -->
	<div class="text-center d-none d-md-inline">
		<button class="rounded-circle border-0" id="sidebarToggle"></button>
	</div>

</ul>
<!-- End of Sidebar -->