import java.util.Arrays;

public class BowlingGameTest {
	private static final int ONLY_ONE_ROLL = 1;
	private static final int TWO_ROLLS = 2;

	private int score;
	
	public static void main(String[] args) {
		if_there_was(ONLY_ONE_ROLL).and_it_was_a(1).then_your_score_should_be(1);
		if_there_was(ONLY_ONE_ROLL).and_it_was_a(2).then_your_score_should_be(2);
		if_there_was(ONLY_ONE_ROLL).and_it_was_a(5).then_your_score_should_be(5);
		if_there_was(ONLY_ONE_ROLL).and_it_was_a(10).then_your_score_should_be(10);
		if_there_were(TWO_ROLLS).and_they_were(1, 1).then_your_score_should_be(2);
	}

	public BowlingGameTest(int numberOfRolls) {
		System.out.print("If there was a game with " + numberOfRolls + " rolls");
	}

	public BowlingGameTest and_it_was_a(int singleRollScore) {
		System.out.print(" and it was a " + singleRollScore);
		this.score = singleRollScore;
		return this;
	}
	
	public BowlingGameTest and_they_were(int... rolls) {
		System.out.print(" and they were " + Arrays.toString(rolls));
		return this;
	}

	public void then_your_score_should_be(int expectedScore) {
		if (score == expectedScore) {
			System.out.println(": passes");
		} else {
			System.out.println(": IS BROKEN!");
		}

	}

	private static BowlingGameTest if_there_was(int numberOfRolls) {
		return new BowlingGameTest(numberOfRolls);
	}
	private static BowlingGameTest if_there_were(int numberOfRolls) {
		return new BowlingGameTest(numberOfRolls);
	}
}
