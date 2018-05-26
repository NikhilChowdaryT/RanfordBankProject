 package TestBase;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Properties;

import org.openqa.selenium.By;

public class Base {
	static Properties pro;
	
	public static void loadproperty()
	{
		try{
		File f = new File(System.getProperty("user.dir")+"\\src\\main\\java\\configuration\\Or.properties");
		FileReader fr = new FileReader(f);
		 pro = new Properties();
		pro.load(fr);
		}
		catch(Exception e){
			e.printStackTrace();
		
		}
	}
	public static By elements(String key){
		By loc=null;
		loadproperty();
		
		String elementvalue =pro.getProperty(key);
		String loctype =elementvalue.split(":")[0];
		String locvalue= elementvalue.split(":")[1];
		
		switch(loctype)
		{
			case "id":
				loc=By.id(locvalue);
				break;
				
			case "xpath":
				loc=By.xpath(locvalue);
				break;
		}

		return loc;
		
	}

	
	public static void loadproperty1()
	{
		try{
			File f = new File(System.getProperty("user.dir")+"\\src\\main\\java\\configuration\\config.properties");
			FileReader fr = new FileReader(f);
			 pro = new Properties();
			pro.load(fr);
			}
			catch(Exception e){
				e.printStackTrace();
			}
		}
		public static String config(String key){
			loadproperty1();
			String x=pro.getProperty(key);
			return x;
			
		}
		
	}

