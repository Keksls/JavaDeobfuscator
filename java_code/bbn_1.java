/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from bBN
 */
public class bbn_1
extends bFZ {
    static final Logger q = Logger.getLogger(bbn_1.class);

    @Override
    public void c(ph_0 ph_02) {
    }

    @Override
    public boolean b(Tv tv, TF tF) {
        if (tv != Tv.a) {
            return false;
        }
        this.a(tv);
        this.b(tv);
        return true;
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
    public cSS[] az_() {
        return new cSS[]{cSY.v.a()};
    }

    @Override
    public String al_() {
        return "TODO Clem: Machine qui parle";
    }

    @Override
    public void onCheckOut() {
        super.onCheckOut();
        this.g = 1;
        this.f(true);
        this.b(true);
        this.g(true);
        this.B = true;
        this.A = true;
    }

    static /* synthetic */ void a(bbn_1 bbn_12, abm_1 abm_12) {
        bbn_12.a(abm_12);
    }
}

