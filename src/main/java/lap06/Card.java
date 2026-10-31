package lap06;

/**
 * Một lá bài gồm hạng (Rank) và chất (Suit).
 */
public final class Card {

	private final Rank aRank;
	private final Suit aSuit;

	private Card(Rank pRank, Suit pSuit) {
		aRank = pRank;
		aSuit = pSuit;
	}

	public static Card get(Rank pRank, Suit pSuit) {
		return new Card(pRank, pSuit);
	}

	public Rank getRank() {
		return aRank;
	}

	public Suit getSuit() {
		return aSuit;
	}

	@Override
	public String toString() {
		return aRank + " of " + aSuit;
	}
}
