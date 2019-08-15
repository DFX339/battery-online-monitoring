package com.gaunyi.batteryonline.common.filter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * Created by S0111 on 2019/8/15.
 */
@Service
public class FilterManager {



    /**
     * @author nongzhenqin
     * @version 1.0
     * @ClassName NoticeFilterManager
     * @description 检查项管理器-调用入口
     * @date 2018/10/8 10:58
     */


        @Autowired
        private ApplicationContext applicationContext;
        /**
         * 检查项链
         */
        private static final ThreadLocal<CheckFilterChain> CHAIN_THREAD_LOCAL = new ThreadLocal<>();

        /**
         * 功能描述：执行检查项
         *
         * @param CheckParam 执行检查项参数对象
         * @return java.util.List<com.imodule.batch.facade.impl.checkcode.NoticeFilterResult>
         * @author nongzhenqin
         * @date 2018/10/24 16:27
         */
        public List<CheckResult> run(CheckParam filterParam) {
            // 第一次获取检查链时为null
            CheckFilterChain chain = CHAIN_THREAD_LOCAL.get();
            // 同步添加检查链
            if(chain == null || chain.getSize() == 0){
                // 同步添加检查项实例
                synchronized (CHAIN_THREAD_LOCAL){
                    // 再次判断，防止线程同时进入第一层的检查链空判断而进行两次添加
                    if(chain == null || chain.getSize() == 0){
                        CHAIN_THREAD_LOCAL.set(new CheckFilterChain());
                        // 获取检查项bean
                        Map<String, CheckFilter> filterMap = applicationContext.getBeansOfType(CheckFilter.class);
                        if(filterMap.size() > 0){
                            for(Map.Entry<String, CheckFilter> filter : filterMap.entrySet()){
                                this.addFilter(filter.getValue());
                            }
                        }
                    }
                }
            }

            // 添加好检查项后再次从本地对象中获取
            chain = CHAIN_THREAD_LOCAL.get();
            List<CheckResult> resultList = chain.runChain(filterParam);
            return resultList;
        }

        /**
         * 功能描述：添加检查项
         *
         * @param filter
         * @return void
         * @author nongzhenqin
         * @date 2018/10/8 11:00
         */
        public void addFilter(CheckFilter filter){
            CheckFilterChain chain = CHAIN_THREAD_LOCAL.get();
            chain.addFilter(filter);
        }


}
