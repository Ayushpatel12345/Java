public class COMPsmrtkitchnref {
    public static void main(String[] args) {

        COMPsmartkitchen kitchen= new COMPsmartkitchen();

//        kitchen.getDishWasher().setHasWorkTodDo(true);
//        kitchen.getIceBox().setHasWorkTodDo(true);
//        kitchen.getBrewMaster().setHasWorkTodDo(true);
//
//        kitchen.getDishWasher().doDishes();
//        kitchen.getIceBox().orderFood();
//        kitchen.getBrewMaster().brewCoffee();

        kitchen.setKitchenState(true,false,true);
        kitchen.doKitchenWork();
    }
}
