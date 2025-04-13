/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;
import java.util.BitSet;
import java.util.List;

/*
 * Renamed from eKD
 */
public abstract class ekd_0
extends eki_0 {
    private static final ru_0[] y = new ru_0[]{ekd_0.au(), eps_0.p, eps_0.y, eps_0.x, eps_0.v, eps_0.w, eps_0.u};
    protected final eAA w = new eAA(y);
    private aej_2 I = null;
    public static final sy_0 x = new sy_0(new sx_0("Tonneau Panda avec increment des PV par level", new aqo_2("PV"), new aqo_2("incr par level"), new aqo_2("Bonus de PV en % de PV du caster"), new aqo_2("incr du Bonus de PV en % de PV du caster")));
    private final long[] J = new long[1];

    public static eps_0 au() {
        return eps_0.b;
    }

    protected ekd_0() {
    }

    public ekd_0(int n, aqd_1 aqd_12, BitSet bitSet, BitSet bitSet2, int n2, int n3, float[] fArray, float[] fArray2, boolean bl, boolean bl2, int n4) {
        super(n, aqd_12, bitSet, bitSet2, n2, n3, fArray, fArray2, bl, bl2, n4);
    }

    @Override
    public void ar() {
        this.w.a();
        int n = this.as();
        this.w.b(ekd_0.au()).g(n);
        this.w.b(ekd_0.au()).n();
        this.H = new eJL(this);
    }

    private int as() {
        float f2 = this.c(0);
        short s2 = this.c();
        float f3 = (float)s2 * this.c(1);
        float f4 = this.c(2) + this.c(3) * (float)s2;
        float f5 = f2 + f3;
        float f6 = f4 * (float)(this.l != null ? this.l.b(ekd_0.au()).c() / 100 : 0);
        return (int)(f5 + f6);
    }

    @Override
    public rs_0 av() {
        return this.b(ekd_0.au());
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
        return ele_0.o.a();
    }

    @Override
    public long[] c(apq_2 apq_22) {
        this.J[0] = apb_2.a(this.h);
        return this.J;
    }

    @Override
    public List<apq_2> d(apq_2 apq_22) {
        return null;
    }

    @Override
    public boolean e(apq_2 apq_22) {
        return false;
    }

    @Override
    public boolean ab() {
        return true;
    }

    @Override
    public boolean aa() {
        return true;
    }

    @Override
    public boolean ax() {
        return true;
    }

    @Override
    public boolean m() {
        return super.m() || this.w.c(ekd_0.au()) <= 0;
    }

    @Override
    public boolean N() {
        return false;
    }

    @Override
    public int G() {
        if (this.hf() != null) {
            this.hf().G();
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
        this.I = aej_22;
    }

    @Override
    public aej_2 j() {
        if (this.I == null) {
            return this.F();
        }
        return this.I;
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

    @Override
    public byte[] I_() {
        abx_2 abx_22 = new abx_2();
        abx_22.a(this.d(ekd_0.au()));
        abx_22.a(this.c(ekd_0.au()));
        return abx_22.c();
    }

    @Override
    public void b(ByteBuffer byteBuffer) {
        int n = byteBuffer.getInt();
        int n2 = byteBuffer.getInt();
        this.b(ekd_0.au()).g(n);
        this.b(ekd_0.au()).b(n2);
    }
}

