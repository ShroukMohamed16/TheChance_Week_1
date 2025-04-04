package ipv4_checker

fun main(){

}
/**
 * @param input
 * @return input
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
                segment.isEmpty() -> return false
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