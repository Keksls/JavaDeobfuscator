/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.list.array.TLongArrayList
 */
import gnu.trove.list.array.TLongArrayList;

/*
 * Renamed from btM
 */
public class btm_0
extends OT {
    private btl_0 a;

    public btm_0(int n) {
        super(btd_0.d.a(), btd_0.d.a(n));
    }

    public void a(btl_0 btl_02) {
        this.a = btl_02;
    }

    public int g() {
        return this.a.b();
    }

    @Override
    public String d() {
        return this.a.a();
    }

    @Override
    public int e() {
        return this.a.c();
    }

    @Override
    public void f() {
        this.a(new btU(this.a.a(), this.a.c()));
        this.a(new btT(this.a.d(), this.a.e()));
        this.a(new btS(this.a.f(), this.a.h(), this.a.g(), this.a.i(), this.a.j()));
        this.a(new btN(this.a.k(), this.a.l(), this.a.m(), this.a.n(), this.a.o(), this.a.p(), this.a.q(), this.a.r(), this.a.s(), this.a.t(), this.a.u(), this.a.v(), this.a.w(), this.a.x(), this.a.y(), this.a.z(), this.a.A(), this.a.B(), this.a.C(), this.a.D(), this.a.E(), this.a.F(), this.a.G(), this.a.H(), this.a.I(), this.a.J(), this.a.K(), this.a.L(), this.a.M(), this.a.N(), this.a.O(), this.a.P(), this.a.Q(), this.a.R(), this.a.S()));
        this.a(new btO(this.a.T(), this.a(this.a.U()), true));
        this.a(new btO(this.a.V(), this.a(this.a.W()), true));
        this.a(new btO(this.a.V(), this.a(this.a.W()), true));
        this.a(new btP(this.a.X(), this.b(this.a.Y()), this.a.Z()));
    }

    private TLongArrayList a(int[] nArray) {
        TLongArrayList tLongArrayList = new TLongArrayList(nArray.length);
        for (int n : nArray) {
            tLongArrayList.add(btd_0.b.a(n));
        }
        return tLongArrayList;
    }

    private TLongArrayList b(int[] nArray) {
        TLongArrayList tLongArrayList = new TLongArrayList(nArray.length);
        for (int n : nArray) {
            tLongArrayList.add(btd_0.e.a(n));
        }
        return tLongArrayList;
    }
}

