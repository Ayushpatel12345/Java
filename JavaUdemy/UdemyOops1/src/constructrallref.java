public class constructrallref {
    public static void main(String[] args) {

        //three parameter
        constructrall con = new constructrall("vishv",1000,
                "vishv@gmail.com");
           System.out.println("(1) name:" + con.getName());
           System.out.println("limit:" + con.getCreditLimit());
           System.out.println("email:" + con.getEmail());

        //two parameter(1 bydefault value = creditlimit)
        constructrall like = new constructrall("abc","abc@gamil.com");
           System.out.println("(2) "+like.getName());
           System.out.println(like.getCreditLimit());
           System.out.println(like.getEmail());

        //zero parameter(3 bydefault value = name,creditlimit,email)
        constructrall temp = new constructrall();
           System.out.println("(3) " + temp.getName());
           System.out.println(temp.getCreditLimit());
           System.out.println(temp.getEmail());
    }
}
