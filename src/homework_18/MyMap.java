package homework_18;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class MyMap<K, V> extends MyEntry {

    private LinkedHashMap<K, V> map;

    public MyMap(K k, V v) {
        super(k, v);
        this.map = new LinkedHashMap<K, V>();
    }

    public void addNewObject(K k, V v) {
        map.put(k, v);
    }


    public void removeByKey(K k) {
        map.remove(k);
    }

    public void removeByValue(V v) {
        Iterator<Map.Entry<K, V>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<K, V> next = iterator.next();
            if (next.getValue().equals(v)) {
                iterator.remove();
            }
        }
    }

    public void showKeys() {
        System.out.println("Map keys are:");
        Iterator<Map.Entry<K, V>> iterator2 = map.entrySet().iterator();
        while (iterator2.hasNext()) {
            Map.Entry<K, V> next = iterator2.next();
            System.out.println(next.getKey().toString());
        }
    }

    public void showValues() {
        System.out.println("Map values are:");
        Iterator<Map.Entry<K, V>> iterator2 = map.entrySet().iterator();
        while (iterator2.hasNext()) {
            Map.Entry<K, V> next = iterator2.next();
            System.out.println(next.getValue().toString());
        }
    }

    public void showMap(){
        System.out.println("Map is:");
        Iterator<Map.Entry<K,V>> iterator2=map.entrySet().iterator();
        while (iterator2.hasNext()){
            Map.Entry<K,V> next=iterator2.next();
            System.out.println(next.toString());
        }
    }
}
