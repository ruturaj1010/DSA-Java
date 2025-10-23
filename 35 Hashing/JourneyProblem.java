import java.util.HashMap;

public class JourneyProblem {

    public static String getStart(HashMap<String, String> map) {

        HashMap<String, String> revMap = new HashMap<>();
        for (String from : map.keySet()) {
            revMap.put(map.get(from), from);
        }

        for (String from : map.keySet()) {
            if (!revMap.containsKey(from)) {
                return from;
            }
        }

        return null;
    }
    public static void main(String[] args) {
        HashMap<String, String> tickets = new HashMap<>();
        tickets.put("Chennai", "Bengluru");
        tickets.put("Mumbai", "Delhi");
        tickets.put("Goa","Chennai");
        tickets.put("Delhi", "Goa");

        String st = getStart(tickets);

        System.out.print(st);
        for (String key : tickets.keySet()) {
            System.out.print(" => " + tickets.get(st));
            st = tickets.get(st);
        }
    }
}
