/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.List;

/*
 * Renamed from eKL
 */
public abstract class ekl_0
extends ekk_0 {
    private static final int S = 1;
    private static final int T = 2;
    private static final int U = 4;
    private static final int V = 8;
    private static final int W = 16;
    private static final int X = 32;
    private static final int Y = 64;
    public static final int w = 1;
    public static final int x = 2;
    public static final int y = 4;
    public static final int I = 6;
    public static final sy_0 J;
    protected aej_2 K;
    protected boolean L;
    protected boolean M;
    protected boolean N;
    protected boolean O;
    protected byte P;
    protected int Q;
    protected eAA R;
    private final long[] Z = new long[1];

    public sy_0 as() {
        return J;
    }

    public ekl_0(int n, aqd_1 aqd_12, BitSet bitSet, BitSet bitSet2, int n2, int n3, float[] fArray, float[] fArray2, boolean bl, boolean bl2, int n4) {
        super(n, aqd_12, bitSet, bitSet2, n2, n3, fArray, fArray2, bl, bl2, n4);
    }

    public ekl_0 c(elb_0 elb_02) {
        ekl_0 ekl_02 = (ekl_0)super.b(elb_02);
        if (elb_02 != null && elb_02.i() != null) {
            ekl_02.a(elb_02.i());
        }
        return ekl_02;
    }

    protected ekl_0() {
    }

    @Override
    public int w() {
        return ele_0.n.a();
    }

    @Override
    public void ar() {
        Object object;
        boolean bl;
        this.Q = Math.round(this.c(0));
        boolean bl2 = this.c(1) != -1.0f;
        boolean bl3 = this.c(9) >= 0.0f && this.c(9) <= 127.0f;
        boolean bl4 = bl = this.q.length >= 14;
        if (bl2 || bl3 || bl) {
            eps_0 eps_02;
            byte by;
            object = new ArrayList();
            if (bl2) {
                ((ArrayList)object).add(eps_0.b);
            }
            if (bl3) {
                ((ArrayList)object).add(eps_0.p);
            }
            int n = 10;
            while (this.q.length >= n + 4) {
                by = (byte)this.c(n);
                eps_02 = eps_0.a(by);
                if (eps_02 == null) {
                    a.error((Object)("Unable to add dynamic charac " + this.c(n) + " to effectarea : unknown charac"));
                } else {
                    ((ArrayList)object).add(eps_02);
                }
                n += 4;
            }
            if (((ArrayList)object).size() > 0) {
                this.R = new eAA((Iterable<ru_0>)object);
                this.R.a();
            }
            n = 10;
            while (this.q.length >= n + 4) {
                by = (byte)this.c(n);
                eps_02 = eps_0.a(by);
                if (eps_02 != null) {
                    epa_1 epa_12 = (epa_1)this.b(eps_02);
                    if (epa_12 == null) {
                        a.error((Object)"UNable to find a newly created dynamic charac for this effect area");
                    } else {
                        int n2 = (int)this.c(n + 1);
                        int n3 = (int)this.c(n + 2);
                        int n4 = (int)this.c(n + 3);
                        if (n3 == -2) {
                            epa_12.h(epa_12.w());
                        } else if (n3 != -1) {
                            epa_12.h(n3);
                        }
                        if (n4 == -2) {
                            epa_12.g(epa_12.x());
                        } else if (n4 != -1) {
                            epa_12.g(n4);
                        }
                        epa_12.b(n2);
                    }
                }
                n += 4;
            }
        }
        object = this.v();
        if (bl2) {
            float f2 = this.c(1);
            float f3 = this.c(2);
            int n = (int)(f2 + (float)this.c() * f3);
            this.R.b(eps_0.b).g(n);
            this.R.b(eps_0.b).n();
        }
        if (bl3 && object != null) {
            rs_0 rs_02 = this.b(eps_0.p);
            byte by = (byte)this.c(9);
            if (object.a(eps_0.p) && (by & 1) != 0) {
                rs_02.c(object.c(eps_0.p));
            }
            if (object.a(eps_0.q) && (by & 2) != 0) {
                rs_02.c(object.c(eps_0.q));
            }
            if (object.a(eps_0.r) && (by & 4) != 0) {
                rs_02.c(object.c(eps_0.r));
            }
            if (object.a(eps_0.s) && (by & 8) != 0) {
                rs_02.c(object.c(eps_0.s));
            }
            if (object.a(eps_0.t) && (by & 0x10) != 0) {
                rs_02.c(object.c(eps_0.t));
            }
            if (object.a(eps_0.R) && (by & 0x20) != 0) {
                rs_02.c(object.c(eps_0.R));
            }
        }
        this.L = this.c(3) == 1.0f;
        this.M = this.c(4) == 1.0f;
        this.H = this.c(5) == 1.0f ? new eJL(this) : null;
        this.N = this.c(6) == 1.0f;
        this.O = this.c(7) == 1.0f;
        int n = (int)this.c(8);
        this.P = n <= 0 ? (byte)6 : (byte)n;
    }

    @Override
    public boolean aa() {
        return this.L || this.M;
    }

    @Override
    public boolean ab() {
        return this.L;
    }

    @Override
    public boolean ax() {
        return this.M;
    }

    @Override
    public boolean e(apq_2 apq_22) {
        if (apq_22 == this.l) {
            return this.N;
        }
        return this.O;
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
    public rs_0 av() {
        return this.b(eps_0.b);
    }

    @Override
    public rs_0 b(ru_0 ru_02) {
        if (this.R == null) {
            return null;
        }
        return this.R.b(ru_02);
    }

    @Override
    public eAA aw() {
        return this.R;
    }

    @Override
    public boolean a(ru_0 ru_02) {
        if (this.R == null) {
            return false;
        }
        return this.R.a(ru_02);
    }

    @Override
    public long[] c(apq_2 apq_22) {
        if (apq_22 != null) {
            this.Z[0] = apb_2.a(apq_22.G(), apq_22.H(), apq_22.I());
            return this.Z;
        }
        return null;
    }

    @Override
    public List<apq_2> d(apq_2 apq_22) {
        return Collections.singletonList(this.l);
    }

    @Override
    public byte W() {
        return this.P;
    }

    public int au() {
        return this.Q;
    }

    @Override
    public boolean m() {
        if (super.m()) {
            return true;
        }
        if (this.R != null && this.a(eps_0.b)) {
            return this.R.c(eps_0.b) <= 0;
        }
        return false;
    }

    @Override
    public void a(aej_2 aej_22) {
        this.K = aej_22;
    }

    @Override
    public aej_2 F() {
        if (this.K == null) {
            return super.F();
        }
        return this.K;
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
    public /* synthetic */ ekk_0 b(elb_0 elb_02) {
        return this.c(elb_02);
    }

    @Override
    public /* synthetic */ aqr_2 c_() {
        return this.as();
    }

    @Override
    public /* synthetic */ sr_0 a(st_0 st_02) {
        return this.c((elb_0)st_02);
    }

    static {
        ArrayList<sx_0> arrayList = new ArrayList<sx_0>();
        ArrayList<aqo_2> arrayList2 = new ArrayList<aqo_2>();
        arrayList2.add(new aqo_2("UserDefined ID"));
        arrayList2.add(new aqo_2("PV (-1 = pas de PV)"));
        arrayList2.add(new aqo_2("PV inc par level (useless si HP == -1)"));
        arrayList2.add(new aqo_2("Bloque mouvement (oui si 1, non sinon)"));
        arrayList2.add(new aqo_2("Bloque ligne de vue (oui si 1, non sinon)"));
        arrayList2.add(new aqo_2("Avec RunningEffectManager (oui si 1, non sinon)"));
        arrayList2.add(new aqo_2("P-e triggered par owner (oui si 1, non sinon)"));
        arrayList2.add(new aqo_2("P-e triggered par qqun d'autre (oui si 1, non sinon)"));
        arrayList2.add(new aqo_2("Hauteur (NORMAL_HEIGHT si <= 0)"));
        arrayList2.add(new aqo_2("Bonus d\u00e9gats owner recopi\u00e9s (-1:aucun 1:phys 2:Feu 4:Eau 8:Terre 16:Air 32:Stasis 64:Meca"));
        arrayList.add(new sx_0("Fake fighter sous forme d'effect area", arrayList2.toArray(new aqo_2[arrayList2.size()])));
        for (int k = 1; k < 6; ++k) {
            arrayList2.add(new aqo_2("Charac#" + k + " : id"));
            arrayList2.add(new aqo_2("Charac#" + k + " : valeur initiale"));
            arrayList2.add(new aqo_2("Charac#" + k + " : valeur min (-1 = default min, -2 = lower bound)"));
            arrayList2.add(new aqo_2("Charac#" + k + " : valeur max (-1 = default max, -2 = upper bound)"));
            arrayList.add(new sx_0("Fake fighter avec " + k + " charac dynamique", arrayList2.toArray(new aqo_2[arrayList2.size()])));
        }
        J = new sy_0(arrayList.toArray(new sx_0[arrayList.size()]));
    }
}

