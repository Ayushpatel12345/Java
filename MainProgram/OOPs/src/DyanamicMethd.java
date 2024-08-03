class Phone{
    void showtime(){
        System.out.println("time is 9pm");
    }
}

class SmartPhone extends Phone{
    void music(){
        System.out.println("play music");
    }
}

public class DyanamicMethd {
    public static void main(String[] args) {

        Phone obj = new SmartPhone();
        obj.showtime();
//        obj.music();               not allowed
    }
}
