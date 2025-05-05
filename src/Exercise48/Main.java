package Exercise48;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
 public static void main(String[] args) {
        Player player = new Player("Arthur", 100, 75);
        System.out.println(player);
        saveObject(player);


        player.setHitPoints(80);
        player.setWeapon("Axe");
        System.out.println(player);
        saveObject(player);

        loadObject(player);
        System.out.println("After loading: " + player);

        Monster monster = new Monster("Orc", 120, 90);
        System.out.println(monster);
        saveObject(monster);

        loadObject(monster);
        System.out.println("After loading: " + monster);
    }

    public static void saveObject(ISaveable objectToSave) {
        for (int i = 0; i < objectToSave.write().size(); i++) {
            System.out.println("Saving " + objectToSave.write().get(i) + " to storage device.");
        }
    }

    public static void loadObject(ISaveable objectToLoad) {
        List<String> values = readValues();
        objectToLoad.read(values);
    }

    public static List<String> readValues() {
        List<String> values = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;

        System.out.println("Enter object data (type 0 to finish):");
        while (!quit) {
            System.out.print("Enter a value: ");
            String input = scanner.nextLine();
            if (input.equals("0")) {
                quit = true;
            } else {
                values.add(input);
            }
        }
        return values;
    }
}
