/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fad
 */
public class fad_0
implements ezv_0 {
    private ezy_0 a;
    private long b;

    fad_0() {
    }

    public fad_0(ezy_0 ezy_02) {
        this.a = ezy_02;
    }

    @Override
    public ezy_0 a() {
        return this.a;
    }

    public void a(long l) {
        this.b = l;
    }

    @Override
    public long b() {
        return this.b;
    }

    @Override
    public short c() {
        return this.f().a(this.b);
    }

    @Override
    public short d() {
        return this.f().a();
    }

    @Override
    public float e() {
        return this.f().a(this.c(), this.b);
    }

    @Override
    public void a(fae_0 fae_02) {
    }

    @Override
    public void b(fae_0 fae_02) {
    }

    @Override
    public boolean a(wy_2 wy_22) {
        wy_22.a = this.a.a();
        wy_22.b = this.b;
        return true;
    }

    @Override
    public boolean b(wy_2 wy_22) {
        this.a = ezz_0.a.a(wy_22.a);
        this.b = wy_22.b;
        return true;
    }

    @Override
    public oj_0 f() {
        if (this.a != null && this.a.a() == 2) {
            return of_0.a;
        }
        return OB.a;
    }

    @Override
    public String g() {
        return "xp(" + this.b + ")";
    }
}

