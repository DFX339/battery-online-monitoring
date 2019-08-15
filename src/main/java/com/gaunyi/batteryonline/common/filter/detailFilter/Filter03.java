package com.gaunyi.batteryonline.common.filter.detailFilter;

import com.gaunyi.batteryonline.common.filter.CheckFilter;
import com.gaunyi.batteryonline.common.filter.CheckFilterChain;
import com.gaunyi.batteryonline.common.filter.CheckParam;
import com.gaunyi.batteryonline.common.filter.CheckResult;

import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by S0111 on 2019/8/15.
 */
@Service
public class Filter03 implements CheckFilter {

    @Override
    public boolean isChecked(CheckParam checkParam) {
        return true;
    }

    @Override
    public List<CheckResult> runCheck(CheckParam checkparam, CheckFilterChain checkFilterChain) {
        List<CheckResult> results = new ArrayList<>();

        CheckResult res = new CheckResult();
        if(checkparam.getPlcNo().equals("03")){
            res.setMsg("plcno ok");
            res.setSuccess(true);
            res.setCode("03");
        }else{
            res.setMsg("plcno error");
            res.setSuccess(false);
            res.setCode("03");
        }
        results.add(res);

        return results;
    }


}
