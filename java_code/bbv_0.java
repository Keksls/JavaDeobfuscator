/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bbv
 */
public class bbv_0
extends alb_2 {
    private final bmv_1 m;
    private final short n;
    private final short o;

    public bbv_0(int n, int n2, int n3, int n4, long l, short s2, short s3) {
        super(n, n2, n3);
        this.m = (bmv_1)bmf_2.a().c(l);
        this.n = s2;
        this.o = s3;
        this.a(new byw_0(this));
        this.e(n4);
    }

    @Override
    public long o() {
        super.o();
        return -1L;
    }

    @Override
    protected void l() {
        Short s2;
        super.l();
        if (this.m != null && (s2 = Short.valueOf(this.m.gO())) != this.n) {
            a.error((Object)("Oublie de script LUA d\u00e9finissant une \u00e9volution pour le breedId=" + s2));
            this.m.a(this.n, this.o);
        }
    }

    public long r() {
        return this.m.a_();
    }

    public short s() {
        return this.n;
    }

    public short t() {
        return this.o;
    }

    public blx_1 u() {
        return this.m;
    }
}

