/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.lang3.ArrayUtils
 *  org.jetbrains.annotations.Nullable
 */
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;
import org.apache.commons.lang3.ArrayUtils;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from eKC
 */
public abstract class ekc_0
extends ekk_0 {
    public static final sy_0 w = new sy_0(new sx_0("Aura standard", new aqo_2[0]));
    private final long[] x = new long[1];

    public sy_0 au() {
        return w;
    }

    protected ekc_0() {
    }

    public ekc_0(int n, aqd_1 aqd_12, BitSet bitSet, BitSet bitSet2, int n2, int n3, float[] fArray, float[] fArray2, boolean bl, boolean bl2, int n4) {
        super(n, aqd_12, bitSet, bitSet2, n2, n3, fArray, fArray2, bl, bl2, n4);
    }

    @Override
    public void ar() {
    }

    @Override
    public int w() {
        return ele_0.e.a();
    }

    @Override
    public int G() {
        return this.l.G();
    }

    @Override
    public int H() {
        return this.l.H();
    }

    @Override
    public short I() {
        return this.l.I();
    }

    @Override
    public void a(int n, int n2, short s2) {
    }

    @Override
    public boolean a(BitSet bitSet, apq_2 apq_22) {
        if (apq_22 == this.l && bitSet.get(10004)) {
            return true;
        }
        return super.a(bitSet, apq_22);
    }

    @Override
    public void a(BitSet bitSet, @Nullable sd_0 sd_02, apq_2 apq_22) {
        if (apq_22 == this.l && (bitSet.get(10001) || bitSet.get(10002))) {
            return;
        }
        super.a(bitSet, sd_02, apq_22);
    }

    @Override
    public boolean N() {
        return false;
    }

    @Override
    public long[] c(apq_2 apq_22) {
        if (apq_22 != null) {
            this.x[0] = apb_2.a(apq_22.G(), apq_22.H(), apq_22.I());
            return this.x;
        }
        return null;
    }

    public ArrayList<apq_2> l(apq_2 apq_22) {
        ArrayList<apq_2> arrayList = new ArrayList<apq_2>();
        if (apq_22 != null) {
            arrayList.add(apq_22);
        }
        return arrayList;
    }

    @Override
    public boolean e(apq_2 apq_22) {
        return true;
    }

    @Override
    public void af() {
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
}

