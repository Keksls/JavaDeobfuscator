/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.lang3.ArrayUtils
 */
import java.nio.ByteBuffer;
import java.util.BitSet;
import java.util.List;
import org.apache.commons.lang3.ArrayUtils;

/*
 * Renamed from eKP
 */
public abstract class ekp_0
extends ekk_0 {
    public static final sy_0 w = new sy_0(new sx_0("LootArea standard", new aqo_2[0]));
    private aej_2 x;
    private final long[] y = new long[1];

    @Override
    public aqr_2 c_() {
        return w;
    }

    protected ekp_0(int n, aqd_1 aqd_12, BitSet bitSet, BitSet bitSet2, int n2, int n3, float[] fArray, float[] fArray2, boolean bl, boolean bl2, int n4) {
        super(n, aqd_12, bitSet, bitSet2, n2, n3, fArray, fArray2, bl, bl2, n4);
    }

    protected ekp_0() {
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

    @Override
    public void ar() {
    }

    @Override
    public int w() {
        return ele_0.l.a();
    }

    @Override
    public long[] c(apq_2 apq_22) {
        this.y[0] = apb_2.a(apq_22.G(), apq_22.H(), apq_22.I());
        return this.y;
    }

    @Override
    public List<apq_2> d(apq_2 apq_22) {
        return null;
    }

    @Override
    public boolean e(apq_2 apq_22) {
        return true;
    }

    @Override
    public aej_2 F() {
        return this.x;
    }

    @Override
    public void a(aej_2 aej_22) {
        this.x = aej_22;
    }

    @Override
    public byte[] I_() {
        return ArrayUtils.EMPTY_BYTE_ARRAY;
    }

    @Override
    public void b(ByteBuffer byteBuffer) {
    }

    @Override
    public /* synthetic */ sr_0 a(st_0 st_02) {
        return this.b((elb_0)st_02);
    }
}

