/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from buo
 */
public class buo_2
implements bvi_2 {
    public static final aqr_2 a = new bvk_2(new bvj_2("standard", new aqo_2[0]), new bvj_2("filtr\u00e9", new aqo_2("id de l'achievement d\u00e9bloqu\u00e9")));
    private final int b;

    public buo_2(int n) {
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
        return bvl_2.k.a();
    }
}

