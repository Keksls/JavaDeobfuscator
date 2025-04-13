/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

public final class bOF {
    private static final Logger a = Logger.getLogger(bOF.class);

    public static void a(bmv_1 bmv_12, blx_1 blx_12) {
        bOF.a(bmv_12, blx_12, blx_12.gX(), blx_12.gO());
    }

    public static void a(bmv_1 bmv_12, blx_1 blx_12, byte by, int n) {
        Object object;
        Object object2;
        if (blx_12 == null) {
            return;
        }
        bmv_12.k(blx_12.X_());
        bmv_12.c(blx_12.X_());
        if (blx_12 instanceof bnh_1) {
            object2 = (bnh_1)blx_12;
            object = new bpg_1();
            ((bpg_1)object).a(new bpj_1(atm_1.c, (azj_2)new azf_2(((bnh_1)object2).ew().b())));
            ((bpg_1)object).a(new bpj_1(atm_1.b, (azj_2)new azf_2(((bnh_1)object2).ew().a())));
            ((bpg_1)object).a(new bpj_1(atm_1.i, (azj_2)new azf_2(((bnh_1)object2).ew().c())));
            ((bpg_1)object).a(new bpj_1(atm_1.k, (azj_2)new azf_2(((bnh_1)object2).ew().d())));
            ((bpg_1)object).a(new bpj_1(atm_1.l, (azj_2)new azf_2(((bnh_1)object2).ew().e())));
            ((bpg_1)object).a(new bpj_1(atm_1.m, (azj_2)new azf_2(((bnh_1)object2).ew().f())));
            ((bpg_1)object).a(new bpj_1(atm_1.n, (azj_2)new azf_2(((bnh_1)object2).ew().g())));
            ((bpg_1)object).a(new bpj_1(atm_1.o, (azj_2)new azf_2(((bnh_1)object2).ew().h())));
            ((bpg_1)object).a(new bpj_1(atm_1.p, (azj_2)new azf_2(((bnh_1)object2).ew().i())));
            ((bpg_1)object).a(new bpk_1(blx_12.bX(), atn_2.a("VETEMENTCUSTOM")));
            ((bpg_1)object).a(new bpk_1(blx_12.bW(), atn_2.a("CHEVEUXCUSTOM")));
            bmv_12.a((bpg_1)object);
            blv_1 blv_12 = ((blx_1)object2).D();
            if (blv_12 != null) {
                bmv_12.a(blv_12);
            }
        } else if (blx_12 instanceof bmv_1) {
            object2 = ((bmv_1)blx_12).cY();
            bmv_12.a((bpg_1)object2);
        } else {
            a.error((Object)("Summoner type not handled : " + blx_12 + " : " + blx_12.getClass().getSimpleName()));
            return;
        }
        bmv_12.a(blx_12.bc());
        bmv_12.q(blx_12.en());
        object2 = bmv_12.bv();
        object = blx_12.bv();
        if (object != null) {
            ((biI)object).cg().h((biI)object2);
            ((biI)object).cg().g((biI)object2);
            ((biI)object).cg().f((biI)object2);
            ((biI)object).cg().e((biI)object2);
        }
        bmv_12.aQ();
    }

    private static int a() {
        return 0;
    }
}

