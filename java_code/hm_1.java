/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.codahale.metrics.Timer
 *  com.google.gson.annotations.SerializedName
 */
import com.codahale.metrics.Timer;
import com.google.gson.annotations.SerializedName;

/*
 * Renamed from HM
 */
public class hm_1
extends hl_1 {
    @SerializedName(value="type")
    private static final String a = "timer";
    @SerializedName(value="count")
    private final long b;
    @SerializedName(value="mean_rate")
    private final double c;
    @SerializedName(value="m1_rate")
    private final double d;
    @SerializedName(value="m5_rate")
    private final double e;
    @SerializedName(value="m15_rate")
    private final double f;
    @SerializedName(value="min")
    private final double g;
    @SerializedName(value="max")
    private final double h;
    @SerializedName(value="mean")
    private final double i;
    @SerializedName(value="median")
    private final double j;
    @SerializedName(value="stddev")
    private final double k;
    @SerializedName(value="p75")
    private final double l;
    @SerializedName(value="p95")
    private final double m;
    @SerializedName(value="p98")
    private final double n;
    @SerializedName(value="p99")
    private final double o;
    @SerializedName(value="p999")
    private final double p;
    @SerializedName(value="rate_unit")
    private final String q;
    @SerializedName(value="duration_unit")
    private final String r;

    public hm_1(String string, hb_1 hb_12, Timer timer) {
        super(string);
        this.b = timer.getCount();
        this.c = hb_12.a(timer.getMeanRate());
        this.d = hb_12.a(timer.getOneMinuteRate());
        this.e = hb_12.a(timer.getFiveMinuteRate());
        this.f = hb_12.a(timer.getFifteenMinuteRate());
        this.g = hb_12.b(timer.getSnapshot().getMin());
        this.h = hb_12.b(timer.getSnapshot().getMax());
        this.i = hb_12.b(timer.getSnapshot().getMean());
        this.j = hb_12.b(timer.getSnapshot().getMedian());
        this.k = hb_12.b(timer.getSnapshot().getStdDev());
        this.l = hb_12.b(timer.getSnapshot().get75thPercentile());
        this.m = hb_12.b(timer.getSnapshot().get95thPercentile());
        this.n = hb_12.b(timer.getSnapshot().get98thPercentile());
        this.o = hb_12.b(timer.getSnapshot().get98thPercentile());
        this.p = hb_12.b(timer.getSnapshot().get999thPercentile());
        this.q = String.format("calls/%s", hb_12.a());
        this.r = String.format("%s", hb_12.b());
    }
}

