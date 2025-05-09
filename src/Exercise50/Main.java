package Exercise50;


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

// ✅ Import statements for Scanner and HashMap
// ✅ Import statements for Map and HashMap
public class Main {


 private Map<Integer, Location> locations = new HashMap<>();
 private Map<String, String> vocabulary = new HashMap<>(); // ✅ vocabulary as private field

 public Main() {
     locations.put(0, new Location(0, "You are sitting in front of a computer learning Java"));
     locations.put(1, new Location(1, "You are standing at the end of a road before a small brick building"));
     locations.put(2, new Location(2, "You are at the top of a hill"));
     locations.put(3, new Location(3, "You are inside a building, a well house for a small spring"));
     locations.put(4, new Location(4, "You are in a valley beside a stream"));
     locations.put(5, new Location(5, "You are in the forest"));

     locations.get(1).addExit("W", 2);
     locations.get(1).addExit("E", 3);
     locations.get(1).addExit("S", 4);
     locations.get(1).addExit("N", 5);

     locations.get(2).addExit("N", 5);

     locations.get(3).addExit("W", 1);

     locations.get(4).addExit("N", 1);
     locations.get(4).addExit("W", 2);

     locations.get(5).addExit("S", 1);
     locations.get(5).addExit("W", 2);

     // ✅ Build vocabulary here
     vocabulary.put("NORTH", "N");
     vocabulary.put("SOUTH", "S");
     vocabulary.put("EAST", "E");
     vocabulary.put("WEST", "W");
     vocabulary.put("QUIT", "Q");
 }

 public void command() {
     Scanner scanner = new Scanner(System.in);
     Location currentLocation = locations.get(1);

     while (true) {
         System.out.println();
         System.out.println(currentLocation.getDescription());
         System.out.println();

         Map<String, Integer> exits = currentLocation.getExits();
         StringBuilder availableExits = new StringBuilder("Available exits are ");
         for (String exit : exits.keySet()) {
             availableExits.append(exit).append(", ");
         }
         System.out.println(availableExits);

         String input = scanner.nextLine().trim().toUpperCase();
         String direction = null;

         if (input.length() == 1 && "NSEWQ".contains(input)) {
             direction = input;
         } else {
             for (String word : input.split(" ")) {
                 if (vocabulary.containsKey(word)) {
                     direction = vocabulary.get(word);
                     break;
                 }
             }
         }

         if (direction == null) {
             System.out.println();
             System.out.println("You cannot go in that direction");
             continue;
         }

         if (direction.equals("Q")) {
             System.out.println();
             System.out.println(locations.get(0).getDescription());
             break;
         }

         if (exits.containsKey(direction)) {
             currentLocation = locations.get(exits.get(direction));
         } else {
             System.out.println();
             System.out.println("You cannot go in that direction");
         }
     }

     scanner.close();
 }

 public static void main(String[] args) {
     Main game = new Main();
     game.command();
 }
}
