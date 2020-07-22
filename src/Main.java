import Decorator.Coffee;
import Decorator.Milk;
import Decorator.Sugar;
import Factory.CapuccinoFactory;
import Factory.CoffeeFactory;
import Factory.ExpressoFactory;
import Factory.LatteFactory;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Welcome to the Coffee Heaven");
        System.out.println("What kind of coffee would you like to drink today?");
        System.out.println("1) Expresso \n2) Capuccino \n3) Latte");
        Scanner sc=new Scanner(System.in);
        int type=sc.nextInt();
        CoffeeFactory cf;
        switch (type){
            case 1:
                cf= new ExpressoFactory();
                break;
            case 2:
                cf=new CapuccinoFactory();
                break;
            case 3:
                cf=new LatteFactory();
                break;
            default:
                cf=new ExpressoFactory();
                break;
        }
        Coffee c=cf.makeCoffee();
        System.out.println("Do you want some extra milk or sugar?");
        System.out.println("1) Yes, sugar\n2) Yes, milk\n3) Yes, both\n4) No, thanks");
        int choose=sc.nextInt();
        switch (choose){
            case 1:
                c= new Sugar(c);
                break;
            case 2:
                c=new Milk(c);
                break;
            case 3:
                c=new Milk(new Sugar(c));
                break;
            default:
                break;
        }
        System.out.println("You have ordered: "+c.getIngredients());
        System.out.println("Please give me "+c.getCost()+" coins");
        

    }
}

