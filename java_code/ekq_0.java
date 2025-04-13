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
 * Renamed from eKQ
 */
public abstract class ekq_0
extends ekk_0 {
    public static final sy_0 w = new sy_0(new sx_0("Case simple", new aqo_2[0]));
    private int x = ele_0.g.a();
    private aej_2 y;

    public sy_0 as() {
        return w;
    }

    public ekq_0(int n, aqd_1 aqd_12, BitSet bitSet, BitSet bitSet2, int n2, int n3, float[] fArray, float[] fArray2, boolean bl, boolean bl2, int n4) {
        super(n, aqd_12, bitSet, bitSet2, n2, n3, fArray, fArray2, bl, bl2, n4);
    }

    public ekq_0 c(elb_0 elb_02) {
        ekq_0 ekq_02 = (ekq_0)super.b(elb_02);
        ekq_02.x = this.x;
        if (elb_02 != null && elb_02.i() != null) {
            ekq_02.a(elb_02.i());
        }
        return ekq_02;
    }

    protected ekq_0() {
    }

    @Override
    public int w() {
        return this.x;
    }

    public void d(int n) {
        this.x = n;
    }

    @Override
    public void ar() {
    }

    @Override
    public boolean e(apq_2 apq_22) {
        return apq_22 == this.l;
    }

    @Override
    public long[] c(apq_2 apq_22) {
        return null;
    }

    public ArrayList<apq_2> l(apq_2 apq_22) {
        ArrayList<apq_2> arrayList = new ArrayList<apq_2>();
        arrayList.add(apq_22);
        return arrayList;
    }

    @Override
    public byte W() {
        return 6;
    }

    @Override
    public void a(aej_2 aej_22) {
        if (aej_22 != null) {
            this.y = aej_22;
        }
    }

    @Override
    public aej_2 F() {
        if (this.y == null) {
            return super.F();
        }
        return this.y;
    }

    @Override
    public byte[] I_() {
        return ArrayUtils.EMPTY_BYTE_ARRAY;
    }

    @Override
    public void b(ByteBuffer byteBuffer) {
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

