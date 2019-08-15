package com.gaunyi.batteryonline.common.filter;
import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;

/**
 * Created by S0111 on 2019/6/27.
 * 检查项 链信息，存储所有的检查项
 */
public class CheckFilterChain {

    //private CheckFilter checkFilter;

    private List<CheckFilter> filterChains = new ArrayList<CheckFilter>();

    //添加检查项到检查链
    public void addFilter(CheckFilter checkFilter){
        this.filterChains.add(checkFilter);
    }

    //得到检查链的长度
    public int getSize(){
        return filterChains.size();
    }

    //执行检查项方法
    public List<CheckResult> runChain(CheckParam checkParam){
        List<CheckResult> chainResult = new ArrayList<CheckResult>();

        for(CheckFilter filter: filterChains){
            if(filter.isChecked(checkParam)){
                List<CheckResult> result = filter.runCheck(checkParam, this);
                chainResult.addAll(result);
            }
        }

        return chainResult;
    }
}
