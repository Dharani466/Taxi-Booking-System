package Taxibooking;

public class Taxi implements Cloneable {
    private char pickup;
    private char drop;
    private int pickuptime;
    private int customerId;
    private char current_location='A';
    private int taxiId;
    private int earnings;

   protected Object clone() throws CloneNotSupportedException{
     return super.clone();
   }
    public char getPickup() {
        return pickup;
    }
    public void setPickup(char pickup) {
        this.pickup = pickup;
    }
    public char getDrop() {
        return drop;
    }
    public void setDrop(char drop) {
        this.drop = drop;
    }
    public int getPickuptime() {
        return pickuptime;
    }
    public void setPickuptime(int pickuptime) {
        this.pickuptime = pickuptime;
    }
    public int getCustomerId() {
        return customerId;
    }
    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }
    public char getCurrent_location() {
        return current_location;
    }
    public void setCurrent_location(char current_location) {
        this.current_location = current_location;
    }
    public int getTaxiId() {
        return taxiId;
    }
    public void setTaxiId(int taxiId) {
        this.taxiId = taxiId;
    }
    public int getEarnings() {
        return earnings;
    }
    public void setEarnings(int earnings) {
        this.earnings = earnings;
    }
    @Override
    public  String toString(){
      return "Taxi_NO "+getTaxiId()+"Current_Loction  "+getCurrent_location()+"Drop_Location"+getDrop()+"Earning"+getEarnings();
    } 



}
