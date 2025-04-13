/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TIntIntHashMap
 *  org.apache.log4j.Logger
 */
import gnu.trove.map.hash.TIntIntHashMap;
import org.apache.log4j.Logger;

public class cXm
extends cVb {
    protected static final Logger b = Logger.getLogger(cXm.class);
    private static final cXm c = new cXm();
    private bqN d;
    private String e;
    private ans_1 f;

    public static cXm d() {
        return c;
    }

    @Override
    public void a(aav_2 aav_22, boolean bl) {
        super.a(aav_22, bl);
        if (!bl) {
            this.f = new cXn(this);
            fpm_0.b().a(this.f);
            fpm_0.b().a("wakfu.collectMachine", cGi.class);
            fvk_0 fvk_02 = (fvk_0)fpm_0.b().a(this.e, cfi_0.a(this.e), 17L, (short)10000);
            if (fvk_02 == null) {
                b.error((Object)("Unable to retrieve collect window ! loaded=" + fpm_0.b().q(this.e)));
            } else {
                this.a(fvk_02);
            }
        }
    }

    @Override
    public void b(aav_2 aav_22, boolean bl) {
        super.b(aav_22, bl);
        if (!bl) {
            fpm_0.b().e("wakfu.collectMachine");
            fpm_0.b().b(this.f);
            if (fpm_0.b().q("freeCollectMachineDialog")) {
                fpm_0.b().o("freeCollectMachineDialog");
            }
            if (fpm_0.b().q("lockedCollectMachineDialog")) {
                fpm_0.b().o("lockedCollectMachineDialog");
            }
            fis_1.a().a("collectMachine");
        }
    }

    public void a(bqI bqI2) {
        if (bqI2 == null) {
            b.error((Object)"on tent d'afficher une provider null");
            return;
        }
        if (bqI2.a().f()) {
            this.d = new bqQ(bqI2);
            this.e = "lockedCollectMachineDialog";
        } else {
            this.d = new bqT(bqI2);
            this.e = "freeCollectMachineDialog";
        }
        fis_1.a().a("collectMachine", this.d);
        if (!fpm_0.b().q(this.e)) {
            azu_0.j().a(this);
        }
    }

    public bqN e() {
        return this.d;
    }

    @Override
    public boolean a(adt_1 adt_12) {
        switch (adt_12.a()) {
            case 17133: {
                dfB dfB2 = (dfB)adt_12;
                long l = dfB2.c();
                bqP bqP2 = dfB2.k();
                long l2 = bqP2.a();
                if (l > l2 || l == -1L) {
                    l = l2;
                }
                bqP2.a(Hw.e(l));
                fis_1.a().a((ajf_1)bqP2, "currentPlayerQuantity", "canMax", "valid");
                return false;
            }
            case 19887: {
                dfB dfB3 = (dfB)adt_12;
                bqP bqP3 = dfB3.k();
                TIntIntHashMap tIntIntHashMap = new TIntIntHashMap();
                bpf_2 bpf_22 = (bpf_2)azu_0.j().k().eE();
                if (bpf_22 == null) {
                    return false;
                }
                if (bqP3 instanceof bqR) {
                    tIntIntHashMap.put(((bqR)bqP3).i(), Hw.e(bqP3.g()));
                    bpf_22.a(tIntIntHashMap, 0L);
                    bqP3.a(0);
                } else {
                    bpf_22.a(tIntIntHashMap, this.d.e());
                }
                return false;
            }
            case 17530: {
                dgL dgL2 = (dgL)adt_12;
                exk_2 exk_22 = dgL2.o();
                evp_2 evp_22 = new evp_2(dgL2.d(), exk_22 != null ? exk_22.aT_() : -1, dgL2.e());
                cXm.a(evp_22);
                return false;
            }
            case 18118: {
                dgL dgL3 = (dgL)adt_12;
                long l = dgL3.t();
                exk_2 exk_23 = dgL3.o();
                cXm.a(new evx_2(exk_23.a(), exk_23.aT_(), dgL3.u(), l, (byte)dgL3.r()));
                cGi.setDraggedItemId(-1L);
                return false;
            }
            case 16393: {
                long l = ((dfc)adt_12).d();
                if (l == 0L) {
                    return false;
                }
                cXm.a(new evr_2(l));
                return false;
            }
            case 16774: {
                int n = ((dfc)adt_12).c();
                if (n == 0) {
                    return false;
                }
                cXm.a(new evz_2(n));
                return false;
            }
        }
        return true;
    }

    private static void a(evn_2 evn_22) {
        cpa_0 cpa_02 = new cpa_0(evn_22);
        azu_0.j().K().c(cpa_02);
    }

    @Override
    public long a_() {
        return 11L;
    }

    @Override
    public void a(long l) {
    }
}

