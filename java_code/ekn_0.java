/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;

/*
 * Renamed from eKN
 */
public abstract class ekn_0
extends ekk_0 {
    public static final sy_0 w = new sy_0(new sx_0("Glyphe standard", new aqo_2[0]), new sx_0("Glyphe param\u00e9tr\u00e9", new aqo_2("0 : rien (default), 1 : le caster doit rester sur sa position")), new sx_0("Glyphe appartenant au caster", new aqo_2("0 : rien (default), 1 : le caster doit rester sur sa position"), new aqo_2("0 : le glyphe est caster des effets (default), 1 : le caster du glyphe est caster des effets")));
    private final aff_1 y = new aff_1();
    private boolean I;
    protected boolean x;
    private final long[] J = new long[1];
    private aej_2 K = aej_2.h;

    public sy_0 as() {
        return w;
    }

    protected ekn_0() {
    }

    public ekn_0(int n, aqd_1 aqd_12, BitSet bitSet, BitSet bitSet2, int n2, int n3, float[] fArray, float[] fArray2, boolean bl, boolean bl2, int n4) {
        super(n, aqd_12, bitSet, bitSet2, n2, n3, fArray, fArray2, bl, bl2, n4);
    }

    public ekn_0 c(elb_0 elb_02) {
        ekn_0 ekn_02 = (ekn_0)super.b(elb_02);
        if (elb_02 != null) {
            if (elb_02.f() != null) {
                Su su = elb_02.f();
                ekn_02.d(su.G(), su.H(), su.I());
            }
            ekn_02.a(elb_02.i());
        }
        return ekn_02;
    }

    @Override
    public void ar() {
        if (this.q == null) {
            this.I = false;
            this.x = false;
            return;
        }
        this.I = this.q.length > 0 && this.c(0) == 1.0f;
        this.x = this.q.length > 1 && this.c(1) == 1.0f;
    }

    public void d(int n, int n2, short s2) {
        this.y.b(n);
        this.y.c(n2);
        this.y.a(s2);
    }

    public boolean au() {
        if (!this.I) {
            return true;
        }
        if (this.l == null) {
            return false;
        }
        return this.y.b(this.l.G(), this.l.H(), (int)this.l.I());
    }

    @Override
    public int w() {
        return ele_0.a.a();
    }

    @Override
    public long[] c(apq_2 apq_22) {
        if (apq_22 != null) {
            this.J[0] = apb_2.a(apq_22.G(), apq_22.H(), apq_22.I());
            return this.J;
        }
        return null;
    }

    public ArrayList<apq_2> l(apq_2 apq_22) {
        if (apq_22 == null) {
            return null;
        }
        ArrayList<apq_2> arrayList = new ArrayList<apq_2>();
        arrayList.add(apq_22);
        return arrayList;
    }

    @Override
    public boolean e(apq_2 apq_22) {
        return true;
    }

    @Override
    public int ag() {
        return this.y.d();
    }

    @Override
    public int ah() {
        return this.y.e();
    }

    @Override
    public short ai() {
        return this.y.f();
    }

    @Override
    public aej_2 F() {
        return aej_2.h;
    }

    @Override
    public void a(aej_2 aej_22) {
        this.K = aej_22;
    }

    @Override
    public byte[] I_() {
        abx_2 abx_22 = new abx_2();
        abx_22.a(this.I ? (byte)1 : 0);
        abx_22.a(this.y.d());
        abx_22.a(this.y.e());
        abx_22.a(this.y.f());
        abx_22.a((byte)this.K.l);
        return abx_22.c();
    }

    @Override
    public void b(ByteBuffer byteBuffer) {
        this.I = byteBuffer.get() == 1;
        this.d(byteBuffer.getInt(), byteBuffer.getInt(), byteBuffer.getShort());
        aej_2 aej_22 = aej_2.a(byteBuffer.get());
        this.a(aej_22);
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
    public /* synthetic */ List d(apq_2 apq_22) {
        return this.l(apq_22);
    }

    @Override
    public /* synthetic */ sr_0 a(st_0 st_02) {
        return this.c((elb_0)st_02);
    }
}

