/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.codahale.metrics.Timer
 */
import com.codahale.metrics.Timer;

/*
 * Renamed from HI
 */
class hi_1 {
    private final hc_1 a;
    private final Timer b;

    hi_1(hc_1 hc_12, Timer timer) {
        this.a = hc_12;
        this.b = timer;
    }

    public long a() {
        return this.b.getCount();
    }

    public String b() {
        return String.format("%2.2f calls/%s", hc_1.a(this.a, this.b.getMeanRate()), hc_1.a(this.a));
    }

    public String c() {
        return String.format("%2.2f calls/%s", hc_1.b(this.a, this.b.getOneMinuteRate()), hc_1.b(this.a));
    }

    public String d() {
        return String.format("%2.2f calls/%s", hc_1.c(this.a, this.b.getFiveMinuteRate()), hc_1.c(this.a));
    }

    public String e() {
        return String.format("%2.2f calls/%s", hc_1.d(this.a, this.b.getFifteenMinuteRate()), hc_1.d(this.a));
    }

    public String f() {
        return String.format("%2.2f %s", hc_1.e(this.a, this.b.getSnapshot().getMin()), hc_1.e(this.a));
    }

    public String g() {
        return String.format("%2.2f %s", hc_1.f(this.a, this.b.getSnapshot().getMax()), hc_1.f(this.a));
    }

    public String h() {
        return String.format("%2.2f %s", hc_1.g(this.a, this.b.getSnapshot().getMean()), hc_1.g(this.a));
    }

    public String i() {
        return String.format("%2.2f %s", hc_1.h(this.a, this.b.getSnapshot().getStdDev()), hc_1.h(this.a));
    }

    public String j() {
        return String.format("%2.2f %s", hc_1.i(this.a, this.b.getSnapshot().getMedian()), hc_1.i(this.a));
    }

    public String k() {
        return String.format("<= %2.2f %s", hc_1.j(this.a, this.b.getSnapshot().get75thPercentile()), hc_1.j(this.a));
    }

    public String l() {
        return String.format("<= %2.2f %s", hc_1.k(this.a, this.b.getSnapshot().get95thPercentile()), hc_1.k(this.a));
    }

    public String m() {
        return String.format("<= %2.2f %s", hc_1.l(this.a, this.b.getSnapshot().get98thPercentile()), hc_1.l(this.a));
    }

    public String n() {
        return String.format("<= %2.2f %s", hc_1.m(this.a, this.b.getSnapshot().get99thPercentile()), hc_1.m(this.a));
    }

    public String o() {
        return String.format("<= %2.2f %s", hc_1.n(this.a, this.b.getSnapshot().get999thPercentile()), hc_1.n(this.a));
    }

    public String toString() {
        return "TimerReport{m_timer=" + this.b.getCount() + "}";
    }
}

