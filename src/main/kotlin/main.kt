const val COMMISSION_PERCENT = 0.75
const val MIN_COMMISSION = 35_00

fun main() {

    val amount = 10_000_00
    val commission = (amount * COMMISSION_PERCENT / 100).toInt().coerceAtLeast(MIN_COMMISSION)

    println("Сумма перевода: $amount коп., сумма комиссии: $commission коп.")

}