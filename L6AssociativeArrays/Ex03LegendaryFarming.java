package L6AssociativeArrays;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Ex03LegendaryFarming {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> keyMaterials = new TreeMap<>();
        Map<String, Integer> junk = new TreeMap<>();

        keyMaterials.put("shards", 0);
        keyMaterials.put("fragments", 0);
        keyMaterials.put("motes", 0);

        while (keyMaterials.get("shards") < 250 && keyMaterials.get("fragments") < 250 && keyMaterials.get("motes") < 250){
            String[] inputMaterials = scanner.nextLine().split(" ");

            for(int i = 0; i < inputMaterials.length-1; i += 2){
                int quantity = Integer.parseInt(inputMaterials[i]);
                String material = inputMaterials[i+1].toLowerCase();

                if(keyMaterials.containsKey(material)){
                    keyMaterials.put(material, keyMaterials.get(material) + quantity);
                    if(keyMaterials.get(material) >= 250){
                        break;
                    }
                }else {
                    junk.putIfAbsent(material, 0);
                    junk.put(material, junk.get(material) + quantity);
                }
            }
        }
        if(keyMaterials.get("shards") >= 250){
            keyMaterials.put("shards", keyMaterials.get("shards") - 250);
            System.out.println("Shadowmourne obtained!");
        }else if(keyMaterials.get("fragments") >= 250){
            keyMaterials.put("fragments", keyMaterials.get("fragments") - 250);
            System.out.println("Valanyr obtained!");
        }else if(keyMaterials.get("motes") >= 250){
            keyMaterials.put("motes", keyMaterials.get("motes") - 250);
            System.out.println("Dragonwrath obtained!");
        }

        keyMaterials.entrySet().stream().sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue()))
                .forEach(e -> System.out.println(e.getKey() + ": " + e.getValue()));
        junk.forEach((k, v) -> System.out.println(k + ": " + v));
    }
}
