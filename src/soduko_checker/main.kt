fun main(){

}

/**
 * check whether a given board is a valid Soduko Game.
 *
 * @param board The matrix to check. Can be any type.
 * @return true if the input is a valid Soduko Game, otherwise false.
 */
fun isValidSoduko(board:List<List<Any>>):Boolean{


    if(board.isEmpty())
        return false
    else{
        if(board.all { row -> row.all { it == '-' } }) return false

        if(! board.all{it.size == board.size}) return false

        val colSeen = mutableSetOf<Char>()

        for (row in board.indices){
                val seen = mutableSetOf<Char>()
                board[row].forEach{ item ->
                    when{
                        item !is Char -> return false
                        item == ' ' -> return false
                        item.digitToIntOrNull() == null && item != '-' -> return false
                        item != '-' && (item.digitToIntOrNull() ?:false) !in 1..9 ->  return false
                        item in seen && item != '-' -> return false
                        item !in seen  && item != '-' ->seen.add(item)
                }
            }
            for(col in board.indices) {
                board[col].forEach { item ->
                    when {
                        item !is Char -> return false
                        item in board.map { it[row] } && item in colSeen && item != '-' -> return false
                        item in board.map { it[row] } && item !in colSeen && item != '-' -> colSeen.add(item)
                    }
                }
            }
        }

    }
    return true
}