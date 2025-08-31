import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class NActivities {
    public static void main(String[] args) {
        int Start[] = { 1, 3, 8, 0, 5, 5 };
        int end[]   = { 2, 4, 9, 6, 7, 9 };

        // Sorting if activities are unSorted
        int activities[][] = new int[Start.length][3];

        for (int i = 0; i < Start.length; i++) {
            activities[i][0] = i;
            activities[i][1] = Start[i];
            activities[i][2] = end[i];
        }

        // Sorting 2D array using lambda function
        Arrays.sort(activities, Comparator.comparingDouble(o -> o[2] ));
        for (int i = 0; i < activities.length; i++) {
            for (int j = 0; j < activities[0].length; j++) {
                System.out.print(activities[i][j] + " ");
            }
            System.out.println();
        }

        // end time basis sorted
        ArrayList<Integer> act = new ArrayList<>();
        int maxAct = 1;
        act.add(activities[0][0]);
        int lastEnd = activities[0][2];

        for (int i = 1; i < end.length; i++) {
            if (activities[i][1] >= lastEnd) {
                maxAct++;
                act.add(activities[i][0]);
                lastEnd = activities[i][2];
            }
        }

        System.out.println("Maxactivites we can perform are "+maxAct);
        for (int i = 0; i < act.size(); i++) {
            System.out.print("A"+act.get(i)+" ");
        }

    }
}