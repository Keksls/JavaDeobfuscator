/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;
import java.util.BitSet;
import java.util.List;

/*
 * Renamed from eKB
 */
public abstract class ekb_0
extends ekk_0 {
    public static final sy_0 w = new sy_0(new sx_0("Art\u00e9fact standard", new aqo_2[0]));
    private final long[] x = new long[1];

    protected ekb_0() {
    }

    protected ekb_0(int n, aqd_1 aqd_12, BitSet bitSet, BitSet bitSet2, int n2, int n3, float[] fArray, float[] fArray2, boolean bl, boolean bl2, int n4) {
        super(n, aqd_12, bitSet, bitSet2, n2, n3, fArray, fArray2, bl, bl2, n4);
    }

    @Override
    public int w() {
        return ele_0.r.a();
    }

    @Override
    public long[] c(apq_2 apq_22) {
        if (apq_22 != null) {
            this.x[0] = apb_2.a(apq_22.G(), apq_22.H(), apq_22.I());
            return this.x;
        }
        return null;
    }

    @Override
    public List<apq_2> d(apq_2 apq_22) {
        return null;
    }

    @Override
    public boolean e(apq_2 apq_22) {
        return true;
    }

    public sy_0 as() {
        return w;
    }

    @Override
    public void ar() {
    }

    @Override
    public byte[] I_() {
        return new byte[0];
    }

    @Override
    public void b(ByteBuffer byteBuffer) {
    }

    @Override
    public /* synthetic */ aqr_2 c_() {
        return this.as();
    }
}

