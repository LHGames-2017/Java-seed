package com.jeremycurny.sparkjavarestapi.util;

import java.util.List;
import java.util.Map;

public class GameInfo {

    public Player player;
    public String customSerializedMap;
    public List<Map<String, PlayerInfo>> otherPlayers;

    public GameInfo() {}

}
