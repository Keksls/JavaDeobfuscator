/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;
import java.util.BitSet;
import java.util.List;

/*
 * Renamed from eKH
 */
public abstract class ekh_0
extends eki_0 {
    private static final ru_0[] I = new ru_0[]{eps_0.M, eps_0.p, eps_0.q, eps_0.t, eps_0.r, eps_0.s, eps_0.ad, eps_0.ae, eps_0.af, eps_0.ag, eps_0.H, eps_0.K};
    protected final eAA w = new eAA(I);
    private aej_2 J = null;
    public static final sy_0 x = new sy_0(new sx_0("Bombe roublard", new aqo_2("BOMB_COOLDOWN")), new sx_0("Bombe roublard avec increment des PV par level", new aqo_2("BOMB_COOLDOWN"), new aqo_2("incr par level")));
    protected emp_2 y;
    private final long[] K = new long[1];

    protected ekh_0() {
    }

    public ekh_0(int n, aqd_1 aqd_12, BitSet bitSet, BitSet bitSet2, int n2, int n3, float[] fArray, float[] fArray2, boolean bl, boolean bl2, int n4) {
        super(n, aqd_12, bitSet, bitSet2, n2, n3, fArray, fArray2, bl, bl2, n4);
    }

    @Override
    public void ar() {
        this.w.a();
        float f2 = this.q.length > 1 ? (float)this.c() * this.c(1) : 0.0f;
        int n = (int)(this.c(0) + f2);
        this.w.b(eps_0.M).g(n);
        this.w.b(eps_0.M).n();
        this.H = new eJL(this);
    }

    @Override
    public rs_0 av() {
        return this.b(eps_0.M);
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
        return this.w.a(ru_02);
    }

    @Override
    public int w() {
        return ele_0.j.a();
    }

    @Override
    public long[] c(apq_2 apq_22) {
        this.K[0] = apb_2.a(this.h);
        return this.K;
    }

    @Override
    public List<apq_2> d(apq_2 apq_22) {
        return null;
    }

    @Override
    public boolean e(apq_2 apq_22) {
        if (apq_22 == null) {
            return true;
        }
        if (this.l == apq_22) {
            return true;
        }
        if (apq_22 instanceof ekh_0) {
            return ((sq_0)((Object)apq_22)).v() == this.l;
        }
        if (apq_22 instanceof epq_2) {
            return ((erb_2)((Object)apq_22)).cl() == this.l;
        }
        return false;
    }

    @Override
    public boolean b(erb_2 erb_22) {
        if (this.c(eps_0.M) <= 0) {
            return false;
        }
        return super.b(erb_22);
    }

    @Override
    public boolean ab() {
        return false;
    }

    @Override
    public boolean aa() {
        return false;
    }

    @Override
    public boolean N() {
        return false;
    }

    @Override
    public int G() {
        erb_2 erb_22 = this.hf();
        if (erb_22 != null) {
            erb_22.G();
        }
        return super.G();
    }

    @Override
    public int H() {
        erb_2 erb_22 = this.hf();
        if (erb_22 != null) {
            erb_22.H();
        }
        return super.H();
    }

    @Override
    public short I() {
        erb_2 erb_22 = this.hf();
        if (erb_22 != null) {
            erb_22.I();
        }
        return super.I();
    }

    @Override
    public aqr_2 c_() {
        return x;
    }

    @Override
    public void b(aej_2 aej_22) {
        this.J = aej_22;
    }

    @Override
    public aej_2 j() {
        if (this.J == null) {
            return this.F();
        }
        return this.J;
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
    protected byte E() {
        return 3;
    }

    public void au() {
    }

    @Override
    public void a(emp_2 emp_22) {
        this.y = emp_22;
    }

    @Override
    public void hE() {
        super.hE();
        if (this.y != null) {
            try {
                this.y.f(this);
            }
            catch (Exception exception) {
                a.error((Object)"Exception levee", (Throwable)exception);
            }
        }
    }

    @Override
    public byte[] I_() {
        abx_2 abx_22 = new abx_2();
        abx_22.a(this.d(eps_0.M));
        abx_22.a(this.c(eps_0.M));
        return abx_22.c();
    }

    @Override
    public void b(ByteBuffer byteBuffer) {
        int n = byteBuffer.getInt();
        int n2 = byteBuffer.getInt();
        this.b(eps_0.M).g(n);
        this.b(eps_0.M).b(n2);
    }
}

