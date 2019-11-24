package by.training.eliseyles.agregation.task3.view;

import by.training.eliseyles.agregation.task3.container.District;
import by.training.eliseyles.agregation.task3.entity.City;

public class DistrictView {
    public void printDistrict(District district) {
        for (int i = 0; i < district.getCitiesNumber(); i++) {
            new CityView().print(district.getCity(i));
            System.out.print(" ");
        }
        System.out.println();
    }
}
