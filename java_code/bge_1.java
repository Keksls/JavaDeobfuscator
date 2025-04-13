/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from bGe
 */
public class bge_1
extends bFZ {
    static final Logger q = Logger.getLogger(bge_1.class);
    private boolean r;

    @Override
    public void c(ph_0 ph_02) {
        q.info((Object)("[ON VIEW UPDATED] " + ph_02));
    }

    @Override
    public boolean b(Tv tv, TF tF) {
        switch (tv) {
            case j: {
                if (this.g == 1 && !this.r) {
                    q.info((Object)("Action [" + tv + "] performed on interactive element : " + this.a_()));
                    bua_0.a.a(new bvh_2(this.a_()));
                    this.c(tv, tF);
                } else {
                    q.info((Object)("Action [" + tv + "] ignored on interactive element : " + this.a_()));
                }
                this.r = true;
                return true;
            }
            case k: {
                if (this.g == 1 && this.r) {
                    q.info((Object)("Action [" + tv + "] performed on interactive element : " + this.a_()));
                    this.d(tv, tF);
                } else {
                    q.info((Object)("Action [" + tv + "] ignored on interactive element : " + this.a_()));
                }
                this.r = false;
                return true;
            }
        }
        q.info((Object)("Action [" + tv + "] not processed on interactive element : " + this.a_()));
        return false;
    }

    protected void d(Tv tv, TF tF) {
        this.e(tv, tF);
    }

    protected void c(Tv tv, TF tF) {
        this.e(tv, tF);
    }

    protected void e(Tv tv, TF tF) {
        this.a(tv);
        this.aI_();
        this.b(tv);
    }

    @Override
    public Tv ap_() {
        return Tv.j;
    }

    @Override
    public Tv[] r() {
        return new Tv[]{Tv.j, Tv.k, Tv.f};
    }

    public boolean ao() {
        return this.r;
    }

    @Override
    public void onCheckOut() {
        super.onCheckOut();
        this.r = false;
    }

    static /* synthetic */ void a(bge_1 bge_12, abm_1 abm_12) {
        bge_12.a(abm_12);
    }
}

