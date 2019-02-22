package com.design.state;

/**
 * 状态接口
 */
public interface State {

    void onPreparing();

    void onEnterState();
}
