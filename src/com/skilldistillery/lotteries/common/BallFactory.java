package com.skilldistillery.lotteries.common;

import java.util.ArrayList;
import java.util.List;
import java.util.*;

public class BallFactory {

	List<PingPongBall> orderedBalls = new ArrayList<>();

	// adds the list of pingPong balls from the list below to create a Map with a
	// key and value.
	public List<PingPongBall> makePingPongBall(Map<String, Integer> balls) {
		for (String key : balls.keySet()) {
			orderedBalls.addAll(makePingPongBall(key, balls.get(key)));
		}

		return orderedBalls;

	}

	// Adds the ordered amount of pingPong balls to the list. Here the type of
	// pinPong balls is given by label.
	public List<PingPongBall> makePingPongBall(String label, int amount) {
		for (int i = 0; i < amount; i++) {
			orderedBalls.add(new PingPongBall(label));
		}

		return orderedBalls;

	}
}
