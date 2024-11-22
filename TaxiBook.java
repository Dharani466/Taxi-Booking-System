
package Taxibooking;
import java.util.*;

public class TaxiBook  {
    private static  ArrayList<Taxi> taxilist=new ArrayList<>();
    private static int taxilimit=4,idgenerator=1;
    private static ArrayList<Taxi> taxihistory =new ArrayList<>();

   
    public static String booking(char pickup,char drop,int picktime) throws CloneNotSupportedException
    {
        if(taxilist.size()<taxilimit){
            taxilist.add(new Taxi());
        }
        int min=Integer.MAX_VALUE;
        Taxi newtax=null;
            for(Taxi t:taxilist){
                if(t.getDrop()<=picktime && Math.abs(pickup-t.getDrop())<=min){
                    if(Math.abs(pickup-t.getDrop())==min){
                        if(newtax!=null && t.getEarnings()<newtax.getEarnings()){
                            newtax=t;
                            min=Math.abs(pickup-t.getDrop());
                        }
                    }
                    else{
                        newtax=t;
                        min=Math.abs(pickup-t.getDrop());
                    }
                }
                if(newtax!=null){
                    newtax.setCustomerId(idgenerator++);
                    newtax.setPickup(pickup);
                    newtax.setCurrent_location(drop);
                    newtax.setDrop(drop);
                    newtax.setTaxiId(taxilist.indexOf(newtax)+1);
                    newtax.setEarnings(newtax.getEarnings()+(Math.abs(drop-pickup)*15-5)*10 + 100);
                    taxihistory.add((Taxi)newtax.clone());
                }
            }
                return newtax!=null?"Taxi no:"+newtax.getTaxiId()+"is booked":"Taxis not available";
            
    }
    public static void display(){
        System.out.print("----------");
        for(Taxi i:taxihistory){
            System.out.print(i.toString());
            System.err.println("-------");
        }
    }
}
