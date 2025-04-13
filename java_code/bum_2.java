/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from buM
 */
public final class bum_2
implements bvi_2 {
    public static final aqr_2 a = new bvk_2(new bvj_2("standard", new aqo_2[0]), new bvj_2("filtr\u00e9", new aqo_2("id de l'instance")));
    private final long b;

    public bum_2(long l) {
        this.b = l;
    }

    @Override
    public String[] a() {
        return new String[]{Long.toString(this.b)};
    }

    @Override
    public aqr_2 c_() {
        return a;
    }

    @Override
    public int b() {
        return bvl_2.J.a();
    }

    public String toString() {
        return "ClientEventLeaveInstance{m_instanceId=" + this.b + "}";
    }
}

