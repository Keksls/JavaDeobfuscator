/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.util.ArrayList;
import java.util.List;
import org.apache.log4j.Logger;

/*
 * Renamed from cWn
 */
public class cwn_0
implements ahr_1 {
    protected static final Logger a = Logger.getLogger(cwn_0.class);
    private static final cwn_0 b = new cwn_0();
    private final bql_0 c = new bql_0();
    private bFN d;
    private ans_1 e;

    public static cwn_0 a() {
        return b;
    }

    @Override
    public boolean a(adt_1 adt_12) {
        if (dez.d(adt_12)) {
            return false;
        }
        switch (adt_12.a()) {
            case 17165: {
                dfc dfc2 = (dfc)adt_12;
                String string = dfc2.h();
                this.c.a(string);
                return false;
            }
            case 17128: {
                dfc dfc3 = (dfc)adt_12;
                String string = dfc3.h();
                this.c.a(string);
                List<bqk_0> list = this.c.a();
                if (list == null || list.size() != 1) {
                    return false;
                }
                bqk_0 bqk_02 = list.get(0);
                ArrayList<bqj_0> arrayList = bqk_02.c();
                if (arrayList.size() != 1) {
                    return false;
                }
                bqj_0 bqj_02 = arrayList.get(0);
                if (bqj_02 == null) {
                    return false;
                }
                this.b(bqj_02.a());
                return false;
            }
            case 17770: {
                dfc dfc4 = (dfc)adt_12;
                long l = dfc4.d();
                this.b(l);
                return false;
            }
        }
        return true;
    }

    public void b(long l) {
        bmr_1 bmr_12 = azu_0.j().k();
        bqv_0 bqv_02 = (bqv_0)fjq_0.a(fjv.d);
        bqv_02.c(bmr_12, this.d, l);
        azu_0.j().b(this);
    }

    public void a(bFN bFN2) {
        this.d = bFN2;
        this.c.a(bFN2.a_(), bFN2);
        azu_0.j().a(this);
    }

    public bFN c() {
        return this.d;
    }

    @Override
    public long a_() {
        return 0L;
    }

    @Override
    public void a(long l) {
    }

    @Override
    public void a(aav_2 aav_22, boolean bl) {
        if (!bl) {
            bql_0.g = "";
            this.e = new cWo(this);
            fpm_0.b().a(this.e);
            fis_1.a().a("ticketOffice", this.c);
            fis_1.a().a("boatTicketOffice", true);
            fpm_0.b().a("zaapDialog", cfi_0.a("zaapDialog"), 1L, (short)10000);
            fpm_0.b().a("wakfu.zaap", cKs.class);
        }
    }

    @Override
    public void b(aav_2 aav_22, boolean bl) {
        if (!bl) {
            fpm_0.b().b(this.e);
            fpm_0.b().o("zaapDialog");
            fis_1.a().a("ticketOffice");
            fis_1.a().a("boatTicketOffice");
            fpm_0.b().e("wakfu.zaap");
            this.d = null;
        }
    }
}

