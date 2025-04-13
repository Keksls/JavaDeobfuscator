/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bur
 */
public final class bur_1
implements bvi_2 {
    public static final aqr_2 a = new bvk_2(new bvj_2("filtr\u00e9", new aqo_2("Id du perso"), new aqo_2("Id de breed"), new aqo_2("Id du groupe")));
    private final long b;
    private final int d;
    private final long e;

    public bur_1(long l, int n, long l2) {
        this.b = l;
        this.d = n;
        this.e = l2;
    }

    @Override
    public int b() {
        return bvl_2.E.a();
    }

    @Override
    public String[] a() {
        return new String[]{String.valueOf(this.b), String.valueOf(this.d), String.valueOf(this.e)};
    }

    @Override
    public aqr_2 c_() {
        return a;
    }
}

