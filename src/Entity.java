import java.util.Scanner;

/**
 * This class represents entity
 *
 * @author Zhao Zhang
 */
class Entity {
    Scanner scanner = new Scanner(System.in);
    /**player health*/
    private int playerHealth;
    /**player max health*/
    private int maxHp;
    /**player healed health*/
    private int addedHp;
    /**player attack dmg*/
    private int playerAttack;
    /**player defense*/
    private int playerDefense;
    /**player original defense*/
    private int originalDefense;
    /**player added defense*/
    private int addedDefense;
    /**player weapon damage*/
    private int playerWepDmg;
    /**enemy health*/
    private int enemyHealth;
    /**enemy max health*/
    private int eMaxHp;
    /**enemy healed health*/
    private int eHealed;
    /**enemy attack damage*/
    private int enemyAttack;
    /**enemy dealt dmg*/
    private int eADmg;
    /**enemy defense*/
    private int enemyDefense;
    /**enemy defense*/
    private int eDefend;
    /**game difficulty*/
    private int difficulty;
    /**player skill points*/
    private int sp;
    /**how much points is awarded to the player*/
    private int rewardSp;
    /**effectiveness of enemy and player moves*/
    private int effectiveness;
    /**player turn (true/false)*/
    private boolean pTurn;
    /**boss is dead (true/false)*/
    private boolean bossDead;
    // PLAYER
    /**
     * Instantiates a Entity object.
     *
     * @param playerHealth the playerHealth
     * @param playerAttack the playerAttack
     * @param playerDefense the playerDefense
     * @param playerWepDmg the playerWepDmg
     * @param difficulty the difficulty
     * @param sp the sp
     */
    public Entity(int playerHealth, int playerAttack, int playerDefense, int playerWepDmg, int difficulty, int sp) {
        this.playerHealth = playerHealth + 1;
        this.playerAttack = playerAttack + 1;
        this.playerDefense = playerDefense + 1;
        this.playerWepDmg = playerWepDmg + 1;
        this.difficulty = difficulty;
        this.sp = sp;
    }

    /**
     * Void method that sets the playerHealth to moreHealth+playerHealth
     * @param moreHealth
     */
    public void setHealth(int moreHealth) {
        this.playerHealth += moreHealth;
    }

    /**
     * int method that return the playerHealth
     * @return
     */
    public int getHealth(){
        return playerHealth;
    }

    /**
     * void method that sets the playerAttack to moreAttack+playerAttack
     * @param moreAttack
     */
    public void setAttack(int moreAttack) {
        this.playerAttack += moreAttack;
    }

    /**
     * int method that returns playerAttack
     * @return
     */
    public int getAttack(){
        return playerAttack;
    }

    /**
     * void method that sets playerDefense to playerDefense+moreDefense
     * @param moreDefense
     */
    public void setDefense(int moreDefense) {
        this.playerDefense += moreDefense;
    }

    /**
     * int method that return playerDefense
     * @return
     */
    public int getDefense(){
        return playerDefense;
    }

    /**
     * void method that sets playerWepDmg to playerWepDmg+moreWepDmg
     * @param moreWepDmg
     */
    public void setWepDmg(int moreWepDmg) {
        this.playerWepDmg += moreWepDmg;
    }

    /**
     * int method that returns the effectiveness of attack1
     * @return
     */
    public int attack1() {
        effectiveness = (int) (Math.random() * 10 + 1);
        return (int) (playerWepDmg * (playerAttack / effectiveness));
    }

    /**
     * int method that returns effectiveness of defend1
     * @return
     */
    public int defend1() {
        originalDefense = playerDefense;
        effectiveness = (int) (Math.random() * playerDefense + (int) (0.25 * playerDefense));
        addedDefense = playerDefense - originalDefense;
        return effectiveness;
    }

    /**
     * int method that returns the new hp
     * @return
     */
    public int heal1() {
        addedHp = (int) (Math.random() * (maxHp / 4) + 1);
        if (addedHp + playerHealth > maxHp) {
            return maxHp;
        } else {
            return addedHp + playerHealth;
        }
    }

