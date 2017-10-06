package com.jeremycurny.sparkjavarestapi.util;

public class Player {

    public Player(int health, int maxHealth, Point position, Point houseLocation, int score,
                  int carriedResources, int carryingCapacity)
    {
        Health = health;
        MaxHealth = maxHealth;
        Position = position;
        HouseLocation = houseLocation;
        Score = score;
        CarriedResources = carriedResources;
        CarryingCapacity = carryingCapacity;
    }

    public int Health;
    public int MaxHealth;
    public int CarriedResources;
    public int CarryingCapacity;
    public Point Position;
    public Point HouseLocation;
    public int Score;


}
