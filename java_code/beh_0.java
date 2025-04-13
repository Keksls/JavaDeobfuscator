/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from bEH
 */
public class beh_0
extends bFZ {
    static final Logger q = Logger.getLogger(beh_0.class);
    private boolean r;

    @Override
    public Tv[] r() {
        return new Tv[]{Tv.a, Tv.F};
    }

    @Override
    protected Tv ap_() {
        return Tv.a;
    }

    @Override
    public cSS[] az_() {
        return new cSS[]{cSY.as.a(), cSY.at.a()};
    }

    @Override
    public void c(ph_0 ph_02) {
    }

    public fha_0 Z() {
        return fha_0.a(this.B());
    }

    @Override
    public boolean b(Tv tv, TF tF) {
        this.a(tv);
        this.b(tv);
        if (tv == Tv.a || tv == Tv.F) {
            bqd_0.a(new bei_0(this, tv));
        }
        return true;
    }

    public void a(boolean bl) {
        this.r = bl;
    }

    public boolean ao() {
        return this.r;
    }

    @Override
    protected void ao_() {
        super.ao_();
        this.r = false;
    }

    @Override
    public void onCheckOut() {
        super.onCheckOut();
        this.a((short)fha_0.b.ordinal());
    }

    static /* synthetic */ void a(beh_0 beh_02, abm_1 abm_12) {
        beh_02.a(abm_12);
    }
}

