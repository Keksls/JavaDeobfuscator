/*
 * Decompiled with CFR 0.152.
 */
public class fkw
implements fkt_0<etn_2> {
    private final etn_2 a;
    private final int c;
    private final int d;

    public fkw(etn_2 etn_22, int n, int n2) {
        this.a = etn_22;
        this.c = n;
        this.d = n2;
    }

    @Override
    public fks_0 a() {
        return fks_0.a;
    }

    @Override
    public afe_1 b() {
        return new afe_1(this.c * 9, this.d * 9);
    }

    public etn_2 c() {
        return this.a;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || this.getClass() != object.getClass()) {
            return false;
        }
        fkw fkw2 = (fkw)object;
        return fku_0.a(this, fkw2);
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

    public short h() {
        return this.a.b();
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

