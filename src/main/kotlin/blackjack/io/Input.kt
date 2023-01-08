package blackjack.io

import blackjack.domain.player.User

class Input {
    fun getBet(player: User): Double {
        println("${player.name}의 배팅금액은?")
        return readln().toDouble()
    }

    fun getPlayers(): List<String> {
        println("게임에 참여할 사람의 이름을 입력하세요.(쉼표 기준으로 분리)")
        return readln().split(',')
    }

    fun moreDraw(player: User): Boolean {
        println("${player.name}은 한장의 카드를 더 받겠습니까?(예는 y, 아니오는 n)")
        return readln() == "y"
    }
}
