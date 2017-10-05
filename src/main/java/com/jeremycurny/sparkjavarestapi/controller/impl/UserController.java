package com.jeremycurny.sparkjavarestapi.controller.impl;

import java.util.List;

import com.jeremycurny.sparkjavarestapi.controller.RestController;
import com.jeremycurny.sparkjavarestapi.util.JsonUtil;

import spark.Request;
import spark.Response;

public class UserController extends RestController {

	@Override
	public Object bot(Request req, Response res) {
		return super.resJson(req, res, 200, "TO BE IMPLEMENTED");
	}

}
