package fr.Maxime3399.MCube.start;

import fr.Maxime3399.MCube.GameState;

public class PvPStart
{
  public PvPStart() {}
  
  public static void start() {
    GameState.setState(GameState.PVP);
    fr.Maxime3399.MCube.manager.FlyPvpPatch.start();
  }
  

  public static void stop()
  {
    GameState.setState(GameState.PVP);
    fr.Maxime3399.MCube.manager.FlyPvpPatch.stop();
  }
}
