package ru.netology.service;

public class Main {
    public static void main(String[] args) {
        CashbackHackService service = new CashbackHackService();
        {
            System.out.println("It should return 0 for 1000");
            int result = service.remain(1000);
            System.out.println(0 == result);
        }
        {
            System.out.println("It should return 10 for 2000");
            int result = service.remain(2000);
            System.out.println(10 == result);
        }
    }
}