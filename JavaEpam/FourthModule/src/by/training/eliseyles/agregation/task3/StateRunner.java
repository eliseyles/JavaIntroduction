//3. Создать объект класса Государство, используя классы Область, Район, Город. Методы: вывести на консоль
//столицу, количество областей, площадь, областные центры.

package by.training.eliseyles.agregation.task3;

import by.training.eliseyles.agregation.task3.container.District;
import by.training.eliseyles.agregation.task3.container.Region;
import by.training.eliseyles.agregation.task3.container.State;
import by.training.eliseyles.agregation.task3.entity.City;
import by.training.eliseyles.agregation.task3.view.StateView;

import java.util.Random;

public class StateRunner {
    public static final String[] CITY = new String[]{"Moscow", "Minsk", "Virginia", "Tokyo", "Toronto", "Gomel", "Warsaw",
            "Ozark", "Phenix City", "Prichard", "Scottsboro", "Selma", "Sheffield", "Sylacauga", "Talladega", "Anniston"};
    public static final int REGION_NUMBER = 4;
    public static final int DISTRRIC_NUMBER = 2;
    public static final int CITY_NUMBER = 2;


    public static void main(String[] args) {
        State state = new State();
        int cityIndex = 0;

        for (int i = 0; i < REGION_NUMBER; i++) {
            Region region = new Region();
            for (int j = 0; j < DISTRRIC_NUMBER; j++) {
                District district = new District();
                for (int k = 0; k < CITY_NUMBER; k++) {
                    district.add(new City(CITY[cityIndex]));
                    cityIndex++;
                }
                region.add(district);
            }
            region.setSquare(new Random().nextDouble() * 100);
            region.setMainDistrictCity(new City(CITY[cityIndex - 1]));
            state.add(region);
        }

        state.setCapital(new City(CITY[0]));

        new StateView().print(state);
        new StateView().printCapital(state);
        new StateView().printRegionNumber(state);
        new StateView().printSquare(state);
        new StateView().printMainRegionCity(state);
    }
}
