/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bun
 */
public class bun_1
implements bvi_2 {
    public static final aqr_2 a = new bvk_2(new bvj_2("standard", new aqo_2[0]), new bvj_2("filtr\u00e9", new aqo_2("id de l'objectif d\u00e9bloqu\u00e9")), new bvj_2("filtr\u00e9", new aqo_2("id de l'objectif d\u00e9bloqu\u00e9"), new aqo_2("id de l'achievement")));
    private final int b;
    private final int d;

    public bun_1(int n, int n2) {
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
        return bvl_2.x.a();
    }
}

