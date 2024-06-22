public class StrBuildMethd {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("tony");

        //charAt
        System.out.println("charAt : "+sb.charAt(1));

        //set charAt
        sb.setCharAt(0,'c');
        System.out.println("set charAt : "+sb);

        //insert
        sb.insert(3,'t');
        System.out.println("insert : "+sb);

        //delete
        sb.delete(3,4);
        System.out.println("delete : " + sb);

        //apeend
        sb.append("e");
        System.out.println("append : " + sb);

        //reverse
        sb.reverse();
        System.out.println("reverse : " + sb);
    }
}

