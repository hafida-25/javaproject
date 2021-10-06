package fourthpackage;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;

public class HashsetPractice {
    public static void main (String[] args) {
       // unique data --> no duplicate data is allowed
       HashSet<String> cities = new HashSet<>();
       ArrayList<String> cityList = new ArrayList<>();
        cities.add("PA");
        cities.add("Olathe");
        cities.add("New york");
        cities.add("Olathe");
         System.out.println(cities);

        Iterator it = cities.iterator();
        while (it.hasNext()) {
            String city = it.next().toString();
            //System.out.println(city);
            cityList.add(city);
        }
        System.out.println(cityList);
        System.out.println(cityList.get(0));


    }
}
