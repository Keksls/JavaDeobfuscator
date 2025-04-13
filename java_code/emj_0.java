/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from emJ
 */
public abstract class emj_0
extends Enum<emj_0>
implements emc_0<emh_0> {
    public static final /* enum */ emj_0 a = new emk_0();
    public static final /* enum */ emj_0 b = new eml_0();
    public static final /* enum */ emj_0 c = new emm_0();
    private static final /* synthetic */ emj_0[] d;

    public static emj_0[] values() {
        return (emj_0[])d.clone();
    }

    public static emj_0 valueOf(String string) {
        return Enum.valueOf(emj_0.class, string);
    }

    public abstract boolean a(emh_0 ... var1);

    static {
        d = new emj_0[]{a, b, c};
    }
}

