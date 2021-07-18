fun main() {
    val lastSeen = 3400
    var totalTime = agoToText(lastSeen)

}

fun hours(timeHours: Int) = if (timeHours == 1) {
        ("$timeHours час")
    } else if (timeHours % 10 == 2 || timeHours % 10 == 3 || timeHours % 10 == 4) {
        ("$timeHours часа")
    } else {
        ("$timeHours часов")
    }

fun minutes(timeMinutes: Int)  = if (timeMinutes % 10 == 1) {
        ("$timeMinutes минуту")
    } else if (timeMinutes % 10 == 2 || timeMinutes % 10 == 3 || timeMinutes % 10 == 4) {
        ("$timeMinutes минуты")
    } else if (timeMinutes == 11) {
        ("$timeMinutes минут")
    } else {
        ("$timeMinutes минут")
    }
fun agoToText(lastSeen: Int) {
    var timeMinutes = lastSeen/60
    var timeHours = lastSeen/3_600

    return when(lastSeen) {
        in 0..60 -> println("Пользователь был(а) в сети только что")
        in 61..3600 -> println("Пользователь был(а) в сети ${minutes(timeMinutes)} назад")
        in 3601..86400 -> println("Пользователь был(а) в сети ${hours(timeHours)} назад")
        in 86401..172800 -> println("Пользователь был(а) в сети сегодня")
        in 172801..259200 -> println("Пользователь был(а) в сети вчера")
        else -> println("Пользователь был(а) в сети давно")
    }
}


