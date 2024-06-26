Class Caster extends character
  {
    protected spell [] spells;

    public Caster(String n, String r, String g, int l, spell[]s)
      {
        super(n,r,g,l);
        this.spells = s;
      }

    public String toString()
      {
        String str = super.toString() + "\n" + "Spells: ";
        for(int i = 0; i < this.spells.length; i++)
          {
            str = str + this.spells[i].toString() + ", ";
          }
        return str;
      }

    public void cast(string sn, Character ch)
     {
        string temp = sn;
      int k = -1;
        if(this.alive)
        {
        do
          {
            for(int i = 0; i < this.spells.length; i++)
            {
              if(this.spells[i].getName() == temp)
              {
                k = i
              }
            }
          if(k = -1)
            system.out.println("You don't have this spell, enter another spell");
            temp = input.next();
          }while(k = -1);
          system.out.println(this.spells[k].toString());
          if(this.spells[k].getAttacking())
          {
            if(this.cha > 10)
              int b = (this.cha - 10)/2;
            ch.takeDamage(diceRoll(3,6) + b);
          }
        }
      else
      {
        system.out.println("You can't cast a spell," + this.name + " is dead");
      }
     }
  }