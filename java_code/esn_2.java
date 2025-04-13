/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from eSN
 */
public abstract class esn_2
extends Enum<esn_2>
implements abr_1<esl_2> {
    public static final /* enum */ esn_2 a = new eso_1(1);
    public static final /* enum */ esn_2 b = new esq_1(2);
    public static final /* enum */ esn_2 c = new esr_2(3);
    public static final /* enum */ esn_2 d = new ess_1(4);
    public static final /* enum */ esn_2 e = new est_2(5);
    public static final /* enum */ esn_2 f = new esu_2(6);
    public static final /* enum */ esn_2 g = new esv_2(7);
    public static final /* enum */ esn_2 h = new esw_1(8);
    public static final /* enum */ esn_2 i = new esx_2(9);
    public static final /* enum */ esn_2 j = new esp_1(10);
    public final byte k;
    private static final /* synthetic */ esn_2[] l;

    public static esn_2[] values() {
        return (esn_2[])l.clone();
    }

    public static esn_2 valueOf(String string) {
        return Enum.valueOf(esn_2.class, string);
    }

    esn_2(int n2) {
        this.k = Hw.b((long)n2);
    }

    public static esn_2 a(byte by) {
        for (esn_2 esn_22 : esn_2.values()) {
            if (esn_22.k != by) continue;
            return esn_22;
        }
        throw new etp_2("[HAVEN_WORLD] Action " + by + " inconnue");
    }

    static {
        l = new esn_2[]{a, b, c, d, e, f, g, h, i, j};
    }
}

