package com.saini.awsexpo.lib.asset;

import java.io.File;

public class LocalFileStorage implements FileStorage {

	@Override
	public boolean create(File file,String filePath) {
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
