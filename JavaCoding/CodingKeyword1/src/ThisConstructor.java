class A{
    A(){
        System.out.println("hello java");
    }
    A(int x){
        this();
    }
}
class ThisConstructor {
    public static void main(String[] args) {

        A a1 = new A(1);
    }
}