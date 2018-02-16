package fr.Maxime3399.MCube.custom;

public enum GameEvent{
	
  NONE(true), ETERNALDAY(false), ETERNALNIGHT(false), SPEEDTIME(false), ANTIWEATHER(false), DOUBLELIFE(false), HALFLIFE(false), NOFOOD(false), NOREGEN(false), MOBMONEY(false), MOBTROPHIES(false), MONEYTIME(false), TROPHIESTIME(false), EXPLOREMONEY(false), EXPLORETROPHIES(false), HALFDAMAGES(false), DOUBLEDAMAGES(false), HASTE(false), RESISTANCE(false), FORCE(false), SPEED(false), SLOWNESS(false), CRYSTALSFINDER(false), DEATHCOINS(false), DEATHSTUFF(false), USELESSEVENT(false), CHESTFINDER(false);
  
  private boolean canJoin;
  private static GameEvent currentState;
  
  private GameEvent(boolean canJoin){
	  
    this.canJoin = canJoin;
    
  }
  
  public boolean canJoin(){
	  
    return canJoin;
    
  }
  
  public static void setEvent(GameEvent state){
	  
    currentState = state;
    
  }
  
  public static boolean isEvent(GameEvent state){
	  
    return currentState == state;
    
  }
  
  public static GameEvent getEvent(){
	  
    return currentState;
    
  }
  
}