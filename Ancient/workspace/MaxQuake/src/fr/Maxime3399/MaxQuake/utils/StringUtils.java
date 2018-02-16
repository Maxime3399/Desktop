package fr.Maxime3399.MaxQuake.utils;

public class StringUtils {
	
	public static String counter(String value){
		
		String result = "01";
		
		if(value.equalsIgnoreCase("1")){
			result = "01";
		}else if(value.equalsIgnoreCase("2")){
			result = "02";
		}else if(value.equalsIgnoreCase("3")){
			result = "03";
		}else if(value.equalsIgnoreCase("4")){
			result = "04";
		}else if(value.equalsIgnoreCase("5")){
			result = "05";
		}else if(value.equalsIgnoreCase("6")){
			result = "06";
		}else if(value.equalsIgnoreCase("7")){
			result = "07";
		}else if(value.equalsIgnoreCase("8")){
			result = "08";
		}else if(value.equalsIgnoreCase("9")){
			result = "09";
		}else{
			result = value;
		}
		
		return result;
		
	}

}
