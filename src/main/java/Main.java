
import java.util.Scanner;
public class Main 
{
  public static void main(String[] args) 
  {
    Scanner input=new Scanner(System.in);
    string type;
    type = "fighter";
    
      Fighter Ch1 = createCharacter(type);
  
    system.out.println(Ch1.toString());
    \\ דמות נוספת
     type = "caster";
    Caster Ch2 = createCharacter(type);
    system.out.println(Ch2.toString());

    syste.out.println("Now the fight will begin. each turn you will choose a spell to cast or a weapon for your character to attack.");
    while(Ch1.alive && Ch2.alive)
      {
        Ch1.attack(Ch2);
        if(Ch2.alive)
        {
        System.out.println(Ch2.getName() + "enter the spell you want to use");
        string n = input.next();
        Ch2.cast(n,Ch1);
        }
      }
    if(Ch1.alive)
      Sytem.out.println(Ch1.getName() + "won");
    else
    {
      System.out.println(Ch2.getName() + "won");
    }
  }
  


  public static int diceRoll(int n, int d)
  {
    Scanner input=new Scanner(System.in); 
    System.out.println("Ender how many sides the die has");
    d = input.nextInt();
    System.out.println("Enter how many" + d + "sided dice you want   to roll");
    n = input.nextInt();
    int sum = 0;
    for(int i = 0; i < n; i++)
      {
        int roll = (int)(Math.random()*d+1);
        sum += roll;
      }
    return sum;
  }

  public static Character createCharacter(string type)
  {
   system.out.println("Enter the name, race, gender and level of the character");
    string n = input.next();
    string r = input.next();
    string g = input.next();
    int l = input.nextInt();
    
    if(type == "fighter")
      Fighter f = new Fighter(n,r,g,l);
    return f;
    if(type == "caster")
      Spells [] s = new Spells{New Spell("fireball","casts a ball of fire at the target",true),New Spell("illusion","casts a small illusion",false),New Spell("eldrich blast","sends a burst of force",true),New Spell("prestidigitation","allows a small party trick",false)};
    
      Caster c = new Caster(n,r,g,l,s);
    return c;
      
  }
}