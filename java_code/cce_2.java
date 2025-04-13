/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cce
 */
public final class cce_2
extends cbq_1 {
    private static final int a = 20;
    private int i;
    private final int j;
    private final int k;

    public cce_2() {
        this(5000, 20000);
    }

    public cce_2(int n, int n2) {
        this.j = n;
        this.k = n2;
    }

    @Override
    public void i() {
        super.i();
        this.c();
    }

    @Override
    public void a(int n) {
        super.a(n);
        this.i -= n;
        if (this.i >= 0) {
            return;
        }
        this.c();
        if (cce_2.d()) {
            this.l();
        } else {
            this.k();
        }
    }

    private void c() {
        this.i = Hw.b(this.j, this.k);
    }

    private static boolean d() {
        return false;
    }

    private void k() {
        cbt_1.a(this.e, this.b());
    }

    private void l() {
        ccc_2.a(this.e);
    }

    public String toString() {
        return "KatrepatThunderEffect{m_timeBeforeFlash=" + this.i + ", m_minTimeBetweenFlash=" + this.j + ", m_maxTimeBetweenFlash=" + this.k + "}";
    }
}

