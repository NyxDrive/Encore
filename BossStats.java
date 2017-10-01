
/**
 * Boss Stats Class
 *
 * @Created by: Azure & Noir
 * @Version Alpha 1.0
 */

import apcslib.*;

import java.awt.*;

import chn.util.*;

public class BossStats extends MonsterStats
{
    private int currentMonsHP, currentMonsAtt, currentMonsDef;
    
    public BossStats()
    {
        super.monsHP = 24;
        super.monsAtt = 8;
        super.monsDef = 5;
    }
    
    @Override
    public void resetMonsterStats()
    {
        currentMonsHP = monsHP;
        currentMonsAtt = monsAtt;
        currentMonsDef = monsDef;
    }
    
    @Override
    public void monsterLvlUp()
    {
        monsHP += 9;
        monsAtt += 3;
        monsDef += 2;
    }
}
