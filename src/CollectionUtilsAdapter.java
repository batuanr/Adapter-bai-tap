import com.codegym.CollectionUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class CollectionUtilsAdapter implements CollectionOperations{
    CollectionUtils collectionUtils = new CollectionUtils();
    @Override
    public int findMax(Set<Integer> numbers) {
        List<Integer> list = new ArrayList<>();
        list.addAll(numbers);
        return collectionUtils.findMax(list);
    }
}
