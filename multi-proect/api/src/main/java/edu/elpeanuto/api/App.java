package edu.elpeanuto.api;

import edu.elpeanuto.core.Utils;

public class App {
    public static void main(String[] args) {
        if (Utils.isAllPositiveNumbers("12", "79")) {
            System.out.println("All numbers are positive.");
        } else {
            System.out.println("Not all numbers are positive.");
        }
    }
}
