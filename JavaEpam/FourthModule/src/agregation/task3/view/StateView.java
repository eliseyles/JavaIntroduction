//3. Создать объект класса Государство, используя классы Область, Район, Город. Методы: вывести на консоль
//столицу, количество областей, площадь, областные центры.

package agregation.task3.view;

import agregation.task3.container.State;
import agregation.task3.logic.StateLogic;

public class StateView {
    public void printCapital(State state) {
        new CityView().print(state.getCapital());
    }

    public void printRegionNumber(State state) {
        System.out.println(state.getRegionNumber());
    }

    public void printSquare(State state) {
        System.out.println(new StateLogic().getAllSquare(state));
    }

    public void printMainRegionCity(State state) {
        for (int i = 0; i < state.getRegionNumber(); i++) {
            new RegionView().printCapital(state.getRegion(i));
        }
    }
}
