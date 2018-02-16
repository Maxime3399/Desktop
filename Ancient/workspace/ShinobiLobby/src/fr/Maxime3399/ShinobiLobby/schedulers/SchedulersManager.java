package fr.Maxime3399.ShinobiLobby.schedulers;

public class SchedulersManager {
	
	public static void registerSchedulers(){
		
		HologramsSchedulers.start();
		FCScheduler.start();
		WaitScheduler.start();
		
	}

}
