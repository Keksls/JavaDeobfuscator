/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bcn
 */
class bcn_2
implements adx_1<crs_0> {
    protected bcl_2 a;

    bcn_2() {
    }

    public String toString() {
        return "AuthentificationTokenMessageRunner{}";
    }

    protected void a(bcl_2 bcl_22) {
        this.a = bcl_22;
    }

    @Override
    public boolean a(crs_0 crs_02) {
        String string = crs_02.b();
        if (Cz.f(string)) {
            this.a.a();
        } else {
            this.a.a(string);
        }
        return false;
    }

    @Override
    public int a() {
        return 23465;
    }
}

