package com.jeremycurny.sparkjavarestapi.controller.impl;

import java.util.ArrayList;
import java.util.List;

import com.jeremycurny.sparkjavarestapi.controller.RestController;
import com.jeremycurny.sparkjavarestapi.util.JsonUtil;
import com.jeremycurny.sparkjavarestapi.util.Point;
import com.jeremycurny.sparkjavarestapi.util.Tile;

import spark.Request;
import spark.Response;

public class UserController extends RestController {

	@Override
	public Object bot(Request req, Response res) {
		return super.resJson(req, res, 200, "TO BE IMPLEMENTED");
	}

	public List<List<Tile>> deserializeMap(String serializedMap) {

        serializedMap = serializedMap.substring(1, serializedMap.length() - 1);
        String[] rows = serializedMap.split("\\[");
        String[] column = rows[1].split("\\{");
        List<List<Tile>> map = new ArrayList<>();

        for (int i = 0; i < rows.length - 1; i++) {
            column = rows[i + 1].split("\\{");
            for (int j = 0; j < column.length - 1; j++)
            {
                String[] infos = column[j + 1].split(",");
                map.get(j).add(
                        new Tile(
                                Integer.parseInt(infos[0]),
                                Integer.parseInt(infos[1]),
                                Integer.parseInt((infos[2].substring(0, infos[2].indexOf('}'))))));
            }
        }
        return map;


    }

}
