package extensions

// file로 추가한 이유 : top level의 함수로 확장함수를 추가하기 위해

fun String?.getNotEmptyString(): String {
    var input = this
    while(input.isNullOrBlank()) {
        println("값을 입력해 주세요")
        input = readLine()
    }
    return input.trim()
}

fun String?.getNotEmptyInt(): Int {
    var input = this?.trim()
    while(input.isNullOrEmpty() || input.toIntOrNull() == null) {
        println("값을 입력해 주세요")
        input = readLine()
    }
    return input.toInt()
}