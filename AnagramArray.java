public class AnagramArray {
    public static void main(String args[]) {
        System.out.println(anagram("Priyaaaa","Priyanka"));
    }
    static boolean anagram(String s1,String s2){
        if(s1.length()!=s2.length()) return false;
        int[] charSet =new int[256];
        int uni1=0,uni2=0;
        for(int i=0;i<s1.length();i++){
            int temp=s1.charAt(i);
            if(charSet[temp]!=0){
                charSet[temp]+=1;
            }
            else {
                charSet[temp]=1;
                uni1++;
            }
        }
        for(int i=0;i<s2.length();i++){
      
            int temp=s2.charAt(i);
            if(charSet[temp]==0) return false;
            else if(charSet[temp]>1){
                charSet[temp]-=1;
            }
            else if(charSet[temp]==1){
                 charSet[temp]=0;
              uni2++;
            }
        }
        
        if(uni1==uni2) return true;
        return false;
    }
}
