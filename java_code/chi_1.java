/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.util.stream.Collectors;
import org.apache.log4j.Logger;

/*
 * Renamed from chI
 */
final class chi_1
extends chd_1<crN, bvx_2> {
    private static final Logger b = Logger.getLogger(chi_1.class);

    chi_1() {
    }

    @Override
    public boolean a(crN crN2) {
        blx_1 blx_13 = (blx_1)((bvx_2)this.a).n(crN2.b());
        if (blx_13 == null) {
            b.error((Object)("Impossible de t\u00e9l\u00e9porter un personnage qui n'est pas dans le combat " + crN2.b() + " ; fighters = " + ((bvx_2)this.a).j().stream().map(blx_12 -> String.valueOf(blx_12 instanceof bnh_1 ? blx_12.a_() : (long)blx_12.Z_().s())).collect(Collectors.joining(", "))));
            return true;
        }
        if (chv_1.d.b) {
            chv_1.d.c.a(blx_13, new aff_1(crN2.c(), crN2.d(), crN2.e()));
            return false;
        }
        if (chv_1.d.a || ((bvx_2)this.a).e() == elp_0.b || ((bvx_2)this.a).e() == elp_0.d) {
            bae_0 bae_02 = bae_0.a(alc_1.q(), emd_1.x.a(), 0, blx_13, new aff_1(crN2.c(), crN2.d(), crN2.e()), crN2.f());
            baa_0.a().a((bvx_2)this.a, (aku_1)bae_02);
            baa_0.a().a(this.a);
            return false;
        }
        b.error((Object)("Impossible de t\u00e9l\u00e9porter un personnage du combat " + crN2.b()));
        return true;
    }
}

