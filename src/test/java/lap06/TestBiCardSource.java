package lap06;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

import org.junit.jupiter.api.Test;

public class TestBiCardSource {

	// Stub: nguồn bài giả, hành vi do test kiểm soát
	private static class StubCardSource implements CardSource {
		private final Deque<Card> aCards = new ArrayDeque<>();

		StubCardSource(Card... pCards) {
			aCards.addAll(Arrays.asList(pCards));
		}

		@Override
		public Card draw() {
			return aCards.removeFirst(); // ném lỗi nếu rỗng
		}

		@Override
		public boolean isEmpty() {
			return aCards.isEmpty();
		}
	}

	private static final Card CARD_A = Card.get(Rank.ACE, Suit.CLUBS);
	private static final Card CARD_B = Card.get(Rank.TWO, Suit.HEARTS);

	@Test
	void draw_source1NotEmpty_drawsFromSource1() {
		CardSource s1 = new StubCardSource(CARD_A);
		CardSource s2 = new StubCardSource(CARD_B);
		BiCardSource bi = new BiCardSource(s1, s2);
		assertSame(CARD_A, bi.draw());
		assertFalse(s2.isEmpty());
	}

	@Test
	void draw_source1Empty_drawsFromSource2() {
		CardSource s1 = new StubCardSource();
		CardSource s2 = new StubCardSource(CARD_B);
		BiCardSource bi = new BiCardSource(s1, s2);
		assertSame(CARD_B, bi.draw());
	}

	@Test
	void isEmpty_source1NotEmpty_returnsFalse() {
		BiCardSource bi = new BiCardSource(new StubCardSource(CARD_A), new StubCardSource());
		assertFalse(bi.isEmpty());
	}

	@Test
	void isEmpty_source1EmptySource2NotEmpty_returnsFalse() {
		BiCardSource bi = new BiCardSource(new StubCardSource(), new StubCardSource(CARD_B));
		assertFalse(bi.isEmpty());
	}

	@Test
	void isEmpty_bothEmpty_returnsTrue() {
		BiCardSource bi = new BiCardSource(new StubCardSource(), new StubCardSource());
		assertTrue(bi.isEmpty());
	}
}
