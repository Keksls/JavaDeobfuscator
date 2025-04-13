/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.lang3.ArrayUtils
 */
import java.nio.ByteBuffer;
import java.util.BitSet;
import java.util.Collections;
import java.util.List;
import org.apache.commons.lang3.ArrayUtils;

/*
 * Renamed from eKU
 */
public abstract class eku_0
extends ekk_0 {
    public static final sy_0 w = new sy_0(new sx_0("Case simple", new aqo_2[0]));

    public sy_0 as() {
        return w;
    }

    public eku_0(int n, aqd_1 aqd_12, BitSet bitSet, BitSet bitSet2, int n2, int n3, float[] fArray, float[] fArray2, boolean bl, boolean bl2, int n4) {
        super(n, aqd_12, bitSet, bitSet2, n2, n3, fArray, fArray2, bl, bl2, n4);
    }

    protected eku_0() {
    }

    @Override
    public void ar() {
        this.H = new eJL(this);
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
    public int w() {
        return ele_0.m.a();
    }

    @Override
    public long[] c(apq_2 apq_22) {
        return null;
    }

    @Override
    public List<apq_2> d(apq_2 apq_22) {
        return Collections.emptyList();
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
    public byte[] I_() {
        return ArrayUtils.EMPTY_BYTE_ARRAY;
    }

    @Override
    public void b(ByteBuffer byteBuffer) {
    }

    @Override
    public /* synthetic */ aqr_2 c_() {
        return this.as();
    }
}

