package at.htl.vehicleShop.model;

public class Roadster extends Vehicle {
    private int horsepower;
    private int top_speed;
    private int weight; //in kg

    //region Constructor
    public Roadster() {
    }

    public Roadster(Long id, String manufacturer, String modelName, int horsepower, int top_speed, int weight) {
        super(id, manufacturer, modelName);
        this.horsepower = horsepower;
        this.top_speed = top_speed;
        this.weight = weight;
    }
    //endregion

    //region Getter and Setter
    public int getHorsepower() {
        return horsepower;
    }

    public void setHorsepower(int horsepower) {
        this.horsepower = horsepower;
    }

    public int getTop_speed() {
        return top_speed;
    }

    public void setTop_speed(int top_speed) {
        this.top_speed = top_speed;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
    //endregion
}
