package ipv4_checker

fun main(){

}
/**
 * check whether a given input is a valid ipv4 address.
 *
 * @param input The value to check. Can be any type.
 * @return true if the input is a valid IPv4 address, otherwise false.
 */
fun isValidIpv4(input:Any):Boolean{
    if (input is String){
        val parts = input.split('.')

        if (input.isEmpty() || input.isBlank() )
            return false
        if (parts.size != 4)
            return false
        for (segment in parts) {
            when{
                segment.isEmpty() || segment.isBlank() -> return false
                segment.length > 1 && segment.startsWith("0") -> return false
                segment.toIntOrNull() == null -> return false
                segment.toIntOrNull() !in 0..255 -> return false
            }
        }
        return true

    }
    else{

        return false
    }
}