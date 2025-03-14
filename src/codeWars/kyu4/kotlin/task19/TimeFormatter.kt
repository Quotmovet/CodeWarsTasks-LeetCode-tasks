package codeWars.kyu4.kotlin.task19

object TimeFormatter {

    fun formatDuration(seconds: Int): String {
        if (seconds <= 0) return "now"

        val sec = seconds % ONE_HOUR_IN_MIN
        val min = (seconds / ONE_HOUR_IN_MIN) % ONE_HOUR_IN_MIN
        val hour = (seconds / ONE_HOUR_IN_SEC) % ONE_DAY_IN_HOUR
        val day = (seconds / ONE_DAY_IN_SEC) % ONE_YEAR_IN_DAY
        val year = seconds / ONE_YEAR_IN_SEC

        val parts = mutableListOf<String>()

        fun addPart(value: Int, singular: String, plural: String) {
            if (value > 0) {
                parts.add("$value ${if (value == 1) singular else plural}")
            }
        }

        addPart(year, "year", "years")
        addPart(day, "day", "days")
        addPart(hour, "hour", "hours")
        addPart(min, "minute", "minutes")
        addPart(sec, "second", "seconds")

        return when (parts.size) {
            0 -> "now"
            1 -> parts[0]
            2 -> parts.joinToString(" and ")
            else -> parts.dropLast(1).joinToString(", ") + " and " + parts.last()
        }
    }

    private const val ONE_HOUR_IN_MIN = 60
    private const val ONE_DAY_IN_HOUR = 24
    private const val ONE_YEAR_IN_DAY = 365

    private const val ONE_HOUR_IN_SEC = 3_600
    private const val ONE_DAY_IN_SEC = 86_400
    private const val ONE_YEAR_IN_SEC = 31_536_000
}