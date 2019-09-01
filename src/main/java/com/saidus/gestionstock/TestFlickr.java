package com.saidus.gestionstock;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

import com.saidus.gestionstock.dao.impl.FlickrDaoImpl;

public class TestFlickr {

	public static void main(String[] args) {
	
		 FlickrDaoImpl flickr = new FlickrDaoImpl(); 
		 // flickr.auth();
		 
		
		  try { 
			  InputStream inputStream = new FileInputStream(new File("C:\\Users\\MESMOUDI\\Desktop\\Computers photos\\PC (1).jpg")); 
		  String url = flickr.savePhoto(inputStream, "myImage"); System.out.println(url); 
		  }catch (Exception e) { 
			 e.printStackTrace(); 
		  }
		 
		 
	}

}
