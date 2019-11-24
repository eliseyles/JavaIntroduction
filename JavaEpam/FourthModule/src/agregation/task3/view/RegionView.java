package agregation.task3.view;

import agregation.task3.container.Region;

public class RegionView{
    public void printCapital(Region region) {
        new CityView().print(region.getMainDistrictCity());
    }
}
