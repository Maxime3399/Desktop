package fr.Maxime3399.UltimateBoosters.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MessagesUtils {
	
	public static String secondToHours(String time){
		
		String result = "0";
		int times = 0;
		
        try{
            times = Integer.parseInt(time);
          }catch (NumberFormatException e){
            e.printStackTrace();
          }
        
        if(times < 10){
        	result = new SimpleDateFormat("s").format(new Date(times*1000));
        }else if(times < 60){
        	result = new SimpleDateFormat("ss").format(new Date(times*1000));
        }else if(times < 600){
        	result = new SimpleDateFormat("m:ss").format(new Date(times*1000));
        }else if(times <= 3599){
        	
        	result = new SimpleDateFormat("mm:ss").format(new Date(times*1000));
        	
        }else if(times == 3600){
        	
        	result = "01:00";
        	
        }else{
        	
        	result = new SimpleDateFormat("hh:mm").format(new Date(times*1000));
        	
        }
        
		return result;
		
	}

}
