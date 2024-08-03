package Telecommunication;

class MobilePhone implements TelePhone {

    private String myNumber;
    private boolean isRinging;
    private boolean isPowerOn;

    MobilePhone(String myNumber){
        this.myNumber = myNumber;
    }

    @Override
    public void powerOn() {
        isPowerOn = true;
        System.out.println("Phone power on");
    }

    @Override
    public void dial(String phoneNumber) {
        System.out.println("now ringing " + phoneNumber + " on desktop");
    }

    @Override
    public void answer() {
        if (isPowerOn && isRinging){
            System.out.println("Answering phone");
            isRinging = false;
        }else {
            System.out.println("phone is not ringing");
        }
    }

    @Override
    public boolean callPhone(String phoneNumber) {
        if (phoneNumber == myNumber && isPowerOn ){
            isRinging = true;
            System.out.println("phone ringing");
        }else {
            System.out.println("either wrong number entered");
            isRinging = false;
        }
        return isRinging;
    }

    @Override
    public boolean isRinging() {
        return isRinging;
    }
}
