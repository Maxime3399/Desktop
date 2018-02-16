package fr.Maxime3399.MCube;

public enum GameState{
	
  NONE(true),  ETERNALDAY(false),  ETERNALNIGHT(false),  PVP(false),  KEEPINVENTORY(false),  MOBMONEY(false),  MOBTROPHIES(false),  DOUBLELIFE(false),  MONEYTIME(false),  TROPHIESTIME(false),  ANTIWEATHER(false),  NOFOOD(false),  NOREGEN(false),  USELESSEVNT(false),  HASTE(false),  ANTISPAWN(false),  CHESTFINDER(false),  HALFLIFE(false);
  
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