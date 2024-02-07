public class SmartLamp{}

 // Instance variables
 private String brand;
 private boolean isOn;
 private int brightnessLevel;

 // Constructors
 public SmartLamp() {
     this.brand = "Unknown";
     this.isOn = false;
     this.brightnessLevel = 0;
 }

 public SmartLamp(String brand, boolean isOn, int brightnessLevel) {
     this.brand = brand;
     this.isOn = isOn;
     this.brightnessLevel = brightnessLevel;
 }

 // Getters
 public String getBrand() {
     return brand;
 }

 public boolean isOn() {
     return isOn;
 }

 public int getBrightnessLevel() {
     return brightnessLevel;
 }

 // Setters
 public void setBrand(String brand) {
     this.brand = brand;
 }

 public void setOn(boolean isOn) {
     this.isOn = isOn;
 }

 public void setBrightnessLevel(int brightnessLevel) {
     this.brightnessLevel = brightnessLevel;
 }

 // toString() method
 @Override
 public String toString() {
     return "SmartLamp{" +
             "brand='" + brand + '\'' +
             ", isOn=" + isOn +
             ", brightnessLevel=" + brightnessLevel +
             '}';
 }

 }


}

