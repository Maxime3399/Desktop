package fr.Maxime3399.MCube.start;

import fr.Maxime3399.MCube.GameState;

public class MobTrophiesStart {
  public MobTrophiesStart() {}
  
  public static void start() {
    GameState.setState(GameState.MOBTROPHIES);
  }
  

  public static void stop()
  {
    GameState.setState(GameState.NONE);
  }
}
