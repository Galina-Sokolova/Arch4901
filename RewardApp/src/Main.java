import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

import Fabric.*;

public class Main {
    public static void main(String[] args) throws Exception {
//        ItemGenerator f1 = new GoldGenerator();
//        f1.openReward();

        List<ItemGenerator> generators = new ArrayList<>();

        generators.add(new GoldGenerator());
        generators.add(new GemGenerator());
        generators.add(new SilverGenerator());
        generators.add(new RubyGenerator());
        generators.add(new DiamondGenerator());

        Random random = ThreadLocalRandom.current();
        int countGem = 0;
        final int LIMIT = 10;
        int limitGem = LIMIT * 20 / 100;
        for (int i = 0; i < LIMIT; i++) {
            if (countGem < limitGem) {
                int index = random.nextInt(5);
                if (index == 1) {
                    countGem++;
                }
                generators.get(index).openReward();
            }

            if (countGem > limitGem) {
                int index = random.nextInt(4);
                generators.get(index).openReward();
            }

            if (countGem == limitGem) {
                generators.remove(1);
                countGem++;
            }

        }

    }
}