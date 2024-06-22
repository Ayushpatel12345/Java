public class RecSubSqunc {
    public static void subsequnce(String str,int idx,String newString){
        if (idx == str.length()){
            System.out.println(newString);
            return;
        }
        char currChar = str.charAt(idx);
        subsequnce(str,idx+1,newString+currChar);
        subsequnce(str,idx+1,newString);
    }

    public static void main(String[] args) {
        String str = "abc";
        subsequnce(str,0,"");
    }
}
