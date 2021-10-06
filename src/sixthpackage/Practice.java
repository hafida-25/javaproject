package sixthpackage;

import java.util.Arrays;
import java.util.HashMap;

public class Practice {
    public static void  getIsAnagram(String a ,String b) {

        char[] charArrayOfA = a.toCharArray();
        char[] charArrayOfB = b.toCharArray();

        Arrays.sort( charArrayOfA);
        Arrays.sort( charArrayOfB);

       boolean isAnagram=Arrays.equals(charArrayOfA, charArrayOfB) ;

        if(isAnagram) {
            System.out.println(a+" and "+b+"+ are anagram");
        } else {
            System.out.println(a+" and "+b+"+ are not anagram");
        }

    }

    public static void main(String[] args) {
        //1. write the application figure out if given 2 string are anagram or not
        getIsAnagram("CAT", "ACT");

        // 2 from a given sentence , find out the duplicated data and their accurrences
        String data = " Today is sunday,sunday is a good day ,i play soccer on sunday.";

        // HashMap<String, Integer> accurances = new HashMap<>();
        // String[] individualWords = data.split(" ");
        // System.out.println(individualWords[2]);
        // System.out.println(individualWords.length);

        String updatedData = data.replace(".", "");

        String[] arrayOfIndividualWod = updatedData.split(" ");
        HashMap<String, Integer> mapIfOccurance = new HashMap<>();

        for (String individualWord : arrayOfIndividualWod) {
            Integer previousCount = mapIfOccurance.get(individualWord);
            if (previousCount == null) {
                previousCount = 0;
            }
            mapIfOccurance.put(individualWord, previousCount + 1);
        }
        System.out.println(mapIfOccurance);
    }














}
