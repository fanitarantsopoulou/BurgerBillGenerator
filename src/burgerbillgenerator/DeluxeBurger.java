package burgerbillgenerator;
public class DeluxeBurger extends Burger {
    //Declaration of variables
    //Double Burger with: Cheese, Ketchup, Bacon, Egg, Iceberg
    private final double deluxeBurgerBaconPrice = 0.40;
    private final double deluxeBurgerCheesePrice = 0.20;
    private final double deluxeBurgerPicklesPrice = 0.30;
    private final double deluxeBurgerFriesPrice=1.50;
    private final double deluxeBurgerDeliveryPrice=0.50;
   
    
    private double ingredientsDeluxeBurger;
    private double doubleBurgerPrice = 7.50;
    
    private boolean isExtraBaconAddedDe = false;
    private boolean isExtraCheeseAddedDe= false;
    private boolean isExtraPicklesAddedDe = false;
    private boolean isExtraFriesAddedDe=false;
    private boolean isDeliveryChosenD = false;
    
    //Constructor
    public DeluxeBurger(Boolean beef) {
        super(beef);
        addExtraBacon();
        addExtraCheese();
        addExtraPickles();
        addExtraFries();
            this.doubleBurgerPrice=7.50;
            ingredientsDeluxeBurger=this.doubleBurgerPrice;
    }
    //Methods
    public  double getDoubleBurgerPrice() {
        return doubleBurgerPrice;
    }

    @Override
    public final void addExtraBacon() {
        isExtraBaconAddedDe = true;
        doubleBurgerPrice += deluxeBurgerBaconPrice;
    }

    @Override
    public final void addExtraCheese() {
        isExtraCheeseAddedDe = true;
        doubleBurgerPrice+=deluxeBurgerCheesePrice;
    }

    @Override
    public final void addExtraPickles() {
        isExtraPicklesAddedDe = true;
        doubleBurgerPrice += deluxeBurgerPicklesPrice;
    }
    @Override
    public final void addExtraFries(){
        isExtraFriesAddedDe=true;
        doubleBurgerPrice+=deluxeBurgerFriesPrice;
    }
    @Override
    public final void addDeliveryPrice(){
        isDeliveryChosenD=true;
        doubleBurgerPrice+=deluxeBurgerDeliveryPrice;
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
        if(isDeliveryChosenD){
            deluxeBurgerBill+=deluxeBurgerDeliveryPrice;
        }
        deluxeBurgerBill="Total bill:"+this.doubleBurgerPrice+"\n";
        System.out.println(deluxeBurgerBill);
    }
    
}
