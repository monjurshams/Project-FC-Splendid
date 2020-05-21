package fc.splendid;

public class user1 {
    
    private String name;
    private int jersey,league,tourney, cup,other,goal,assist,sellingprice,buyingprice,agentfee,teambenefit,matchno,minute,date,year;
    private String address;
    private String bloodgroup;
    private int phoneNumber;
    private int age;
    private float weight;
    private String position;
    private String soldto,boughtfrom,matchvs,half,event,description,day,month,field;
    private double buyingprice2,agentfee2,tax,totalcost;
    
    
    public user1(String NAME, int JERSEY, String ADDRESS,String BLOODGROUP,int PHONENUMBER,int AGE,float WEIGHT,String POSITION)
    {
        this.name = NAME;
        this.jersey = JERSEY;
        this.address = ADDRESS;
        this.bloodgroup=BLOODGROUP;
        this.phoneNumber=PHONENUMBER;
        this.age = AGE;
        this.weight=WEIGHT;
        this.position=POSITION;
    }

    user1(String NAME, int JERSEY,int AGE,float WEIGHT,String POSITION) {
        this.name = NAME;
        this.jersey = JERSEY;
        this.age = AGE;
        this.weight=WEIGHT;
        this.position=POSITION;
        
    }

    user1(String NAME,int JERSEY,int LEAGUE, int TOURNEY, int CUP, int OTHER, int GOAL, int ASSIST) {
        
        this.name=NAME;
        this.jersey= JERSEY;
        this.league=LEAGUE;
        this.tourney=TOURNEY;
        this.cup=CUP;
        this.other=OTHER;
        this.goal=GOAL;
        this.assist=ASSIST;
    }

    user1(String NAME, int JERSEY, String SOLDTO, int SELLINGPRICE, int BUYINGPRICE, int AGENTFEE, int TEAMBENEFIT) {
       this.name= NAME;
        this.jersey=JERSEY;
        this.soldto=SOLDTO;
        this.sellingprice=SELLINGPRICE;
        this.buyingprice=BUYINGPRICE;
        this.agentfee=AGENTFEE;
        this.teambenefit=TEAMBENEFIT;
        
    }
    user1(String NAME, int JERSEY, String BOUGHTFROM, double BUYINGPRICE, double AGENTFEE, double TAX, double TOTALCOST) {
        this.name= NAME;
        this.jersey=JERSEY;
        this.boughtfrom=BOUGHTFROM;
        this.buyingprice2=BUYINGPRICE;
        this.agentfee2=AGENTFEE;
        this.tax=TAX;
        this.totalcost=TOTALCOST;
        
    }

    user1(String MATCHVS, int MATCHNO, String HALF, int MINUTE, String EVENT, String DESCRIPTION) {
        this.matchvs= MATCHVS;
        this.matchno=MATCHNO;
        this.half=HALF;
        this.minute=MINUTE;
        this.event=EVENT;
        this.description=DESCRIPTION;
        
    }

    user1(String MATCHVS, int MATCHNO, int DATE, String DAY, String MONTH, int YEAR, String FIELD) {
        this.matchvs= MATCHVS;
        this.matchno=MATCHNO;
        this.date=DATE;
        this.day=DAY;
        this.month=MONTH;
        this.year=YEAR;
        this.field=FIELD;
    }

    user1(String NAME, int JERSEYNO) {
        this.name=NAME;
        this.jersey=JERSEYNO;
    }
 
    public String getname()
    {
        return name;
    }
     public int getjersey()
    {
        return jersey;
    }
    
    public String getaddress()
    {
        return address;
    }
    
    public String getbloodgroup()
    {
        return bloodgroup;
    }
    public int getphone()
    {
        return phoneNumber;
    }
    public int getage()
    {
        return age;
    }
    public float getweight()
    {
        return weight;
    }
    public String getposition()
    {
        return position;
    }
    
    public int getleague()
    {
        return league;
    }
    public int gettourney()
    {
        return tourney;
    }
    public int getcup()
    {
        return cup;
    }
    public int getother()
    {
        return other;
    }
    public int getgoal()
    {
        return goal;
    }
    public int getassist()
    {
        return assist;
    }
     public String getsoldto()
    {
        return soldto;
    }
      public int getsellingprice()
    {
        return sellingprice;
    }
       public int getbuyingprice()
    {
        return buyingprice;
    }
        public int getagentfee()
    {
        return agentfee;
    }
         public int getteambenefit()
    {
        return teambenefit;
    }
          public String getboughtfrom()
    {
        return boughtfrom;
    }
      public double getbuyingprice2()
    {
        return buyingprice2;
    }
      public double getagentfee2()
    {
        return agentfee2;
    }
       public double gettax()
    {
        return tax;
    }
       public double gettotalcost()
    {
        return totalcost;
    }
        public String getmatchvs()
    {
        return matchvs;
    }
        public int getmatchno()
    {
        return matchno;
    }
         public String gethalf()
    {
        return half;
    }
         public int getminute()
    {
        return minute;
    }
          public String getevent()
    {
        return event;
    }
           public String getdescription()
    {
        return description;
    }
     public int getdate()
    {
        return date;
    }
     public String getday()
    {
        return day;
    }
      public String getmonth()
    {
        return month;
    }
      public int getyear()
    {
        return year;
    }
       public String getfield()
    {
        return field;
    }
}