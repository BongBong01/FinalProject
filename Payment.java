public class Payment {

   Order myOrder = new Order();   
   
   private double payment, subTotal,total, tax;
   
   public double calculateTax(double tax){ //calculate the tax on the items       
      return tax = subTotal * .065;
   }   
   
   public void setPayment(double pay){
      payment = pay;
   }   
   public double getPayment(){
      return payment;
   }
   public double subTotal(){
      return myOrder.getQuantity(); // we need to multiply with the price of the items
                                      // we need to add the price of items that user ordered   
   }

   public double total(){
      double total = subTotal+ tax;  
      return total;
   }
   public double calculateChange(){ // TODO 
      double change = payment - total; //TODO 
      return change; // TODO
   }
   
   public static void main (String args[]){      
      Payment nPay = new Payment();
   }

}