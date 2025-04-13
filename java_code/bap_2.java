/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from bAp
 */
public abstract class bap_2
extends bFZ
implements bgf_1 {
    long s;
    private feW t;
    protected boolean q;
    private final fo_1 u = new baq_2(this);

    protected abstract void a(ByteBuffer var1);

    @Override
    public final long m() {
        return this.s;
    }

    @Override
    public boolean n() {
        return true;
    }

    @Override
    public void onCheckIn() {
        super.onCheckIn();
        this.t = null;
        this.aB().f();
    }

    @Override
    public void onCheckOut() {
        super.onCheckOut();
        this.a(TI.c);
        this.s = 0L;
        this.aB().g();
        this.e.c();
        assert (this.t == null);
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
    protected final fo_1 ad() {
        return this.u;
    }

    @Override
    protected fo_1 aA_() {
        return fo_1.c;
    }

    @Override
    public boolean b(Tv tv, TF tF) {
        if (tv == Tv.x || tv == Tv.B || tv == Tv.D) {
            this.b(tv);
            return true;
        }
        return false;
    }

    @Override
    public final Tv[] r() {
        Tv[] tvArray = this.s();
        Tv[] tvArray2 = new Tv[3 + tvArray.length];
        tvArray2[0] = Tv.B;
        tvArray2[1] = Tv.x;
        tvArray2[2] = Tv.D;
        System.arraycopy(tvArray, 0, tvArray2, 3, tvArray.length);
        return tvArray2;
    }

    protected abstract Tv[] s();

    @Override
    public final cSS[] az_() {
        cSS[] cSSArray = this.u();
        bmr_1 bmr_12 = azu_0.j().k();
        if (this.m() != bmr_12.a_() && !cSW.a(this.s)) {
            return cSSArray;
        }
        cSS[] cSSArray2 = new cSS[3 + cSSArray.length];
        cSSArray2[0] = cSY.z.a();
        cSSArray2[1] = cSY.A.a();
        cSSArray2[2] = cSY.B.a();
        System.arraycopy(cSSArray, 0, cSSArray2, 3, cSSArray.length);
        return cSSArray2;
    }

    protected abstract cSS[] u();

    @Override
    public final void a(vb_1 vb_12) {
        throw new UnsupportedOperationException("Pas de persistance des donn\u00e9es des RoomContent dans le client");
    }

    @Override
    public final boolean b(vb_1 vb_12) {
        this.a(new aff_1(vb_12.b, vb_12.c, vb_12.d));
        this.a(aej_2.a(vb_12.e));
        this.q = vb_12.f;
        this.a(vb_12.h);
        return true;
    }

    protected abstract void a(oq_0 var1);

    @Override
    public void a(feW feW2) {
        this.t = feW2;
    }

    @Override
    public bgf_1 aG_() {
        return this;
    }

    @Override
    public bgf_1 aH_() {
        return this;
    }

    @Override
    public boolean y() {
        return true;
    }

    @Override
    public void a(wz_2 wz_22) {
    }

    @Override
    public boolean aM_() {
        return this.q;
    }

    @Override
    public void aN_() {
        aej_2 aej_22 = eul_1.a(this.F());
        this.a(aej_22);
        this.aI_();
    }

    @Override
    public aej_2 F() {
        return super.F();
    }

    static /* synthetic */ aff_1 a(bap_2 bap_22) {
        return bap_22.e;
    }
}

