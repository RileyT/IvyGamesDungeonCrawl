/**
 *  Application: IvyGames_SoftwareProduct
 *  Description: Take user through a dungeon-crawl-style adventure. 
 *  Title:       IvyGames' Dungeon Crawl
 *  Authors:     Riley Tucker,  Aiden Hutton,  Karen Stackhouse,  Christopher Fields

 *  Version:     1.0
 *  Date:        4/5/2019
 *  Description: This class calculates the constitution, strength, and dexterity 
 *               scores for a Boss enemy.
 *  Assignment:  SDEV265  System - Software Analysis and Projects
 * 
 */
package semesterproject;


public class Boss extends FantasyRace {

    // set stats
    // base 1-11, then add multiples of 5 to adjust
    
    /*
    // Hard mode stats
    // base +4x, x9, 4x * 5
    // between 21-31, 46-56, 21-31
    int constituton = (int) (Math.random() * ((31 - 21) + 1)) + 21;
    int strength = (int) (Math.random() * ((56 - 46) + 1)) + 46;
    int dexterity = (int) (Math.random() * ((31 - 21) + 1)) + 21;
    */
    
    // base +3x, x8, 3x * 5
    // between 16-26, 41-51, 16-26
    int constituton = (int) (Math.random() * ((26 - 16) + 1)) + 16;
    int strength = (int) (Math.random() * ((51 - 41) + 1)) + 41;
    int dexterity = (int) (Math.random() * ((26 - 16) + 1)) + 16;

    // create boss
    Boss() {
        super();
    }

    public void setBossStats() {
        setEnemyHealth(constituton * 10);
        setEnemyMaxHealth(constituton * 10);
        setEnemyAttackPower(strength);
        setEnemySpeed(dexterity);
    } 
}
