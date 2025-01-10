// import String.class from java.lang package to use built-in .replace() method -- otw will have to create a loop and yada yada yada 
import java.lang.String;

public class RemoveAllCharacter {
    /**
     * Return a String that has all the character of a String removed.
     * You could either use a for loop to build a new String that excludes a character, or you could cleverly use
     * the replaceAll method of String to replace a character with a blank space.
     *
     * Here are the docs for String: https://docs.oracle.com/javase/7/docs/api/java/lang/String.html
     *
     * @param str A string.
     * @param ch A string containing a single character which should be removed from str.
     * @return str, without any characters of type ch.
     */
    public String removeAll(String str, String ch){
        // https://stackoverflow.com/questions/4576352/remove-all-occurrences-of-char-from-string
        // implment String.replace(old char, new char) method to replace each instance of 'ch' w/ nothing
        // Note: Since 'ch' was initialized w/ type of String, double quotes "" were used in 2nd params -- if 1st param single '', 2nd param must match ''
        String newStr = str.replace(ch, "");   // could've been done recursively -- assign to 'str'
        
        // return 'newStr' w/o any inkling of char 'ch'
        return newStr;
    }
}