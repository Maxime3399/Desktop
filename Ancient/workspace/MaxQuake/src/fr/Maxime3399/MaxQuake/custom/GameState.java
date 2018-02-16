package fr.Maxime3399.MaxQuake.custom;

public enum GameState {

	WAITING(true), PLAYING(false), END(false);
	
	  private boolean canJoin;
	  private static GameState currentState;
	  
	  private GameState(boolean canJoin){
		  
	    this.canJoin = canJoin;
	    
	  }
	  
	  public boolean canJoin(){
		  
	    return canJoin;
	    
	  }
	  
	  public static void setState(GameState state){
		  
	    currentState = state;
	    
	  }
	  
	  public static boolean isState(GameState state){
		  
	    return currentState == state;
	    
	  }
	  
	  public static GameState getState(){
		  
	    return currentState;
	    
	  }
	
}
