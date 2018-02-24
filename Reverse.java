public class Reverse {
    public static void main(String args[]) {
        String palindrome="priyanka";
        StringBuffer a=new StringBuffer();
        for(int i=palindrome.length()-1;i>=0;i--){
            a.append(palindrome.charAt(i));
        }
        System.out.println(a);
        
    }
  
}
