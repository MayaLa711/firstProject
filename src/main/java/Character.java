class Character
  {
    protected int level;//רמת הדמות
    protected String name;//שם הדמות
    protected int hp;//נקודות הפגיעה (כמה נזק הדמות יכולה לספוג)
    protected String race;//גזע הדמות
    protected String gender;//מגדר הדמות
    protected int str;//כוח הדמות
    protected int dex;//זריזות הדמות
    protected int con;//חוסן הדמות
    protected int intel;//רמת האינטיליגנציה של הדמות
    protected int wis;//רמת התבונה של הדמות
    protected int cha;//כריזמת הדמות
    protected double speed;//כמה מטרים הדמות יכולה ללכת בתור
    public boolean alive;//האם הדמות חיה
    
    public Character(String n,String r,String g, int l)
    {
      this.name=n;
      this.race=r;
      this.gender=g;
      this.level=l;
      this.str = Main.diceRoll(1,20);
      this.dex = Main.diceRoll(1,20);
      this.con = Main.diceRoll(1,20);
      this.intel = Main.diceRoll(1,20);
      this.wis = Main.diceRoll(1,20);
      this.cha = Main.diceRoll(1,20);
      this.hp = Main.diceRoll(this.level,10) + this.con;
      this.speed = 30;
      this.alive = true;
    }

    public String toString()
    {
      String str = "Name: " + this.name + "\n" + "Race: " + this.race + "Gender: " + this.gender + "\n" + "Level: " + this.level + "\n" + "Strength: " + this.str + "\n" + "Dexterity: " + this.dex + "\n" + "Constitution: " + this.con + "\n" + "Intelligence: " + this.intel + "\n" + "Wisdom: " + this.wis + "\n" + "Charisma: " + this.cha + "\n" + "Hit Points: " + this.hp + "\n" + "Speed: " + this.speed + "\n" + "Alive: " + this.alive;
      return str;
    }

    public Void takeDamage(int d)
    {
      this.hp = this.hp - d;
      if(this.hp <= 0)
      {
        System.out.println(this.name + " died");
        this.alive = false;
      }
    }
  }