package ru.netology.service;

public class CashbackHackService {
    private final int boundary = 1000;

    public int remain(int amougnt) {
        return boundary - amount % boundary;
    }
}