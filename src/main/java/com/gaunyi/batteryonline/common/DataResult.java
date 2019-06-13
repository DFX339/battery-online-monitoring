package com.gaunyi.batteryonline.common;

import lombok.Data;
import java.util.Map;
import java.util.HashMap;

/**
 * Created by S0111 on 2019/6/13.
 */

public class DataResult extends BaseResult {

    private Map<String,Object> data=new HashMap<String,Object>();//返回的数据信息

    public Map<String, Object> getData() {
        return data;
    }

    public void setData(Map<String, Object> data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "DataResult{" +
                "data=" + data +
                '}';
    }
}
