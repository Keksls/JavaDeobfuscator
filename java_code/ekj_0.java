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
 * Renamed from eKJ
 */
public abstract class ekj_0
extends ekk_0 {
    public static final sy_0 w = new sy_0(new sx_0("Gisement standard", new aqo_2("Niveau du gisement")));
    private final long[] x = new long[1];

    @Override
    public aqr_2 c_() {
        return w;
    }

    protected ekj_0(int n, aqd_1 aqd_12, BitSet bitSet, BitSet bitSet2, int n2, int n3, float[] fArray, float[] fArray2, boolean bl, boolean bl2, int n4) {
        super(n, aqd_12, bitSet, bitSet2, n2, n3, fArray, fArray2, bl, bl2, n4);
    }

    protected ekj_0() {
    }

    @Override
    public void ar() {
    }

    @Override
    public int w() {
        return ele_0.k.a();
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

    public int as() {
        return (int)this.c(0);
    }

    @Override
    public byte[] I_() {
        return ArrayUtils.EMPTY_BYTE_ARRAY;
    }

    @Override
    public void b(ByteBuffer byteBuffer) {
    }
}

