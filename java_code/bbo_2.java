/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from bBo
 */
public class bbo_2
extends bFZ {
    static final Logger s = Logger.getLogger(bbo_2.class);
    public static final short q = 0;
    public static final short r = 1;

    @Override
    public void onCheckOut() {
        super.onCheckOut();
        this.a((short)0);
        this.b(true);
        this.g(true);
        this.k(true);
    }

    @Override
    public void c(ph_0 ph_02) {
        s.info((Object)("[ON VIEW UPDATED] " + ph_02));
    }

    @Override
    public boolean b(Tv tv, TF tF) {
        s.info((Object)("Action performed on interactive element : " + tv.toString()));
        this.a(tv);
        switch (tv) {
            case r: {
                if (this.B() == 1) {
                    this.b(tv);
                }
                return true;
            }
            case s: {
                this.b(tv);
                return true;
            }
        }
        return false;
    }

    @Override
    public Tv ap_() {
        return Tv.r;
    }

    @Override
    public Tv[] r() {
        return new Tv[]{Tv.r};
    }

    @Override
    public byte W() {
        return 4;
    }

    @Override
    public boolean aF_() {
        bmr_1 bmr_12 = azu_0.j().k();
        return emj_0.b.a(new emh_0[]{bmr_12});
    }

    static /* synthetic */ void a(bbo_2 bbo_22, abm_1 abm_12) {
        bbo_22.a(abm_12);
    }
}

