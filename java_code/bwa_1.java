/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.nio.ByteBuffer;
import java.util.List;
import org.apache.log4j.Logger;

/*
 * Renamed from bwa
 */
public final class bwa_1 {
    private static final Logger b = Logger.getLogger(bwa_1.class);
    private bvx_2 c;

    public bvx_2 a(ctj_1 ctj_12, bvx_2 bvx_22) {
        Object object;
        this.c = bvx_22;
        ctk_1[] ctk_1Array = ctj_12.q();
        for (int k = 0; k < ctk_1Array.length; ++k) {
            if (ctk_1Array[k].a != 10) continue;
            object = ccm_1.g().a(ctk_1Array[k].b);
            if (object == null) {
                b.error((Object)("IE non trouv\u00e9 " + ctk_1Array[k].b));
                continue;
            }
            this.c.a((bbh_2)object);
        }
        eke_0 eke_02 = elg_0.a().e(ctj_12.j());
        assert (eke_02 != null) : "Impossible de cr\u00e9er la bulle de combat : la zone d'effet d'index " + ctj_12.j() + " n'existe pas";
        object = this.c.g();
        eke_0 eke_03 = (eke_0)eke_02.b(new elb_0(ctj_12.k(), ((yy_0)object).z(), ((yy_0)object).A(), ((tg_0)object).m(), this.c.h(), 0L, null, 0, aej_2.k));
        eke_03.a((tg_0)object);
        this.c.a(eke_03);
        bwb_1 bwb_12 = this.a(ctj_12);
        this.a(ctj_12, bwb_12);
        this.c.c(ctj_12.g());
        bwa_1.a(ctj_12.t(), this.c);
        return this.c;
    }

    public static void a(List<byte[]> list, bvx_2 bvx_22) {
        for (byte[] byArray : list) {
            try {
                ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
                long l = byteBuffer.getLong();
                ekk_0 ekk_02 = elg_0.a().i(l);
                if (ekk_02 == null) {
                    bwj_1.a.error((Object)("Impossible de recr\u00e9er la zone d'id " + l));
                    continue;
                }
                elb_0 elb_02 = env_1.a(byteBuffer, bvx_22);
                ekk_0 ekk_03 = (ekk_0)bvx_22.i().b(elb_02.a());
                if (ekk_03 == null) {
                    ekk_03 = ekk_02.b(elb_02);
                }
                ekk_03.ar();
                env_1.a(ekk_03, byteBuffer);
                bvx_22.i().a(ekk_03);
            }
            catch (Exception exception) {
                bwj_1.a.error((Object)"Exception levee", (Throwable)exception);
            }
        }
        apw_0.a().b();
    }

    private bwb_1 a(ctj_1 ctj_12) {
        bwb_1 bwb_12 = new bwb_1();
        for (int k = 0; k < ctj_12.e(); ++k) {
            byte by = ctj_12.d(k);
            long l = ctj_12.b(k);
            blx_1 blx_12 = bmf_2.a().c(l);
            if (blx_12 == null) {
                b.error((Object)("Impossible d'ajouter le joueur " + l + " au combat " + ctj_12.d() + " : ce fighter n'existe pas"));
                continue;
            }
            if (l == ctj_12.o() || l == ctj_12.p()) {
                bwb_12.b(blx_12, by);
                continue;
            }
            bwb_12.a(blx_12, by);
        }
        return bwb_12;
    }

    private void a(ctj_1 ctj_12, bwb_1 bwb_12) {
        for (byte by : new byte[]{0, 1}) {
            if (this.c.a(by, bwb_12.a(by), false)) continue;
            b.error((Object)"Impossible d'ajouter une team au combat, client d\u00e9synchronis\u00e9 avec la demande serveur");
        }
        for (int k = 0; k < ctj_12.e(); ++k) {
            byte by;
            blx_1 blx_12 = (blx_1)this.c.n(ctj_12.b(k));
            byte[] byArray = ctj_12.f(k);
            byte[] byArray2 = ctj_12.g(k);
            if (blx_12 != null) {
                blx_12.c(true);
                if (!ctj_12.u()) {
                    blx_12.a(this.c, byArray, byArray2);
                }
            }
            if (enq_0.a(by = ctj_12.e(k)) == enq_0.c) {
                this.c.l(blx_12);
                continue;
            }
            if (enq_0.a(by) != enq_0.d) continue;
            this.c.l(blx_12);
            this.c.m(blx_12);
        }
    }
}

