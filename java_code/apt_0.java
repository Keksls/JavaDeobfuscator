/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.util.List;
import org.apache.log4j.Logger;

/*
 * Renamed from aPT
 */
public class apt_0
extends apq_0
implements ape_0 {
    private static final Logger g = Logger.getLogger(apt_0.class);
    private static final String h = "SpellZoneEffect";
    private static final String i = "SpellZoneAdditionalEffect";
    private static final String j = "SpellRange";
    private static final String k = "SpellRangeWithConstraint";
    private static final String l = "SpellRangeWithoutLOS";
    private static final String m = "SpellEmptyCellsNeeded";
    private static final elz_0 n = new elz_0().a(false).b(false);
    private bpl_0 o;
    private static final String p = "forbidden.tga";
    private static final String q = "notinLOS.tga";
    private static final apt_0 r = new apt_0();

    public static apt_0 a() {
        return r;
    }

    private apt_0() {
        super(j, anr_0.N, h, anr_0.K, i, anr_0.L, k, anr_0.O, l, anr_0.P, m, anr_0.M);
    }

    public void a(bpl_0 bpl_02, blx_1 blx_12) {
        this.o = bpl_02;
        this.b(blx_12);
        this.o = null;
    }

    @Override
    public void a(List<efi_0> list, blx_1 blx_12, aff_1 aff_12) {
        efi_0 efi_02 = list.get(list.size() - 1);
        if (efi_02 instanceof bpl_0 && ((bph_0)((bpl_0)efi_02).r()).C()) {
            this.a(aff_12);
            return;
        }
        super.a(list, blx_12, aff_12);
    }

    @Override
    protected aps_0 a(aff_1 aff_12, blx_1 blx_12) {
        switch (blx_12.bz().a(blx_12, this.o, aff_12, true, n)) {
            case a: 
            case b: {
                return aps_0.a;
            }
            case d: {
                return aps_0.c;
            }
            case s: {
                if (this.o.r() != null && ((bph_0)this.o.r()).b(fic_0.m)) {
                    return aps_0.e;
                }
                return aps_0.d;
            }
        }
        return aps_0.e;
    }

    @Override
    public void b() {
        try {
            String string = azs_0.a().a("highLightGfxPath") + p;
            if (this.c != null) {
                this.c.a(string, aim.b);
            }
            string = azs_0.a().a("highLightGfxPath") + q;
            if (this.b != null) {
                this.b.a(string, aim.b);
            }
        }
        catch (Exception exception) {
            g.error((Object)exception);
        }
    }
}

