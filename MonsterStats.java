
/**
 * Monster Stats Class
 *
 * @Created by: Azure & Noir
 * @Version Alpha 1.0
 */

import apcslib.*;

import java.awt.*;

import chn.util.*;

public class MonsterStats
{
    private int monsHP, monsAtt, monsDef, monsHPUp, monsAttUp, monsDefUp;
    
    public MonsterStats()
    {
        monsHPUp = 5;
        monsAttUp = 3;
        monsDefUp = 2;
        monsHP = (int)(Math.random() * monsHPUp + 5);
        monsAtt = (int)(Math.random() * monsAttUp + 3);
        monsDef = (int)(Math.random() * monsDefUp + 1);
    }
    
    public void showMonsStats()
    {
        System.out.println("=====Monster Stats=====");
        System.out.println("HP: " + monsHP);
        System.out.println("Att: " + monsAtt);
        System.out.println("Def: " + monsDef);
    }
    
    public void monsterLvlUp()
    {
        monsHPUp += 3;
        monsAttUp += 1;
        monsDefUp += 1;
    }
    
    public void resetMonsterStats()
    {
        monsHPUp += 2;
        monsAttUp += 1;
        monsDefUp += 1;
        monsHP = (int)(Math.random() * monsHPUp + 4);
        monsAtt = (int)(Math.random() * monsAttUp + 2);
        monsDef = (int)(Math.random() * monsDefUp + 1);
    }
    
    public int getMonsterHP()
    {
        return monsHP;
    }
    
    public int getMonsterAtt()
    {
        return monsAtt;
    }
    
    public int getMonsterDef()
    {
        return monsDef;
    }
    
    public void setMonsterHP(int newHP)
    {
        monsHP = newHP;
    }
}
