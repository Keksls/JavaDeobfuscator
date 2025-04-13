/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from bCn
 */
public class bcn_0
extends bFZ
implements ajh_1 {
    public static final float q = 0.001f;
    protected static final Logger r = Logger.getLogger(bcn_0.class);
    public static final String s = "taxPercentage";

    @Override
    public void onCheckOut() {
        super.onCheckOut();
        this.i(true);
        this.b(false);
        this.g(true);
    }

    @Override
    public String al_() {
        return bae.h().a("ie.dimensionalBagLogConsole", new Object[0]);
    }

    @Override
    public void c(ph_0 ph_02) {
    }

    @Override
    protected fo_1 ad() {
        return fo_1.c;
    }

    @Override
    public boolean b(Tv tv, TF tF) {
        this.a(tv);
        switch (tv) {
            case a: {
                r.info((Object)"Demande de r\u00e9cup\u00e9ration du log de transactions local");
                ans_0.D();
                azu_0 azu_02 = ans_0.F();
                cpW cpW2 = new cpW();
                azu_02.K().c(cpW2);
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
    public cSS[] az_() {
        bmr_1 bmr_12 = azu_0.j().k();
        boolean bl = bmr_12.di() == bmr_12.dj();
        Object a2 = cSY.v.a();
        ((cSS)a2).c(bl);
        return new cSS[]{a2};
    }

    @Override
    public Tv[] r() {
        return new Tv[]{Tv.a};
    }

    @Override
    public Object b(String string) {
        if (string.equals(s)) {
            return String.format("%.2f%%", Float.valueOf(0.1f));
        }
        return null;
    }

    @Override
    public String[] d() {
        return null;
    }

    static /* synthetic */ void a(bcn_0 bcn_02, abm_1 abm_12) {
        bcn_02.a(abm_12);
    }
}

