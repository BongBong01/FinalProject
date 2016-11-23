public class Order {

   private int userItemNumber;
   private int quantity;
   
   public void setUserItemNumber(int item){         
      userItemNumber = item;
   }
   
   public int getUserItemNumber(){      
      return userItemNumber; 
   }
   
   public void setQuantity(int quant){      
      quantity = quant;
   }
   
   public int getQuantity(){   
      return quantity;
   }

}