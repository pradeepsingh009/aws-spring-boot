package com.saini.awsexpo.lib.asset;

import java.io.File;

public interface FileStorage {

	public boolean create();
	
	public File get(String relativePath);
	
	public boolean delete(String relativePath);
	
	public boolean rename(String oldPath,String newPath);
	
	public String getAbsoluteFilePath(String relativePath);
		
}
