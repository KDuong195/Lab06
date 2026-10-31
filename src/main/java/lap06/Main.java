package lap06;

public class Main {
	public static void main(String[] args) {
		CardSource s1 = new BiCardSource(new SingleCardSource(Card.get(Rank.ACE, Suit.CLUBS)),
				new SingleCardSource(Card.get(Rank.TWO, Suit.HEARTS)));
		while (!s1.isEmpty()) {
			System.out.println(s1.draw());
		}
	}

	/** Nguồn bài đơn giản chứa đúng một lá, chỉ dùng cho demo. */
	private static class SingleCardSource implements CardSource {
		private Card aCard;

		SingleCardSource(Card pCard) {
			aCard = pCard;
		}

		@Override
		public Card draw() {
			Card result = aCard;
			aCard = null;
			return result;
		}

		@Override
		public boolean isEmpty() {
			return aCard == null;
		}
	}
}
