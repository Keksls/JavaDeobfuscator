/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from cXw
 */
public class cxw_0
implements ahr_1 {
    private static final cxw_0 b = new cxw_0();
    protected static Logger a = Logger.getLogger(cxw_0.class);
    private cxx_0 c;

    public static cxw_0 a() {
        return b;
    }

    @Override
    public boolean a(adt_1 adt_12) {
        adt_12.a();
        return true;
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
            // empty if block
        }
    }

    @Override
    public void b(aav_2 aav_22, boolean bl) {
        if (!bl) {
            // empty if block
        }
    }

    public void c() {
        if (this.c != null) {
            return;
        }
        this.c = new cxx_0();
        fis_1.a().a("sessionTimer", this.c);
        this.g();
        this.c.a();
    }

    public void d() {
        this.c.b();
        fis_1.a().a("sessionTimer");
        this.c = null;
    }

    public void e() {
        aUm aUm2 = new aUm(bae.h().a("conventionDropChatMessage", new Object[0]));
        aUm2.a(aup_0.j);
        aul_0.a().a(aUm2);
        cWa cWa2 = cWa.a();
        cWa2.a(17);
        azu_0.j().a(cWa2);
        cdw_0.n().c(600062L);
    }

    public void f() {
        cWa cWa2 = cWa.a();
        cWa2.a(16);
        azu_0.j().a(cWa2);
    }

    public void g() {
        fpm_0.b().a("sessionTimerDialog", cfi_0.a("sessionTimerDialog"), 8193L, (short)10000);
    }
}

