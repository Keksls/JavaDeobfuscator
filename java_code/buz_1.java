/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from buz
 */
public class buz_1
implements bvi_2 {
    public static final aqr_2 a = new bvk_2(new bvj_2("standard", new aqo_2[0]), new bvj_2("filtr\u00e9", new aqo_2("Id du dialogue"), new aqo_2("Id du choix")));
    private final int b;
    private final int d;

    public buz_1(int n, int n2) {
        this.b = n;
        this.d = n2;
    }

    @Override
    public String[] a() {
        return new String[]{Integer.toString(this.b), Integer.toString(this.d)};
    }

    @Override
    public aqr_2 c_() {
        return a;
    }

    @Override
    public int b() {
        return bvl_2.A.a();
    }
}

