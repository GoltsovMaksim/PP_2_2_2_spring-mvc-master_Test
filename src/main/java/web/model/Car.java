package web.model;

import org.springframework.stereotype.Component;

@Component
public class Car {
    private int id;
    private String developer;
    private String model;
    private int yearOfModel;

    public Car() {
    }

    public Car(int count, String developer, String model, int yearOfModel) {
        this.id = count;
        this.developer = developer;
        this.model = model;
        this.yearOfModel = yearOfModel;
    }

    public int getId() {
        return id;
    }

    public String getDeveloper() {
        return developer;
    }

    public String getModel() {
        return model;
    }

    public int getYearOfModel() {
        return yearOfModel;
    }

}
