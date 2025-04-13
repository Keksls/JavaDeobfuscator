/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from buK
 */
public class buk_2
implements bvi_2 {
    public static final aqr_2 a = new bvk_2(new bvj_2("standard", new aqo_2[0]), new bvj_2("filtr\u00e9", new aqo_2("Id de l'item"), new aqo_2("Id de cat\u00e9gorie")));
    private final ezr_0 b;

    public buk_2(ezr_0 ezr_02) {
        this.b = ezr_02;
    }

    @Override
    public String[] a() {
        return new String[]{Integer.toString(this.b.n()), Integer.toString(this.b.F().d())};
    }

    @Override
    public aqr_2 c_() {
        return a;
    }

    @Override
    public int b() {
        return bvl_2.r.a();
    }
}

