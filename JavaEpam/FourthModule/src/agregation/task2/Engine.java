//2. Создать объект класса Автомобиль, используя классы Колесо, Двигатель. Методы: ехать, заправляться,
//менять колесо, вывести на консоль марку автомобиля.

package agregation.task2;

import java.util.Objects;

public class Engine {
    private String engineModel;
    private String engineType;

    public Engine() {
        engineModel = "";
        engineType = "";
    }

    public Engine(String engineModel, String engineType) {
        this.engineModel = engineModel;
        this.engineType = engineType;
    }

    public String getEngineModel() {
        return engineModel;
    }

    public void setEngineModel(String engineModel) {
        this.engineModel = engineModel;
    }

    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Engine engine = (Engine) o;
        return Objects.equals(engineModel, engine.engineModel) &&
                Objects.equals(engineType, engine.engineType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(engineModel, engineType);
    }

    @Override
    public String toString() {
        return "Engine{" +
                "engineModel='" + engineModel + '\'' +
                ", engineType='" + engineType + '\'' +
                '}';
    }
}
