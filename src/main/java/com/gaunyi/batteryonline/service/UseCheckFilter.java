package com.gaunyi.batteryonline.service;

import com.gaunyi.batteryonline.common.filter.CheckFilter;
import com.gaunyi.batteryonline.common.filter.CheckParam;
import com.gaunyi.batteryonline.common.filter.CheckResult;

import java.util.List;

/**
 * Created by S0111 on 2019/8/15.
 */
public interface UseCheckFilter {

    public void  addFilter(CheckFilter filter);

    public List<CheckResult> run(CheckParam param);

}
