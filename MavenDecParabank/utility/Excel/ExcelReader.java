package Excel;



import java.io.FileInputStream;
import java.io.IOException;


import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelReader {
	
	

	public  Object[][] gettestData( String SheetName,String ExcelName)  throws  IOException{

		
		FileInputStream  file = new FileInputStream(ExcelName);
		Sheet sh = WorkbookFactory.create(file).getSheet(SheetName);
		 Object[][] data = new Object[sh.getLastRowNum()][sh.getRow(0).getLastCellNum()];
	           for(int i=0;i<sh.getLastRowNum();i++) {
	        	   		for(int j=0;j<sh.getRow(0).getLastCellNum();j++) {
	        		   			data[i][j] =sh.getRow(i+1).getCell(j).toString();
	        		   			System.out.println(data[i][j]);
		}
	}
		return data ;
	}

	
	

}
	
		

