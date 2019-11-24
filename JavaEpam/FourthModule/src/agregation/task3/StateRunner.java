package agregation.task3;

import agregation.task3.container.District;
import agregation.task3.container.Region;
import agregation.task3.container.State;

import java.util.ArrayList;

public class StateRunner {
    public static final String[] CITY = new String[]{"Moscow", "Minsk", "Virginia", "Tokyo", "Toronto", "Gomel", "Warsaw"};


    public static void main(String[] args) {
        State state = new State();
        for (int i = 0; i < CITY.length / 2; i++) {
            Region region = new Region();
            for (int j = 0; j < 2; j++) {
                region.add(new District(new ArrayList<>()));
            }
        }
    }
}
