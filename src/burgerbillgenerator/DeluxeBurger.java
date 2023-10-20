package burgerbillgenerator;
public class DeluxeBurger extends Burger {
    //Declaration of variables
    //Double Burger with: Cheese, Ketchup, Bacon, Egg, Iceberg
    private final double deluxeBurgerBaconPrice = 0.40;
    private final double deluxeBurgerCheesePrice = 0.20;
    private final double deluxeBurgerPicklesPrice = 0.30;
    private final double deluxeBurgerFriesPrice=1.50;
    private final double deluxeBurgerEggPrice=0.50;
    private final double deluxeBurgerIcebergPrice=0.20;
    private final double deluxeBurgerDeliveryPrice=0.50;
   
    
    private double ingredientsDeluxeBurger;
    private double deluxeBurgerPrice = 7.50;
    
    private boolean isExtraBaconAddedDe = false;
    private boolean isExtraCheeseAddedDe= false;
    private boolean isExtraPicklesAddedDe = false;
    private boolean isExtraFriesAddedDe=false;
    private boolean isExtraEggAddedDe=false;
    private boolean isExtraIcebergAddedDe=false;
    private boolean isDeliveryChosenDe = false;
    
    //Constructor
    public DeluxeBurger(Boolean beef) {
        super(beef);
        addExtraBacon();
        addExtraCheese();
        addExtraPickles();
        addExtraFries();
        addExtraEgg();
        addExtraIceberg();
            this.deluxeBurgerPrice=7.50;
            ingredientsDeluxeBurger=this.deluxeBurgerPrice;
    }
    //Methods
    public  double getDoubleBurgerPrice() {
        return deluxeBurgerPrice;
    }
    
    public final void addExtraIceberg(){
        isExtraIcebergAddedDe=true;
        deluxeBurgerPrice+=deluxeBurgerIcebergPrice;
    }
    
    public final void addExtraEgg(){
        isExtraEggAddedDe=true;
        deluxeBurgerPrice+=deluxeBurgerEggPrice;
    }
    @Override
    public final void addExtraBacon() {
        isExtraBaconAddedDe = true;
        deluxeBurgerPrice += deluxeBurgerBaconPrice;
    }

    @Override
    public final void addExtraCheese() {
        isExtraCheeseAddedDe = true;
        deluxeBurgerPrice+=deluxeBurgerCheesePrice;
    }

    @Override
    public final void addExtraPickles() {
        isExtraPicklesAddedDe = true;
        deluxeBurgerPrice += deluxeBurgerPicklesPrice;
    }
    
    @Override
    public final void addExtraFries(){
        isExtraFriesAddedDe=true;
        deluxeBurgerPrice+=deluxeBurgerFriesPrice;
    }
    @Override
    public final void addDeliveryPrice(){
        isDeliveryChosenDe=true;
        deluxeBurgerPrice+=deluxeBurgerDeliveryPrice;
    }
    public void getDoubleBurgerBill(){
        String deluxeBurgerBill="";
        if(isExtraBaconAddedDe){
            deluxeBurgerBill+=deluxeBurgerBaconPrice;
        }
        if(isExtraCheeseAddedDe){
            deluxeBurgerBill+=deluxeBurgerCheesePrice;
        }
        if(isExtraPicklesAddedDe){
            deluxeBurgerBill+=deluxeBurgerPicklesPrice;
        }
        if(isExtraFriesAddedDe){
            deluxeBurgerBill+=deluxeBurgerFriesPrice;
        }
        if(isExtraEggAddedDe){
            deluxeBurgerBill+=deluxeBurgerEggPrice;
        }
          if(isExtraIcebergAddedDe){
            deluxeBurgerBill+=deluxeBurgerIcebergPrice;
        }
        if(isDeliveryChosenDe){
            deluxeBurgerBill+=deluxeBurgerDeliveryPrice;
        } else {
        }
        deluxeBurgerBill="Total bill:"+this.deluxeBurgerPrice+"\n";
        System.out.println(deluxeBurgerBill);
    }
    
}
