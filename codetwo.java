public class ProductTester 
{
   public static void main(String[] args) 
   {
       Product product1 = new Product("Toaster", 29.95);
       System.out.println("Name of product 1: " + product1.getName());
       System.out.println("Price of product 1: " + product1.getPrice());
       product1.reducePrice(5);
       System.out.println("Reduced price of product 1: " + product1.getPrice());
       
   }      
}  
