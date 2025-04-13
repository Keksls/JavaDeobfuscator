/*
 * Decompiled with CFR 0.152.
 */
import java.util.Collection;

/*
 * Renamed from bGw
 */
public abstract class bgw_0<T extends bFZ>
implements bgf_1 {
    protected final T a;
    private long c;
    protected boolean b;

    bgw_0(T t) {
        this.a = t;
    }

    @Override
    public bgz_1 aB() {
        return ((bFZ)this.a).aB();
    }

    @Override
    public final void a(wz_2 wz_22) {
        this.c = wz_22.e;
        ((TG)this.a).P_().c(wz_22.a, wz_22.b, wz_22.c);
        ((bFZ)this.a).a(aej_2.a(wz_22.d));
        this.b = wz_22.f;
    }

    @Override
    public void a(vb_1 vb_12) {
        throw new UnsupportedOperationException("Pas de persistance des donn\u00e9es des RoomContent dans le client");
    }

    @Override
    public final boolean b(vb_1 vb_12) {
        ((bFZ)this.a).a(new aff_1(vb_12.b, vb_12.c, vb_12.d));
        ((bFZ)this.a).a(aej_2.a(vb_12.e));
        this.a(vb_12.h);
        this.b = vb_12.f;
        return true;
    }

    protected abstract void a(oq_0 var1);

    @Override
    public int G() {
        return ((bFZ)this.a).G();
    }

    @Override
    public int H() {
        return ((bFZ)this.a).H();
    }

    @Override
    public short I() {
        return ((bFZ)this.a).I();
    }

    @Override
    public boolean o() {
        throw new UnsupportedOperationException();
    }

    @Override
    public void p() {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean M() {
        return ((TG)this.a).M();
    }

    @Override
    public long m() {
        return this.c;
    }

    @Override
    public void aI_() {
        ((pj_0)this.a).aI_();
    }

    @Override
    public void a(feW feW2) {
    }

    @Override
    public Collection<ph_0> av_() {
        return ((pj_0)this.a).av_();
    }

    @Override
    public void i(boolean bl) {
        ((bFZ)this.a).i(bl);
    }

    @Override
    public final Tv[] r() {
        Tv[] tvArray = ((bFZ)this.a).r();
        Tv[] tvArray2 = new Tv[3 + tvArray.length];
        tvArray2[0] = Tv.B;
        tvArray2[1] = Tv.x;
        tvArray2[2] = Tv.D;
        System.arraycopy(tvArray, 0, tvArray2, 3, tvArray.length);
        return tvArray2;
    }

    @Override
    public final cSS[] az_() {
        cSS[] cSSArray = ((bFZ)this.a).az_();
        bmr_1 bmr_12 = azu_0.j().k();
        if (this.c != bmr_12.a_() && !cSW.a(this.c)) {
            return cSSArray;
        }
        cSS[] cSSArray2 = new cSS[3 + cSSArray.length];
        cSSArray2[0] = cSY.z.a();
        cSSArray2[1] = cSY.A.a();
        cSSArray2[2] = cSY.B.a();
        System.arraycopy(cSSArray, 0, cSSArray2, 3, cSSArray.length);
        return cSSArray2;
    }

    @Override
    public boolean b(Tv tv, TF tF) {
        if (tv == Tv.x || tv == Tv.B || tv == Tv.D) {
            ((bFZ)this.a).b(tv);
            return true;
        }
        return false;
    }

    @Override
    public boolean aM_() {
        return this.b;
    }

    @Override
    public void release() {
        ((TG)this.a).release();
    }

    @Override
    public void aN_() {
        aej_2 aej_22 = eul_1.a(((TG)this.a).F());
        ((bFZ)this.a).a(aej_22);
        ((pj_0)this.a).aI_();
    }

    @Override
    public aej_2 F() {
        return ((TG)this.a).F();
    }

    @Override
    public boolean c(aej_2 aej_22) {
        return ((TG)this.a).al().contains((Object)aej_22);
    }
}

