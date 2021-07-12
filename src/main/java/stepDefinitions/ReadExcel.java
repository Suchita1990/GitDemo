package stepDefinitions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class ReadExcel {
	int x, y, result;

	@Given("User has two number from {int}")
	public void acceptNumbers(int rowNum) {
		FileInputStream fis = null;
		try {
			fis = new FileInputStream("C:\\Users\\Shree\\Documents\\CucumberData.xlsx");
			XSSFWorkbook book = new XSSFWorkbook(fis);
			XSSFSheet sheet = book.getSheet("Sheet1");
			Row row = sheet.getRow(rowNum);

			x = (int) row.getCell(1).getNumericCellValue();
			y = (int) row.getCell(2).getNumericCellValue();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	@When("adds given numbers")
	public void addNumber() {
		result = x + y;
	}

	
	@Then("Result must be Even Number")
	public void checkIfAdditionIsEven() {
		int rem = result % 2;
		System.out.println("Addition of "+x+" and "+y+": "+result);
		Assert.assertEquals("Addition is odd no: "+result,0, rem);

	}
}
