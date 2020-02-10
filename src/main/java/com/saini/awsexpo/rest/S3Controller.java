package com.saini.awsexpo.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.saini.awsexpo.services.AssetFileStorageService;

@RestController
@RequestMapping("/s3")
public class S3Controller {

	@Autowired
	private AssetFileStorageService storageService;
	
	@GetMapping("/upload-file")
	public String uploadFile() {
		
		System.out.println(this.storageService.getFileStorageClient().getClass().getName());
		System.exit(0);
		return null;
	}
}