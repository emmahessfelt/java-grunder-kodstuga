package EnchantedArena;
import java.util.Scanner;

public class Player extends AllObjects implements Movable
{
    private int health;
    private char currentDirection;
    private int nofSteps;

    Player(int health)
    {
        this.health = health;        
        setMapChar('P');
    }
    
    public void display()
    {
        
        System.out.println("Your position is x: " + this.getColumn() + " y: " + this.getRow());
        System.out.println("Your health is: " + health + "." );
    }
    public int move(GameMap myMap)
    {
        Scanner sc = new Scanner(System.in);
        int action;
        int checkSteps = 0;
        System.out.println("Which direction do you want to go? (N, E, S, W)");
        String stringDirection = sc.nextLine().toUpperCase();
        this.currentDirection = stringDirection.charAt(0);
        
        
        try 
        {
            System.out.print("How many steps do you want to move? ");
            checkSteps = sc.nextInt(); // Potential input mismatch
            
        } 
        catch (java.util.InputMismatchException e) 
        {
            System.out.println("Error: Invalid input. Please enter an integer.");
        }

        this.nofSteps = checkSteps;
        
        
        int x = this.getColumn();
        int y = this.getRow();    
        this.moving(x, y, myMap); 
        action = this.checkPosition(myMap);    
        return action;     
        
    }

    public void moving(int x, int y, GameMap myMap)
    {
        int mapLength = myMap.getMapLength();

        switch (this.currentDirection)
        {            
            case 'N':
                if (y - this.nofSteps < 0)
                {
                    y = 0;
                    System.out.println("You have reached the northern edge!");
                }
                else
                {
                    y -= this.nofSteps;
                }                
                break;
            case 'E':
                if (x + this.nofSteps > mapLength - 1)
                {
                    x = mapLength - 1;
                    System.out.println("You have reached the eastern edge!");
                }
                else
                {
                    x += this.nofSteps;
                }                
                break;
            case 'S':
                if (y + this.nofSteps > mapLength - 1)
                {
                    y = mapLength - 1;
                    System.out.println("You have reached the southern edge!");
                }
                else
                {
                    y += this.nofSteps; 
                }                
                break;
            case 'W':
                if (x - this.nofSteps < 0)
                {
                    x = 0;
                    System.out.println("You have reached the western edge!");
                }
                else
                {
                    x -= this.nofSteps;
                }                
                break;
            default:
                System.out.println("You didn't enter a valid direction.");
                break;
        }

        this.setPosition(x, y);
    }

    public int checkPosition(GameMap myMap)
    {
        char mapChar;
        int action = 0;
        mapChar = myMap.getChar(this.getColumn(), this.getRow());
        if (mapChar == 'F')
        {
            System.out.println("You found some food. You eat the food.");
            action = 1;         
            
        }        
        else if (mapChar == 'E')
        {
            System.out.println("Oh no! You have encountered a monster. The monster attacks!");            
            action = 2;
        }
        else if (mapChar == 'T') 
        {
            System.out.println("Congratulations! You found the treasure! You win!");
            action = 3;
            
        } 
        return action;       
    }

    public void eatFood(Food myFood)
    {
        int healthBoost;
        healthBoost = myFood.getHealthBoost();
        this.health += healthBoost;
        System.out.println("You gain " + healthBoost + " health. You have " + this.health + " health." );
    }

    public void takeDamage(Enemy myEnemy)
    {
        int damage;
        damage = myEnemy.getDamage();
        this.health -= damage;
        System.out.println("You take " + damage + " damage. You have " + this.health + " health." );
    }

    public boolean isPlayerDead()
    {
        if (this.health <= 0)
        {
            System.out.println("You are dead. Game over!");
            return true;
        }
        else
        {
            return false;
        }
        
    }

   
}
