/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

public class bEd
extends bFZ {
    static final Logger q = Logger.getLogger(bEd.class);
    private static final int r = 31;

    @Override
    public boolean b(Tv tv, TF tF) {
        switch (tv) {
            case a: {
                q.info((Object)"[MAILBOX] Activation d'une mailbox");
                czp_2 czp_22 = new czp_2();
                czp_22.a(azu_0.j().k().dp());
                czp_22.b("Test title");
                czp_22.c("Yeah RastaPouet ... test de message de ouf ^^\r\n!!!Vive les barbus!!!");
                azu_0.j().K().c(czp_22);
                return true;
            }
        }
        return false;
    }

    @Override
    public Tv ap_() {
        return Tv.a;
    }

    @Override
    public Tv[] r() {
        return new Tv[]{Tv.a};
    }

    @Override
    public void onCheckOut() {
        super.onCheckOut();
        this.b(true);
        this.g(true);
        this.i(true);
    }

    @Override
    public cSS[] az_() {
        cSS[] cSSArray = new cSS[1];
        cto_0 cto_02 = (cto_0)cSY.v.a();
        cto_02.a(31);
        cSSArray[0] = cto_02;
        return cSSArray;
    }

    @Override
    public String al_() {
        return bae.h().a("mailbox.name", new Object[0]);
    }

    @Override
    public void c(ph_0 ph_02) {
    }

    static /* synthetic */ void a(bEd bEd2, abm_1 abm_12) {
        bEd2.a(abm_12);
    }
}

