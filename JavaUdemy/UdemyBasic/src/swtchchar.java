public class swtchchar {
    public static void main(String[] args) {
        char charValue = 'A';
        switch (charValue){
            case 'A':
                System.out.println("A is able");
                break;
            case 'B':
                System.out.println("B is bark");
                break;
            case 'C':
                System.out.println("c is charlie");
                break;
            default:
                System.out.println(charValue + " letter  was not found in statment");
                break;
        }
    }
}
