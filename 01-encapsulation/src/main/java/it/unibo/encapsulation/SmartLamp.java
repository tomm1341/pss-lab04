package it.unibo.encapsulation;
import java.util.Scanner;

public class SmartLamp {

    private final boolean lampSwitch;
    private final int lightIntensity;
    private final String lightColor;
    private final String brand;
    private final String model;


    public SmartLamp(final boolean lampSwitch, final int lightIntensity, final String lightColor, final String brand, final String model){
        this.lampSwitch = lampSwitch;
        this.lightColor = lightColor;
        this.lightIntensity = lightIntensity;
        this.brand = brand;
        this.model = model;
    }

    public boolean switchOnOff(){
        boolean status = this.lampSwitch;
        if(status)
        status = false;
        else status = true;
        return status;
    }

    public int setLightIntensity(){
        int acceptableVal[] = {1, 2, 3};

        System.out.println("Insert light intensity value from 1 to 3: ");
        Scanner scanner = new Scanner(System.in);
        int intensity = scanner.nextInt();
        scanner.close();
        
        //Controllo validità input
        for(int i : acceptableVal){
            if(intensity == i){
                return intensity;
            }
        }

        System.out.println("Invalid input. Please enter a value from 1 to 3.");
        return -1;
    }

    public String setLightColor(){
        System.out.println("Insert light color (white / red / blue / green): ");
    }

    public boolean getOnOff(){
        return lampSwitch;
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
        System.out.println("Smart Lamp On: " + this.lampSwitch);
        System.out.println("Smart Lamp Intensity: " + this.lightIntensity);
        System.out.println("Smart Lamp Color: " + this.lightColor);
        System.out.println("Smart Lamp Brand: " + this.brand);
        System.out.println("Smart Lamp Model: " + this.model);
    }

}
