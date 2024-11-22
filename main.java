package Taxibooking;

import java.util.*;

public class main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Scanner sc=new Scanner(System.in);
        boolean loop=true;
        while(loop){
            System.out.print("Cab Booking System\n1.Book taxi\n2.Display Details\n3.Exit");
        int a=sc.nextInt();
                switch (a) {
                    case 1:
                        {
                            System.out.print("Enter pickup location");
                            char k=sc.next().charAt(0);
                            System.out.print("Enter drop location");
                            char k2=sc.next().charAt(0);
                            System.out.print("Enter pickup time");
                            char k3=sc.next().charAt(0);
                            System.out.print(TaxiBook.booking(k,k2,k3));
                             break;
                        }
                    
                
                    case 2:
                    {
                                 TaxiBook.display();
                                 break;
                                 
                    }

                    case 3:
                     {
                          
                        loop=false;
                           break;
                     }
                }
        }
    }
}
