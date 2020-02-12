package com.skilldistillery.lotteries.common;

import java.util.ArrayList;
import java.util.*;

public class Hooper {

	private List<PingPongBall> balls = new ArrayList<>();

	// Adds the balls to the hopper
	public void addBalls(List<PingPongBall> addedBalls) {
		balls.addAll(addedBalls);

	}

	// shuffles the added balls
	public void shuffleBalls() {
		Collections.shuffle(balls);

	}

	// picks out the winner from the hopper
	public PingPongBall pickWinner() {
		return (balls.get(new Random().nextInt(balls.size())));

	}

}
