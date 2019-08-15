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
public class Filter01 implements CheckFilter {

    @Override
    public boolean isChecked(CheckParam checkParam) {
        return true;
    }

    @Override
    public List<CheckResult> runCheck(CheckParam checkparam, CheckFilterChain checkFilterChain) {
        List<CheckResult> results = new ArrayList<>();

        Param01 param = (Param01) checkparam;
        if(param.getPlcNo().equals("01")){
            CheckResult res = new CheckResult();
            res.setMsg("plcno ok");
            res.setSuccess(true);
            res.setCode("01");
            results.add(res);
        }else{
            CheckResult res = new CheckResult();
            res.setMsg("plcno error");
            res.setSuccess(false);
            res.setCode("01");
            results.add(res);
        }

        if(param.getName().equals("zs")){
            CheckResult res = new CheckResult();
            res.setMsg("name ok");
            res.setSuccess(true);
            res.setCode("01");
            results.add(res);
        }else{
            CheckResult res = new CheckResult();
            res.setMsg("name error");
            res.setSuccess(false);
            res.setCode("01");
            results.add(res);
        }

        return results;
    }


}
