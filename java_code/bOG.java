/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

public final class bOG
extends eqz_1 {
    private static final Logger a = Logger.getLogger(bOG.class);

    public bOG() {
    }

    public bOG a() {
        return new bOG();
    }

    public bOG(short s2, String string, int n, short s3, epq_2 epq_22, int n2, fiz<fio_0> fiz2) {
        super(s2, string, n, s3, epq_22, n2, fiz2);
    }

    public bOG a(short s2, String string, int n, short s3, epq_2 epq_22, int n2, fiz<fio_0> fiz2) {
        return new bOG(s2, string, n, s3, epq_22, n2, fiz2);
    }

    public bOG(short s2, tv_0<fio_0, yt_2> tv_02, tt_0<fio_0> tt_02, boolean bl, boolean bl2, boolean bl3) {
        super(s2, tv_02, tt_02, bl, bl2, bl3);
    }

    public bOG a(short s2, tv_0<fio_0, yt_2> tv_02, tt_0<fio_0> tt_02, boolean bl, boolean bl2, boolean bl3) {
        return new bOG(s2, tv_02, tt_02, bl, bl2, bl3);
    }

    @Override
    public void a(epq_2 epq_22, epq_2 epq_23) {
        super.a(epq_22, epq_23);
        bmv_1 bmv_12 = (bmv_1)epq_22;
        int n = bOH.b(this.f(), this.n(), (short)this.f.u());
        bmv_12.k(n);
        bmv_12.c(n);
        bpg_1 bpg_12 = new bpg_1();
        bpg_12.a(new bpk_1(bkw_1.a().n(this.f(), this.n(), (short)this.f.u()), atn_2.a("VETEMENTCUSTOM")));
        bpg_12.a(new bpj_1(atm_1.k, (azj_2)new azf_2(this.f.i())));
        bpg_12.a(new bpj_1(atm_1.l, (azj_2)new azf_2(this.f.k())));
        bpg_12.a(new bpj_1(atm_1.m, (azj_2)new azf_2(this.f.m())));
        bpg_12.a(new bpj_1(atm_1.n, (azj_2)new azf_2(this.f.o())));
        bpg_12.a(new bpj_1(atm_1.o, (azj_2)new azf_2(this.f.q())));
        bpg_12.a(new bpj_1(atm_1.p, (azj_2)new azf_2(this.f.s())));
        bmv_12.a(bpg_12);
        bmv_12.a(this.g);
        bmv_12.aQ();
    }

    public /* synthetic */ erd_2 b(short s2, tv_0 tv_02, tt_0 tt_02, boolean bl, boolean bl2, boolean bl3) {
        return this.a(s2, tv_02, tt_02, bl, bl2, bl3);
    }

    @Override
    public /* synthetic */ erd_2 b() {
        return this.a();
    }

    public /* synthetic */ erd_2 b(short s2, String string, int n, short s3, epq_2 epq_22, int n2, fiz fiz2) {
        return this.a(s2, string, n, s3, epq_22, n2, fiz2);
    }
}

