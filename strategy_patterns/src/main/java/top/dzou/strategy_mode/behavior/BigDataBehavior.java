package top.dzou.strategy_mode.behavior;

import top.dzou.strategy_mode.ProgramBehavior;

/**
 * @author dingxiang
 * @date 19-8-3 下午12:01
 */
public class BigDataBehavior implements ProgramBehavior {
    @Override
    public void doCoding() {
        System.out.println("I am doing Big Data coding.");
    }
}
