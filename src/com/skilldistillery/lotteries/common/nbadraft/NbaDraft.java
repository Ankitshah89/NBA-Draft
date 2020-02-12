package com.skilldistillery.lotteries.common.nbadraft;

import java.util.*;

import com.skilldistillery.lotteries.common.BallFactory;
import com.skilldistillery.lotteries.common.Hooper;
import com.skilldistillery.lotteries.common.PingPongBall;

public class NbaDraft {

	private BallFactory ballFactory = new BallFactory();
	private Hooper hooper = new Hooper();

	Map<String, Integer> teams = new HashMap<>();

	private void generateTeams(Map<String, Integer> teams) {

		teams.put("New York Knicks", 140);
		teams.put("Clevelend Cavaliers", 140);
		teams.put("Phoenix Suns", 140);
		teams.put("Chicago Bulls", 125);
		teams.put("Atlanta Hawks", 105);
		teams.put("Washington Wizards", 90);
		teams.put("New Orleans Pelicans", 75);
		teams.put("Memphis Grizzlies", 60);
		teams.put("Dallas Mavericks", 45);
		teams.put("Minnesota Timberwolves", 30);
		teams.put("LA Clippers", 20);
		teams.put("Charlotte Hornetts", 15);
		teams.put("Miami Heat", 10);
		teams.put("Sacramento Kings", 5);

	}

	// constructor
	public NbaDraft() {
		generateTeams(teams);
	}

	public void orderBalls() {
		hooper.addBalls(ballFactory.makePingPongBall(teams));
	}

	public PingPongBall pickWinner() {
		return hooper.pickWinner();
	}

	public void shuffle() {
		hooper.shuffleBalls();
	}

}
