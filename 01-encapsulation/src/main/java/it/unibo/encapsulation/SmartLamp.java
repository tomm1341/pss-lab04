package it.unibo.encapsulation;

public class SmartLamp {

    private final boolean lampOn;
    private final int lightIntensity;
    private final String lightColor;
    private final String brand;
    private final String model;


    public SmartLamp(final boolean lampOn, final int lightIntensity, final String lightColor, final String brand, final String model){
        this.lampOn = lampOn;
        this.lightColor = lightColor;
        this.lightIntensity = lightIntensity;
        this.brand = brand;
        this.model = model;
    }

    public boolean getOnOff(){
        return lampOn;
    }

    public int getIntensity(){
        return lightIntensity;
    }

    public String getColor(){
        return lightColor;
    }

    public String getBrand(){
        return brand;
    }

    public String getModel(){
        return model;
    }

    public void lampInfo(){
        System.out.println("Smart Lamp On: " + this.lampOn);
        System.out.println("Smart Lamp Intensity: " + this.lightIntensity);
        System.out.println("Smart Lamp Color: " + this.lightColor);
        System.out.println("Smart Lamp Brand: " + this.brand);
        System.out.println("Smart Lamp Model: " + this.model);
    }

}
