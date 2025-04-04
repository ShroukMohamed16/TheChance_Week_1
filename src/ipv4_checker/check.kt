package ipv4_checker

fun main(){
    isValidIpv4("192.168.1.1")
    test(
        name = "when input is correct and  met all constraints return true",
        result = isValidIpv4("192.168.1.1"),
        correctResult = true
    )
    test(
        name = "when input is empty return false",
        result = isValidIpv4(""),
        correctResult = false
    )
    test(
        name = "when input is blank return false",
        result = isValidIpv4(" "),
        correctResult = false
    )
    test(
        name = "when input is not string return false",
        result = isValidIpv4(45248),
        correctResult = false
    )
    test(
        name = "when input contains less than three dots return false",
        result = isValidIpv4("192.168.1"),
        correctResult = false
    )
    test(
        name = "when input contains more than three dots return false",
        result = isValidIpv4("192.168.1.1.2"),
        correctResult = false
    )
    test(
        name = "when input contains empty segment return false",
        result = isValidIpv4("192.168.."),
        correctResult = false
    )
    test(
        name = "when input contains negative number return false",
        result = isValidIpv4("-1.168.4.5"),
        correctResult = false
    )
    test(
        name = "when input segment exceeds max return false",
        result = isValidIpv4("256.168.4.5"),
        correctResult = false
    )
    test(
        name = "when input contains less than three segments return false",
        result = isValidIpv4(".256.168.4"),
        correctResult = false
    )
    test(
        name = "when input contains characters return false",
        result = isValidIpv4("256.ipv.4.5"),
        correctResult = false
    )
    test(
        name = "when input contains leading zero return false",
        result = isValidIpv4("256.162.01.5"),
        correctResult = false
    )
    test(
        name = "when the input contains a special character instead of dot return false",
        result = isValidIpv4("256,162,1,5"),
        correctResult = false
    )
    test(
        name = "when the input ends with a space return false",
        result = isValidIpv4("256.162.1.5 "),
        correctResult = false
    )
    test(
        name = "when the input starts with a space return false",
        result = isValidIpv4(" 256.162.1.5"),
        correctResult = false
    )


}
fun test(name:String, result:Boolean, correctResult:Boolean){
    if(result == correctResult)
        println("Success - $name")
    else
        println("Falied  - $name")
}