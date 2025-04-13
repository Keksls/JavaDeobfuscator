/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TLongIntHashMap
 *  gnu.trove.procedure.TIntProcedure
 *  gnu.trove.procedure.TObjectProcedure
 */
import com.ankamagames.baseImpl.graphics.isometric.particles.FreeParticleSystem;
import gnu.trove.map.hash.TLongIntHashMap;
import gnu.trove.procedure.TIntProcedure;
import gnu.trove.procedure.TObjectProcedure;
import java.util.Optional;

/*
 * Renamed from blD
 */
public class bld_2
implements afw_0,
afx_0,
ahw,
ahx,
bNP,
bNQ {
    public static final bld_2 a = new bld_2();
    private final TLongIntHashMap b = new TLongIntHashMap();
    private final TLongIntHashMap c = new TLongIntHashMap();
    private final TLongIntHashMap d = new TLongIntHashMap();
    private final long e = -1L;
    private static final TIntProcedure f = new ble_2();

    private bld_2() {
    }

    private static boolean a(afv afv2) {
        if (!(afv2 instanceof biI)) {
            return false;
        }
        if (!(((biI)afv2).bI() instanceof bmv_1)) {
            return false;
        }
        bmv_1 bmv_12 = (bmv_1)((biI)afv2).bI();
        bon_1 bon_12 = boq_1.a().a(bmv_12.cL());
        if (bon_12 != null) {
            return bon_12.b().stream().anyMatch(bop_12 -> {
                bpb_1 bpb_12 = bpc_1.a().a(bop_12.b());
                return bpb_12 != null && bpb_12.a(erl_2.H);
            });
        }
        return false;
    }

    @Override
    public void onMobileDestruction(afv afv2) {
        bld_2.a(afv2, this.b);
    }

    private static void a(abu abu2, TLongIntHashMap tLongIntHashMap) {
        int n = tLongIntHashMap.remove(abu2.a());
        if (n == 0) {
            return;
        }
        aik_0.a().b(n);
    }

    @Override
    public void a(bNK bNK2) {
        bld_2.a(bNK2, this.c);
    }

    @Override
    public void a(ahv ahv2) {
        if (!ahv2.d().c(eud_1.a)) {
            return;
        }
        bld_2.a(ahv2, this.d, 800163);
    }

    @Override
    public void b(ahv ahv2) {
        bld_2.a(ahv2, this.d);
    }

    void a() {
        this.b.forEachValue(f);
        this.b.clear();
        this.c.forEachValue(f);
        this.c.clear();
    }

    private static boolean b(afv afv2) {
        return afv2 instanceof biI && ((biI)afv2).bI().a(erl_2.p);
    }

    private static void a(abu abu2, TLongIntHashMap tLongIntHashMap, int n) {
        if (tLongIntHashMap.contains(abu2.a())) {
            int n2 = tLongIntHashMap.remove(abu2.a());
            aik_0.a().b(n2);
        }
        FreeParticleSystem freeParticleSystem = aij_0.a().a(n);
        freeParticleSystem.a(abu2);
        aik_0.a().b(freeParticleSystem);
        tLongIntHashMap.put(abu2.a(), freeParticleSystem.ac());
    }

    @Override
    public void onMobileCreation(afv afv2) {
        if (!bld_2.b(afv2) || bld_2.a(afv2)) {
            return;
        }
        Optional<bls_2> optional = blo_1.e().d();
        optional.ifPresent(bls_22 -> bld_2.a(afv2, this.b, bls_22.e().c()));
    }

    @Override
    public void b(bNK bNK2) {
        if (!bNK2.aR().c(fhr_0.b)) {
            return;
        }
        Optional<bls_2> optional = blo_1.e().d();
        optional.ifPresent(bls_22 -> bld_2.a(bNK2, this.c, bls_22.e().g()));
    }

    void b() {
        bmr_1 bmr_12 = azu_0.j().k();
        bmf_0 bmf_02 = bme_0.a.a(bmr_12.G(), bmr_12.H());
        for (afv afv2 : afz_0.d().g()) {
            bmf_0 bmf_03;
            if (!bld_2.b(afv2) || bld_2.a(afv2) || (bmf_03 = bme_0.a.a(afv2.G(), afv2.H())) != bmf_02) continue;
            Optional<bls_2> optional = blo_1.e().d();
            optional.ifPresent(bls_22 -> bld_2.a(afv2, this.b, bls_22.e().c()));
        }
        bNT.f().a((TObjectProcedure<bNK>)((TObjectProcedure)bNK2 -> {
            if (!bNK2.aR().c(fhr_0.b)) {
                return true;
            }
            if (bNK2.aN() == 0) {
                return true;
            }
            bmf_0 bmf_03 = bme_0.a.a(bNK2.G(), bNK2.H());
            if (bmf_03 != bmf_02) {
                return true;
            }
            Optional<bls_2> optional = blo_1.e().d();
            optional.ifPresent(bls_22 -> bld_2.a(bNK2, this.c, bls_22.e().g()));
            return true;
        }));
    }

    public long c() {
        return -1L;
    }
}

