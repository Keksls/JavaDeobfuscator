/*
 * Decompiled with CFR 0.152.
 */
public class btX
implements bvi_2 {
    public static final aqr_2 a = new bvk_2(new bvj_2("standard", new aqo_2[0]), new bvj_2("filtr\u00e9", new aqo_2("Id du titre perdu")));
    private final int b;

    public btX(int n) {
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
        return bvl_2.X.a();
    }
}

