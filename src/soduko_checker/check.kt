package soduko_checker

import isValidSoduko

fun main(){

    test(
        name = "when board met all constraints return true",
        result = isValidSoduko(
            listOf(
            listOf('5', '3', '-', ),
            listOf('6', '-', '-' ),
            listOf('-', '9', '8' ),
            )
        ),
        correctResult = true
    )

    test(
        name = "when all cells are empty return false",
        result = isValidSoduko(
            listOf(
            listOf('-','-','-'),
            listOf('-','-','-'),
            listOf('-','-','-')
        )),
        correctResult = false
    )

    test(
        name = "when rows not equals columns return false",
        result = isValidSoduko(
            listOf(
                listOf('5', '3', '-'),
                listOf('6', '-', '-'),
                listOf('-', '9', '8'),
                listOf('-', '7', '5'),



            )),
        correctResult = false
    )

    test(
        name = "The board contains other types besides characters return false",
        result = isValidSoduko(
            listOf(
                listOf('5', '3', '-'),
                listOf('6', '-', '-'),
                listOf('-', true , '8'),



        )),
        correctResult = false
    )
    test(
        name = "when board contains numbers exceed range return false",
        result = isValidSoduko(
            listOf(
                listOf('5', '3', '-'),
                listOf('6', '-', '-'),
                listOf('-', 10 , '8'),


        )),
        correctResult = false
    )
    test(
        name = "when board contains special character instead of dash return false",
        result = isValidSoduko(
            listOf(
                listOf('5', '3', '-'),
                listOf('6', '/', '-'),
                listOf('-', '9', '8'),



        )),
        correctResult = false
    )
    test(
        name = "when board contains character instead of number return false",
        result = isValidSoduko(
            listOf(
                listOf('5', '3', '-'),
                listOf('6', '-', '-'),
                listOf('-', 'a', '8'),

        )),
        correctResult = false
    )
    test(
        name = "when board contains zero  return false",
        result = isValidSoduko(
            listOf(
                listOf('5', '3', '-'),
                listOf('6', '-', '-'),
                listOf('-', '0', '8'),


        )),
        correctResult = false
    )
    test(
        name = "when board contains negative number return false",
        result = isValidSoduko(
            listOf(
                listOf('5', '3', '-'),
                listOf('6', '-', '-'),
                listOf('-', -9 , '8'),


        )),
        correctResult = false
    )
    test(
        name = "when number repeated in the same row return false",
        result = isValidSoduko(
            listOf(
                listOf('5', '5', '-'),
                listOf('6', '-', '-'),
                listOf('-', '9' , '8'),


        )),
        correctResult = false
    )
    test(
        name = "when number repeated in the same column return false",
        result = isValidSoduko(
            listOf(
                listOf('5', '3', '-'),
                listOf('5', '-', '-'),
                listOf('-', '9' , '8'),



        )),
        correctResult = false
    )
    test(
        name = "when board contains space character return false",
        result = isValidSoduko(
            listOf(
                listOf('5', '3', '-'),
                listOf('6', ' ' , '-'),
                listOf('-', '9' , '8'),



        )),
        correctResult = false
    )
    test(
        name = "when board is empty return false",
        result = isValidSoduko(listOf()),
        correctResult = false
    )


}
fun test(name:String, result:Boolean, correctResult:Boolean){
    if(result == correctResult)
        println("Success - $name")
    else
        println("Falied  - $name")
}