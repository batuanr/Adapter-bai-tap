import com.codegym.CollectionUtils;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        CollectionUtilsAdapter collectionUtilsAdapter = new CollectionUtilsAdapter();
        Client client = new Client(collectionUtilsAdapter);
        Set<Integer> set = new HashSet<>();
        Random random =new Random();
        for (int i = 0; i < 10; i++) {
            int number = random.nextInt(90);
            set.add(number);
        }
        client.printMaxValue(set);

    }
}
