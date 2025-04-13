/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from eZH
 */
public abstract class ezh_0
extends Enum<ezh_0> {
    public static final /* enum */ ezh_0 a = new ezi_0();
    public static final /* enum */ ezh_0 b = new ezj_0();
    public static final /* enum */ ezh_0 c = new ezk_0();
    private static final /* synthetic */ ezh_0[] d;

    public static ezh_0[] values() {
        return (ezh_0[])d.clone();
    }

    public static ezh_0 valueOf(String string) {
        return Enum.valueOf(ezh_0.class, string);
    }

    public abstract boolean a(exk_2 var1);

    public static ezh_0 a(boolean bl, boolean bl2) {
        if (bl) {
            return a;
        }
        if (bl2) {
            return b;
        }
        return c;
    }

    static {
        d = new ezh_0[]{a, b, c};
    }
}

