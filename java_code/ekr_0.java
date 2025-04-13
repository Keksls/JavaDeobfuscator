/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.lang3.ArrayUtils
 */
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;
import org.apache.commons.lang3.ArrayUtils;

/*
 * Renamed from eKR
 */
public abstract class ekr_0
extends ekk_0 {
    private static final BitSet y = new BitSet();
    public static final sy_0 w;
    private static final ru_0[] I;
    protected final eAA x = new eAA(I);
    private BitSet J;
    private boolean K = false;
    private boolean L;
    private final long[] M = new long[1];

    public sy_0 au() {
        return w;
    }

    protected ekr_0() {
    }

    @Override
    public void ar() {
        this.x.a();
        this.K = false;
        this.L = true;
        if (this.q == null) {
            return;
        }
        if (this.q.length > 0) {
            boolean bl = this.K = this.c(0) == 1.0f;
        }
        if (this.q.length > 1) {
            this.L = this.c(1) == 0.0f;
        }
    }

    @Override
    public rs_0 b(ru_0 ru_02) {
        return this.x.b(ru_02);
    }

    @Override
    public eAA aw() {
        return this.x;
    }

    @Override
    public boolean a(ru_0 ru_02) {
        return this.x.a(ru_02);
    }

    public ekr_0(int n, aqd_1 aqd_12, BitSet bitSet, BitSet bitSet2, int n2, int n3, float[] fArray, float[] fArray2, boolean bl, boolean bl2, int n4) {
        super(n, aqd_12, bitSet, bitSet2, n2, n3, fArray, fArray2, bl, bl2, n4);
    }

    @Override
    public int w() {
        return ele_0.d.a();
    }

    @Override
    public long[] c(apq_2 apq_22) {
        this.M[0] = apb_2.a(this.h);
        return this.M;
    }

    public ArrayList<apq_2> l(apq_2 apq_22) {
        return null;
    }

    @Override
    public boolean e(apq_2 apq_22) {
        if (this.K) {
            return true;
        }
        if (apq_22 != this.l) {
            return true;
        }
        if (!(this.l instanceof epq_2)) {
            return true;
        }
        if (this.J != null && !this.J.intersects(y)) {
            return true;
        }
        elw_0 elw_02 = (elw_0)this.l;
        els_0 els_02 = elw_02.ck();
        return els_02 == null || !els_02.P().i(elw_02.a_());
    }

    @Override
    public boolean a(BitSet bitSet, apq_2 apq_22) {
        this.J = bitSet;
        boolean bl = this.e(apq_22) && super.a(bitSet, apq_22);
        this.J = null;
        return bl;
    }

    public boolean ay() {
        return this.L;
    }

    @Override
    public byte[] I_() {
        return ArrayUtils.EMPTY_BYTE_ARRAY;
    }

    @Override
    public void b(ByteBuffer byteBuffer) {
    }

    @Override
    public /* synthetic */ aqr_2 c_() {
        return this.au();
    }

    @Override
    public /* synthetic */ List d(apq_2 apq_22) {
        return this.l(apq_22);
    }

    static {
        y.set(10001);
        y.set(10008);
        y.set(10002);
        w = new sy_0(new sx_0("Pi\u00e8ge standard", new aqo_2[0]), new sx_0("Pi\u00e8ge pouvant \u00eatre d\u00e9clench\u00e9 par son proprio", new aqo_2("peut \u00eatre d\u00e9clench\u00e9 par le proprio (1=oui, 0= non (defaut))")), new sx_0("Piege visible pour tout le monde", new aqo_2("peut \u00eatre d\u00e9clench\u00e9 par le proprio (1=oui, 0= non (defaut))"), new aqo_2("visible pour tout le monde (1=oui, 0= non (defaut))")));
        I = new ru_0[]{eps_0.p, eps_0.q, eps_0.r, eps_0.t, eps_0.s, eps_0.ad, eps_0.ae, eps_0.af, eps_0.ag, eps_0.o};
    }
}

