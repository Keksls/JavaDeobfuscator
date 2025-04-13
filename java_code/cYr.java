/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

public class cYr
implements ahr_1 {
    protected static final Logger a = Logger.getLogger(cYr.class);
    private static final cYr b = new cYr();
    private ans_1 c;
    private btV d;

    public static cYr a() {
        return b;
    }

    @Override
    public void a(aav_2 aav_22, boolean bl) {
        if (!bl) {
            this.c = new cys_0(this);
            fpm_0.b().a(this.c);
            fpm_0.b().a("equipableDummyDialog", cfi_0.a("equipableDummyDialog"), 1L, (short)10000).getElementMap();
            cdw_0.n().c(600012L);
            if (this.d.a().Z() == null) {
                this.c();
            }
            fpm_0.b().a("wakfu.equipableDummy", cGN.class);
        }
    }

    @Override
    public void b(aav_2 aav_22, boolean bl) {
        if (!bl) {
            fpm_0.b().b(this.c);
            fpm_0.b().o("equipableDummyDialog");
            fis_1.a().a("equipableDummy");
            cdw_0.n().c(600013L);
            fpm_0.b().e("wakfu.equipableDummy");
        }
    }

    private void c() {
        fyy_0 fyy_02 = fpm_0.b().h().d("equipableDummyDialog");
        fjb_2.a((fvE)fyy_02.a("pennon"));
    }

    private void a(exk_2 exk_22) {
        Object object;
        euh_1 euh_12;
        if (exk_22 == null) {
            euh_12 = new euh_1(-1L);
        } else {
            boolean bl;
            object = exk_22.T();
            apc_2 apc_22 = ((ezr_0)object).a(exz_1.e);
            if (exk_22.ab() || apc_22 != null && !apc_22.b(null, null, null, null)) {
                aUh.a("error.cannotEquipNonExchangeableItem", new Object[0]);
                return;
            }
            eyw_1 eyw_12 = ((ezr_0)object).p();
            boolean bl2 = eyw_12 instanceof bjf_2;
            boolean bl3 = ((ezr_0)object).F().d() == 646;
            boolean bl4 = bl = ((ezr_0)object).F().d() == 647;
            if (!(bl2 || bl3 || bl)) {
                return;
            }
            euh_12 = new euh_1(exk_22.a());
        }
        object = new cnJ();
        ((cnJ)object).a(this.d.a().a_());
        ((cnJ)object).a(euh_12);
        azu_0.j().K().c(object);
    }

    @Override
    public boolean a(adt_1 adt_12) {
        switch (adt_12.a()) {
            case 19779: {
                dgL dgL2 = (dgL)adt_12;
                this.a(dgL2.o());
                return false;
            }
            case 18870: {
                dgL dgL3 = (dgL)adt_12;
                exk_2 exk_22 = this.d.a().Z();
                if (exk_22 == null) {
                    return false;
                }
                if (exk_22.aT_() == dgL3.c()) {
                    this.a((exk_2)null);
                }
                return false;
            }
        }
        return true;
    }

    @Override
    public long a_() {
        return 0L;
    }

    @Override
    public void a(long l) {
    }

    public void a(bcr_1 bcr_12) {
        this.d = new btV(bcr_12);
        fis_1.a().a("equipableDummy", this.d);
        azu_0.j().a(this);
        if (fpm_0.b().q("equipableDummyDialog") && this.d.a().Z() == null) {
            this.c();
        }
    }
}

