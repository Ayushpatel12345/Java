public class pojorecord1ref {
    public static void main(String[] args) {

        //pojo and record database in use
        for ( int i = 1; i <=4; i++){

            pojo1 p = new pojo1("s92300" + i,
                   switch (i){
                        case 1 -> "ayush";
                        case 2 -> "vishv";
                        case 3 -> "priyank";
                        case 4 -> "jay";
                        default ->  "no name";
                   },
                    "05/11/2004",
                    "java");
            System.out.println(p);
        }
        System.out.println(" ");
        //pojo use set/get method and ouput curly bracket
        pojo1 p = new pojo1("1001","abc","05/01/2001/","java");

        //record doesn't use set/get method and output square bracket
        Recordpojo1 r = new Recordpojo1("1011","def","06/12/2002","python");

        System.out.println(p);
        System.out.println(r);
    }
}
