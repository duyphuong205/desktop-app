package com.EduPoLy.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Color;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelHelper {

	private FileInputStream fis;
	private FileOutputStream file_out;
	private Workbook wb;
	private Sheet sh;
	private Cell cell;
	private Row row;
	private CellStyle cell_style;
	private Color my_color;
	private String excel_FilePath;
	private DataFormatter dataFormatter;
	private Map<String, Integer> columns = new HashMap<>();

	// private List<String> cellnames = new ArrayList<>();
	public void setExcelFile(String ExcelPath, String sheet_Name) throws Exception {
		try {
			File f = new File(ExcelPath);
			if (!f.exists()) {
				f.createNewFile();
				System.out.println("File nay khong ton tai. Da tao moi!");
			}

			fis = new FileInputStream(ExcelPath);
			wb = WorkbookFactory.create(fis);
			sh = wb.getSheet(sheet_Name);
			if (sh == null) {
				sh = wb.createSheet(sheet_Name);
			}
			this.excel_FilePath = ExcelPath;

			sh.getRow(0).forEach(cell -> {
				columns.put(cell.getStringCellValue(), cell.getColumnIndex());

			});
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// read data file excel
	public String getCellData(int rownum, int colnum) throws Exception {
		try {
			cell = sh.getRow(rownum).getCell(colnum);
			String CellData = null;
			switch (cell.getCellType()) {
			case STRING:
				CellData = cell.getStringCellValue();
				break;
			case NUMERIC:
				if (DateUtil.isCellDateFormatted(cell)) {
					CellData = String.valueOf(cell.getDateCellValue());
				} else {
					CellData = String.valueOf((long) cell.getNumericCellValue());
				}
				break;
			case BOOLEAN:
				CellData = Boolean.toString(cell.getBooleanCellValue());
				break;
			case BLANK:
				CellData = "";
				break;
			}
			return CellData;
		} catch (Exception e) {
			e.printStackTrace();
			return "";
		}

	}

	// call this method
	public String getCellData(String columnName, int rownum) throws Exception {
		return getCellData(rownum, columns.get(columnName));
	}

	public void setCellData(String text, int rownum, int colnum) throws Exception {
		try {
			row = sh.getRow(rownum);
			if (row == null) {
				row = sh.createRow(rownum);
			}
			cell = row.getCell(colnum);
			if (cell == null) {
				cell = row.createCell(colnum);
			}
			cell.setCellValue(text);

			// ghi excel
			file_out = new FileOutputStream(excel_FilePath);
			wb.write(file_out);
			file_out.flush();
			file_out.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
