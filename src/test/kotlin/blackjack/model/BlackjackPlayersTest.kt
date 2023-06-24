package blackjack.model

import io.kotest.core.spec.DisplayName
import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.collections.shouldHaveSize

@DisplayName("블랙잭 플레이어들")
class BlackjackPlayersTest : StringSpec({

    "블랙잭 플레이어들을 생성하면 두번씩 실행" {
        // given
        val cardDeck = CardDeck()
        // when
        val players = BlackjackPlayers(
            cardDeck,
            { _, _ -> },
            listOf(
                BlackjackPlayer(
                    PlayerName("name"),
                    { _ -> },
                    { _ -> true },
                )
            )
        )
        // then
        players.players.first().deck.cards shouldHaveSize 2
    }
})
