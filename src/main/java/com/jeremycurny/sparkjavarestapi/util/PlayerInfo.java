package com.jeremycurny.sparkjavarestapi.util;

public class PlayerInfo {

    public PlayerInfo(int health, int maxHealth, Point position)
    {
        Health = health;
        MaxHealth = maxHealth;
        Position = position;
    }

    public int Health;
    public int MaxHealth;
    public Point Position;

}
