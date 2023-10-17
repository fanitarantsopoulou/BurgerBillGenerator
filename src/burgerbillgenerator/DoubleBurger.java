package burgerbillgenerator;

public class DoubleBurger extends Burger {
    private double ingredientsDoubleBurger;
    private static double doubleBurgerBaconPrice = 0.40;
    private static final double doubleBurgerCheesePrice = 0.20;
    private static final double doubleBurgerPicklesPrice = 0.30;
    private static final double doubleBurgerTakeAwayPrice=0.50;
    private double doubleBurgerPrice = 6.00;
    private boolean isExtraBaconAddedD = false;
    private boolean isExtraCheeseAddedD = false;
    private boolean isExtraPicklesAddedD = false;
    private boolean isTakeAwayChosenD = false;

    public DoubleBurger(Boolean beef) {
        super(beef);
        addExtraBacon();
        addExtraCheese();
        addExtraPickles();
        if (this.beef){
            this.doubleBurgerPrice=6.00;
        }else{
            this.doubleBurgerPrice=5.00; //The price is counted in euros.
        }
        ingredientsDoubleBurger=this.doubleBurgerPrice;
    }

    public  double getDoubleBurgerPrice() {
        return doubleBurgerPrice;
    }

    @Override
    public void addExtraBacon() {
        isExtraBaconAddedD = true;
        doubleBurgerPrice = doubleBurgerPrice + doubleBurgerBaconPrice;
    }

    @Override
    public void addExtraCheese() {
        isExtraCheeseAddedD = true;
        doubleBurgerPrice = doubleBurgerPrice + doubleBurgerCheesePrice;
    }

    @Override
    public void addExtraPickles() {
        isExtraPicklesAddedD = true;
        doubleBurgerPrice = doubleBurgerPrice + doubleBurgerPicklesPrice;
    }
    public void getDoubleBurgerBill(){
        String doubleBurgerBill="";
        System.out.println("Burger:"+ingredientsDoubleBurger);
        if(isExtraBaconAddedD){
            doubleBurgerBill+="Extra bacon added:"+doubleBurgerBaconPrice+"\n";
        }
        if(isExtraCheeseAddedD){
            doubleBurgerBill+="Extra cheese added:"+doubleBurgerCheesePrice+"\n";
        }
        if(isExtraPicklesAddedD){
            doubleBurgerBill+="Extra pickles added:"+doubleBurgerPicklesPrice+"\n";
        }
        if(isTakeAwayChosenD){
            doubleBurgerBill+="Delivery price is:"+doubleBurgerTakeAwayPrice+"\n";
        }
        doubleBurgerBill="Total bill:"+this.doubleBurgerPrice+"\n";
        System.out.println(doubleBurgerBill);
    }

}
