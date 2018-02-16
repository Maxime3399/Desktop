package fr.Maxime3399.MaxQuake.equip;

import fr.Maxime3399.MaxQuake.custom.QuakePlayer;

public class EquipCounts {
	
	public static int getTriggers(QuakePlayer qp){
		
		int result = 0;
		String eq = qp.getItems();
		
		if(eq.contains("trigger01")){
			result = 1;
		}
		if(eq.contains("trigger02")){
			result = 2;
		}
		if(eq.contains("trigger03")){
			result = 3;
		}
		if(eq.contains("trigger04")){
			result = 4;
		}
		if(eq.contains("trigger05")){
			result = 5;
		}
		if(eq.contains("trigger06")){
			result = 6;
		}
		if(eq.contains("trigger07")){
			result = 7;
		}
		if(eq.contains("trigger08")){
			result = 8;
		}
		if(eq.contains("trigger09")){
			result = 9;
		}
		
		return result;
		
	}
	
	public static int getTriggerPercentage(QuakePlayer qp){
		
		int result = 0;
		int cases = getTriggers(qp);
		
		result = cases*100/9;
		
		return result;
		
	}
	
	public static int getCases(QuakePlayer qp){
		
		int result = 0;
		String eq = qp.getItems();
		
		if(eq.contains("case01")){
			result = 1;
		}
		if(eq.contains("case02")){
			result = 2;
		}
		if(eq.contains("case03")){
			result = 3;
		}
		if(eq.contains("case04")){
			result = 4;
		}
		if(eq.contains("case05")){
			result = 5;
		}
		if(eq.contains("case06")){
			result = 6;
		}
		if(eq.contains("case07")){
			result = 7;
		}
		if(eq.contains("case08")){
			result = 8;
		}
		if(eq.contains("case09")){
			result = 9;
		}
		if(eq.contains("case10")){
			result = 10;
		}
		if(eq.contains("case11")){
			result = 11;
		}
		if(eq.contains("case12")){
			result = 12;
		}
		if(eq.contains("case13")){
			result = 13;
		}
		if(eq.contains("case14")){
			result = 14;
		}
		
		return result;
		
	}
	
	public static int getCasePercentage(QuakePlayer qp){
		
		int result = 0;
		int cases = getCases(qp);
		
		result = cases*100/14;
		
		return result;
		
	}

}
