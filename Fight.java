
/**
 * Fight Class
 *
 * @Created by: Azure & Noir
 * @Version Alpha 1.0
 */

import apcslib.*;

import java.awt.*;

import chn.util.*;

public class Fight
{
    private PlayerStats playStats;
    private MonsterStats monsStats;
    
    public Fight(PlayerStats pStats, MonsterStats mStats)
    {
        playStats = pStats;
        monsStats = mStats;
    }
    
    public void playerAttacks()
    {
        monsStats.setMonsterHP(monsStats.getMonsterHP() - (playStats.getPlayerAtt() - monsStats.getMonsterDef()));
    }
    
    public void playerCastsSpell()
    {
        monsStats.setMonsterHP(monsStats.getMonsterHP() - playStats.getPlayerMgAtt());
        playStats.setPlayerMP(playStats.getPlayerMP() - 3);
    }
    
    public void monsterAttacks()
    {
        playStats.setPlayerHP(playStats.getPlayerHP() - (monsStats.getMonsterAtt() - playStats.getPlayerDef()));
    }
}
