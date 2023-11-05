import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

import Fabric.*;

public class Main {
    public static void main(String[] args) throws Exception {

        List<ItemGenerator> generators = new ArrayList<>();

        generators.add(new GoldGenerator());
        generators.add(new GemGenerator());
        generators.add(new SilverGenerator());
        generators.add(new RubyGenerator());
        generators.add(new DiamondGenerator());
        generators.add(new HealthGenerator());
        generators.add(new BombGenerator());


        Random random = ThreadLocalRandom.current();
        //генерирует не более трех Gold и не более одного Gem
        int countGold = 0;
        final int LIMIT = 154;
        int limitGold = 3;
        for (int i = 0; i < LIMIT; i++) {
            if (countGold < limitGold) {
                int index = random.nextInt(generators.size());
                generators.get(index).openReward();
                if (index == 0) {
                    countGold++;
                }
                if (index == 1 & generators.size() == 7){
                    generators.remove(index);
                }
            }

            if (countGold > limitGold) {
                int index = random.nextInt(generators.size());
                generators.get(index).openReward();
                if (index == 0 & generators.size() == 6){
                    generators.remove(index);
                }
            }

            if (countGold == limitGold) {
                generators.remove(0);
                countGold++;
            }

        }

    }
}