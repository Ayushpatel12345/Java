public class INHEworkrempref{
    public static void main(String[] args) {
        INHEemp temp = new INHEemp("ayush","01/01/2004","01/04/2022");
        System.out.println(temp);
        System.out.println("age:" + temp.getAge());
        System.out.println("pay:" + temp.coolectPay());

        INHEemp temp1 = new INHEemp("vishv","02/01/2005","05/04/2022");
        System.out.println(temp1);
    }
}
