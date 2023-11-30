/*
 *  Given two strings ransomNote and magazine, return true if 
 *  ransomNote can be constructed by using the letters from magazine
 *  and false otherwise.
 *  
 * Each letter in magazine can only be used once in ransomNote
 * 
 * EX: ransomNote = "a", magazine = "b" => False
 * ransomNote = "aa", magazine = "ab" => False
 * ransomNote = "aa", magazine = "aab" => True
 * 
 * Constraints:
 * 1 <= ransomNote.length, magazine.length <= 10^5
 * ransomNote and magazine consists of lowercase English letters
 */

/* 
 *  Summarize: We're provided with two strings (ransomNote & magazine), ransomNote must be 
 *  able to be constructed from the letters of magazine (Letters in magazine can only be used once.)
 * 
 *  Example: ransomNote = "money", magazine = "aobmcendyp" => True
 *  ransomNote = "money", magazine = "xyz" => False
 * 
 *  Approach: map all elements of ransomNote to a HashMap. Map all elements of magazine to a HashMap.
 *  Loop through ransomNote hashmap & check if K:V in ransomNote matches K:V in magazine (K = char, V = count).
 */

import java.util.HashMap;
import java.util.Map;

public class RansomNote {
    public static void main(String args[]) {
        String magazine_1 = "apblcedhpp";
        String ransomNote_1 = "helppp";
        System.out.println(canConstruct(ransomNote_1, magazine_1)); // true

        String magazine_2 = "xyz";
        String ransomNote_2 = "money";
        System.out.println(canConstruct(ransomNote_2, magazine_2)); // false
    }

    public static boolean canConstruct(String ransomNote, String magazine) {
        if (magazine.length() == 0) { 
            return false;
        }

        HashMap<Character, Integer> magazineMap = new HashMap<>();
        for (int i = 0; i < magazine.length(); i++) {
            char magazineLetter = magazine.charAt(i);
            magazineMap.put(magazineLetter, magazineMap.getOrDefault(magazineLetter, 0)+1);
        }

        HashMap<Character, Integer> ransomMap = new HashMap<>();
        for (int j = 0; j < ransomNote.length(); j++) {
            char ransomLetter = ransomNote.charAt(j);
            ransomMap.put(ransomLetter, ransomMap.getOrDefault(ransomLetter, 0)+1);
        }

        for (Map.Entry<Character, Integer> entry : ransomMap.entrySet()) {
            if (magazineMap.get(entry.getKey()) == null) {
                return false;
            }
        }

        return true;
    }
}
