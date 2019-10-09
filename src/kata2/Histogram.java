package kata2;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class Histogram implements Iterable<Integer> {
    private final Map<Integer,Integer> count= new TreeMap<>();
    public Histogram(int... values) {
        for (int i : values) {
            count.put(i,count.getOrDefault(i,0)+1);
        }
    }

    public Integer getCount(int value) {
        return count.get(value);
    }

    @Override
    public Iterator<Integer> iterator() {
        return count.keySet().iterator();
    }
    
    
}
