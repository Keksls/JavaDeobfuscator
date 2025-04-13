/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.iterator.TIntObjectIterator
 *  org.apache.log4j.Logger
 */
import gnu.trove.iterator.TIntObjectIterator;
import java.nio.ByteBuffer;
import org.apache.log4j.Logger;

/*
 * Renamed from ciG
 */
final class cig_1
extends chd_1<ctj_1, bvw_2> {
    private static final Logger b = Logger.getLogger(cig_1.class);

    cig_1() {
    }

    @Override
    public boolean a(ctj_1 ctj_12) {
        boolean bl = false;
        for (int k = 0; k < ctj_12.e(); ++k) {
            if (azu_0.j().k().a_() != ctj_12.b(k)) continue;
            bl = true;
            break;
        }
        if (bl) {
            if (cgz_1.a().c() != null) {
                baa_0.a().b(cgz_1.a().c().c());
            }
            TIntObjectIterator<bwh_0> tIntObjectIterator = bwj_1.a().b();
            while (tIntObjectIterator.hasNext()) {
                tIntObjectIterator.advance();
                bwh_0 bwh_02 = (bwh_0)tIntObjectIterator.value();
                if (!(bwh_02 instanceof bvw_2)) continue;
                ((bvw_2)bwh_02).m();
            }
            bwj_1.a().b(ctj_12.d());
            for (int k = 0; k < ctj_12.e(); ++k) {
                long l = ctj_12.b(k);
                blx_1 blx_12 = bmf_2.a().c(l);
                if (blx_12 == null) {
                    blx_1 blx_13 = (blx_1)euw_2.a.d(l);
                    if (blx_13 == null) continue;
                    bmf_2.a().a(blx_13);
                    blx_13.a(ctj_12.d());
                    continue;
                }
                blx_12.a(ctj_12.d());
            }
            bwo_0 bwo_02 = new bwo_0();
            new eml_2(bwo_02).a(ByteBuffer.wrap(ctj_12.h()));
            bvx_2 bvx_22 = bwj_1.a().a((int)ctj_12.i(), ctj_12.d(), (tg_0)bwo_02, ctj_12.r(), ctj_12.s(), ctj_12.t());
            bvx_22.a(bwh_1.a);
            bvx_22.a(new bwf_1());
            bwh_1.a.a(bwg_0.i, new bwu_1());
            cgz_1.a().a(bvx_22);
            return cgz_1.a().a(ctj_12);
        }
        return false;
    }
}

