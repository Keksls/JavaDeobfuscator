/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from buI
 */
public class bui_2
implements bvi_2 {
    public static final aqr_2 a = new bvk_2(new bvj_2("standard", new aqo_2[0]), new bvj_2("[Element|Template|Action] Id", new aqo_2("element Id"), new aqo_2("model Id"), new aqo_2("action Id")));
    private final long b;
    private final long d;
    private final long e;

    public bui_2(bFZ bFZ2, long l) {
        this.d = l;
        this.b = bFZ2.a_();
        this.e = bFZ2.af();
    }

    @Override
    public String[] a() {
        return new String[]{String.valueOf(this.b), String.valueOf(this.e), String.valueOf(this.d)};
    }

    @Override
    public aqr_2 c_() {
        return a;
    }

    @Override
    public int b() {
        return bvl_2.w.a();
    }
}

