/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from buy
 */
public class buy_1
implements bvi_2 {
    public static final aqr_2 a = new bvk_2(new bvj_2("filtr\u00e9", new aqo_2("Cat\u00e9gorie de recette")));
    private final int b;

    public buy_1(int n) {
        this.b = n;
    }

    @Override
    public String[] a() {
        return new String[]{String.valueOf(this.b)};
    }

    @Override
    public aqr_2 c_() {
        return a;
    }

    @Override
    public int b() {
        return bvl_2.o.a();
    }
}

