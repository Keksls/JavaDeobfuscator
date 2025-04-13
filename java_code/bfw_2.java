/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from bfw
 */
public class bfw_2
implements agw_0 {
    protected static Logger a = Logger.getLogger(bfw_2.class);

    public void a(YK yK) {
        this.a();
        yK.b(this);
    }

    public void a() {
        asw_2.a().a(new aTk(), new bfx_1(this));
    }

    void a(aTk aTk2, fgb_0 fgb_02) {
        for (atm_0 atm_02 : aTk2.e()) {
            fgb_02.b(atm_02.a(), atm_02.b(), atm_02.c(), atm_02.d(), atm_02.e());
        }
    }

    void b(aTk aTk2, fgb_0 fgb_02) {
        for (atl_0 atl_02 : aTk2.d()) {
            fgb_02.a(atl_02.a(), atl_02.b(), atl_02.c(), atl_02.d(), atl_02.e());
        }
    }

    @Override
    public String m_() {
        return bae.h().a("contentLoader.protectorEcosystem", new Object[0]);
    }
}

