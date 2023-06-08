# Bill Generation by using abstract factory design pattern. 

### Program execution 
OrderPayableBill change the code and quantity of items will produce bill automatically
based on given condition 

### Solution Design pattern
Solution given by me by using Abstract factory pattern, which consist multi layer of abstraction by using interfaces.
The existing implementation can be replaced or improve more by using few more modification if needed shortend code.

1. Crate 3 different item (tea, coffee, cold drinks) class by implementing their respective interface, so rather than 
using/creating 3 different class object this could have been only class like TeaInterface -> TeaInterfaceImpl,where
we can provide 3 different price for 3 different tea, coffee, Cold drinks, but I used 3 different implementation. 
2. In all implemented class, could have been used the separate common method like
     
   public void processBill(int quantity) {
        System.out.println(quantity * PRICE);
   }
but since the objective of this method is to perform calculation which is common for all items therefore, I used
one common implementation inside BeverageBillCalculation class.
The commented out code can be found in ColdCoffee class. 

3. Instead of using hard coded string values for all beverages code like MT LT etc. I used the enums which can be found in 
Enums folder so no depend on hard coded string except at the time of running main class (OrderPayBill)
