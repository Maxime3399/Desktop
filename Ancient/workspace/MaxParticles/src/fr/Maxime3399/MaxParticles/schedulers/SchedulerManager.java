package fr.Maxime3399.MaxParticles.schedulers;

public class SchedulerManager {
	
	public static void registerSchedulers(){
		
		WingsScheduler.start();
		AurasScheduler.start();
		HatsScheduler.start();
		
	}

}
