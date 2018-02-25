package com.coolweather.android.gson;

/**
 * Created by Administrator on 2018/2/24.
 * AQI实体类，存放city
 */

public class AQI {

    public AQICity city;

    public class AQICity{

        public String aqi;

        public String pm25;
    }
}
