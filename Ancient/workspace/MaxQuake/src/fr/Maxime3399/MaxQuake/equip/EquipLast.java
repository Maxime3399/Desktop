package fr.Maxime3399.MaxQuake.equip;

import fr.Maxime3399.MaxQuake.custom.QuakePlayer;

public class EquipLast {
	
	public static int getCase(QuakePlayer qp){
		
		int result = 1;
		String items = qp.getItems();
		
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
	
	public static int getTrigger(QuakePlayer qp){
		
		int result = 1;
		String items = qp.getItems();
		
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

}
