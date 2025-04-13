/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.NotNull
 */
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from flm
 */
public final class flm_0
implements Comparable<flm_0> {
    protected static final Logger a = Logger.getLogger(flm_0.class);
    private final fll_0 c;
    private final long d;

    public flm_0(fll_0 fll_02) {
        this.c = fll_02;
        this.d = System.currentTimeMillis();
    }

    public flm_0(fll_0 fll_02, int n) {
        assert ((long)n <= fll_02.g()) : "Temps restant trop court";
        this.c = fll_02;
        this.d = System.currentTimeMillis() + (long)n - fll_02.g();
    }

    public final fll_0 a() {
        return this.c;
    }

    public final int b() {
        return this.c.a();
    }

    public final long c() {
        return this.d;
    }

    public final long d() {
        if (this.c.h()) {
            return Long.MAX_VALUE;
        }
        return this.d + this.c.g();
    }

    public final int e() {
        if (this.c.h()) {
            return -1;
        }
        long l = this.d() - System.currentTimeMillis();
        return l <= Integer.MAX_VALUE ? (int)l : -1;
    }

    public final int a(@NotNull flm_0 flm_02) {
        long l = this.d() - flm_02.d();
        if (l > 0L) {
            return 1;
        }
        if (l < 0L) {
            return -1;
        }
        return 0;
    }

    @Override
    public /* synthetic */ int compareTo(@NotNull Object object) {
        return this.a((flm_0)object);
    }
}

