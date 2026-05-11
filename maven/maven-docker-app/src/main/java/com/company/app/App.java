package com.company.app;

public class App {
    public static void main(String[] args) {
        System.out.println("Maven Docker App is running inside container.");
    }

    public static String status() {
        return "CONTAINER_READY";
    }
}