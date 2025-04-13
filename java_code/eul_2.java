/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from eUl
 */
public abstract class eul_2
extends Enum<eul_2> {
    public static final /* enum */ eul_2 a = new eum_2();
    public static final /* enum */ eul_2 b = new eun_2();
    public static final /* enum */ eul_2 c = new euo_2();
    public static final /* enum */ eul_2 d = new eup_2();
    public static final /* enum */ eul_2 e = new euq_2();
    public static final /* enum */ eul_2 f = new eur_2();
    public static final /* enum */ eul_2 g = new eus_2();
    public static final /* enum */ eul_2 h = new eut_2();
    private static final /* synthetic */ eul_2[] i;

    public static eul_2[] values() {
        return (eul_2[])i.clone();
    }

    public static eul_2 valueOf(String string) {
        return Enum.valueOf(eul_2.class, string);
    }

    public abstract enX a(euk_2 var1);

    protected static enX b(euk_2 euk_22) {
        for (eul_2 eul_22 : eul_2.values()) {
            enX enX2;
            if (eul_22 == a || (enX2 = eul_22.a(euk_22)) == enX.a) continue;
            return enX2;
        }
        return enX.a;
    }

    static {
        i = new eul_2[]{a, b, c, d, e, f, g, h};
    }
}

