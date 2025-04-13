/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from aPM
 */
public class apm_0
extends apq_0
implements ape_0 {
    private static final Logger g = Logger.getLogger(apm_0.class);
    private static final String h = "ItemZoneEffect";
    private static final String i = "ItemZoneAdditionalEffect";
    private static final String j = "ItemRange";
    private static final String k = "ItemRangeWithConstraint";
    private static final String l = "ItemRangeWithoutLOS";
    private static final String m = "ItemEmptyCellsNeeded";
    private exk_2 n;
    private static final String o = "forbidden.tga";
    private static final String p = "notinLOS.tga";
    private static final apm_0 q = new apm_0();

    public static apm_0 a() {
        return q;
    }

    private apm_0() {
        super(j, anr_0.N, h, anr_0.K, i, anr_0.L, k, anr_0.O, l, anr_0.P, m, anr_0.M);
    }

    public void a(exk_2 exk_22, blx_1 blx_12) {
        this.n = exk_22;
        this.b(blx_12);
        this.n = null;
    }

    @Override
    protected aps_0 a(aff_1 aff_12, blx_1 blx_12) {
        switch (blx_12.bz().a((epq_2)blx_12, this.n, aff_12, true)) {
            case a: {
                return aps_0.a;
            }
            case b: {
                return aps_0.b;
            }
            case d: {
                return aps_0.c;
            }
            case s: {
                return aps_0.d;
            }
        }
        return aps_0.e;
    }

    @Override
    public void b() {
        try {
            String string = azs_0.a().a("highLightGfxPath") + o;
            this.c.a(string, aim.a);
            string = azs_0.a().a("highLightGfxPath") + p;
            this.b.a(string, aim.b);
        }
        catch (Exception exception) {
            g.error((Object)exception);
        }
    }
}

