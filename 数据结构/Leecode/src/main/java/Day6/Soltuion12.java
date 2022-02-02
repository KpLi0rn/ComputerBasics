package Day6;

import java.util.HashMap;

public class Soltuion12 {

    public static void main(String[] args) {
        String ransomNote = "aa";
        String magazine = "aab";
        System.out.println(new Soltuion12().canConstruct(ransomNote,magazine));
    }

//    public boolean canConstruct(String ransomNote, String magazine) {
//        char[] ransomNoteArry = ransomNote.toCharArray();
//        char[] magazineArry = magazine.toCharArray();
//        HashMap<Character,Integer> temp = new HashMap<>();
//        for (int i=0;i<magazineArry.length;i++){
//            temp.put(magazineArry[i],temp.getOrDefault(magazineArry[i],0)+1);
//        }
//
//        for (int i=0;i<ransomNoteArry.length;i++){
//            int count = temp.getOrDefault(ransomNoteArry[i],0);
//            if (count == 0){
//                return false;
//            }
//            if (count == 1){
//                temp.remove(ransomNoteArry[i]);
//            } else if (count > 1){
//                temp.put(magazineArry[i],count - 1);
//            }
//        }
//        return true;
//    }

    public boolean canConstruct(String ransomNote, String magazine) {
        if (ransomNote.length() > magazine.length()) {
            return false;
        }
        char[] ransomNoteArry = ransomNote.toCharArray();
        char[] magazineArry = magazine.toCharArray();
        int[] temp = new int[26];
        for (char chr: magazineArry) {
            temp[chr - 'a']++;
        }

        for (char chr : ransomNoteArry){
            temp[chr - 'a']--;
            if (temp[chr - 'a'] < 0){
                return false;
            }
        }
        return true;
    }


}
