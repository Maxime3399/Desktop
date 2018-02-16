package fr.Maxime3399.MCube.start;

import fr.Maxime3399.MCube.GameState;

public class HasteStart {
  public HasteStart() {}
  
  public static void start() {
    GameState.setState(GameState.HASTE);
  }
  

  public static void stop()
  {
    GameState.setState(GameState.NONE);
  }
}
