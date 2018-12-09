package com.plumre.ideaStudy;

import java.util.Date;

public class Abc {

    public static final String NAME = "zhangsan";
    private String name = "aposaji";
    private String pathname = "/Users/plumre/IdeaProjects/algorithms/src/main/java/com/plumre/chapter0/Flips.java";
    private String refname = "com.plumre.chapter0.Flips";
    public static final int AGE = 18;

    private String nname;
    /**
     * aage
     */
    private String aage;
    private String sName;



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPathname() {
        return pathname;
    }

    public void setPathname(String pathname) {
        this.pathname = pathname;
    }

    public String getRefname() {
        return refname;
    }

    public void setRefname(String refname) {
        this.refname = refname;
    }



    public void setsName(String sName) {
        this.sName = sName;
    }

    public static void main(String[] args) {

        defineData();
        loadDataFromDB();
        getFinals();

        new User(NAME);
        for (int i = 0; i < 100; i++) {
            System.out.println(new Date());

        }
    }

    private static void getFinals() {
        new Abc().getABC();
        new Abc().getABC();
    }

    private static void loadDataFromDB() {
        new Abc().getABC();
        new Abc().getABC();
    }

    private static void defineData() {
        new Abc().getABC();
        new Abc().getABC();
    }

    public User getUser() {
        User user = new User("iui");
        return user;
    }

    private void getABC() {}
}
