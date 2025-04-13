/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.nio.ByteBuffer;
import java.util.HashSet;
import org.apache.log4j.Logger;

/*
 * Renamed from ciD
 */
final class cid_1
extends chd_1<ctg_1, bvw_2> {
    private static final Logger b = Logger.getLogger(cid_1.class);
    private static final boolean c = false;

    cid_1() {
    }

    @Override
    public boolean a(ctg_1 ctg_12) {
        emr_2 emr_22 = emr_2.a(ctg_12.c());
        if (emr_22 == null) {
            b.error((Object)String.format("FightModel (typeId=%d) inconnu dans la cr\u00e9ation de l'external fight id=%d", ctg_12.c(), ctg_12.d()));
            return false;
        }
        bvw_2 bvw_22 = new bvw_2(emr_22, ctg_12.o());
        bvw_22.a((byte)0, ctg_12.p());
        bvw_22.a((byte)1, ctg_12.q());
        bvw_22.b((byte)0, ctg_12.r());
        bvw_22.b((byte)1, ctg_12.s());
        bwo_0 bwo_02 = new bwo_0();
        new eml_2(bwo_02).a(ByteBuffer.wrap(ctg_12.g()));
        bvw_22.a(ctg_12.d());
        bvw_22.a(ctg_12.h());
        bvw_22.a(ctg_12.j());
        bvw_22.a(bwo_02);
        bwo_02.a(true, false);
        boolean bl = azu_0.j().k().bz() == null;
        for (int k = 0; k < ctg_12.b(); ++k) {
            byte by = ctg_12.c(k);
            long l = ctg_12.b(k);
            bvw_22.a(by, l);
        }
        cic_1.a.b.add(ctg_12.d());
        bvw_22.f(ctg_12.i().get(0));
        bvw_22.g(ctg_12.i().get(1));
        bvw_22.a(ctg_12.k());
        blx_1 blx_12 = bvw_22.e(ctg_12.i().get(0));
        blx_1 blx_13 = bvw_22.e(ctg_12.i().get(1));
        if (blx_12 != null && blx_13 != null) {
            cic_1.a.c.put(ctg_12.d(), (Object)bap_0.a(1, (int)emd_1.E.a(), 0, blx_12, blx_13));
            cic_1.a.d.put(ctg_12.d(), (Object)bap_0.a(2, (int)emd_1.E.a(), 0, blx_13, blx_12));
            cic_1.a.e.put(ctg_12.d(), (Object)bap_0.a(3, (int)emd_1.E.a(), 0, bvw_22.g(blx_12.Y()), blx_13));
            cic_1.a.f.put(ctg_12.d(), (Object)bap_0.a(4, (int)emd_1.E.a(), 0, bvw_22.g(blx_13.Y()), blx_12));
            cic_1.a.h.put(ctg_12.d(), (Object)bat_0.a(6, emd_1.F.a(), 0, blx_13, "AnimHit", 250));
            if (bl) {
                cic_1.a.i.put(ctg_12.d(), (Object)bbd_0.a(10, (int)emd_1.I.a(), 0, blx_13));
                HashSet<blx_1> hashSet = new HashSet<blx_1>(bvw_22.g(blx_13.Y()));
                hashSet.remove(blx_13);
                cic_1.a.j.put(ctg_12.d(), (Object)bbd_0.a(10, (int)emd_1.I.a(), 0, hashSet));
            }
        }
        if (blx_12 != null) {
            bvw_22.e(blx_12);
        }
        if (blx_13 != null) {
            bvw_22.f(blx_13);
        }
        if (bl) {
            eke_0 eke_02 = elg_0.a().e(ctg_12.e());
            if (eke_02 != null) {
                eke_0 eke_03 = (eke_0)eke_02.b(new elb_0(ctg_12.f(), bwo_02.z(), bwo_02.A(), bwo_02.m(), bvw_22.h(), 0L, null, 0, aej_2.k));
                eke_03.a(bwo_02);
                bvw_22.i().a(eke_03);
            } else {
                b.error((Object)("Impossible de cr\u00e9er la bulle de combat : la zone d'effet d'index " + ctg_12.e() + " n'existe pas"));
            }
            ((bvv_2)bvw_22.q()).a(bwo_02);
        }
        bwj_1.a().a(bvw_22);
        ccm_1.g().a(bvw_22);
        if (blx_12 != null && blx_13 != null) {
            aPc.f().a(bvw_22);
        }
        return false;
    }
}

