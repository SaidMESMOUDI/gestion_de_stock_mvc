package com.saidus.gestionstock.controllers;

import com.saidus.gestionstock.entities.Client;
import com.saidus.gestionstock.entities.FileBucket;
import com.saidus.gestionstock.entities.UploadFile;
import com.saidus.gestionstock.services.IClientService;
import com.saidus.gestionstock.services.IUploadFileService;
import com.saidus.gestionstock.util.FileValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


@Controller
@RequestMapping(value = "/client")
public class ClientController {
	
	  @Autowired
	  private IClientService clientService;
	  
	  @Autowired
	  private IUploadFileService uploadFileService;
	  
	/*
	 * @Autowired private IFlickrService flickrService;
	 * 
	 * @Autowired private SessionFactory sessionFactory;
	 */
	  @Autowired
	  FileValidator fileValidator;
	     
	  @InitBinder("fileBucket")
	  protected void initBinder(WebDataBinder binder) {
		  binder.setValidator(fileValidator);
	  }

	@RequestMapping(value = { "", "/" })
	public String afficherClients(Model model) {
		List<Client> clients = clientService.selectAll();
		if (clients == null) {
			clients = new ArrayList<Client>();
		}
		model.addAttribute("clients", clients);
		return "client/client";
	}
	
	@SuppressWarnings("unchecked")
	@RequestMapping(value = "/nouveau", method = RequestMethod.GET)
	public String ajouterClient(ModelMap modelMap) {
		Client client = new Client();
		modelMap.addAttribute("client", client);
		modelMap.addAttribute("edit", false);
		//
		FileBucket fileModel = new FileBucket();
        modelMap.addAttribute("fileBucket", fileModel);
        //
		List<UploadFile> uploadFiles =  (List<UploadFile>) new UploadFile();  //List<UploadFile> uploadFiles = uploadFileService.findAllByClientId(clientId);
		modelMap.addAttribute("uploadFiles", uploadFiles);
		
		return "client/ajouterClient";
	}

	@RequestMapping(value = "/enregistrer", method = RequestMethod.POST)
	public String enregistrerClient (@Valid FileBucket fileBucket, 
									 @ModelAttribute("client") Client client, 
									 BindingResult result,
									 ModelMap modelMap) {
		
		if (result.hasErrors()) {
			System.out.println("validation errors");
			return "client/ajouterClient";
		}
		 
		if (client != null) {
			client.setUploadFiles(null); 
			clientService.save(client);
			modelMap.addAttribute("client", client);
			
			System.out.println("Fetching file");
			UploadFile uploadFile = new UploadFile(); 
			MultipartFile multipartFile = fileBucket.getFile();
			 
			uploadFile.setFileName(multipartFile.getOriginalFilename());
			uploadFile.setType(multipartFile.getContentType());
			try {
				uploadFile.setData(multipartFile.getBytes());
			} catch (IOException e) {
				e.printStackTrace();
			}
			uploadFile.setClient(client);
			
			uploadFileService.saveUploadFile(uploadFile); 
			modelMap.addAttribute("uploadFile", uploadFile);
			System.out.println("le fichier uploader est : \n " + uploadFile.toString());
			
			
			client.setUploadFiles(uploadFile.getClient().getUploadFiles()); 
			clientService.save(client);
			modelMap.addAttribute("client", client);
			System.out.println("le client enregistrer est : \n " + client.toString());
			
			return "redirect:/client/"; 
			
		} else {
			
			return "client/ajouterClient";
		}
		 
        

	}
	
	
	@RequestMapping(value = "/modifier/{id}", method = RequestMethod.GET)
	public String modifierClient(Model model, @PathVariable("id") Long idClt) {
		if (idClt != null) {
			Client client = clientService.getById(idClt);
			if (client != null) {
				model.addAttribute("client", client);
			}
		}
		
		model.addAttribute("edit", true);
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