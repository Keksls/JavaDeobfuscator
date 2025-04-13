/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bNd
 */
public class bnd_0
extends bmr_0 {
    private fgk_0 b;

    bnd_0() {
    }

    @Override
    public bnm_0 b() {
        if (this.b == fgk_0.d) {
            return bnm_0.b;
        }
        if (this.b == fgk_0.b) {
            return bnm_0.c;
        }
        return bnm_0.a;
    }

    @Override
    public void a(fgk_0 fgk_02) {
        this.b = fgk_02;
    }

    public fgk_0 a() {
        return this.b;
    }

    public boolean equals(Object object) {
        if (!(object instanceof bnd_0)) {
            return false;
        }
        bnd_0 bnd_02 = (bnd_0)object;
        return bnd_02.a().equals((Object)this.a());
    }

    @Override
    public String[] c() {
        String[] stringArray = new String[]{String.valueOf(this.b.a())};
        return stringArray;
    }
}

