package fr.Maxime3399.MCube.schedulers;

public class SchedulersManager{
	
	public static void registerSchedulers(){
		
		HourScheduler.start();
		CosWingsScheduler.start();
		CosHatsScheduler.start();
		PhaseScheduler.start();
		
	}

}
