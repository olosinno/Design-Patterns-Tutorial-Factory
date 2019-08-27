package dp.factory;
import java.util.Scanner;
public class EnemyShipTesting {
	public static void main(String[] args) {
		EnemyShip theEnemy = null;
		EnemyShip ufoShip = new UFOEnemyShip();
		EnemyShip rocketShip = new RocketEnemyShip();
		
		Scanner userInput = new Scanner(System.in);
		String enemyShipOption = "";
		System.out.print("What type of ship?  (U/R)  ");

		if(userInput.hasNextLine()) {enemyShipOption = userInput.nextLine();}

		if(enemyShipOption.equals("U")) {theEnemy = new UFOEnemyShip();}
		if(enemyShipOption.equals("R")) {theEnemy = new RocketEnemyShip();}

		EnemyShipFactory shipFactory = new EnemyShipFactory();
		theEnemy = null;
		System.out.print("What type of ship?  (U/R/B)  ");
		if(userInput.hasNextLine()) {
			String typeOfShip = userInput.nextLine();
			theEnemy = shipFactory.buildEnemyShip(typeOfShip);
		}
		if(theEnemy != null) {doCombatEnemy(theEnemy);} else System.out.print("Enter a U, R, or B next line.  ");
	}
	public static void doCombatEnemy(EnemyShip anEnemyShip) {
		anEnemyShip.displayEnemyShip();
		anEnemyShip.followPlayerShip();
		anEnemyShip.shootPlayerShip();
	}
}
