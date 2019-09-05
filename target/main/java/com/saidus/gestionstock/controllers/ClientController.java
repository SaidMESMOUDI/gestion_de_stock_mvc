package com.saidus.gestionstock.controllers;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Blob;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.io.IOUtils;
import org.hibernate.Hibernate;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;

import com.saidus.gestionstock.entities.Client;
import com.saidus.gestionstock.services.IClientService;
import com.saidus.gestionstock.services.IFlickrService;


@Controller
@RequestMapping(value = "/client")
public class ClientController {
	
	  @Autowired
	  private IClientService clientService;
	  @Autowired
	  private IFlickrService flickrService; 
	  
	  @Autowired
	  private SessionFactory sessionFactory;
	 	

	@RequestMapping(value = { "", "/" })
	public String afficherClients(Model model) {
		List<Client> clients = clientService.selectAll();
		if (clients == null) {
			clients = new ArrayList<Client>();
		}
		model.addAttribute("clients", clients);
		return "client/client";
	}
	
	@RequestMapping(value = "/nouveau", method = RequestMethod.GET)
	public String ajouterClient(Model model) {
		Client client = new Client();
		
		model.addAttribute("client", client);
		return "client/ajouterClient";
	}
	
	@RequestMapping(value = "/enregistrer", method = RequestMethod.POST)
	public String enregistrerClient(Model model, Client client, MultipartFile file) {
		/*
		 * @ModelAttribute("client") Client client,
		 * @RequestParam("photo") MultipartFile file
		 */
		
		if (client != null) {
			InputStream stream = null;
			Blob blob = null;
			if (file != null && !file.isEmpty()) { 
				try {
					stream = file.getInputStream(); // System.out.println(stream);
					
					blob = Hibernate.getLobCreator(sessionFactory.getCurrentSession()).createBlob(IOUtils.toByteArray(stream));
					//Blob blob = Hibernate.getLobCreator(sessionFactory.getCurrentSession()).createBlob(stream, -1);
					System.out.println(blob);
					
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			
			client.setPhoto(blob); 
			
			try {
				System.out.println(client.getPhoto().getBinaryStream().toString());
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
			model.addAttribute("client", client);
			clientService.save(client);
		}
		
		return "redirect:/client/"; 
	}
	
	@RequestMapping(value = "/modifier/{id}", method = RequestMethod.GET)
	public String modifierClient(Model model, @PathVariable("id") Long idClt) {
		if (idClt != null) {
			Client client = clientService.getById(idClt);
			if (client != null) {
				model.addAttribute("client", client);
			}
		}
		return "client/ajouterClient";
	}
	 
	
	@RequestMapping(value = "/supprimer/{id}", method = RequestMethod.GET)
	public String supprimerClient(Model model, @PathVariable("id") Long idClt) {
		if (idClt != null) {
			Client client = clientService.getById(idClt);
			if (client != null) {
				clientService.remove(idClt);
			}
		}
		return "redirect:/client/"; 
	}
 
}
