//3. Создать объект класса Государство, используя классы Область, Район, Город. Методы: вывести на консоль
//столицу, количество областей, площадь, областные центры.

package by.training.eliseyles.agregation.task3.view;

import by.training.eliseyles.agregation.task3.container.State;
import by.training.eliseyles.agregation.task3.entity.City;
import by.training.eliseyles.agregation.task3.logic.StateLogic;

public class StateView {
    public void printCity(City city) {
        new CityView().print(city);
        System.out.println();
    }

    public void printNumber(int number) {
        System.out.println(number);
    }

    public void printSquare(double square) {
        System.out.println(square);
    }

    public void printMainRegionCity(State state) {
        for (int i = 0; i < state.getRegionNumber(); i++) {
            System.out.println("region №" + i);
            new RegionView().printCapital(state.getRegion(i));
            System.out.println();
        }
    }

    public void print(State state) {
        for (int i = 0; i < state.getRegionNumber(); i++) {
            System.out.println("region №" + i);
            new RegionView().print(state.getRegion(i));
        }
    }
}
