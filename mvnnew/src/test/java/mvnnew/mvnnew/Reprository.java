package mvnnew.mvnnew;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.pagelibrary.ranfordbank.BranchesPage;
import com.pagelibrary.ranfordbank.Employee;
import com.pagelibrary.ranfordbank.GenricClass;
import com.pagelibrary.ranfordbank.Homepage;
import com.pagelibrary.ranfordbank.New_Branch_Entry;
import com.pagelibrary.ranfordbank.New_Emply_Creation;
import com.pagelibrary.ranfordbank.New_Roles_Creation;
import com.pagelibrary.ranfordbank.New_User_Creation;
import com.pagelibrary.ranfordbank.Roles;
import com.pagelibrary.ranfordbank.Users;

import TestBase.Base;
import excel.Excel_class;
import jxl.Sheet;
import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;

public class Reprository extends Base{
	static String folderpath;
	WebDriver driver;
	static Sheet sh;
	static Workbook wb;
	static WritableWorkbook wwb;
	static WritableSheet wsh;
	public void launch(String brow)
	{
		if(brow.equalsIgnoreCase("firefox")){
		System.setProperty(config("firefoxDriverName"),config("firefoxDriverPath"));
		driver = new FirefoxDriver();
		}
		else if(brow.equalsIgnoreCase("chrome")){
			System.setProperty(config("chromeDriverName"),config("chromeDriverPath"));
			driver = new ChromeDriver();
		}
		driver.get(config("Bulid2"));
		
	}
    public void login()
	{
    
		Homepage.Username_text(driver).sendKeys(config("username"));
		System.out.println("nikhil");
		Homepage.Password_text(driver).sendKeys(config("password"));
		Homepage.Login_clk(driver).click();
	}
	
