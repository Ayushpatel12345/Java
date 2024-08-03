public class UsrDefException {
    public static void main(String[] args) {

        // printStackTrace()
        try {
            int a = 10/0;
            System.out.println(a);
        } catch (Exception e) {
            e.printStackTrace();
        }

        // toString()
        try {
            int a = 10/0;
            System.out.println(a);
        } catch (Exception e) {
            System.out.println(e.toString());
        }

        // getMessage()
        try {
            int a = 10/0;
            System.out.println(a);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}