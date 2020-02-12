package com.skilldistillery.lotteries.common.nbadraft;

public class NbaDraftSimulator {

	private NbaDraft nba = new NbaDraft();

	public static void main(String[] args) {
		NbaDraftSimulator app = new NbaDraftSimulator();
		app.run();
	}

	private void run() {

		nba.orderBalls();
		nba.shuffle();
		System.out.println(nba.pickWinner());

	}

}
