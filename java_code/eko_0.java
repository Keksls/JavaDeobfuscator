/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collection;
import java.util.List;

/*
 * Renamed from eKO
 */
public abstract class eko_0
extends ekk_0 {
    public static final sy_0 w = new sy_0(new sx_0("Heure standard", new aqo_2[0]));
    private boolean x = false;
    private byte y;
    private final long[] I = new long[1];

    public sy_0 as() {
        return w;
    }

    public eko_0(int n, aqd_1 aqd_12, BitSet bitSet, BitSet bitSet2, int n2, int n3, float[] fArray, float[] fArray2, boolean bl, boolean bl2, int n4) {
        super(n, aqd_12, bitSet, bitSet2, n2, n3, fArray, fArray2, bl, bl2, n4);
    }

    protected eko_0() {
    }

    @Override
    public void ar() {
    }

    @Override
    public int w() {
        return ele_0.b.a();
    }

    public boolean au() {
        return this.x;
    }

    public void f(boolean bl) {
        this.x = bl;
    }

    public void c(byte by) {
        this.y = by;
    }

    public byte ay() {
        return this.y;
    }

    @Override
    public boolean C() {
        return true;
    }

    @Override
    public boolean D() {
        return false;
    }

    @Override
    public void a(int n, int n2, short s2, sd_0 sd_02) {
    }

    @Override
    public long[] c(apq_2 apq_22) {
        if (apq_22 == this.l) {
            this.I[0] = apb_2.a(this.l.G(), this.l.H(), this.l.I());
            return this.I;
        }
        return null;
    }

    public ArrayList<apq_2> l(apq_2 apq_22) {
        ArrayList<apq_2> arrayList = new ArrayList<apq_2>();
        if (this.l != null) {
            arrayList.add(this.l);
        }
        return arrayList;
    }

    @Override
    public boolean e(apq_2 apq_22) {
        return this.l == apq_22;
    }

    @Override
    public void f(apq_2 apq_22) {
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
            if (sr_02 == this || sr_02.G() != this.G() || sr_02.H() != this.H() || sr_02.I() != this.I() || sr_02.v() != this.v()) continue;
            arrayList.add(sr_02);
        }
        return arrayList;
    }

    @Override
    public byte[] I_() {
        abx_2 abx_22 = new abx_2();
        abx_22.a(this.y);
        abx_22.a((byte)(this.x ? 1 : 0));
        return abx_22.c();
    }

    @Override
    public void b(ByteBuffer byteBuffer) {
        this.c(byteBuffer.get());
        this.f(byteBuffer.get() == 1);
    }

    @Override
    public /* synthetic */ aqr_2 c_() {
        return this.as();
    }

    @Override
    public /* synthetic */ List d(apq_2 apq_22) {
        return this.l(apq_22);
    }
}

