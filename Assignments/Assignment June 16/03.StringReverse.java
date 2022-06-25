import java.util.Collection;

class StringReverse {
    static String stringReverse(StringBuilder str, int i) {
        if( i == str.length()/2 ) {
            return str.toString();
        }
        
       String temp = str.substring(i,i+1);
       str.replace(i, i+1, str.substring(str.length() - i - 1,str.length() - i));
       str.replace(str.length() - i - 1, str.length() - i, temp);
    
       return stringReverse(str, i +1);
        
    }
    public static void main(String[] args) {
        System.out.println(stringReverse(new StringBuilder("Tim"), 0));
    }
}