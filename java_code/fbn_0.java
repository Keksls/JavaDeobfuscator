/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fbN
 */
final class fbn_0
implements fbm_0 {
    private final int a;
    private final int b;
    private final int c;
    private final String d;
    private final String e;
    private final fbs_0[] f;

    fbn_0(int n, int n2, int n3, String string, String string2, fbs_0[] fbs_0Array) {
        this.a = n;
        this.b = n2;
        this.c = n3;
        this.d = string;
        this.e = string2;
        this.f = fbs_0Array;
    }

    @Override
    public String a() {
        return this.d;
    }

    @Override
    public int b() {
        return this.b;
    }

    @Override
    public String c() {
        return this.e;
    }

    @Override
    public int d() {
        return this.c;
    }

    @Override
    public boolean a(fbs_0 fbs_02) {
        for (int k = 0; k < this.f.length; ++k) {
            if (this.f[k] != fbs_02) continue;
            return true;
        }
        return false;
    }

    @Override
    public int e() {
        return this.a;
    }
}

