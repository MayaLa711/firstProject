public class Weapon
  {
    private String type;//סוג הנשק
    private int damage;//(הוא מוריד hp כמה) כמה נזק הנשק עושה
    private boolean towHanded;//האם משתמשים בנשק ביד אחת או בשתי ידיים

    public Weapon(String type)
    {
      if(type == "longSword")
      {
        this.type = type;
        this.damage = Main.diceRoll(1,12);
        this.towHanded = true;
      }
      if(type == "Dagger")
      {
        this.type = type;
        this.damage = Main.diceRoll(2,6);
        this.towHanded = false;
      }
    }
    
    public String getType()
    {
      return this.type;
    }
    public int getDamage()
    {
      return this.damage;
    }
    public boolean getTowHanded()
    {
      return this.towHanded;
    }
    public void addDamage(int d)
    {
      this.damage = this.damage + d;
    }
  
  }