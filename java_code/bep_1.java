/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from bep
 */
public class bep_1
implements agw_0 {
    private static final Logger a = Logger.getLogger(bep_1.class);

    public void a(YK yK) {
        for (eqp_2 eqp_22 : eqp_2.values()) {
            eqd_0 eqd_02 = eqp_22.a();
            if (eqt_2.a(eqd_02)) {
                eqs_2.a.a(eqd_02);
                continue;
            }
            a.warn((Object)("Bonus de guilde mal saisi. id=" + eqd_02.a()), (Throwable)new Exception());
        }
        yK.b(this);
    }

    @Override
    public String m_() {
        return bae.h().a("contentLoader.guildBonus", new Object[0]);
    }
}

