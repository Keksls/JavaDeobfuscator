/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from dbj
 */
public class dbj_0
implements ahr_1 {
    public static final dbj_0 a = new dbj_0();
    protected static final Logger b = Logger.getLogger(dbj_0.class);
    private ans_1 c;

    private dbj_0() {
    }

    @Override
    public boolean a(adt_1 adt_12) {
        switch (adt_12.a()) {
            case 17896: {
                bnp_0.b.c();
                return false;
            }
            case 18636: {
                bnp_0.b.e();
                return false;
            }
            case 18794: {
                bnp_0.b.f();
                return false;
            }
            case 19423: {
                bnp_0.b.g();
                return false;
            }
            case 16653: {
                dfc dfc2 = (dfc)adt_12;
                bnr_0 bnr_02 = (bnr_0)dfc2.j();
                bnp_0.b.a(bnr_02);
                return false;
            }
            case 17374: {
                dfc dfc3 = (dfc)adt_12;
                bnq_0 bnq_02 = (bnq_0)dfc3.j();
                bnp_0.b.a(bnq_02);
                return false;
            }
            case 18624: {
                dfc dfc4 = (dfc)adt_12;
                bVn bVn2 = (bVn)dfc4.j();
                bnp_0.b.a(bVn2);
                return false;
            }
            case 17856: {
                dfc dfc5 = (dfc)adt_12;
                bno_0 bno_02 = (bno_0)dfc5.j();
                this.a(bno_02);
                return false;
            }
            case 18410: {
                anw_1 anw_12 = (anw_1)adt_12;
                String string = anw_12.h();
                bnp_0.b.a(string);
                return false;
            }
            case 19622: {
                bnp_0.b.a();
                return false;
            }
        }
        return true;
    }

    private void a(bno_0 bno_02) {
        bno_02.c();
        String string = "pvpLadderEntryDialog" + bno_02.b().a();
        fyb_0 fyb_02 = fpm_0.b().a(string, cfi_0.a("pvpLadderEntryDialog"), 0L, (short)10000);
        if (fyb_02 != null) {
            fis_1.a().a("pvpLadderEntry", (Object)bno_02, fyb_02.getElementMap());
        }
    }

    @Override
    public void a(aav_2 aav_22, boolean bl) {
        if (!bl) {
            this.c = new dbk_0(this);
            fis_1.a().a("nationPvpLadder", bnp_0.b);
            bnp_0.b.a();
            fpm_0.b().a(this.c);
            fpm_0.b().a("nationPvpLadderDialog", cfi_0.a("nationPvpLadderDialog"), 32768L, (short)10000);
            fpm_0.b().a("wakfu.nationPvpLadder", cic_0.class);
        }
    }

    @Override
    public void b(aav_2 aav_22, boolean bl) {
        if (!bl) {
            fpm_0.b().b(this.c);
            fpm_0.b().o("nationPvpLadderDialog");
            fpm_0.b().e("wakfu.nationPvpLadder");
        }
    }

    @Override
    public long a_() {
        return 0L;
    }

    @Override
    public void a(long l) {
    }
}

