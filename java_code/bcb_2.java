/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from bCb
 */
public class bcb_2
extends bFZ {
    static final Logger q = Logger.getLogger(bcb_2.class);

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
        q.info((Object)("Action performed on interactive element : " + tv.toString()));
        switch (tv) {
            case f: {
                if (this.g != 1) break;
                this.a(tv);
                this.aI_();
                ans_0.D();
                bmr_1 bmr_12 = ans_0.F().k();
                bmr_12.di().y();
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

    static /* synthetic */ void a(bcb_2 bcb_22, abm_1 abm_12) {
        bcb_22.a(abm_12);
    }
}

