/*
 * Decompiled with CFR 0.152.
 */
public class btW
implements bvi_2 {
    public static final aqr_2 a = new bvk_2(new bvj_2("standard", new aqo_2[0]), new bvj_2("filtr\u00e9", new aqo_2("Coordonn\u00e9es de partition quitt\u00e9e {x,y}"), new aqo_2("Coordonn\u00e9es de partition entr\u00e9e {x,y}")));
    private final String b;
    private final String d;

    public btW(cch_1 cch_12, cch_1 cch_13) {
        this.b = "{" + cch_12.a() + "," + cch_12.b() + "}";
        this.d = "{" + cch_13.a() + "," + cch_13.b() + "}";
    }

    @Override
    public String[] a() {
        return new String[]{this.b, this.d};
    }

    @Override
    public aqr_2 c_() {
        return a;
    }

    @Override
    public int b() {
        return bvl_2.q.a();
    }
}

