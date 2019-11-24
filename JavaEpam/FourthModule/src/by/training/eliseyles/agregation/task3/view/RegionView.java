package by.training.eliseyles.agregation.task3.view;

import by.training.eliseyles.agregation.task3.container.Region;

public class RegionView{
    public void printCapital(Region region) {
        new CityView().print(region.getMainDistrictCity());
    }

    public void print(Region region) {
        for (int i = 0; i < region.getDistrictNumber(); i++) {
            System.out.print("district №" + i + " ");
            new DistrictView().printDistrict(region.getDistrict(i));
        }
    }
}
