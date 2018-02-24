import java.util.HashMap;
public class AnagramHashMap {
    public static void main(String args[]) {
        System.out.println(anagram("Priyanka","Priyankn"));
    }
    static boolean anagram(String s1,String s2){
        if(s1.length()!=s2.length()) return false;
        HashMap<Character, Integer> charWithCountS1 =new HashMap<Character, Integer>();
        for(int i=0;i<s1.length();i++){
            if(charWithCountS1.containsKey(s1.charAt(i))){
                 charWithCountS1.put(s1.charAt(i),charWithCountS1.get(s1.charAt(i))+1);
            }
            else charWithCountS1.put(s1.charAt(i),1);
        }
        for(int i=0;i<s2.length();i++){
            if(charWithCountS1.containsKey(s2.charAt(i))){
                if(charWithCountS1.get(s2.charAt(i))==1) charWithCountS1.remove(s2.charAt(i));
                 else charWithCountS1.put(s2.charAt(i),charWithCountS1.get(s2.charAt(i))-1);
            }
            else 
            return false;
        }
        if(charWithCountS1.size()==0) return true;
        return false;
    }
}
