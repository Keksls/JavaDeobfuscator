/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collection;
import java.util.List;

/*
 * Renamed from eKF
 */
public abstract class ekf_0
extends ekk_0 {
    private aej_2 y;
    private static final ru_0[] I = new ru_0[]{ekf_0.as(), eps_0.p, eps_0.q, eps_0.t, eps_0.r, eps_0.s, eps_0.ad, eps_0.ae, eps_0.af, eps_0.ag, eps_0.H, eps_0.I, eps_0.u, eps_0.y, eps_0.v, eps_0.w, eps_0.x, eps_0.n, eps_0.W};
    protected final eAA w = new eAA(I);
    private int J;
    public static final sy_0 x = new sy_0(new sx_0("Balise destructible", new aqo_2("HP"), new aqo_2("incr par level")));

    public static eps_0 as() {
        return eps_0.b;
    }

    public sy_0 au() {
        return x;
    }

    public ekf_0(int n, aqd_1 aqd_12, BitSet bitSet, BitSet bitSet2, int n2, int n3, float[] fArray, float[] fArray2, boolean bl, boolean bl2, int n4) {
        super(n, aqd_12, bitSet, bitSet2, n2, n3, fArray, fArray2, bl, bl2, n4);
    }

    @Override
    public ekk_0 b(elb_0 elb_02) {
        ekk_0 ekk_02 = super.b(elb_02);
        if (elb_02 != null && elb_02.i() != null) {
            ekk_02.a(elb_02.i());
        } else {
            ekk_02.a(aej_2.d);
        }
        return ekk_02;
    }

    protected ekf_0() {
    }

    @Override
    public int w() {
        return ele_0.c.a();
    }

    @Override
    public void ar() {
        this.w.a();
        int n = (int)(this.c(0) + (float)this.c() * this.c(1));
        this.w.b(ekf_0.as()).g(n);
        this.w.b(ekf_0.as()).n();
        this.H = new eJL(this);
        this.c(eoz_1.as);
    }

    @Override
    public boolean e(apq_2 apq_22) {
        return apq_22 == this.l;
    }

    @Override
    public rs_0 av() {
        return this.b(ekf_0.as());
    }

    @Override
    public rs_0 b(ru_0 ru_02) {
        return this.w.b(ru_02);
    }

    @Override
    public eAA aw() {
        return this.w;
    }

    @Override
    public boolean a(ru_0 ru_02) {
        if (this.w == null) {
            return false;
        }
        return this.w.a(ru_02);
    }

    @Override
    public boolean m() {
        return super.m() || this.w.c(ekf_0.as()) <= 0;
    }

    @Override
    public aej_2 F() {
        return this.y;
    }

    @Override
    public void a(aej_2 aej_22) {
        this.y = aej_22;
    }

    @Override
    public aej_2 j() {
        return this.F();
    }

    @Override
    public long[] c(apq_2 apq_22) {
        return new long[]{apb_2.a(this.G(), this.H(), this.I())};
    }

    public ArrayList<apq_2> l(apq_2 apq_22) {
        return new ArrayList<apq_2>();
    }

    @Override
    public void n() {
        super.n();
        if (this.j == null) {
            return;
        }
        Collection<sr_0> collection = this.aB();
        this.a(collection);
    }

    @Override
    private void a(Collection<sr_0> collection) {
        for (sr_0 sr_02 : collection) {
            this.j.g().b(sr_02);
        }
    }

    private Collection<sr_0> aB() {
        ArrayList<sr_0> arrayList = new ArrayList<sr_0>();
        for (sr_0 sr_02 : this.j.g().f()) {
            if (!this.a(sr_02)) continue;
            arrayList.add(sr_02);
        }
        return arrayList;
    }

    private boolean a(sr_0 sr_02) {
        return sr_02 != this && this.b(sr_02) && this.d(sr_02) && this.c(sr_02);
    }

    private boolean b(sr_0 sr_02) {
        return sr_02.w() == ele_0.c.a();
    }

    private boolean c(sr_0 sr_02) {
        return sr_02.v() == this.v();
    }

    private boolean d(sr_0 sr_02) {
        return sr_02.G() == this.G() && sr_02.H() == this.H() && sr_02.I() == this.I();
    }

    @Override
    public se_0 x_() {
        return this.H;
    }

    @Override
    public boolean y_() {
        return true;
    }

    @Override
    public byte W() {
        return 6;
    }

    @Override
    public boolean aa() {
        return true;
    }

    @Override
    public boolean ab() {
        return true;
    }

    @Override
    public boolean ax() {
        return true;
    }

    public void d(int n) {
        this.J = n;
    }

    public int ay() {
        return this.J;
    }

    @Override
    public byte[] I_() {
        abx_2 abx_22 = new abx_2();
        abx_22.a(this.d(ekf_0.as()));
        abx_22.a(this.c(ekf_0.as()));
        return abx_22.c();
    }

    @Override
    public void b(ByteBuffer byteBuffer) {
        int n = byteBuffer.getInt();
        int n2 = byteBuffer.getInt();
        this.b(ekf_0.as()).g(n);
        this.b(ekf_0.as()).b(n2);
    }

    @Override
    public void onCheckIn() {
        super.onCheckIn();
        this.J = 0;
    }

    @Override
    public /* synthetic */ aqr_2 c_() {
        return this.au();
    }

    @Override
    public /* synthetic */ List d(apq_2 apq_22) {
        return this.l(apq_22);
    }

    @Override
    public /* synthetic */ sr_0 a(st_0 st_02) {
        return this.b((elb_0)st_02);
    }
}

