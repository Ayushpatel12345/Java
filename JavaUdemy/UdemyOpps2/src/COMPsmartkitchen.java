public class COMPsmartkitchen {
    private coffeeMaker brewMaster;
    private Refrigerator iceBox;
    private  DishWasher dishWasher;

    public COMPsmartkitchen(){
        brewMaster = new coffeeMaker();
        iceBox = new Refrigerator();
        dishWasher = new DishWasher();
    }

    public coffeeMaker getBrewMaster(){return  brewMaster;}
    public Refrigerator getIceBox(){return iceBox;}
    public DishWasher getDishWasher(){return  dishWasher;}

    public void setKitchenState(boolean coffeeFlag,boolean fridgeFlag,
                                boolean dishWasherFlag){
        brewMaster.setHasWorkTodDo(coffeeFlag);
        iceBox.setHasWorkTodDo(fridgeFlag);
        dishWasher.setHasWorkTodDo(dishWasherFlag);
    }
    public void doKitchenWork(){
        brewMaster.brewCoffee();
        iceBox.orderFood();
        dishWasher.doDishes();
    }
}
class  coffeeMaker{
    private boolean hasWorkTodDo;

    public void setHasWorkTodDo(boolean hasWorkTodDo) {
        this.hasWorkTodDo = hasWorkTodDo;
    }

    public void brewCoffee(){
        if (hasWorkTodDo){
            System.out.println("brewing coffee");
            hasWorkTodDo = false;
        }
    }
}

class  DishWasher{
    private boolean hasWorkTodDo;

    public void setHasWorkTodDo(boolean hasWorkTodDo) {
        this.hasWorkTodDo = hasWorkTodDo;
    }

    public void  doDishes(){
        if (hasWorkTodDo){
            System.out.println("washing dishes");
            hasWorkTodDo = false;
        }
    }
}

class  Refrigerator{
    private boolean hasWorkTodDo;

    public void setHasWorkTodDo(boolean hasWorkTodDo) {
        this.hasWorkTodDo = hasWorkTodDo;
    }

    public void orderFood(){
        if (hasWorkTodDo){
            System.out.println("ordering food");
            hasWorkTodDo = false;
        }
    }
}