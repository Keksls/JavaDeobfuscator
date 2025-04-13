/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.List;

/*
 * Renamed from eKS
 */
public abstract class eks_0
extends ekk_0 {
    private static final ArrayList<apq_2> I = new ArrayList();
    private boolean J;
    private boolean K;
    private static final ru_0[] L = new ru_0[]{eps_0.u, eps_0.y, eps_0.v, eps_0.w, eps_0.x, eps_0.n, eps_0.W, eps_0.I};
    protected eAA w;
    protected eps_0 x;
    public static final sy_0 y = new sy_0(new sx_0("Mur destructible, avec HP", new aqo_2("HP"), new aqo_2("incr par level"), new aqo_2("bloque le mouvement (l:oui, 0:non)"), new aqo_2("bloque la ligne de vue (l:oui, 0:non)")));

    public sy_0 au() {
        return y;
    }

    public eks_0(int n, aqd_1 aqd_12, BitSet bitSet, BitSet bitSet2, int n2, int n3, float[] fArray, float[] fArray2, boolean bl, boolean bl2, int n4) {
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

    protected eks_0() {
    }

    @Override
    public int w() {
        return ele_0.h.a();
    }

    @Override
    public void ar() {
        ArrayList<ru_0> arrayList = new ArrayList<ru_0>(Arrays.asList(L));
        this.x = eps_0.b;
        arrayList.add(this.x);
        this.w = new eAA(arrayList);
        this.w.a();
        if (this.q != null && this.q.length >= 4) {
            int n = (int)(this.c(0) + (float)this.c() * this.c(1));
            this.w.b(this.x).g(n);
            this.w.b(this.x).n();
            this.J = this.c(2) == 1.0f;
            this.K = this.c(3) == 1.0f;
            this.H = new eJL(this);
        } else {
            a.error((Object)"nombre de param\u00e8tre incorrect pour la cr\u00e9ation d'un mur");
        }
    }

    @Override
    public boolean e(apq_2 apq_22) {
        return false;
    }

    @Override
    public rs_0 av() {
        return this.b(this.x);
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
        if (this.w != null) {
            return this.w.a(ru_02);
        }
        return false;
    }

    @Override
    public boolean m() {
        return super.m() || this.w.c(this.x) <= 0;
    }

    @Override
    public long[] c(apq_2 apq_22) {
        return null;
    }

    public ArrayList<apq_2> l(apq_2 apq_22) {
        return I;
    }

    @Override
    public byte W() {
        return 6;
    }

    @Override
    public boolean aa() {
        return this.J || this.K;
    }

    @Override
    public boolean ab() {
        return this.J;
    }

    @Override
    public boolean ax() {
        return this.K;
    }

    @Override
    public boolean V() {
        return this.K;
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
    public byte[] I_() {
        abx_2 abx_22 = new abx_2();
        if (this.a(eps_0.b)) {
            abx_22.a(this.d(eps_0.b));
            abx_22.a(this.c(eps_0.b));
        }
        return abx_22.c();
    }

    @Override
    public void b(ByteBuffer byteBuffer) {
        if (this.a(eps_0.b)) {
            int n = byteBuffer.getInt();
            int n2 = byteBuffer.getInt();
            this.b(eps_0.b).g(n);
            this.b(eps_0.b).b(n2);
        }
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

