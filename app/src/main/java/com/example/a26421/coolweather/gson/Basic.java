package com.example.a26421.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by 26421 on 2018/5/28.
 */

public class Basic {

    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update {

        @SerializedName("loc")
        public String updateTime;

    }

}
