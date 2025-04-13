/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from buF
 */
public final class buf_1
implements bvi_2 {
    public static final aqr_2 a = new bvk_2(new bvj_2("standard", new aqo_2[0]), new bvj_2("filtr\u00e9", new aqo_2("id du groupe")));
    private final long b;

    public buf_1(long l) {
        this.b = l;
    }

    @Override
    public int b() {
        return bvl_2.L.a();
    }

    @Override
    public String[] a() {
        return new String[]{Long.toString(this.b)};
    }

    @Override
    public aqr_2 c_() {
        return a;
    }

    public String toString() {
        return "ClientEventGroupKilled{m_groupId=" + this.b + "}";
    }
}

