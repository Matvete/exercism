import java.util.HashMap;
import java.util.Map;

public enum LogLevel
{
    TRACE(1),
    DEBUG(2),
    INFO(4),
    WARNING(5),
    ERROR(6),
    FATAL(42),
    UNKNOWN(0);

    private final int encodedLvl;

    LogLevel(int encodedLvl) {
        this.encodedLvl = encodedLvl;
    }


    public int getEncodedLvl() {
        return encodedLvl;
    }
}
