/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fyF
 */
public class fyf_0
implements adv_1 {
    public static final int a = 300;
    protected static final fyf_0 b = new fyf_0();
    private int c;
    private int d;
    private int e = 300;
    private fvE f;
    private long g = this.hashCode();
    private int h;

    private fyf_0() {
        adi_2.a().start();
    }

    public static fyf_0 a() {
        return b;
    }

    public void a(int n, int n2) {
        this.c = n;
        this.d = n2;
    }

    public int c() {
        return this.c;
    }

    public int d() {
        return this.d;
    }

    @Override
    public long a_() {
        return this.g;
    }

    @Override
    public void a(long l) {
        this.g = l;
    }

    public int e() {
        return this.e;
    }

    public void a(int n) {
        this.e = n;
    }

    public void a(fvE fvE2, fck_2 fck_22) {
        adi_2.a().a(this);
        if (this.f == fvE2 && this.h == fck_22.x()) {
            this.d(fvE2, fck_2.a(fck_22));
            this.c(fvE2, fck_2.a(fck_22));
            this.f = null;
        } else {
            this.f = fvE2;
            this.h = fck_22.x();
        }
    }

    public void b(fvE fvE2, fck_2 fck_22) {
        if (this.f == fvE2) {
            adi_2.a().a(this);
            adi_2.a().a(this, this.e, fvE2.hashCode(), 1L);
            this.d(fvE2, fck_2.a(fck_22));
            return;
        }
        this.f = null;
        this.h = 0;
    }

    @Override
    public boolean a(adt_1 adt_12) {
        if (adt_12 instanceof adh_2) {
            this.h = 0;
            this.f = null;
            return false;
        }
        return true;
    }

    public void c(fvE fvE2, fck_2 fck_22) {
        fck_22.a(frd_0.D);
        fck_22.f(2);
        fck_22.b(true);
        fvE2.dispatchEvent(fck_22);
    }

    public void d(fvE fvE2, fck_2 fck_22) {
        fck_22.a(frd_0.C);
        fck_22.f(1);
        fvE2.dispatchEvent(fck_22);
    }

    public boolean a(fvE fvE2) {
        int n = fvE2.getDisplayX();
        int n2 = fvE2.getDisplayY();
        return fvE2.getAppearance().a(this.c - n, this.d - n2);
    }
}

