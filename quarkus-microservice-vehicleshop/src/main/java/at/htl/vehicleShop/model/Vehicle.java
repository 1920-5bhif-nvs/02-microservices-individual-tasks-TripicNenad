package at.htl.vehicleShop.model;

public abstract class Vehicle {

    private Long Id;

    private String manufacturer;
    private String modelName;

    //region Constructor
    public Vehicle() {
    }

    public Vehicle(Long id, String manufacturer, String modelName) {
        Id = id;
        this.manufacturer = manufacturer;
        this.modelName = modelName;
    }
    //endregion

    //region Getter and Setter
    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }
    //endregion
}
