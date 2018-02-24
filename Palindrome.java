public class Palindrome {
    public static void main(String args[]) {
        System.out.println(palindrome("malaalam"));
    }
    static boolean palindrome(String s1){
        for(int i=0,j=s1.length()-1;i<=j;i++,j--){
            if(s1.charAt(i)==s1.charAt(j)){
                continue;
            }
            return false;
            
        }
        return true;
      
    }
}
