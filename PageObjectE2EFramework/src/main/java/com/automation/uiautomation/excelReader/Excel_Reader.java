package com.automation.uiautomation.excelReader;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_Reader {

	public FileInputStream fis;
	public String path;
	public XSSFWorkbook workbook;
	
	
	public Excel_Reader(String Path)
	{ this.path=Path;
	try {
		fis=new FileInputStream(path);
		workbook = new XSSFWorkbook(fis);
		
	} catch (Exception e) {
		e.printStackTrace();
	}
	}
	
	
	public void getDataFromSheet()
	{
		
	}
	
	
		
	}
