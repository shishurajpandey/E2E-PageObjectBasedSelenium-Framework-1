package com.automation.uiautomation.excelReader;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
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
	
	
	@SuppressWarnings("deprecation")
	public String[][] getDataFromSheet(String sheetName)
	{
		String[][] dataSets=null;
		try{
			XSSFSheet sheet=workbook.getSheet(sheetName);
		
		int totalRows=sheet.getLastRowNum()+1;
		int totalColoums=sheet.getRow(0).getLastCellNum();
		dataSets=new String[totalRows-1][totalColoums];
		
		for(int i=1;i<totalRows-1;i++)
		{ XSSFRow row=sheet.getRow(i);
		for(int j=0;j<totalColoums-1;j++)
		{
			XSSFCell cell=row.getCell(j);
			
			if(cell.getCellType()==org.apache.poi.ss.usermodel.Cell.CELL_TYPE_STRING)
			{
				dataSets[i-1][j]=cell.getStringCellValue();
				
			}
			else
				if(cell.getCellType()==Cell.CELL_TYPE_NUMERIC)
				{
					dataSets[i-1][j]=String.valueOf(cell.getNumericCellValue());
					
				}
				else
					if(cell.getCellType()==Cell.CELL_TYPE_BOOLEAN)
					{
						dataSets[i-1][j]=String.valueOf(cell.getBooleanCellValue());
						
					}
		}
			return dataSets;
		}
		
		}
		catch(Exception E)
		{
			E.printStackTrace();
		}
		return dataSets;
	}
	
	
		
	}
