package PracticeMethods;
import java.util.Scanner;

public class Main 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        //Robot myRobot = new Robot("Matilda Järndotter", 35);  
        
        SuperHero myHero = new SuperHero(354, 250, 400);
        
        //myRobot.halsa();

        double powerLevel = myHero.getPowerLevel();
        System.out.println(powerLevel);

        Dog myDog = new Dog(20, "Henry");
        myDog.showHunger();
        myDog.eat();
        myDog.showHunger();

        Player myPlayer = new Player();
        int myScore = myPlayer.getScore();
        myPlayer.setScore(200);
        System.out.println(myScore);
        myScore = myPlayer.getScore();
        System.out.println(myScore);

        Magic myMagic = new Magic();
        myMagic.setPower("Heavy");
        myMagic.setPower(66);
        myMagic.showMagic();

        Monster gilgamesh = new Monster("Gilgamesh", 35, 60);
        Monster gargamel = new Monster("Gargamel", 55, 70);

        gilgamesh.presentMonster();
        gargamel.attack();
        gargamel.setHealth(45);
        gargamel.presentMonster();
        System.out.println("Vad heter du?");
        String username = sc.nextLine();
        Monster.printName(username);

        sc.close();
    }   
}
