package blackjack.model.participant

import blackjack.model.BlackjackDealerMoreCardScoreLimitConsumer
import blackjack.model.CardDeck

class BlackjackDealer(
    cardDeck: CardDeck,
    private val moreCardScoreLimitConsumer: BlackjackDealerMoreCardScoreLimitConsumer,
) : BlackjackParticipant(cardDeck) {

    override fun draw() {
        if (handDeck.isLessThanOrEqualTo(ADD_CARD_LIMIT_SCORE)) {
            moreCardScoreLimitConsumer.consumeDealerMoreCardScoreLimit(ADD_CARD_LIMIT_SCORE)
            add(cardDeck.draw())
        }
    }

    companion object {
        private const val ADD_CARD_LIMIT_SCORE: Int = 16
    }
}
