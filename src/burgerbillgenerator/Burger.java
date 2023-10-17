package burgerbillgenerator;
public class Burger {
    private double price;
    Boolean beef; //The beef describes the meat if of the burger. The client can choose beef or non-beef (pork) burger.
    private double extraBaconPrice=0.40;
    private double extraCheesePrice=0.20;
    private double extraPicklesPrice=0.30;
    private double takeAwayPrice=0.50;
    private double ingredientsBurgerPrice;
    private boolean isExtraBaconAdded=false;
    private boolean isExtraCheeseAdded=false;
    private boolean isExtraPicklesAdded=false;
    private boolean isTakeAwayChosen=false;
//Constructor
    public Burger(Boolean beef){
        this.beef=beef;
        if (this.beef){
            this.price=4.00; //The price is counted in euros.
        }else{
            this.price=3.00; 
        }
        ingredientsBurgerPrice=this.price;
    }
    public void getBurgerPrice(){
        
   
        System.out.println(this.price);
    }
    
    public void addExtraBacon(){
        isExtraBaconAdded=true;
        System.out.println("Extra bacon added +0.40€");
        this.price=this.price+extraBaconPrice;
    }
    public void addExtraCheese(){
        isExtraCheeseAdded=true;
        System.out.println("Extra cheese added +0.20€");
        this.price=this.price+extraCheesePrice;
    }
    public void addExtraPickles(){
        isExtraPicklesAdded=true;
        System.out.println("Extra pickles added +0.30€");
        this.price=this.price+extraPicklesPrice;
    }
    public void takeAway(){
        isTakeAwayChosen=true; 
        System.out.println("Take away price is +0.50€.");
        this.price=this.price+takeAwayPrice;
    }
    public void getBill(){
        String bill="";
        System.out.println("Burger:"+ingredientsBurgerPrice);
        if(isExtraBaconAdded){
            bill+="Extra bacon added:"+extraBaconPrice+"\n";
        }
        if(isExtraCheeseAdded){
            bill+="Extra cheese added:"+extraCheesePrice+"\n";
        }
        if(isExtraPicklesAdded){
            bill+="Extra pickles added:"+extraPicklesPrice+"\n";
        }
        if(isTakeAwayChosen){
            bill+="Delivery price is:"+takeAwayPrice+"\n";
        }
        bill="Total bill:"+this.price+"\n";
        System.out.println(bill);
    }
    
    
}
