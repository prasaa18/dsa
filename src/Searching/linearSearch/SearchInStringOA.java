package Searching.linearSearch;

public class SearchInStringOA {

    public static void main(String[] args) {
         String name= "kunal";
         char target ='u';
        System.out.println(search2(name, target));
    }
    static boolean search(String str,char target) {
        if (str.length() == 0)
            return false;
        for (int i = 0; i < str.length(); i++) {
            if (target == str.charAt(i)) {
                return true;
            }
        }
        return false;
    }

 // [k ,u, n., a ,l]
    static boolean search2(String str,char target) {
        if (str.length() == 0)
            return false;
        for (char ch: str.toCharArray()) {
            if (ch == target) {
                return true;
            }
        }
        return false;
    }
}
