package excelread;

import java.io.IOException;

public class ExcelBookMain {

	public static void main(String[] args) throws IOException {
         System.out.println(ExcelBook1.getStringData(0, 0));
         System.out.println(ExcelBook1.getStringData(0, 1));
         System.out.println(ExcelBook1.getStringData(1, 0));
         System.out.println(ExcelBook1.getIntegerData(1, 1));
		}

	}


