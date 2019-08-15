package com.gaunyi.batteryonline.service.impl;

import com.gaunyi.batteryonline.common.filter.CheckFilter;
import com.gaunyi.batteryonline.common.filter.CheckParam;
import com.gaunyi.batteryonline.common.filter.CheckResult;
import com.gaunyi.batteryonline.common.filter.FilterManager;
import com.gaunyi.batteryonline.service.UseCheckFilter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

/**
 * Created by S0111 on 2019/8/15.
 */
@Service("useCheckFilter")
public class UseCheckFilterImpl implements UseCheckFilter {

    @Autowired
    private FilterManager filterManager;

    public void  addFilter(CheckFilter filter){
        filterManager.addFilter(filter);
    }

    public List<CheckResult> run(CheckParam param){
        return  filterManager.run(param);
    }

}
