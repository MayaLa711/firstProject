import java.util.Scanner;
class Fighter extends Character
  {
    protected Weapon equiped;
   
    public Fighter (String n,String r,String g, int l)
    {
      super(n,r,g,l);
      System.out.println("Enter the name of the weapon you want to equip, you cat choos from the following: \n longSword - tow handed weapon does 1d12 damage (befor adding your bonus) \n Dagger - one handed weapon does 2d6 damage (befor adding your bonus)");
      String na;
      Scanner input=new Scanner(System.in);
      na = input.next();
      while(na != "longSword" || na != "Dagger")
        {
          System.out.println("You can choos ONLY from the following: \n longSword \n Dagger");
          na = input.next();
        }
      this.equiped = new Weapon(na);
      if(this.str>10)
      {
        this.equiped.addDamage((this.str - 10)/2);
      }
    }

    public String toString()
    {
      String str = super.toString() + "\n" + "Weapon: " + this.equiped.getName();
      return str;
    }

    public void attack(Character ch)
    {
      if(this.alive)
      {
      int d = this.equiped.getDamage() + diceRoll(1,6);
       ch.takeDamage(d);
      }
      else
      {
        system.out.println("You can't attack," + this.name + " is dead");
      }
    }
  }