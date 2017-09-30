
/**
 * MAIN CLASS
 *
 * @Created by: Azure & Noir
 * @Version Alpha 1.0
 */

import apcslib.*;

import java.awt.*;

import chn.util.*;

public class Main
{
    public static void main(String[] args)
    {
        System.out.println("Hello adventurer, what is your name?");
        ConsoleIO input = new ConsoleIO();
        String name = input.readToken();
        PlayerStats pStats = new PlayerStats(name);
        Game encore = new Game(pStats);
        encore.runGame();
        encore.gameOver();
    }
}
