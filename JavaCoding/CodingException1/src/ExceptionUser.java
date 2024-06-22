public class ExceptionUser {
    public static void main(String[] args) {

    }
    class myException extends Exception{
        myException(String msg){
            super(msg);
        }
    }
    class raj{
        void pass(int marks) throws myException{
            if (marks < 30){
                throw new myException("fail ho gaya");
            }
        }
    }
}