    /**
     * void method that prints all of the player's stats
     */
    public void getPlayerStat() {
        System.out.println("\nHealth: " + playerHealth + "\nStrength: " + playerAttack + "\nDefense: " + playerDefense
                + "\nWeapon Damage: " + playerWepDmg);
    }

    /**
     * void method that sets the pTurn boolean
     * @param pTurn
     */
    public void setPTurn(boolean pTurn){
        this.pTurn = pTurn;
    }

    /**
     * boolean method that returns pTurn
     * @return
     */
    public boolean getPTurn(){
        return pTurn;
    }

    // ENEMY
    // difficulty1 = 7, 2 = 9, 3 = 12
    // hp enemy

    /**
     * void method that sets enemy1 stats
     */
    public void setEnemy1Stats() {
        if (difficulty == 1) {
            enemyHealth = 4;
            enemyAttack = 2;
            enemyDefense = 1;
        } else if (difficulty == 2) {
            enemyHealth = 6;
            enemyAttack = 3;
            enemyDefense = 1;
        } else {
            enemyHealth = 8;
            enemyAttack = 3;
            enemyDefense = 1;
        }
    }

    // defense enemy

    /**
     * void method that sets enemy2 stats
     */
    public void setEnemy2Stats() {
        if (difficulty == 1) {
            enemyHealth = 2;
            enemyAttack = 1;
            enemyDefense = 4;
        } else if (difficulty == 2) {
            enemyHealth = 2;
            enemyAttack = 2;
            enemyDefense = 5;
        } else {
            enemyHealth = 2;
            enemyAttack = 3;
            enemyDefense = 7;
        }
    }

    // attack enemy

    /**
     * void method that sets enemy3 stats
     */
    public void setEnemy3Stats() {
        if (difficulty == 1) {
            enemyHealth = 3;
            enemyAttack = 3;
            enemyDefense = 1;
        } else if (difficulty == 2) {
            enemyHealth = 4;
            enemyAttack = 4;
            enemyDefense = 1;
        } else {
            enemyHealth = 5;
            enemyAttack = 6;
            enemyDefense = 1;
        }
    }

    /**
     * void method that adds moreHealth to enemyHealth
     * @param moreHealth
     */

    public void setEHealth(int moreHealth) {
        this.enemyHealth += moreHealth;
    }

    /**
     * int method that returns enemyHealth
     * @return
     */
    public int getEHealth(){
        return enemyHealth;
    }

    /**
     * void method that adds moreAttack to enemyAttack
     * @param moreAttack
     */
    public void setEAttack(int moreAttack) {
        this.enemyAttack += moreAttack;
    }

    /**
     * int method that returns enemyAttack
     * @return
     */
    public int getEAttack(){
        return enemyAttack;
    }

    /**
     * void method that adds moreDefense to enemyDefense
     * @param moreDefense
     */
    public void setEDefense(int moreDefense) {
        this.enemyDefense += moreDefense;
    }

    /**
     * int method that returns enemyDefense
     * @return
     */
    public int getEDefense(){
        return enemyDefense;
    }

    /**
     * int method that returns eAdmg after calculations
     * @return
     */
    public int enemyAttack1() {
        effectiveness = (int) (Math.random() * 10 + 1);
        eADmg = (int) ((enemyAttack / effectiveness) - playerDefense);
        return eADmg;
    }

    /**
     * int method that return eDefend after calculations
     * @return
     */
    public int enemyDefend1() {
        eDefend = (int) (Math.random() * enemyDefense + (int) (0.25 * enemyDefense));
        return eDefend;
    }

    /**
     * int method that returns amount of health healed by enemy
     * @return
     */
    public int enemyHeal1() {
        eHealed = (int) (Math.random() * (eMaxHp/5) + 1);
        return eHealed;
    }

    /**
     * void method that returns all of the enemy's stats
     */
    public void getEnemyStats() {
        System.out.println("\nEnemy Health: " + enemyHealth + "\nEnemy Strength: " + enemyAttack + "\nEnemy Defense: " + enemyDefense);
    }

