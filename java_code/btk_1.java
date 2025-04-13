/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;

/*
 * Renamed from bTk
 */
abstract class btk_1 {
    protected int a;
    protected btj_1 b;

    protected btk_1(int n, btj_1 btj_12) {
        this.a = n;
        this.b = btj_12;
    }

    private int c() {
        return this.a;
    }

    private void a(int n) {
        this.a = n;
    }

    void a(btj_1 btj_12) {
        this.b = btj_12;
    }

    public abstract List<bss_0<?, ?>> a();

    public abstract boolean b();

    public void d() {
        this.b = null;
    }
}

