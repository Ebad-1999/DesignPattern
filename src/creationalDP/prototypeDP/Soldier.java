package creationalDP.prototypeDP;

public class Soldier implements Cloneable{

    private int health;

    private int speed;

    private int lifeTime;

    private int agility;

    private int rank;

    private int power;

    private String weapon;

    private boolean isAvailableForWar;

    // create constructor


    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getLifeTime() {
        return lifeTime;
    }

    public void setLifeTime(int lifeTime) {
        this.lifeTime = lifeTime;
    }

    public int getAgility() {
        return agility;
    }

    public void setAgility(int agility) {
        this.agility = agility;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public boolean isAvailableForWar() {
        return isAvailableForWar;
    }

    public void setAvailableForWar(boolean availableForWar) {
        isAvailableForWar = availableForWar;
    }


    public Soldier(int health, int speed, int lifeTime, int agility, int rank, int power, String weapon, boolean isAvailableForWar) {
        this.health = health;
        this.speed = speed;
        this.lifeTime = lifeTime;
        this.agility = agility;
        this.rank = rank;
        this.power = power;
        this.weapon = weapon;
        this.isAvailableForWar = isAvailableForWar;
    }

    //

    public void showSoldierInfo(){
        System.out.println("Health : "+health);
        System.out.println("Speed : "+speed);
        System.out.println("LifTime : "+lifeTime);
        System.out.println("agility : "+agility);
        System.out.println("Rank  : "+rank);
        System.out.println("Power  : "+power);
        System.out.println("Weapon  : "+weapon);
        if (isAvailableForWar){
            System.out.println("Soldier is Ready for War");
        }else {
            System.out.println("Soldier is  not Ready for War");
        }
    }


    @Override
    public Soldier clone(){
        Soldier soldier=null;
        try {

            soldier =(Soldier) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
//            System.out.println("solder is cloneable");
//            e.printStackTrace();
        }
        return soldier;
    }

}