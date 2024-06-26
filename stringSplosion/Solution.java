public class Solution {
    public static String stringSplosion(String str) {
        char[] new_str=str.toCharArray();
        StringBuilder f_str=new StringBuilder();
        int len=str.length();
        for(int i=0;i<len;i++){
          for(int j=0;j<=i;j++){
            f_str.append(new_str[j]);
          }
        }
        return f_str.toString();
    }
    public static void main(String args[]){
        System.out.println(stringSplosion("Code"));
    }    
}
