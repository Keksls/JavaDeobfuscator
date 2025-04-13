/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from bvZ
 */
class bvz_1
implements eol_2 {
    @NotNull
    private final eop_2 b = new eop_2(new abb_1(), adi_2.a());
    private long c;
    final /* synthetic */ bvx_2 a;

    bvz_1(bvx_2 bvx_22) {
        this.a = bvx_22;
        this.b.a(this);
    }

    @Override
    public void a(int n) {
        if (this.c == 0L) {
            return;
        }
        long l = this.c;
        this.c = 0L;
        blx_1 blx_12 = (blx_1)this.a.n(l);
        if (blx_12 == null) {
            String string = "[TURNS] Tour expir\u00e9 pour le fighter #" + l + ", or celui-ci est absent";
            bvx_2.Q().warn((Object)string);
            return;
        }
        this.a.f(blx_12);
    }

    @Override
    public eol_2 a() {
        return this;
    }

    public void b() {
        this.c = 0L;
        this.b.c();
    }

    public void a(long l, long l2) {
        this.c = l2;
        this.b.a(l, 65535);
    }

    public boolean c() {
        return this.b.a();
    }

    public String toString() {
        return "ClockHandler{m_innerHandler=" + this.b + ", m_currentFighterId=" + this.c + "}";
    }
}

