package com.saini.awsexpo.services;

import java.io.File;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.saini.awsexpo.lib.asset.FileStorage;
import com.saini.awsexpo.lib.asset.LocalFileStorage;
import com.saini.awsexpo.lib.asset.S3FileStorage;

@Service
public class AssetFileStorageService {

	private FileStorage client;
	
	@Value("${application.asset.file_storage_env}")
	private String storageEnv;
	
	@PostConstruct
	public void initStorageCilent() {
		this.client = new LocalFileStorage(); 
		if(this.storageEnv.equalsIgnoreCase("s3")) {
			this.client = new S3FileStorage();
		}
	}
	
	public FileStorage getFileStorageClient() {
		return this.client;
	}
	
	public boolean create(File file,String filePath) {
		return this.client.create(file, filePath);
	}
	
	public File get(String relativePath) {
		return this.client.get(relativePath);
	}
	
	public boolean delete(String relativePath) {
		return this.client.delete(relativePath);
	}
	
	public boolean rename(String oldPath,String newPath) {
		return this.client.rename(oldPath, newPath);
	}
	
	
	public String getAbsoluteFilePath(String relativePath) {
		return this.client.getAbsoluteFilePath(relativePath);
	}
	
	
}
