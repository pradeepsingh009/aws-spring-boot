package com.saini.awsexpo.lib.asset;

import java.io.File;

import org.springframework.beans.factory.annotation.Value;

import com.amazonaws.auth.EnvironmentVariableCredentialsProvider;
import com.amazonaws.regions.Regions;
import com.amazonaws.services.s3.model.PutObjectRequest;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3ClientBuilder;

public class S3FileStorage implements FileStorage {
	
	private AmazonS3 s3client;
	
	@Value("${aws.s3.bucket.name}")
	private String bucketName;
	
	public S3FileStorage() {
		s3client = AmazonS3ClientBuilder.standard().withCredentials(new EnvironmentVariableCredentialsProvider()).withRegion(Regions.US_EAST_1).build();
		
	}

	@Override
	public boolean create(File file,String key) {
		PutObjectRequest request = new PutObjectRequest(this.bucketName,key,file);
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public File get(String relativePath) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean delete(String relativePath) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean rename(String oldPath, String newPath) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String getAbsoluteFilePath(String relativePath) {
		// TODO Auto-generated method stub
		return null;
	}

}
