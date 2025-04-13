/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bus
 */
public class bus_1
implements bvi_2 {
    public static final aqr_2 a = new bvk_2(new bvj_2("standard", new aqo_2[0]), new bvj_2("filtr\u00e9", new aqo_2("nom du rang de criminalit\u00e9 (cl\u00e9 de trad)"), new aqo_2("Points de criminalit\u00e9")));
    private final fbm_0 b;
    private final int d;

    public bus_1(fbm_0 fbm_02, int n) {
        this.b = fbm_02;
        this.d = n;
    }

    @Override
    public String[] a() {
        return new String[]{this.b.a(), String.valueOf(this.d)};
    }

    @Override
    public aqr_2 c_() {
        return a;
    }

    @Override
    public int b() {
        return bvl_2.n.a();
    }
}

