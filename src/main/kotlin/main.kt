val USER_NAME = "Gosha"
val visitingTimeSec = 86400
val visitingTimeMin: Int = visitingTimeSec/60
val visitingTimeHour: Int = visitingTimeMin/60

fun main() {

    println(USER_NAME)
    println(agoToText())

}

private fun agoToText() = when (visitingTimeSec) {
    in 0..60 -> "был(а) в сети только что"
    in 61..3600 -> "был(а) в сети $visitingTimeMin" + endOfMinute()   //"x минут назад"
    in 3601..86399 -> "был(а) в сети $visitingTimeHour" + endOfHour()  //"x часов назад"
    in 86400..172799 -> "был(а) в сети сегодня"
    in 172800..259199 -> "был(а) в сети вчера"
    else -> "был(а) в сети давно"
}


private fun endOfMinute() = when (visitingTimeMin) {
    1, 21, 31, 41, 51, 61 -> " минуту назад"
    in 5..20 -> " минут назад"
    in 25..30 -> " минут назад"
    in 35..40 -> " минут назад"
    in 45..50 -> " минут назад"
    in 55..60 -> " минут назад"
    2, 3, 4, 22, 23, 24, 32, 33, 34, 42, 43, 44, 52, 53, 54 -> " минуты назад"
    else -> endOfHour()


}

private fun endOfHour() = when (visitingTimeHour) {
        1, 21 -> " час назад"
        2, 3, 4, 22, 23 -> " часа назад"
        else -> " часов назад"

    }

