package web.model;

import org.springframework.stereotype.Component;

@Component
public class Car {
    private String developer;
    private String model;
    private int yearOfModel;

    public Car() {
    }

    public Car(String developer, String model, int yearOfModel) {
        this.developer = developer;
        this.model = model;
        this.yearOfModel = yearOfModel;
    }

    public String getDeveloper() {
        return developer;
    }

    public void setDeveloper(String developer) {
        this.developer = developer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYearOfModel() {
        return yearOfModel;
    }

    public void setYearOfModel(int yearOfModel) {
        this.yearOfModel = yearOfModel;
    }

}
