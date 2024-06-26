Class spell
  {
    private string name;
    private string effct;
    private boolean attacking;

    public spell(string n, string e, boolean a)
      {
        this.name = n;
        this.effct = e;
        this.attacking = a;
      }

    public string toString()
      {
        string str = "Name: " + this.name + "\n" + "Effect: " + this.effct;
        return str;
      } 

    public string getName()
      {
        return this.name;
      }

    public string getEffct()
      {
      retrun this.effct;
      }

    public boolean getAttacking()
      {
      return this.attacking;
      }
  }