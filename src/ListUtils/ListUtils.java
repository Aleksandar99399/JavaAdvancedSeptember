package ListUtils;

import java.util.List;

public class ListUtils {
    public static  <T extends Comparable<T>> T getMax(List<T> items) {
        if (items.size() == 0) {
            throw new IllegalArgumentException("max on empty list");

        }

        T currentMax = items.get(0);

        for (int i = 0; i < items.size(); i++) {
            if (currentMax.compareTo(items.get(i)) < 0) {
                currentMax = items.get(i);
            }

        }
        return currentMax;
    }

    public static <T extends Comparable<T>> T getMin(List<T> items) {
        if (items.size() == 0) {
            throw new IllegalArgumentException("max on empty list");

        }
        T min = items
                .stream()
                .reduce(items.get(0), (a, b) -> a.compareTo(b) > 0 ? b : a);

        return min;

    }
}
