/*
 * Decompiled with CFR 0.152.
 */
import java.time.Duration;
import java.time.temporal.ChronoUnit;
import java.util.regex.Pattern;

/*
 * Renamed from Wo
 */
public interface wo_0 {
    public static final long a = Duration.of(1L, ChronoUnit.HOURS).toMillis();
    public static final Pattern b = Pattern.compile("[^%]*%[yYMdhms]([^%]+%[yYMdhms])*[^%]*");
    public static final Pattern c = Pattern.compile("%");
    public static final int d = 4;
    public static final int e = 12;
    public static final int f = 30;
    public static final int g = 7;
    public static final int h = 24;
    public static final int i = 60;
    public static final int j = 60;
    public static final int k = 3600;
    public static final int l = 86400;
    public static final int m = 1000;
    public static final long n = 60000L;
    public static final long o = 3600000L;
    public static final long p = 86400000L;
    public static final long q = 604800000L;
    public static final long r = 2592000000L;
    public static final long s = 31104000000L;
    public static final long t = 1000000L;
    public static final int u = 360;
    public static final short v = 1970;
    public static final int w = 1;
    public static final int x = 2;
    public static final int y = 3;
    public static final int z = 4;
}

