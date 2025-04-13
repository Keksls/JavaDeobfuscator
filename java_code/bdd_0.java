/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from bDD
 */
public class bdd_0
extends bFZ {
    static final Logger q = Logger.getLogger(bdd_0.class);

    @Override
    public void onCheckOut() {
        super.onCheckOut();
        this.a((short)1);
        this.b(false);
        this.g(false);
    }

    @Override
    public void a(aff_1 aff_12) {
        super.a(aff_12);
        this.S().add(aff_12);
    }

    @Override
    public boolean b(aff_1 aff_12) {
        return aff_12.a((Object)this.P_());
    }

    @Override
    public void c(ph_0 ph_02) {
        q.info((Object)("[ON VIEW UPDATED] " + ph_02));
    }

    @Override
    public boolean b(Tv tv, TF tF) {
        q.info((Object)("Action performed on interactive element : " + tv.toString()));
        switch (tv) {
            case f: {
                if (this.g != 1) break;
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

    static /* synthetic */ void a(bdd_0 bdd_02, abm_1 abm_12) {
        bdd_02.a(abm_12);
    }
}

