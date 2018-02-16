package fr.Maxime3399.MCube.start;

import fr.Maxime3399.MCube.GameState;

public class MobMoneyStart {
  public MobMoneyStart() {}
  
  public static void start() {
    GameState.setState(GameState.MOBMONEY);
  }
  

  public static void stop()
  {
    GameState.setState(GameState.NONE);
  }
}
