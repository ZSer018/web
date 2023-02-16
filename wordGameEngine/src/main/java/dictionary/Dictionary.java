package dictionary;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Dictionary {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();

        String answer = scanner.nextLine();

        ArrayList<Integer> characters = new ArrayList<>();
           answer.chars().filter(characters::add).forEach(System.out::println);

        word.chars().forEach(value -> {
            System.out.println(value+"----");
            int x = characters.indexOf(value);

            if (x != -1){
               characters.remove(x);
            }
        });

        if (characters.size() > 0){
            System.out.println("Не хватило этих букв: "+ characters.toString());
        }
    }

}
