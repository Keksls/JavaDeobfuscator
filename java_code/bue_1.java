/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from buE
 */
public class bue_1
implements bvi_2 {
    public static final aqr_2 a = new bvk_2(new bvj_2("standard", new aqo_2[0]), new bvj_2("filtr\u00e9", new aqo_2("Breed opposant"), new aqo_2("Group Id")));
    private final int b;
    private final long d;

    public bue_1(int n, long l) {
        this.b = n;
        this.d = l;
    }

    @Override
    public String[] a() {
        return new String[]{Integer.toString(this.b), Long.toString(this.d)};
    }

    @Override
    public aqr_2 c_() {
        return a;
    }

    @Override
    public int b() {
        return bvl_2.z.a();
    }
}

