package module2.chapter11Regex;

public class ReplaceMethod {
    public static void main(String[] args) {
        String originalText, modifiedText;
        originalText = "apple";

        modifiedText = originalText.replace("a","@");
        System.out.println(modifiedText);

        modifiedText = originalText.replaceAll("[aeiou]","@");
//        modifiedText = originalText.replaceAll("[a-z]","*");
        System.out.println(modifiedText);

        String str1 = "attempt";
        String str2 = str1.replaceAll("\\btemp\\b","temporary");
        System.out.println(str2);
    }
}
