package com.saidus.gestionstock.dao.impl;

import com.flickr4java.flickr.Flickr;
import com.flickr4java.flickr.FlickrException;
import com.flickr4java.flickr.REST;
import com.flickr4java.flickr.RequestContext;
import com.flickr4java.flickr.auth.Auth;
import com.flickr4java.flickr.auth.AuthInterface;
import com.flickr4java.flickr.auth.Permission;
import com.flickr4java.flickr.uploader.UploadMetaData;
import com.github.scribejava.core.model.OAuth1RequestToken;
import com.github.scribejava.core.model.OAuth1Token;
import com.saidus.gestionstock.dao.IFlickrDao;
import org.scribe.model.Verifier;

import javax.swing.*;
import java.io.InputStream;


public class FlickrDaoImpl implements IFlickrDao {
	
	private Flickr flickr;
	private UploadMetaData uploadMetaData = new UploadMetaData();
	private String apiKey = "97436ebf73c1984d22a5477961658590";
	private String sharedSecret = "6f3b33cb7ae3f881";
		
    private void connect() { 
		flickr = new Flickr(apiKey, sharedSecret, new REST()); 
		Auth auth = new Auth(); 
		
		auth.setPermission(Permission.READ);
		/*
		 * auth.setToken("72157678731273846-45f683ca35c4b3c2");
		 * auth.setTokenSecret("6342826986448e45");
		 */
		auth.setToken("");
		auth.setTokenSecret("");
		 
		RequestContext requestContext = RequestContext.getRequestContext(); 
		requestContext.setAuth(auth);
		flickr.setAuth(auth); 
	  }
	 

	public String savePhoto(InputStream photo, String title) throws Exception {
		connect();
		uploadMetaData.setTitle(title);
		String photoId = flickr.getUploader().upload(photo, uploadMetaData);
		return flickr.getPhotosInterface().getPhoto(photoId).getMedium640Url();
	}
	
	// On utilise cette fonction (auth) juste une seule fois pour r�cup�rer 
	// dans la console le token et le secretToken
	
	public void auth() {
		flickr = new Flickr(apiKey, sharedSecret, new REST());
		
		AuthInterface authInterface = flickr.getAuthInterface();
		
		OAuth1RequestToken token = authInterface.getRequestToken();
		System.out.println("token: " + token);
		
		String url = authInterface.getAuthorizationUrl(token, Permission.DELETE);
		System.out.println("Follow this URL to autorise yourself on Flickr");
		System.out.println(url);
		System.out.println("Paste in the token it give you:");
		System.out.println(">>");
		
		String tokenKey = JOptionPane.showInputDialog(null);
		OAuth1Token requestToken = authInterface.getAccessToken(token, String.valueOf(new Verifier(tokenKey)));
		System.out.println("Authentication success");
		
		Auth auth = null;
		try {
			auth = authInterface.checkToken(requestToken);
		} catch (FlickrException e) {
			e.printStackTrace();
		}
		
		// This token can be used until the user revokes it. 
		System.out.println("Token : " + requestToken.getToken());
		System.out.println("Secret : " + requestToken.getTokenSecret());
		System.out.println("nsid : " + auth.getUser().getId());
		System.out.println("Realname : " + auth.getUser().getRealName());
		System.out.println("Username : " + auth.getUser().getUsername());
		System.out.println("Permission : " + auth.getPermission().getType());
	}

}