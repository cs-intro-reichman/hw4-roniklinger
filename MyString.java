public class MyString {
    public static void main(String[] args) {
        System.out.println("Testing lowercase:");
        System.out.println("UnHappy : " + lowerCase("UnHappy"));
        System.out.println("This costs 15 Sheksls : " + lowerCase("This costs 15 Sheksls"));
        System.out.println("TLV : " + lowerCase("TLV"));
        System.out.println("lowercase : " + lowerCase("lowercase"));

        System.out.println("Testing contains:");
        System.out.println(contains("unhappy", "happy")); // true
        System.out.println(contains("happy", "unhappy")); // false
        System.out.println(contains("historical", "story")); // false
        System.out.println(contains("psychology", "psycho")); // true
        System.out.println(contains("personality", "son")); // true
        System.out.println(contains("personality", "dad")); // false
        System.out.println(contains("resignation", "sign")); // true
        System.out.println(contains("baba yaga", "baba"));
        System.out.println(contains("baba yaga", ""));
        System.out.println(contains("baba yaga", "John Wick is the baba yaga"));
        System.out.println(contains("baba yaga", "Yaga"));
        System.out.println(contains("baba yaga", "babayaga"));
    }

    /** Returns the lowercase version of the given string. */
    public static String lowerCase(String str) {
        str = str.toLowerCase();
        return str;
    }

    /** If str1 contains str2, returns true; otherwise returns false. */
    public static boolean contains(String str1, String str2) {
        int i = 0;
        if(str2.length() == 0 && str1.length() != 0 ){
            return true;
        }
        //str1 = lowerCase(str1);
        //str2 = lowerCase(str2);
        while (i < str1.length()){
            if(str1.charAt(i) == str2.charAt(0)){
                int count=1;
                for(int j=1; j<str2.length(); j++){
                    i++;
                    if(str1.charAt(i) == str2.charAt(j)){
                        count++;
                    }
                }
                if(count == str2.length()){
                    return true;
                }
            }
            else{
                i++;
            }
        }
        return false;
    }
}
