/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from blm
 */
public class blm_2
extends cbt_2 {
    private static final blm_2 a = new blm_2();
    private boolean b = true;

    private blm_2() {
        super(10, 5, "tutorialMessageDialog");
    }

    public static blm_2 a() {
        return a;
    }

    @Override
    public void b(long l) {
        this.a(l, wc_0.p().a());
    }

    public void a(long l, wu_0 wu_02) {
        ww_0 ww_02 = wu_02.g(wc_0.p().a());
        ww_0 ww_03 = ww_0.a(l);
        ww_03.f(ww_02);
        if (!ww_03.e()) {
            return;
        }
        super.b((int)ww_03.g());
        this.b = false;
    }

    @Override
    public void c() {
        this.b = true;
        super.c();
        this.g();
    }

    @Override
    protected void c(long l) {
        if (this.f() == l) {
            return;
        }
        super.c(l);
        if (!this.b && l >= 1L && l <= 5L) {
            cdw_0.n().c(600128L);
        }
        if (l == 0L) {
            if (!this.b) {
                cdw_0.n().c(600129L);
            }
            this.g();
        }
    }

    @Override
    protected String d() {
        long l = this.f();
        long l2 = l / 3600L;
        long l3 = (l %= 3600L) / 60L;
        long l4 = l %= 60L;
        return bae.h().a("durationFormat.yearMonthDayHourMinuteSecond.short", 0, 0, 0, l2, l3, l4);
    }

    private void g() {
    }
}

