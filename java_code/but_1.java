/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from buT
 */
public class but_1
implements bvi_2 {
    public static final aqr_2 a = new bvk_2(new bvj_2("standard", new aqo_2[0]), new bvj_2("filtr\u00e9", new aqo_2("Id de la resource plant\u00e9e"), new aqo_2("id de la famille de ressource plant\u00e9e")));
    private final int b;
    private final short d;

    public but_1(int n, short s2) {
        this.b = n;
        this.d = s2;
    }

    @Override
    public String[] a() {
        return new String[]{String.valueOf(this.b), String.valueOf(this.d)};
    }

    @Override
    public aqr_2 c_() {
        return a;
    }

    @Override
    public int b() {
        return bvl_2.c.a();
    }
}

