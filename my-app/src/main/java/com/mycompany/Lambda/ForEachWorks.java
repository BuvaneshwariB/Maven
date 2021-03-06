package com.kgfsl.Lambda;

import java.util.*;
import java.util.Arrays;
import java.util.function.Consumer;

class ForEachWorks {

public static void main(String[] args) {
List<String> disneyCharacters = Arrays.asList("Micky", "Donald", "Minnie", "Aurora", "Winnie", "Pluto");

/*Consumer<String> con = new Consumer<String>() {
 public void accept(String s) {
 System.out.println(s);
 }
};*/

//Consumer<String> con = s -> System.out.println(s);
//disneyCharacters.forEach(con);
//disneyCharacters.forEach(s->System.out.println(s));


// call by method
disneyCharacters.forEach(System.out::println);

}
}