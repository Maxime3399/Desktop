package fr.Maxime3399.MCube.start;

import fr.Maxime3399.MCube.GameState;

public class UselessEventStart {
  public UselessEventStart() {}
  
  public static void start() {
    GameState.setState(GameState.USELESSEVNT);
  }
  

  public static void stop()
  {
    GameState.setState(GameState.NONE);
  }
}
