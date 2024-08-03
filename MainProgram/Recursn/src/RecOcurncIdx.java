public class RecOcurncIdx {
    public static int first = -1;
    public static int last = -1;

    public static void findOccurnce(String str,int idx,char element){

        if (idx == str.length()){
            System.out.println(first);
            System.err.println(last);
            return;
        }
        char currChar = str.charAt(idx);
        if (currChar == element){
            if (first == -1){
                first = idx;
            }else{
                last = idx;
            }
        }
        findOccurnce(str,idx+1,element);
    }

    public static void main(String[] args) {
        String str = "abaacdaefaah";
        findOccurnce(str,0,'a');
    }
}
