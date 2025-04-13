/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from eQY
 */
public abstract class eqy_0
extends Enum<eqy_0>
implements abr_1<eqw_0> {
    public static final /* enum */ eqy_0 a = new eqz_0();
    public static final /* enum */ eqy_0 b = new erh_0();
    public static final /* enum */ eqy_0 c = new eri_0();
    public static final /* enum */ eqy_0 d = new erj_0();
    public static final /* enum */ eqy_0 e = new erk_0();
    public static final /* enum */ eqy_0 f = new erl_0();
    public static final /* enum */ eqy_0 g = new erm_0();
    public static final /* enum */ eqy_0 h = new ern_0();
    public static final /* enum */ eqy_0 i = new ero_0();
    public static final /* enum */ eqy_0 j = new era_0();
    public static final /* enum */ eqy_0 k = new erb_0();
    public static final /* enum */ eqy_0 l = new erc_0();
    public static final /* enum */ eqy_0 m = new erd_0();
    public static final /* enum */ eqy_0 n = new ere_0();
    public static final /* enum */ eqy_0 o = new erf_0();
    public static final /* enum */ eqy_0 p = new erg_0();
    public final byte q = (byte)this.ordinal();
    private static final /* synthetic */ eqy_0[] r;

    public static eqy_0[] values() {
        return (eqy_0[])r.clone();
    }

    public static eqy_0 valueOf(String string) {
        return Enum.valueOf(eqy_0.class, string);
    }

    @Nullable
    public static eqy_0 a(byte by) {
        for (eqy_0 eqy_02 : eqy_0.values()) {
            if (eqy_02.q != by) continue;
            return eqy_02;
        }
        return null;
    }

    public String toString() {
        return "GuildChangeType{idx=" + this.q + "}";
    }

    static {
        r = new eqy_0[]{a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p};
    }
}

