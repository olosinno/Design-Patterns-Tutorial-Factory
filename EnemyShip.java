package dp.factory;

public abstract class EnemyShip {
	private String name;
	private double amtDamage;
	
	public String getName() {return name;}
	public void setName(String newName) {name = newName;}

	public double getDamage() {return amtDamage;}
	public void setDamage(double newDamage) {amtDamage = newDamage;}

	public void followPlayerShip() {System.out.println(getName() + " is following the hero!");}
	public void displayEnemyShip() {System.out.println(getName() + " is in range!");}
	public void shootPlayerShip() {System.out.println(getName() + " shoots, dealing " + getDamage() + " points of damage!");}
}
