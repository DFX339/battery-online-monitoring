package com.gaunyi.batteryonline.common.filter;
import java.util.List;
/**
 * Created by S0111 on 2019/6/27.
 * 检查项接口
 */
public interface CheckFilter {

    /**
     * 是否被检查
     * @param checkParam
     * @return
     */
    public boolean isChecked(CheckParam checkParam);

    /**
     * 检查方法（不同的检查项会根据不同的实现类执行检查）
     * @param checkparam
     * @param checkFilterChain
     * @return
     */
    public List<CheckResult> runCheck(CheckParam checkparam,CheckFilterChain checkFilterChain);
}
