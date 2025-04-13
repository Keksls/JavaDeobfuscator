/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bvb
 */
public class bvb_1
implements bvi_2 {
    public static final aqr_2 a = new bvk_2(new bvj_2("standard", new aqo_2[0]), new bvj_2("filtr\u00e9", new aqo_2("id unique de l'action d?\u00e9v\u00e9nement client LAUCH_TUTORIAL")));
    private final int b;

    public bvb_1(int n) {
        this.b = n;
    }

    @Override
    public String[] a() {
        return new String[]{Integer.toString(this.b)};
    }

    @Override
    public aqr_2 c_() {
        return a;
    }

    @Override
    public int b() {
        return bvl_2.M.a();
    }
}

