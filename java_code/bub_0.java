/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from buB
 */
public class bub_0
implements bvi_2 {
    public static final aqr_2 a = new bvk_2(new bvj_2("standard", new aqo_2[0]), new bvj_2("filtr\u00e9", new aqo_2("id de l'instance")), new bvj_2("Ancien monde", new aqo_2("id de l'instance"), new aqo_2("id de l'ancienne instance")));
    private final long b;
    private final long d;

    public bub_0(long l, long l2) {
        this.b = l;
        this.d = l2;
    }

    @Override
    public String[] a() {
        return new String[]{Long.toString(this.d), Long.toString(this.b)};
    }

    @Override
    public aqr_2 c_() {
        return a;
    }

    @Override
    public int b() {
        return bvl_2.l.a();
    }
}

