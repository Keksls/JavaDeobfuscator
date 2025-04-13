/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fkv
 */
public class fkv_0
implements fkt_0<etm_2> {
    private final etm_2 a;
    private final int c;
    private final int d;

    public fkv_0(etm_2 etm_22, int n, int n2) {
        this.a = etm_22;
        this.c = n;
        this.d = n2;
    }

    @Override
    public fks_0 a() {
        return fks_0.c;
    }

    @Override
    public afe_1 b() {
        return new afe_1(this.c, this.d);
    }

    public etm_2 c() {
        return this.a;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || this.getClass() != object.getClass()) {
            return false;
        }
        fkv_0 fkv_02 = (fkv_0)object;
        return fku_0.a(this, fkv_02);
    }

    public int hashCode() {
        return fku_0.a(this);
    }

    public int e() {
        return this.c;
    }

    public int g() {
        return this.d;
    }

    @Override
    public long d() {
        return 31 * this.c + this.d;
    }

    @Override
    public /* synthetic */ etl_2 f() {
        return this.c();
    }
}