    // System.out.println("The enemy attacks you for " + enemyAttack + " damage!");
    // System.out.println("You have " + (playerHealth - enemyAttack) + " health
    // left!");

    // intialize game, next enemy, battle choices, battle rewards, stat
    // distribution, turns, scale the enemies with the player and the player's sp
    int enemyX;

    /**
     * returns a random number 1-4 inclusive representing 4 different enemies
     * @return
     */
    public int encounterEnemy() {
        enemyX = (int) (Math.random() * 5 + 1);
        if (enemyX == 1) {
            // System.out.println("You encountered Bob the healthy slime!");
            return 1;
        } else if (enemyX == 2) {
            // System.out.println("You encountered Josh the tanky slime!");
            return 2;
        } else if (enemyX == 3){
            // System.out.println("You encountered Michael the spiky slime!");
            return 3;
        } else {
            return 4;
        }
    }

    /**
     * void method that sets the enemy's stats based on enemyX
     */
    public void enemyInitiate(){
        if (enemyX == 1) {
            // System.out.println("You encountered Bob the healthy slime!");
            setEnemy1Stats();
        } else if (enemyX == 2) {
            // System.out.println("You encountered Josh the tanky slime!");
            setEnemy2Stats();
        } else if (enemyX == 3){
            // System.out.println("You encountered Michael the spiky slime!");
            setEnemy3Stats();
        } else {
            initiateBoss();
        }
    }

    int choice;
    int choice2;

    /**
     * void method that asks for and responds to the client with moves
     */

    public void playerTurn() {
        System.out.println("\n!-----What would you like to do?------!");
        System.out.println("!-----(1) Attack ---- (2) Defend------!");
        System.out.println("!--------------(3) Heal---------------!");
        System.out.print("!> ");
        int choice2 = scanner.nextInt();
        while (choice2 != 1 && choice2 != 2 && choice2 != 3) {
            System.out.println("\n!----Invalid Option! Choose Again------!");
            System.out.println("!-----(1) Attack ---- (2) Defend------!");
            System.out.println("!--------------(3) Heal---------------!");
            choice2 = scanner.nextInt();
        }
        if (choice2 == 1) {
            playerHealth -= enemyAttack1();
            System.out.println("\nYou attacked the enemy for " + playerAttack + ".\nThe enemy has "
                    + enemyHealth + ".\nleft!");
            pTurn = false;
        } else if (choice2 == 2) {
            playerDefense = defend1();
            System.out.println("\nYou defended yourself for " + addedDefense + " defense points. You now have "
                    + playerDefense + " defense points.");
            pTurn = false;
        } else if (choice2 == 3) {
            {
                playerHealth = heal1();
                setHealth(heal1());
                System.out.println("\nYou healed yourself for " + addedHp + " health. You now have "
                        + playerHealth + " health.");
                pTurn = false;
            }
        }
    }

    /**
     * void method that print out moves that enemy does
     */

    public void enemyTurn() {
        if (!(pTurn)) {
            enemyX = (int) (Math.random() * 3);
            if (enemyX == 1) {
                System.out.println("The enemy attacks you for " + enemyAttack + " damage!");
                System.out.println("You have " + (playerHealth - enemyAttack) + " health left!");
                pTurn = true;
            } else if (enemyX == 2) {
                System.out.println("The enemy defends!");
                enemyDefense = enemyDefend1();
                System.out.println("The enemy defended for " + enemyDefense + " defense points.");
                pTurn = true;
            } else {
                eHealed = enemyHeal1();
                System.out.println("The enemy heals for " + eHealed + " health!");
                if (eHealed + enemyHealth > eMaxHp) {
                    enemyHealth = eMaxHp;
                    System.out.println("The enemy now has " + enemyHealth + " health!");
                    pTurn = true;
                } else {
                    enemyHealth += eHealed;
                    System.out.println("The enemy now has " + enemyHealth + " health!");
                    pTurn = true;
                }
            }
        }
    }

