
/**
 * Game Class
 *
 * @Created by: Azure & Noir
 * @Version Alpha 1.0
 */

import apcslib.*;

import java.awt.*;

import chn.util.*;
//STUPID CMOMENTSTUPID CMOMENTSTUPID CMOMENTSTUPID CMOMENTSTUPID CMOMENTSTUPID CMOMENTSTUPID CMOMENT
public class Game
{
    private boolean gameOver = false;
    private boolean fightOver = true;
    private PlayerStats pStats;
    private int choice, killCount;
    
    ConsoleIO input = new ConsoleIO();
    MonsterStats mStats = new MonsterStats();
    Fight mech;
    
    public Game(PlayerStats stats)
    {
        pStats = stats;
        mech = new Fight(pStats, mStats);
        killCount = 0;
    }
    
    public void playerUP()
    {
        if (killCount == 2)
        {
            pStats.playerLvlUp();
            killCount = 0;
        }
    }
    
    public void gameOver()
    {
        System.out.println("Congratz LOSER");
    }
    
    public void runGame()
    {
        while (gameOver == false)
        {
            showStats();
            fightOver = false;
            while (fightOver != true)
            {
                // Level Up
                playerUP();
                
                // Player Turn
                System.out.println();
                System.out.println("Actions");
                System.out.println("1. Slash");
                System.out.println("2. Explosion");
                choice = input.readInt();
                
                if (choice == 1)
                {
                    mech.playerAttacks();
                }
                else if (choice == 2)
                {
                    mech.playerCastsSpell();
                }
                else
                {
                    mech.playerAttacks();
                }
                
                if (mStats.getMonsterHP() <= 0)
                {
                    fightOver = true;
                    killCount++;
                }
                else
                {
                    // Monster Turn
                    System.out.println("The slime attacked you");
                    System.out.println();
                    mech.monsterAttacks();
                }
                
                // Check if Game Over
                if (pStats.getPlayerHP() <= 0)
                {
                    fightOver = true;
                    gameOver = true;
                }
                else
                {
                    // Show New Stats
                    System.out.println();
                    showStats();
                }
            }
            // Reset Monster Stats
            // mStats.monsterLvlUp();
            mStats.resetMonsterStats();
        }
    }
    
    public void showStats()
    {
        pStats.showPlayStats();
        System.out.println();
        System.out.println("Slime has appeared!");
        mStats.showMonsStats();
    }
}
