import java.util.Scanner;
public class pizza 
{

  String pizza,type;
  int n=0;
  double price=0,amount;
  double totalprice,cheese,toppings,water,ketchup,softdrink,take,gst;
  Scanner s = new Scanner(System.in);
  public void order ()
  {
      
      System.out.println("wellcome to the shop");
      System.out.println("what is your order");
      System.out.println("normal or delux");
      System.out.println("enter your option");
      pizza=s.next();
      System.out.println("enter the type");
      System.out.println("veg or non veg");
      type=s.next();
      
      if(pizza.equalsIgnoreCase("normal")&&type.equalsIgnoreCase("veg"))
      {
          price = price+ 300;
      }
      if (pizza.equalsIgnoreCase("normal")&&type.equalsIgnoreCase("nonveg"))
      {
           price =price+ 400; 
      }
       
        if(pizza.equalsIgnoreCase("delux")&&type.equalsIgnoreCase("veg"))
      {
           price =price+ 600; 
      }
       if(pizza.equalsIgnoreCase("delux")&&type.equalsIgnoreCase("nonveg"))
      {
           price =price+ 800; 
      }
        
  }

  public void addon()
  {
      String add;
      System.out.println("Add extra cheese yes /no");
         add=s.next();
     if(add.equalsIgnoreCase("yes"))
        {
           cheese =100.0;
        }
       
       
        System.out.println("Add extra topping yes /no ");
        add=s.next();
         if(add.equalsIgnoreCase("yes"))
        {
           toppings=100;
        }
        
        System.out.println("Add water bottle yes /no");
        add=s.next();
        if(add.equalsIgnoreCase("yes"))
        {
         System.out.println("enter the no of bottles");
         n=s.nextInt();
          water=n*20;
        }
        System.out.println("Add extra ketchup  yes /no");
        add=s.next();
        if(add.equalsIgnoreCase("yes"))
        {
         System.out.println("enter the no of pakets");
         n=s.nextInt();
            ketchup=n*5;
        }
         System.out.println("Add soft drink  yes /no");
        add=s.next();
        if(add.equalsIgnoreCase("yes"))
        {
         System.out.println("enter the no of cans");
         n=s.nextInt();
            softdrink=n*75;
        }
         System.out.println("take away  yes /no");
          add=s.next();
        if(add.equalsIgnoreCase("yes"))
        {
            take=20;
        }
        
  }
  public void print()
  {
      System.out.println("******************************** BILL*******************************");
      System.out.println("base price                                  Rs."+price);
      System.out.println("extra cheese charges                        Rs."+cheese);
      System.out.println("extra toppings charges                      Rs."+toppings);
      System.out.println("extra water bottles charges                 Rs."+water);
      System.out.println("extra ketchup charges                       Rs."+ketchup);
      System.out.println("extra softdrink charges                     Rs."+softdrink);
      System.out.println("extra bag charges for take away             Rs."+take);
      amount=price+cheese+toppings+water+ketchup+softdrink+take;
      System.out.println("********************************************************************");
      System.out.println("bill Amount has to come                     Rs."+amount);
      gst=amount*18/100;
      System.out.println("adding the Tax amount                       Rs."+gst);
      System.out.println("********************************************************************");
      totalprice=amount+gst;
      System.out.println("Net Amount Payable                          Rs."+totalprice);
      System.out.println("********************************************************************");
  }
public static void main(String[] args)
        {
            pizaa p=new pizaa();
            p.order();
            p.addon();
            p.print();
    
        }
}
