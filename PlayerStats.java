
/**
 * Player Stats Class
 *
 * @Created by: Azure & Noir
 * @Version Alpha 1.0
 */

import apcslib.*;

import java.awt.*;

import chn.util.*;

public class PlayerStats
{
    private int playHP, playMP, playAtt, playDef, playMgAtt, playLvl;
    private String playName;
    
    public PlayerStats()
    {
        playName = "Jesus";
        playHP = 9;
        playMP = 6;
        playAtt = 5;
        playDef = 1;
        playMgAtt = 4;
        playLvl = 1;
    }
    
    public PlayerStats(String name)
    {
        playName = name;
        playHP = 10;
        playMP = 7;
        playAtt = 6;
        playDef = 1;
        playMgAtt = 4;
        playLvl = 1;
    }
    
    public void playerLvlUp()
    {
        playHP += 4;
        playMP += 1;
        playAtt += 3;
        playDef += 2;
        playMgAtt += 1;
        playLvl++;
    }
    
    public void showPlayStats()
    {
        System.out.println("=====" + playName + "'s Stats=====");
        System.out.println("Level: " + playLvl);
        System.out.println("HP: " + playHP);
        System.out.println("MP: " + playMP);
        System.out.println("Att: " + playAtt);
        System.out.println("Def: " + playDef);
        System.out.println("Mg.Att: " + playMgAtt);
    }
    
    public String getPlayerName()
    {
        return playName;
    }
    
    public int getPlayerHP()
    {
        return playHP;
    }
    
    public int getPlayerMP()
    {
        return playMP;
    }
    
    public int getPlayerAtt()
    {
        return playAtt;
    }
    
    public int getPlayerDef()
    {
        return playDef;
    }
    
    public int getPlayerMgAtt()
    {
        return playMgAtt;
    }
    
    public int getPlayerLvl()
    {
        return playLvl;
    }
    
    public void setPlayerHP(int newHP)
    {
        playHP = newHP;
    }
    
    public void setPlayerMP(int newMP)
    {
        playMP = newMP;
    }
    
    public void setPlayerAtt(int newAtt)
    {
        playAtt = newAtt;
    }
    
    public void setPlayerDef(int newDef)
    {
        playDef = newDef;
    }
    
    public void setPlayerMgAtt(int newMgAtt)
    {
        playMgAtt = newMgAtt;
    }
}
