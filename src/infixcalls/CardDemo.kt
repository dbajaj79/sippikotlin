package infixcalls
import infixcalls.Rank.KING
import infixcalls.Suit.CLUBS
import visibilitymodifier.kotlinmodifier.UnitConverter

fun main() {
    val card = Card(Suit.CLUBS,Rank.ACE)
    println(card.rank)
    println(card.suit)
    val card1 = Rank.KING.card(Suit.CLUBS)
    println(card1.rank)
    println(card1.suit)

    val card3 = Rank.KING card Suit.CLUBS
    println(card3.rank)
    println(card3.suit)
    val card4 = KING card CLUBS
    println(card4.rank)
    println(card4.suit)

}