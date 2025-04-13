/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from buJ
 */
public class buj_2
implements bvi_2 {
    public static final aqr_2 a = new bvk_2(new bvj_2("standard", new aqo_2[0]), new bvj_2("filtr\u00e9 sur l'Dd de l'item", new aqo_2("Id de l'item"), new aqo_2("Id de la famille directe")));
    private final int b;
    private final short d;

    public buj_2(ezr_0 ezr_02) {
        this.b = ezr_02.n();
        this.d = ezr_02.F().d();
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
        return bvl_2.b.a();
    }
}

