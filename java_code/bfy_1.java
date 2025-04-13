/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.ankama.zaap.ZaapParametersSources
 *  org.apache.log4j.Logger
 */
import com.ankama.zaap.ZaapParametersSources;
import org.apache.log4j.Logger;

/*
 * Renamed from bfy
 */
public class bfy_1
implements agw_0 {
    static final Logger c = Logger.getLogger(bfy_1.class);
    public static final bfy_1 a = new bfy_1();
    public static final int b = 5000;
    YK d;
    final Runnable e = new bfb_1(this);

    @Override
    public String m_() {
        return bae.h().a("contentLoader.token", new Object[0]);
    }

    public void a(YK yK) {
        this.d = yK;
        boolean bl = fis_1.a().c("demo");
        if (bl) {
            c.info((Object)"Demo mode. Pushing normal auth frame.");
            this.d.b(this);
            emj.c();
            return;
        }
        if (bPL.a.e()) {
            c.info((Object)"Steam mode. Connecting to dispatch");
            this.d.b(this);
            emj.d();
            return;
        }
        ZaapParametersSources zaapParametersSources = emj.b();
        this.a(zaapParametersSources);
    }

    private void a(ZaapParametersSources zaapParametersSources) {
        c.info((Object)"Default mode. Starting connection to Zaap");
        bfy_1 bfy_12 = this;
        ado_1.a().a(this.e, 5000L, 1);
        emj.a.a(new bfz_1(this, bfy_12), zaapParametersSources);
    }
}

