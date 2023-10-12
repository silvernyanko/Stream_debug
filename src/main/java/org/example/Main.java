package org.example;

import java.util.List;


public class Main {
    public static void main(String[] args) {
        List<String> names = List.of("Moomintroll", "Floren", "Moominpappa", "Moominmamma", "Little My", "Snufkin", "Snork", "Sniff", "Mimble", "Hemulen", "Too-Ticky", "Stinky", "the Groke", "the Hattifatteners");
        List<String> result = names.stream().sorted().map(String::toUpperCase).filter(name -> name.contains("I")).toList();
        System.out.println(result);
    }
}
