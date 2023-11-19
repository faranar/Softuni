package VehicleCatalogue_5;

public class Catalogue {
    private String type;
    private String model;
    private String color;
    private int horsePower;

    public Catalogue(String type, String model, String color, int horsePower) {
        this.type = type;
        this.model = model;
        this.color = color;
        this.horsePower = horsePower;
        if(this.type.equals("car")){
            this.type = "Car";
        }
        if (this.type.equals("truck")){
            this.type = "Truck";
        }
    }

    public String getModel() {
        return model;
    }

    public void print(){
        System.out.println("Type: " + this.type);
        System.out.println("Model: " + this.model);
        System.out.println("Color: " + this.color);
        System.out.println("Horsepower: " + this.horsePower);

    }

}
