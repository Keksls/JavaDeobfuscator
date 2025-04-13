/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

public class bDV
extends bFZ {
    static final Logger q = Logger.getLogger(bDV.class);

    @Override
    public void onCheckOut() {
        super.onCheckOut();
        this.a((short)1);
        this.b(true);
        this.g(true);
    }

    @Override
    public void c(ph_0 ph_02) {
        q.info((Object)("[ON VIEW UPDATED] " + ph_02));
    }

    @Override
    public boolean b(Tv tv, TF tF) {
        q.info((Object)("Action performed on interactive element : " + tv.toString()));
        this.a(tv);
        switch (tv) {
            case a: {
                this.a((short)Math.max(1, (this.B() + 1) % 3));
                this.aI_();
                this.b(tv);
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
    public byte W() {
        return 0;
    }

    static /* synthetic */ void a(bDV bDV2, abm_1 abm_12) {
        bDV2.a(abm_12);
    }
}

