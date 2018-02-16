package fr.Maxime3399.MaxQuake.equip;

import fr.Maxime3399.MaxQuake.custom.QuakePlayer;

public class EquipCurrent {
	
	public static int getCase(QuakePlayer qp){
		
		int result = 1;
		String items = qp.getEnable();
		
		if(items.contains("case02")){
			result = 2;
		}else if(items.contains("case03")){
			result = 3;
		}else if(items.contains("case04")){
			result = 4;
		}else if(items.contains("case05")){
			result = 5;
		}else if(items.contains("case06")){
			result = 6;
		}else if(items.contains("case07")){
			result = 7;
		}else if(items.contains("case08")){
			result = 8;
		}else if(items.contains("case09")){
			result = 9;
		}else if(items.contains("case10")){
			result = 10;
		}else if(items.contains("case11")){
			result = 11;
		}else if(items.contains("case12")){
			result = 12;
		}else if(items.contains("case13")){
			result = 13;
		}else if(items.contains("case14")){
			result = 14;
		}
		
		return result;
		
	}
	
	public static String getCaseString(QuakePlayer qp){
		
		String result = "case01";
		String items = qp.getEnable();
		
		if(items.contains("case02")){
			result = "case02";
		}else if(items.contains("case03")){
			result = "case03";
		}else if(items.contains("case04")){
			result = "case04";
		}else if(items.contains("case05")){
			result = "case05";
		}else if(items.contains("case06")){
			result = "case06";
		}else if(items.contains("case07")){
			result = "case07";
		}else if(items.contains("case08")){
			result = "case08";
		}else if(items.contains("case09")){
			result = "case09";
		}else if(items.contains("case10")){
			result = "case10";
		}else if(items.contains("case11")){
			result = "case11";
		}else if(items.contains("case12")){
			result = "case12";
		}else if(items.contains("case13")){
			result = "case13";
		}else if(items.contains("case14")){
			result = "case14";
		}
		
		return result;
		
	}
	
	public static int getTrigger(QuakePlayer qp){
		
		int result = 1;
		String items = qp.getEnable();
		
		if(items.contains("trigger02")){
			result = 2;
		}else if(items.contains("trigger03")){
			result = 3;
		}else if(items.contains("trigger04")){
			result = 4;
		}else if(items.contains("trigger05")){
			result = 5;
		}else if(items.contains("trigger06")){
			result = 6;
		}else if(items.contains("trigger07")){
			result = 7;
		}else if(items.contains("trigger08")){
			result = 8;
		}else if(items.contains("trigger09")){
			result = 9;
		}
		
		return result;
		
	}
	
	public static String getTriggerString(QuakePlayer qp){
		
		String result = "trigger01";
		String items = qp.getEnable();
		
		if(items.contains("trigger02")){
			result = "trigger02";
		}else if(items.contains("trigger03")){
			result = "trigger03";
		}else if(items.contains("trigger04")){
			result = "trigger04";
		}else if(items.contains("trigger05")){
			result = "trigger05";
		}else if(items.contains("trigger06")){
			result = "trigger06";
		}else if(items.contains("trigger07")){
			result = "trigger07";
		}else if(items.contains("trigger08")){
			result = "trigger08";
		}else if(items.contains("trigger09")){
			result = "trigger09";
		}
		
		return result;
		
	}

}
