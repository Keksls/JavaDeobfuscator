/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bpA
 */
public class bpa_1
implements bpz_1 {
    private static final bpa_1 a = new bpa_1();
    private bpz_1 b;

    private bpa_1() {
    }

    public static bpa_1 c() {
        return a;
    }

    private void e() {
        if (this.b == null) {
            this.b = new bpx_1();
        }
    }

    public boolean d() {
        this.e();
        return this.b != null;
    }

    @Override
    public String a() {
        this.e();
        return this.b.a();
    }

    @Override
    public void b() {
        if (this.b != null) {
            this.b.b();
        }
        this.b = null;
    }
}

