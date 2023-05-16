package HashMap.Nicknames;

import java.util.HashMap;

public class Nicknames {

    public static void main(String[] args) {
        HashMap<String,String> map = new HashMap<>();

        map.put("Courtney", "co-co");
        map.put("Matthew", "mattie");
        map.put("Benjamin", "ben");

        System.out.println(map.get("Courtney"));
    }

}