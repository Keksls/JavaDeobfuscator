/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fkr
 */
public class fkr_0
implements fkt_0<etk_2> {
    public static final fkr_0[] a = new fkr_0[0];
    private final esy_2 c;

    public fkr_0(esy_2 esy_22) {
        this.c = esy_22;
    }

    @Override
    public fks_0 a() {
        return fks_0.b;
    }

    @Override
    public afe_1 b() {
        return new afe_1(this.c.h(), this.c.i());
    }

    public etk_2 c() {
        return this.c.n();
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || this.getClass() != object.getClass()) {
            return false;
        }
        fkr_0 fkr_02 = (fkr_0)object;
        return fku_0.a(this, fkr_02);
    }

    public int hashCode() {
        return fku_0.a(this);
    }

    @Override
    public long d() {
        return this.c.c();
    }

    public esy_2 e() {
        return this.c;
    }

    @Override
    public /* synthetic */ etl_2 f() {
        return this.c();
    }
}

