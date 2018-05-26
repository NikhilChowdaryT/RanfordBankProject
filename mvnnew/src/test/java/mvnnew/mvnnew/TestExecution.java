package mvnnew.mvnnew;


import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.pagelibrary.ranfordbank.GenricClass;
import com.pagelibrary.ranfordbank.Roles;

import excel.Excel_class;

public class TestExecution extends Reprository {

	@Parameters({"browser"})
	@BeforeTest
	public void verify_launch(String brow){
		launch(brow);
	}
	@Test(priority=0)
	public void verify_login()
	{
		login();
	}
	@Test(priority=1)
	public void verify_branches() 
	{
		Branches();
	}
	/*@Test(priority=2)
	public void verify_new_branch(String Branch_Name,String Address_1,String Adress_2,String Address_3,String Area,String Zipcode)
	{
		NewBranchs(Branch_Name,Address_1,Adress_2,Address_3,Area,Zipcode);
	}*/
	
	/*@Test(priority=3)
	public void verify_new_branch()
	{
		NewBranchs;
	}*/
	@Test(priority=4)
	public void verify_roles()
	{
		Roles_page();
	}
	@Test(priority=5)
	public void  verify_new_roles()
	{
		New_Role();
	}
	@Test(priority=6)
	public void verify_users()
	{
		User();
	}
	@Test(priority=7)
	public void verify_new_users()
	{
		New_Users();
	}
	@Test(priority=8)
	public void verify_empl()
	{
		Emply();
		
		
	}
	@Test(priority=9)
	public void verify_new_empl()
	{
		New_Emply();
	}
	
	/*@DataProvider(name="bran")
	public Object[][] veify_branches()
	{
		return excelcontent("Excel123.xls", "Sheet1");
		
	}
	
	@DataProvider(name="role")
	public Object[][] verify_role()
	{
		return excelcontent("Excel123.xls","Sheet2");
		
	}*/
	
	
	/* @Test(priority=3)
	    public  void verify_branch_WithoutDP()
	    {
	    	Excel_class.excelconnection("Excel123.xls", "Sheet1");
	  
	    	Reprository.outputexcelconnection("Excel123.xls", "output.xls", "Sheet1");
	    	
	    	for(int i=1;i<Excel_class.rcount();i++)
	    	{
	    		NewBranchs(Excel_class.readdata(0, i) , Excel_class.readdata(1, i), Excel_class.readdata(2, i), Excel_class.readdata(3, i), Excel_class.readdata(4, i),Excel_class.readdata(5, i));
	    		
	    	
	    	String text = GenricClass.Alert(driver).getText();
	    	GenricClass.Alert(driver).accept();
	    	int j=Excel_class.ccount();
	    	if(text.contains("created success"))
	    	{
	    		Reprository.writedata(j++, i, "Test passed");
	    	}
	    	
	    	else if(text.contains("already EXists"))
	    	{
	    		Reprository.writedata(j++, i, "Test Failed");
	    	}
	    	else
	    	{
	    		Reprository.writedata(j++, i, "n/a");
	    	}
	    	}
	    	
	    	Reprository.saveworkbook();
	    }
	}*/
	
	

	/* @Test(priority=2)
	    public  void verify_new_branch_WithoutDP()
	    {
	    	Excel_class.excelconnection("Excel123.xls", "Sheet1");
	    	
	    	Excel_class.outputexcelconnection("Excel123.xls", "output2.xls", "Sheet1");
	    	
	    	
	    	for(int i=1;i<Excel_class.rcount();i++)
	    	{
	    		NewBranchs(Excel_class.readdata(0, i) , Excel_class.readdata(1, i), Excel_class.readdata(2, i), Excel_class.readdata(3, i), Excel_class.readdata(4, i),Excel_class.readdata(5, i));
	    		
	    	String text=GenricClass.Alert(driver).getText();
	    	
	    	GenricClass.Alert(driver).accept();
	    	
	    	int j=Excel_class.ccount();
	    	if(text.contains("created success"))
	    	{
	    		Excel_class.writedata(j++, i, "Test passed");
	    	}
	    	
	    	else if(text.contains("already EXists"))
	    	{
	    		Excel_class.writedata(j++, i, "Test Failed");
	    	}
	    	else
	    	{
	    		Excel_class.writedata(j++, i, "n/a");
	    	}
	    	}
	    	
	    	Excel_class.saveworkbook();
	    }*/
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

