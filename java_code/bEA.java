/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

public class bEA
extends bFZ {
    static final Logger q = Logger.getLogger(bEA.class);

    @Override
    public void onCheckOut() {
        super.onCheckOut();
        this.a((short)1);
        this.b(false);
        this.g(false);
    }

    @Override
    public void c(ph_0 ph_02) {
        q.info((Object)("[ON VIEW UPDATED] " + ph_02));
    }

    @Override
    public boolean b(Tv tv, TF tF) {
        switch (tv) {
            case f: {
                if (this.g == 2) {
                    q.info((Object)("Action [" + tv + "] ignored on interactive element : " + this.a_()));
                    return true;
                }
                q.info((Object)("Action [" + tv + "] performed on interactive element : " + this.a_()));
                this.a(tv);
                this.aI_();
                this.b(tv);
                return true;
            }
        }
        return false;
    }

    @Override
    public Tv ap_() {
        return Tv.f;
    }

    @Override
    public Tv[] r() {
        return new Tv[]{Tv.f};
    }

    @Override
    public byte W() {
        return 0;
    }

    static /* synthetic */ void a(bEA bEA2, abm_1 abm_12) {
        bEA2.a(abm_12);
    }
}

