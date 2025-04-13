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
 * Renamed from bgc
 */
public class bgc_2
implements agw_0<ans_0> {
    static final Logger b = Logger.getLogger(bgc_2.class);
    public static final bgc_2 a = new bgc_2();
    ans_0 c;

    @Override
    public String m_() {
        return bae.h().a("contentLoader.zaapUserInfo", new Object[0]);
    }

    @Override
    public void a(ans_0 ans_02) {
        this.c = ans_02;
        boolean bl = fis_1.a().c("demo");
        if (bl) {
            b.info((Object)"Demo mode. No zaap available");
            this.c.b(this);
            return;
        }
        if (bPL.a.e()) {
            b.info((Object)("Steam mode." + emq.class + " are useless"));
            this.c.b(this);
            return;
        }
        ZaapParametersSources zaapParametersSources = emj.b();
        this.a(zaapParametersSources);
    }

    @Override
    private void a(ZaapParametersSources zaapParametersSources) {
        b.info((Object)("Default mode. Retrieve " + emq.class));
        bgc_2 bgc_22 = this;
        emj.a.a(new bgd_2(this, bgc_22), zaapParametersSources);
    }
}

