package com.example.weatherapp.Model;

public class Wind {
    private double speed;
    private double deg;

    public Wind() {
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public double getDeg() {
        return deg;
    }

    public void setDeg(int deg) {
        this.deg = deg;
    }

    // My own method :D YAY!
    public String getWindDirection(){
        String wind = "";
        if (deg <=23 || deg >=337){
            wind = "N";
        }
        else if (deg >=24 && deg <=68){
            wind = "NE";
        }
        else if (deg>=69 && deg <= 113){
            wind = "E";
        }
        else if (deg>=114 && deg <= 158){
            wind = "SE";
        }
        else if (deg>=159 && deg <= 203){
            wind = "S";
        }
        else if (deg>=204 && deg <= 248){
            wind = "SW";
        }
        else if (deg>=249 && deg <= 293){
            wind = "W";
        }
        else if (deg>=294 && deg <= 336){
            wind = "E";
        }

        return wind;
    }

}