    String stats;
    int inputedSp;

    /**
     * void method that allows the player to distribute their stats
     */

    public void distributeStats() {
        rewardSp = (int) (Math.random() * (sp / 5) + 1);
        System.out.println("\n!--------- CHOOSE YOUR STATS ---------!");
        System.out.println("!------ (HEALTH, STR, DEF, WEP) ------!");
        System.out.println("!------- FORMAT IS (#, #, #, #) ------!");
        System.out.println("!------- You have " + rewardSp + " points ------!");
        System.out.print("!> ");
        stats = scanner.nextLine();
        inputedSp = (Integer.parseInt(stats.substring(1, 2)) + Integer.parseInt(stats.substring(4, 5))
                + Integer.parseInt(stats.substring(7, 8)) + Integer.parseInt(stats.substring(11, 12)));
        while (inputedSp != rewardSp) {
            System.out.println("\n!----- INVALID STAT DISTRIBUTION -----!");
            System.out.println("!----- PLEASE DISTRIBUTE PROPERLY ----!");
            System.out.println("!-------- FORMAT IS (#, #, #) --------!");
            System.out.println("!------ (HEALTH, STR, DEF, WEP) ------!");
            System.out.println("!-------- YOU HAVE " + rewardSp + " POINTS ----------!");
            System.out.print("!> ");
            stats = scanner.nextLine();
            inputedSp = (Integer.parseInt(stats.substring(1, 2)) + Integer.parseInt(stats.substring(4, 5))
                    + Integer.parseInt(stats.substring(7, 8)) + Integer.parseInt(stats.substring(11, 12)));
        }
        playerHealth += Integer.parseInt(stats.substring(1, 2));
        playerAttack += Integer.parseInt(stats.substring(4, 5));
        playerDefense += Integer.parseInt(stats.substring(7, 8));
        playerWepDmg += Integer.parseInt(stats.substring(11, 12));
    }

    /**
     * void method that sets the enemy stats to scale with the player
     * @param hp
     * @param str
     * @param def
     * @param sp
     */
    public void setEstats(int hp, int str, int def, int sp) {
        if (sp > 20) {
            enemyHealth *= (int) (sp * .5);
            enemyAttack *= (int) (sp * .5);
            enemyDefense *= (int) (sp * .5);
        }
    }

    /**
     * void method that initializes the stats of the boss
     */

    public void initiateBoss() {
        if (enemyX == 4) {
            System.out.println("YOU ENCOUNTERED THE BOSS, LEVIATHAN THE DRAGON OF DEVOURING!");
            enemyHealth = (int) (1.25 * playerHealth);
            enemyAttack = (int) (1.25 * playerAttack);
            enemyDefense = (int) (1.25 * playerDefense);
            bossDead = false;
        }
    }

    /**
     * void method that prints the moves of the boss
     */
    public void bossTurn() {
        enemyX = (int) (Math.random() * 3);
        if (getEHealth()<0){
            System.out.println("You have slayed the Boss!");
            bossDead = true;
        }
        if (!bossDead){
            if (enemyX == 1) {
                System.out.println("The boss attacks you for " + enemyAttack + " damage!");
                System.out.println("You have " + (playerHealth - enemyAttack) + " health left!");
                pTurn = true;
            } else if (enemyX == 2) {
                System.out.println("The boss defends!");
                enemyDefense = enemyDefend1();
                System.out.println("The boss defended for " + enemyDefense + " defense points.");
                getEnemyStats();
                pTurn = true;
            } else {
                eHealed = enemyHeal1();
                System.out.println("The boss heals for " + eHealed + " health!");
                if (eHealed + enemyHealth > eMaxHp) {
                    enemyHealth = eMaxHp;
                    System.out.println("The boss now has " + enemyHealth + " health!");
                    pTurn = true;
                } else {
                    enemyHealth += eHealed;
                    System.out.println("The boss now has " + enemyHealth + " health!");
                    pTurn = true;
                }
            }
        }
    }
}
