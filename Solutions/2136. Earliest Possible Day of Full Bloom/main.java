import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class main {
    public static void main(String[] args) {

    }

    // TC: O(n * log(n)), n -> length of plantTime
    // SC: O(n), n -> length of plantTime
    // choosing the seed with the largest growth time
    class Seed {
        int plantTime;
        int growTime;

        public Seed(int plantTime, int growTime) {
            this.plantTime = plantTime;
            this.growTime = growTime;
        }
    }

    public int earliestFullBloom(int[] plantTime, int[] growTime) {
        List<Seed> plant = new ArrayList<>();
        for (int i = 0; i < plantTime.length; i++) {
            plant.add(new Seed(plantTime[i], growTime[i]));
        }

        // go for the one with max growtime
        Collections.sort(plant, (a, b) -> (b.growTime - a.growTime));

        int time = 0;
        int max = 0;
        // plant max grow time first and keep track of max time it can take
        for (int i = 0; i < plantTime.length; i++) {
            time += plant.get(i).plantTime;
            max = Math.max(max, time + plant.get(i).growTime);
        }

        return max;
    }
}