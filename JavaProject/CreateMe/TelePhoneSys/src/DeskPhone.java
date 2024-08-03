package Telecommunication;

class DeskPhone implements TelePhone {

    private String myNumber;
    private boolean isRinging;

    DeskPhone(String myNumber){
        this.myNumber = myNumber;
    }

    @Override
    public void powerOn() {
        System.out.println("Desk phone is always powered");
    }

    @Override
    public void dial(String phoneNumber) {
        System.out.println("now ringing " + phoneNumber + " on desktop");
    }

    @Override
    public void answer() {
        if (isRinging){
            System.out.println("Answering desk phone");
            isRinging = false;
        }else {
            System.out.println("phone is not ringing");
        }
    }

    @Override
    public boolean callPhone(String phoneNumber) {
        if(phoneNumber == myNumber){
            isRinging = true;
            System.out.println("phone ringing");
        }else {
            isRinging = false;
        }
        return isRinging;
    }

    @Override
    public boolean isRinging() {
        return isRinging;
    }
}
