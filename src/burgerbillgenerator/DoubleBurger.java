package burgerbillgenerator;

public class DoubleBurger extends Burger {
    //Declaration of variables
    private final double doubleBurgerBaconPrice = 0.40;
    private final double doubleBurgerCheesePrice = 0.20;
    private final double doubleBurgerPicklesPrice = 0.30;
    private final double doubleBurgerFriesPrice=1.50;
    private final double doubleBurgerDeliveryPrice=0.50;
    
    private double ingredientsDoubleBurger;
    private double doubleBurgerPrice = 6.00;
    
    private boolean isExtraBaconAddedD = false;
    private boolean isExtraCheeseAddedD = false;
    private boolean isExtraPicklesAddedD = false;
    private boolean isExtraFriesAddedD=false;
    private boolean isDeliveryChosenD = false;
    
    //Constructor
    public DoubleBurger(Boolean beef) {
        super(beef);
        addExtraBacon();
        addExtraCheese();
        addExtraPickles();
        addExtraFries();
            this.doubleBurgerPrice=6.00;
            ingredientsDoubleBurger=this.doubleBurgerPrice;
    }
    //Methods
    public  double getDoubleBurgerPrice() {
        return doubleBurgerPrice;
    }

    @Override
    public final void addExtraBacon() {
        isExtraBaconAddedD = true;
        doubleBurgerPrice += doubleBurgerBaconPrice;
    }

    @Override
    public final void addExtraCheese() {
        isExtraCheeseAddedD = true;
        doubleBurgerPrice+=doubleBurgerCheesePrice;
    }

    @Override
    public final void addExtraPickles() {
        isExtraPicklesAddedD = true;
        doubleBurgerPrice += doubleBurgerPicklesPrice;
    }
    @Override
    public final void addExtraFries(){
        isExtraFriesAddedD=true;
        doubleBurgerPrice+=doubleBurgerFriesPrice;
    }
    @Override
    public final void addDeliveryPrice(){
        isDeliveryChosenD=true;
        doubleBurgerPrice+=doubleBurgerDeliveryPrice;
    }
    public void getDoubleBurgerBill(){
        String doubleBurgerBill="";
        if(isExtraBaconAddedD){
            doubleBurgerBill+=doubleBurgerBaconPrice;
        }
        if(isExtraCheeseAddedD){
            doubleBurgerBill+=doubleBurgerCheesePrice;
        }
        if(isExtraPicklesAddedD){
            doubleBurgerBill+=doubleBurgerPicklesPrice;
        }
        if(isExtraFriesAddedD){
            doubleBurgerBill+=doubleBurgerFriesPrice;
        }
        if(isDeliveryChosenD){
            doubleBurgerBill+=doubleBurgerDeliveryPrice;
        }
        doubleBurgerBill="Total bill:"+this.doubleBurgerPrice+"\n";
        System.out.println(doubleBurgerBill);
    }

}
