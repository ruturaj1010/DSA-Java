import java.util.ArrayList;
import java.util.LinkedList;

public class HashMapImplement {
    static class HashMap<K,V> { // generic
        private class Node {
            K key;
            V value;

            Node(K key, V value){
                this.key = key;
                this.value = value;
            }
        }

        private int n;  // n
        private int N;
        private LinkedList<Node> buckets[];  //N

        @SuppressWarnings("unchecked")
        public HashMap(){
            this.N = 4;
            this.buckets = new LinkedList[4];

            for (int i = 0; i < 4; i++) {
                buckets[i] = new LinkedList<>();
            }
        }

        @SuppressWarnings("unchecked")
        private void rehash(){
            LinkedList<Node> oldbuck[] = buckets;
            buckets = new LinkedList[N*2];
            N = N*2;
            for (int i = 0; i < buckets.length; i++) {
                buckets[i] = new LinkedList<>();
            }

            for (int i = 0; i < oldbuck.length; i++) {
                LinkedList<Node> ll = oldbuck[i];
                for (int j = 0; j < ll.size(); j++) {
                    Node node = ll.get(j);
                    put(node.key, node.value);
                }
            }
        }

        private int hashFunction(K key) {
            int hc = key.hashCode();
            return Math.abs(hc) % N;
        }
        private int searchInLL(K key, int bi) {
            LinkedList<Node> ll = buckets[bi];

            int di = 0;
            for (int i = 0; i < ll.size(); i++) {
                Node node = ll.get(i);
                if (node.key == key) {
                    return di;
                }
                di++;
            }
            return -1;
        }
        public void put(K key, V value) {
            int bi = hashFunction(key);
            int di = searchInLL(key, bi);

            if (di != -1) {
                Node node = buckets[bi].get(di);
                node.value = value;
            } else {
                buckets[bi].add(new Node(key, value));
                n++;
            }

            double lamda = (double)n/N;

            if (lamda > 2.0) {
                rehash();
            }
        }

        public boolean containsKey(K key) {
            int bi = hashFunction(key);
            int di = searchInLL(key, bi);

            if (di != -1) {
                return true;
            } else {
                return false;
            }
        }

        public V remove(K key) {
            int bi = hashFunction(key);
            int di = searchInLL(key, bi);

            if (di != -1) {
                Node node = buckets[bi].remove(di);
                return node.value;
            } else {
                return null;
            }
        }

        public V get (K key){
            int bi = hashFunction(key);
            int di = searchInLL(key, bi);

            if (di != -1) {
                Node node = buckets[bi].get(di);
                return node.value;
            } else {
                return null;
            }
        }

        public ArrayList<K> keySet(){
            ArrayList<K> keys = new ArrayList<>();

            for (int i = 0; i < buckets.length; i++) {
                LinkedList<Node> ll = buckets[i];
                for (Node node : ll) {
                    keys.add(node.key);
                }
            }

            return keys;
        }

        public boolean isEmpty() {
            return n == 0;
        }
    }
    public static void main(String args[]) {
        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("India", 120);
        hm.put("Canada", 10);
        hm.put("Italy", 40);
        hm.put("Germany", 70);
        hm.put("US", 70);
        hm.put("US", 90);

        System.out.println(hm.containsKey("India"));
        System.out.println(hm.containsKey("China"));

        System.out.println(hm.remove("US"));
        System.out.println(hm.remove("US"));

        System.out.println(hm.get("India"));
        System.out.println(hm.get("US"));

        ArrayList<String> keys = hm.keySet();
        System.out.println(keys);

        System.out.println(hm.isEmpty());
    }
}
