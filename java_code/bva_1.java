/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bva
 */
public class bva_1
implements bvi_2 {
    public static final aqr_2 a = new bvk_2(new bvj_2("standard", new aqo_2[0]), new bvj_2("standard", new aqo_2("Id du territoire")));
    private final long b;

    public bva_1(long l) {
        this.b = l;
    }

    @Override
    public String[] a() {
        return new String[]{Long.toString(this.b)};
    }

    @Override
    public aqr_2 c_() {
        return a;
    }

    @Override
    public int b() {
        return bvl_2.j.a();
    }
}

