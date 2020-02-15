package com.saini.awsexpo.rest;

import java.io.File;

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
		
		File file = new File("D:/wallpapers/1.jpg");
		System.out.println(file.exists());
		System.out.println(file.length());
		String filePath = "newassets/bmw1000.jpg";
		storageService.create(file,filePath);
		
		String link = "<a href='"+storageService.getAbsoluteFilePath(filePath)+"'>click to open</a>";
		
//		System.out.println(this.storageService.getFileStorageClient().getClass().getName());
//		System.exit(0);
		return "file uploaded at:"+link;
	}
}
