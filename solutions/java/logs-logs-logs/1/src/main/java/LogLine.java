import java.util.Map;

public class LogLine {
    private String logLine;

    private static final Map<String,LogLevel> names = Map.of(
            "TRC",LogLevel.TRACE,
            "DBG",LogLevel.DEBUG,
            "INF",LogLevel.INFO,
            "WRN",LogLevel.WARNING,
            "ERR",LogLevel.ERROR,
            "FTL",LogLevel.FATAL
    );
    public LogLine(String logLine)
    {
        this.logLine = logLine;
    }

    public LogLevel getLogLevel()
    {
        String lvl = logLine.substring(1,logLine.indexOf(']'));
        return names.getOrDefault(lvl,LogLevel.UNKNOWN);
    }

    public String getOutputForShortLog()
    {
        return getLogLevel().getEncodedLvl() + ":" + logLine.substring(logLine.indexOf(' ') + 1);
    }
}
