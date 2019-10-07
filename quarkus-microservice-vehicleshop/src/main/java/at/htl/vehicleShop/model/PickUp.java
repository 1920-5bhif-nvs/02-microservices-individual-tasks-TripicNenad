package at.htl.vehicleShop.model;

public class PickUp extends Vehicle {
    private int maxLoad;    //in Kilogramm
    private int maxTraction; //in NM

    //region Constructor
    public PickUp() {
    }

    public PickUp(Long id, String manufacturer, String modelName, int maxLoad, int maxTraction) {
        super(id, manufacturer, modelName);
        this.maxLoad = maxLoad;
        this.maxTraction = maxTraction;
    }
    //endregion

    //region Getter and Setter
    public int getMaxLoad() {
        return maxLoad;
    }

    public void setMaxLoad(int maxLoad) {
        this.maxLoad = maxLoad;
    }

    public int getMaxTraction() {
        return maxTraction;
    }

    public void setMaxTraction(int maxTraction) {
        this.maxTraction = maxTraction;
    }
    //endregion
}
