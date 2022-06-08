fun main() {
    val commission = 0.0075
    val minCommission = 3500
    val amount = 700000
    val result = if ((amount * commission) > minCommission) amount * commission else minCommission
    println("commission is $result")
}