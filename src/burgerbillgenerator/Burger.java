package burgerbillgenerator;
public class Burger {
    
    private double price;
    private final double extraBaconPrice=0.40;
    private final double extraCheesePrice=0.20;
    private final double extraPicklesPrice=0.30;
    private final double deliveryPrice=0.50;
    private final double ingredientsBurgerPrice;
    
    public String bill="";
    
    public Boolean beef;
    private boolean isExtraBaconAdded=false;
    private boolean isExtraCheeseAdded=false;
    private boolean isExtraPicklesAdded=false;
    private boolean isDeliveryChosen=false;
    //Constructor
    public Burger(Boolean beef){
        this.beef=beef;
            this.price=4.00; //The price is counted in euros.
        ingredientsBurgerPrice=this.price;
    }
    public void getBurgerPrice(){
        
   
        System.out.println(this.price);
    }
    
    public void addExtraBacon(){
        isExtraBaconAdded=true;
        this.price=this.price+extraBaconPrice;
    }
    public void addExtraCheese(){
        isExtraCheeseAdded=true;
        this.price=this.price+extraCheesePrice;
    }
    public void addExtraPickles(){
        isExtraPicklesAdded=true;
        this.price=this.price+extraPicklesPrice;
    }
    public void addDeliveryPrice(){
        isDeliveryChosen=true; 
        this.price=this.price+deliveryPrice;
    }
    public void getBill(){
        System.out.println("Burger:"+ingredientsBurgerPrice);
        if(isExtraBaconAdded){
            bill+=extraBaconPrice;
        }
        if(isExtraCheeseAdded){
            bill+=extraCheesePrice;
        }
        if(isExtraPicklesAdded){
            bill+=extraPicklesPrice;
        }
        if(isDeliveryChosen){
            bill+=deliveryPrice;
        }
        bill="Total bill:"+this.price+"\n";
        System.out.println(bill);
    }
    
    
}