    public void Branches()
    {
    	BranchesPage.Branches_clk(driver).click();
    	BranchesPage.Country_srh(driver).selectByVisibleText("INDIA");
    	BranchesPage.State_srh(driver).selectByVisibleText("Karnataka");
    	BranchesPage.City_srh(driver).selectByVisibleText("HUBLY");
    	BranchesPage.SearchBtn_clk(driver).click();
    	
    }
    public void NewBranchs(String Branch_Name,String Address_1,String Adress_2,String Address_3,String Area,String Zipcode)
    {
    	BranchesPage.NewBranch_clk(driver).click();
    	New_Branch_Entry.BrancheName_text(driver).sendKeys(Branch_Name);
    	New_Branch_Entry.Addres1_text(driver).sendKeys(Address_1);
    	New_Branch_Entry.Addres2_text(driver).sendKeys(Adress_2);
    	New_Branch_Entry.Addres3_text(driver).sendKeys(Address_3);
    	New_Branch_Entry.Area_text(driver).sendKeys(Area);
    	New_Branch_Entry.Zipcode_txt(driver).sendKeys(Zipcode);
    	New_Branch_Entry.Country_srh(driver).selectByVisibleText("INDIA");
    	New_Branch_Entry.State_srh(driver).selectByVisibleText("Andhra Pradesh");
    	New_Branch_Entry.City_srh(driver).selectByVisibleText("Hyderabad");
    	New_Branch_Entry.Submit_clk(driver).click();
    	GenricClass.Alert(driver);
    	//New_Branch_Entry.Reset_clk(driver).click();
    	//New_Branch_Entry.Cancel_clk(driver).click();
    }
    public void Roles_page()
    {
    	Roles.Roles_clk(driver).click();
    	
    }
    public void New_Role()
    {	
    	Roles.NewRole_clk(driver).click();
    	New_Roles_Creation.RoleName_text(driver).sendKeys("XYZ2");
    	New_Roles_Creation.RoleDecs_text(driver).sendKeys("PQRST1");
    	New_Roles_Creation.RoleType_srh(driver).selectByVisibleText("C");
    	New_Roles_Creation.Submit_clk(driver).click();
    	GenricClass.Alert(driver);
    	//New_Roles_Creation.Reset_clk(driver).click();
    	//New_Roles_Creation.Cancel_clk(driver).click();
    }
    public void User()
    {
    	Users.Users_clk(driver).click();
    	Users.Branch_srh(driver).selectByVisibleText("@");
    	Users.Roles_srh(driver).selectByVisibleText("DEENA");
    	Users.Search_clk(driver).click();
    	//GenricClass.Alert(driver);
    	//Users.Clear_clk(driver).click();
    	
    }
    public void New_Users()
    {
    	Users.NewUser_clk(driver).click();
    	New_User_Creation.Role_srh(driver).selectByVisibleText("ASHOK");
    	New_User_Creation.Branch_srh(driver).selectByVisibleText("1");
    	New_User_Creation.CustomerID_srh(driver).selectByVisibleText("Select");
    	New_User_Creation.CustomerName_txt(driver).selectByVisibleText("nik");
    	New_User_Creation.UserName_txt(driver).sendKeys("nikl");
    	New_User_Creation.LoginPassword_txt(driver).sendKeys("54321");
    	New_User_Creation.Submit_clk(driver).click();
    	GenricClass.Alert(driver);
    	//New_User_Creation.Reset_clk(driver).click();
    	//New_User_Creation.Cancel_clk(driver).click();
    }
    public void Emply()
    {
    	Employee.Employee_clk(driver).click();
    }
    public void New_Emply()
    {
    	Employee.NewEmply_clk(driver).click();
    	New_Emply_Creation.EmployerName_txt(driver).sendKeys("nikki");
    	New_Emply_Creation.LoginPass_txt(driver).sendKeys("54321");
    	New_Emply_Creation.Role_srh(driver).selectByVisibleText("VIKAS");
    	New_Emply_Creation.Branch_srh(driver).selectByVisibleText("123456");
    	New_Emply_Creation.Submit_clk(driver).click();
    	GenricClass.Alert(driver);
    	//New_Emply_Creation.Reset_clk(driver).click();
    	//New_Emply_Creation.Cancel_clk(driver).click();
    }
    
    
  /*  public Object[][] excelcontent(String filename , String sheetname)
    {
    	Excel_class.excelconnection(filename, sheetname);
    	
    	int rc=Excel_class.rcount();
    	int cc=Excel_class.ccount();
    	String[][] data = new String[rc-1][cc];
    	for(int r=1;r<rc;r++){
    		for(int c=0;c<cc;c++){
    			data[r-1][c]=Excel_class.readdata(c, r);
    		}
    	}
    	return data;
    	
    }
   
    //writing to excel
    public static void outputexcelconnection(String ifilename,String ofilename,String sheetname)
   	{
   		try {
   			
			FileInputStream fis=new FileInputStream(folderpath+ifilename);
   			
   			wb =  Workbook.getWorkbook(fis);
   			 sh = wb.getSheet(sheetname);
   			 
   			 FileOutputStream fos=new FileOutputStream(folderpath+ofilename);
   			 
   			 wwb=Workbook.createWorkbook(fos, wb);
   			 
   			wsh= wwb.getSheet(sheetname);
   		} catch (Exception e) {
   			// TODO Auto-generated catch block
   			e.printStackTrace();
   		} 
   	}
   	
   	public static void writedata(int col,int row,String data)
   	{
   		try {
   			Label l=new Label(col, row, data);
   			wsh.addCell(l);
   		} catch (Exception e) {
   			// TODO Auto-generated catch block
   			e.printStackTrace();
   		} 
   	}
   	public static void saveworkbook()
   	{
   		try {
   			wwb.write();
   			wwb.close();
   			wb.close();
   		} catch (Exception e) {
   			// TODO Auto-generated catch block
   			e.printStackTrace();
   		} 
   	}
       */
       
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

}
