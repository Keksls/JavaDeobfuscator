/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;

public class bFf
extends bFZ {
    private evv_1 s;
    public static final short q = 0;
    public static final short r = 1;

    @Override
    public void c(ph_0 ph_02) {
    }

    @Override
    public boolean b(Tv tv, TF tF) {
        switch (tv) {
            case m: {
                bpi_2 bpi_22 = new bpi_2(this);
                bpi_22.a();
                this.b(tv);
                return true;
            }
            case n: {
                this.b(tv);
                azu_0.j().k().dN();
                return true;
            }
        }
        return false;
    }

    @Override
    public cSS[] az_() {
        cSS[] cSSArray = new cSS[1];
        cTF cTF2 = (cTF)cSY.w.a();
        fii fii2 = fij.a().a(this.s.n());
        cTF2.a(fii2.c());
        cTF2.a("desc.mru." + fii2.d());
        cTF2.b(Tv.m);
        apc_2 apc_22 = this.s.j();
        cTF2.c(this.a(apc_22));
        cSSArray[0] = cTF2;
        return cSSArray;
    }

    private boolean a(apc_2 apc_22) {
        if (apc_22 == null) {
            return true;
        }
        bmr_1 bmr_12 = azu_0.j().k();
        if (bmr_12 == null) {
            return false;
        }
        return apc_22.b(bmr_12, null, null, bmr_12.Q_());
    }

    @Override
    public Tv[] r() {
        return new Tv[]{Tv.m, Tv.n};
    }

    @Override
    protected Tv ap_() {
        return Tv.m;
    }

    @Override
    protected void ao_() {
        super.ao_();
        String string = bae.h().a(157, (long)this.s.m(), new Object[0]);
        short s2 = this.B();
        short s3 = this.as();
        if (s2 == 0 && s3 == 1) {
            String string2 = bae.h().a("stele.state.disabled", new Object[0]);
            aUh.b(String.format(string2, string), new Object[0]);
            return;
        }
        if (s2 == 1 && s3 == 0) {
            aUh.b("stele.state.activated", string);
            return;
        }
    }

    @Override
    public void ar_() {
        this.s = (evv_1)evl_1.a.a(evg_1.D, Integer.parseInt(this.l));
        this.i(true);
        this.g(true);
        this.b(true);
    }

    public List<evx_1> Z() {
        return this.s.g();
    }

    public evy_1 ao() {
        return this.s.e();
    }

    public evy_1 ap() {
        return this.s.f();
    }

    public int aq() {
        return this.s.m();
    }

    @Override
    public String al_() {
        return bae.h().a(157, (long)this.s.m(), new Object[0]);
    }

    @Override
    public void release() {
        this.onCheckIn();
    }

    public evv_1 ar() {
        return this.s;
    }
}

