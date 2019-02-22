package com.design.proxy;

/**
 * Proxy
 */
public class Application {

    public static void main(String[] args) {
        DiningRoomProxy proxy = new DiningRoomProxy(new DiningRoom());
        proxy.enter(new Customer("赵先森"));
        proxy.enter(new Customer("钱先森"));
        proxy.enter(new Customer("孙先森"));
        proxy.enter(new Customer("李先森"));
        proxy.enter(new Customer("周先森"));
        proxy.enter(new Customer("吴先森"));
        proxy.enter(new Customer("正先森"));
        proxy.enter(new Customer("王先森"));
        proxy.enter(new Customer("冯先森"));
        proxy.enter(new Customer("陈先森"));
        proxy.enter(new Customer("褚先森"));
        proxy.enter(new Customer("魏先森"));
    }
}
