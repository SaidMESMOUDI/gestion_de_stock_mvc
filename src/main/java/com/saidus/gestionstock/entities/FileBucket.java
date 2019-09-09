package com.saidus.gestionstock.entities;

import org.springframework.web.multipart.MultipartFile;

public class FileBucket {
	/*
	 * http://websystique.com/springmvc/spring-mvc-4-fileupload-download-hibernate-
	 * example/
	 */    
	
	MultipartFile file;
     
    String description;
 
    public MultipartFile getFile() {
        return file;
    }
 
    public void setFile(MultipartFile file) {
        this.file = file;
    }
 
    public String getDescription() {
        return description;
    }
 
    public void setDescription(String description) {
        this.description = description;
    }
 
}