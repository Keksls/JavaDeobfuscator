/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from eOm
 */
class eom_2
implements eoo_2 {
    private static final Logger a = Logger.getLogger(eom_2.class);
    private final emx_1<? extends epq_2> b;

    eom_2(emx_1<? extends epq_2> emx_12) {
        this.b = emx_12;
    }

    @Override
    public int a(long l) {
        epq_2 epq_22 = this.b.i(l);
        if (epq_22 == null) {
            a.error((Object)("[_FL_] fightId=" + this.b.c() + " : Fighter inconnu " + l + " on ne peut pas recuperer son init"));
        }
        return epq_22 == null ? 0 : epq_22.c(eps_0.B);
    }

    @Override
    public boolean b(long l) {
        epq_2 epq_22 = this.b.i(l);
        return epq_22 != null && epq_22.a(eoz_1.k);
    }
}

