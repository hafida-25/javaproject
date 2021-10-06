package fourthpackage;

import java.util.ArrayList;
import java.util.HashMap;

public class HashMapPractice {
  public static void main (String[] args){

      ArrayList<String>listOfStateUSA = new ArrayList<>();
      listOfStateUSA.add("NY");
      listOfStateUSA.add("NJ");
      listOfStateUSA.add("PA");

      ArrayList<String>listOfStateCanada = new ArrayList<>();
      listOfStateCanada.add("CO");
      listOfStateCanada.add("NH");

      HashMap<String,ArrayList <String>> countryMap = new HashMap<>();
      countryMap.put("usa",listOfStateUSA);
      System.out.println(countryMap);
      System.out.println(countryMap.get("usa"));

      System.out.println("*****");

      HashMap<String,Integer>  cityAndZipOfUSA = new HashMap<>();
      cityAndZipOfUSA.put("philadephia",19145);
      cityAndZipOfUSA.put("olathe",66062);

      HashMap<String,Integer>  cityAndZipOfCanada = new HashMap<>();
      cityAndZipOfCanada.put("ilyan",123456);
      cityAndZipOfCanada.put("hafo",123);

      ArrayList<HashMap<String,Integer>> cityAndZipCodes = new ArrayList<>();
      cityAndZipCodes.add(cityAndZipOfUSA);
      cityAndZipCodes.add(cityAndZipOfCanada);
      System.out.println(cityAndZipCodes);

      HashMap<String, Integer> ss = cityAndZipCodes.get(0);
      System.out.println(ss.get("ilyan"));
      // or we can use this one just one lign

      System.out.println(cityAndZipCodes.get(0).get("ilyan"));



  }
}
