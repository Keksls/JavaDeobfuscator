/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cVo
 */
public abstract class cvo_0
extends Enum<cvo_0> {
    public static final /* enum */ cvo_0 a = new cvp_0("allOf");
    public static final /* enum */ cvo_0 b = new cvq_0("todo");
    public static final /* enum */ cvo_0 c = new cvr_0("terminated.pl");
    private final String d;
    private static final /* synthetic */ cvo_0[] e;

    public static cvo_0[] values() {
        return (cvo_0[])e.clone();
    }

    public static cvo_0 valueOf(String string) {
        return Enum.valueOf(cvo_0.class, string);
    }

    cvo_0(String string2) {
        this.d = string2;
    }

    public abstract boolean a(boolean var1, boolean var2);

    public String toString() {
        return bae.h().a(this.d, cVh.i.d() ? 2 : 1);
    }

    static {
        e = new cvo_0[]{a, b, c};
    }
}

