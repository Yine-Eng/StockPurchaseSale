public class Main
{
   public static void main(String[] args)
   {

     //Variables
     final int NUM_STOCKS = 1000;//total stocks bought
     final double STOCK_PURCHASE = 28.87 * 1000;
     final double STOCK_SALE = 29.92 * 1000;
     final double STOCK_BROKER1 = 0.015 * STOCK_PURCHASE;
     final double STOCK_BROKER2 = 0.015 * STOCK_SALE;
     final double PROFITS = STOCK_SALE - STOCK_PURCHASE;
     final double BROKER_COMMISSION = STOCK_BROKER1 + STOCK_BROKER2;
     final double MAIN_PROFIT = PROFITS - BROKER_COMMISSION;


     //Display the following to Joe.
     System.out.println("Hey Joe! Below are the details for the stock you bought and sold:");

     //Display to Joe the amount he paid for the stocks he bought.
     System.out.println("You paid $" + STOCK_PURCHASE + " for the stocks you bought.");

     //Display the amount Joe paid to his broker as commision
     System.out.println("You paid $" + STOCK_BROKER1 + " to your broker when you bought the stock.");

     //Display the amount Joe sold his stock for
     System.out.println("You sold your stock for $" + STOCK_SALE);

     //Display the amount Joe paid to his broker after selling his stock
     System.out.println("You paid $" + STOCK_BROKER2 + " to your broker when you sold your stock.");

     //Display the total amount of money Joe paid to his broker
     System.out.println("In all, you gave your broker $" + BROKER_COMMISSION);

     //Display Joe's profit 
     System.out.println("You made $" + MAIN_PROFIT + " after selling your stock and paying the two commissions to your broker.");
     
     

     

             
         
   }
}