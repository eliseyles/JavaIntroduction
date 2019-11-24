//3. Создать объект класса Государство, используя классы Область, Район, Город. Методы: вывести на консоль
//столицу, количество областей, площадь, областные центры.

package agregation.task3.logic;

import agregation.task3.container.State;

public class StateLogic {
    public double getAllSquare(State state) {
        if (state != null) {
            double square = 0;
            for (int i = 0; i < state.getRegionNumber(); i++) {
                square += state.getRegion(i).getSquare();
            }
            return square;
        }
        return 0;
    }
}
