package ru.hello;

public class Main {

    public static void main(String[] args) {
        while (true) {
            System.out.println("Привет!");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}