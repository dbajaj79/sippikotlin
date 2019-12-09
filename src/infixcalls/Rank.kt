package infixcalls

enum class Rank
{
    TWO,THREE,FOUR,FIVE,
    SIX,SEVEN,EIGHT,NINE,
    TEN,JACK,QUEEN,KING,ACE;

    infix fun card(suit: Suit)=Card(suit,this)
}