package com.example.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Ice_Extinguish on 2018/3/10.
 */

public class Suggestion {
    @SerializedName("comf")
    public Comf comf;

    @SerializedName("cw")
    public CarWash carWash;

    @SerializedName("sport")
    public Sport sport;

    public class Comf{
        @SerializedName("txt")
        public String info;
    }
    public class CarWash{
        @SerializedName("txt")
        public String info;
    }
    public class Sport{
        @SerializedName("txt")
        public String info;
    }

}
