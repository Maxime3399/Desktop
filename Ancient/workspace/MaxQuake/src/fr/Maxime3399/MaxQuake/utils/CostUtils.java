package fr.Maxime3399.MaxQuake.utils;

public class CostUtils {
	
	public static int getCaseCost(int level){
		
		int result = 200;
		
		if(level == 2){
			result = 200;
		}else if(level == 3){
			result = 400;
		}else if(level == 4){
			result = 800;
		}else if(level == 5){
			result = 1600;
		}else if(level == 6){
			result = 3200;
		}else if(level == 7){
			result = 6400;
		}else if(level == 8){
			result = 12800;
		}else if(level == 9){
			result = 25600;
		}else if(level == 10){
			result = 51200;
		}else if(level == 11){
			result = 102400;
		}else if(level == 12){
			result = 204800;
		}else if(level == 13){
			result = 409600;
		}else if(level == 14){
			result = 819200;
		}
		
		return result;
		
	}
	
	public static int getTriggerCost(int level){
		
		int result = 1000;
		
		if(level == 2){
			result = 2000;
		}else if(level == 3){
			result = 5000;
		}else if(level == 4){
			result = 12000;
		}else if(level == 5){
			result = 28000;
		}else if(level == 6){
			result = 60000;
		}else if(level == 7){
			result = 130000;
		}else if(level == 8){
			result = 300000;
		}else if(level == 9){
			result = 1000000;
		}
		
		return result;
		
	}

}
