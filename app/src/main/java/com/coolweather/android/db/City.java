package com.coolweather.android.db;

import org.litepal.crud.DataSupport;

/**
 * Created by user on 2017/2/23.
 */

public class City extends DataSupport {
    private int id;
    private String cityNamee;
    private int cityCode;
    private int provinceId;

    public int getCityCode() {
        return cityCode;
    }

    public void setCityCode(int cityCode) {
        this.cityCode = cityCode;
    }

    public String getCityNamee() {
        return cityNamee;
    }

    public void setCityNamee(String cityNamee) {
        this.cityNamee = cityNamee;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(int provinceId) {
        this.provinceId = provinceId;
    }
}
