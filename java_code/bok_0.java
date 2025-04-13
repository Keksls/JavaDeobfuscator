/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from bOK
 */
public class bok_0
extends erg_2 {
    protected static final Logger a = Logger.getLogger(bok_0.class);

    public bok_0() {
    }

    @Override
    public erg_2 a() {
        return new bok_0();
    }

    public bok_0(short s2, String string, int n, short s3, epq_2 epq_22, fiz<fio_0> fiz2) {
        super(s2, string, n, s3, epq_22, fiz2);
    }

    public bok_0 a(short s2, String string, int n, short s3, epq_2 epq_22, fiz<fio_0> fiz2) {
        return new bok_0(s2, string, n, s3, epq_22, fiz2);
    }

    public bok_0(short s2, tv_0<fio_0, yt_2> tv_02, tt_0<fio_0> tt_02, boolean bl, boolean bl2, boolean bl3) {
        super(s2, tv_02, tt_02, bl, bl2, bl3);
    }

    @Override
    public erg_2 a(short s2, tv_0<fio_0, yt_2> tv_02, tt_0<fio_0> tt_02, boolean bl, boolean bl2, boolean bl3) {
        return new bok_0(s2, tv_02, tt_02, bl, bl2, bl3);
    }

    @Override
    public void a(epq_2 epq_22, epq_2 epq_23) {
        Object object;
        super.a(epq_22, epq_23);
        bmv_1 bmv_12 = (bmv_1)epq_22;
        blx_1 blx_12 = (blx_1)epq_23;
        biI biI2 = bmv_12.bv();
        if (blx_12 == null) {
            return;
        }
        bmv_12.k(blx_12.X_());
        bmv_12.c(blx_12.X_());
        if (blx_12 instanceof bnh_1) {
            object = (bnh_1)blx_12;
            bpg_1 bpg_12 = new bpg_1();
            eae_0 eae_02 = ((bnh_1)object).ew();
            bpg_12.a(new bpj_1(atm_1.c, (azj_2)new azf_2(eae_02.b())));
            bpg_12.a(new bpj_1(atm_1.b, (azj_2)new azf_2(eae_02.a())));
            if (bkw_1.a().m(((epq_2)object).gO(), ((epq_2)object).gX(), ((bnh_1)object).bY())) {
                bpg_12.a(new bpj_1(atm_1.i, (azj_2)new azf_2(eae_02.c())));
            }
            bpg_12.a(new bpj_1(atm_1.k, (azj_2)new azf_2(eae_02.d())));
            bpg_12.a(new bpj_1(atm_1.l, (azj_2)new azf_2(eae_02.e())));
            bpg_12.a(new bpj_1(atm_1.m, (azj_2)new azf_2(eae_02.f())));
            bpg_12.a(new bpj_1(atm_1.n, (azj_2)new azf_2(eae_02.g())));
            bpg_12.a(new bpj_1(atm_1.o, (azj_2)new azf_2(eae_02.h())));
            bpg_12.a(new bpj_1(atm_1.p, (azj_2)new azf_2(eae_02.i())));
            bpg_12.a(new bpk_1(blx_12.bX(), atn_2.a("VETEMENTCUSTOM")));
            bpg_12.a(new bpk_1(blx_12.bW(), atn_2.a("CHEVEUXCUSTOM")));
            bmv_12.a(bpg_12);
            blv_1 blv_12 = ((blx_1)object).D();
            if (blv_12 != null) {
                bmv_12.a(blv_12);
            }
        } else if (blx_12 instanceof bmv_1) {
            object = ((bmv_1)blx_12).cY();
            bmv_12.a((bpg_1)object);
        } else {
            a.error((Object)("Summoner type not handled : " + blx_12 + " : " + blx_12.getClass().getSimpleName()));
            return;
        }
        bmv_12.a(blx_12.bc());
        object = blx_12.bv();
        if (object != null) {
            ((biI)object).cg().d(biI2);
        }
        bmv_12.aQ();
        biI2.c(false);
    }

    public /* synthetic */ erg_2 b(short s2, String string, int n, short s3, epq_2 epq_22, fiz fiz2) {
        return this.a(s2, string, n, s3, epq_22, fiz2);
    }
}

