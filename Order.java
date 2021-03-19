
package orderingmenu;

public class Order extends Customer {
    private int orderItems;
    private String date;
    
    public void setOrderItems(int orderItems){
        this.orderItems = orderItems;
  
         if (orderItems ==1){
             orderItems = 1;
         }else if (orderItems == 2){
             orderItems = 2;
         }else if(orderItems == 3){
             orderItems = 3;
         }else if(orderItems == 4){
             orderItems = 4;
         }else{
             System.out.println("Invalid Input!");
             System.exit(1);
         }
     }
    public int getOrderItems(){
         if (orderItems == 1){
             System.out.println("Food Package 1 -------------  $99 ");
             System.out.println("        1 rice, 1 chicken, M drink");;
             return orderItems;
         }else if (orderItems == 2){
             System.out.println("Food Package 1 -------------  $89 ");
             System.out.println("       1 pasta, 1 chicken, M drink");
             return orderItems;
         }else if (orderItems == 3){
             System.out.println("Food Package 1 -------------  $69 ");
             System.out.println("        1 burger, 1 fries, M drink");
             return orderItems;
         }else if (orderItems == 4){
             System.out.println("Package 1 -------------  $199 ");
             System.out.println("    1 rice, 2 chicken, M drink");
             return orderItems;
         }else{
             System.out.println("Invalid Input!");
             System.exit(1);
         }
             return orderItems;
     }

    public void setDate(String date ){
        this.date = date;
    }
    public String getDate(){
        return date;
    }
    
    
}
