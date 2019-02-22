package com.design.visitor;

/**
 * visitor
 */
public class Application {

    public static void main(String[] args) {
        Boss boss = new Boss(new Manager(new Engineer(), new Engineer(), new Engineer()), new Manager(new Engineer(), new Engineer()), new Manager(new Engineer()));
        boss.beVisited(new BossVisitor());
        boss.beVisited(new ManagerVisitor());
        boss.beVisited(new EngineerVisitor());
    }
}
