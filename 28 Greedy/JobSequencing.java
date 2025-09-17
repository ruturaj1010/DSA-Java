import java.util.ArrayList;
import java.util.Collections;

public class JobSequencing {
    static class Job {
        int id;
        int deadline;
        int profit;

        Job(int id, int deadline, int profit) {
            this.id = id;
            this.deadline = deadline;
            this.profit = profit;
        }
    }

    public static void main(String args[]) {
        int jobsInfo[][] = { { 4, 20 }, { 1, 10 }, { 1, 40 }, { 1, 30 } };

        ArrayList<Job> jobs = new ArrayList<>();

        for (int i = 0; i < jobsInfo.length; i++) {
            jobs.add(new Job(i, jobsInfo[i][0], jobsInfo[i][1]));
        }
        Collections.sort(jobs, (obj1, obj2) -> obj2.profit - obj1.profit);

        ArrayList<Integer> seq = new ArrayList<>();
        int time = 0;
        int maxProfit = 0;
        for (int i = 0; i < jobs.size(); i++) {
            Job currJob = jobs.get(i);
            if (currJob.deadline > time) {
                seq.add(currJob.id);
                maxProfit += currJob.profit;
                time++;
            }
        }

        for (int i = 0; i < seq.size(); i++) {
            System.out.print(seq.get(i) + " ");
        }
        System.out.println("Max profit is " + maxProfit);
    }
}
