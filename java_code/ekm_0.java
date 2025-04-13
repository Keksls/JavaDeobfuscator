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
 * Renamed from eKM
 */
public abstract class ekm_0
extends ekk_0 {
    public static final sy_0 w = new sy_0(new sx_0("Portail standard", new aqo_2[0]));

    @Override
    public aqr_2 c_() {
        return w;
    }

    protected ekm_0() {
    }

    protected ekm_0(int n, aqd_1 aqd_12, BitSet bitSet, BitSet bitSet2, int n2, int n3, float[] fArray, float[] fArray2, boolean bl, boolean bl2, int n4) {
        super(n, aqd_12, bitSet, bitSet2, n2, n3, fArray, fArray2, bl, bl2, n4);
    }

    @Override
    public void ar() {
    }

    @Override
    public long[] c(apq_2 apq_22) {
        return null;
    }

    public ArrayList<apq_2> l(apq_2 apq_22) {
        return null;
    }

    @Override
    public boolean e(apq_2 apq_22) {
        return false;
    }

    @Override
    public int w() {
        return ele_0.q.a();
    }

    @Override
    public byte[] I_() {
        return ArrayUtils.EMPTY_BYTE_ARRAY;
    }

    @Override
    public void b(ByteBuffer byteBuffer) {
    }

    @Override
    public /* synthetic */ List d(apq_2 apq_22) {
        return this.l(apq_22);
    }
}

