
public class lab3_fourth {

    /*
 * Given two strings s and t, return true if t is an anagram of s, and false otherwise.
Example 1:
Input: s = "anagram", t = "nagaram"
Output: true
Example 2:
Input: s = "rat", t = "car"
Output: false

     */
    public static boolean isAnagram(String s, String t) {
        // If lengths are not equal, they cannot be anagrams
        if (s.length() != t.length()) {
            return false;
        }
        int[] charCount = new int[26];
        for (int i = 0; i < s.length(); i++) {
            charCount[s.charAt(i) - 'a']++;
            charCount[t.charAt(i) - 'a']--;
        }
        for (int i = 0; i < 26; i++) {
            if (charCount[i] != 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String s1 = "anagram";
        String t1 = "nagaram";
        System.out.println(isAnagram(s1, t1)); // Output: true

        String s2 = "rat";
        String t2 = "car";
        System.out.println(isAnagram(s2, t2)); // Output: false
    }
}
