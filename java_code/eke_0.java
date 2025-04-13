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
 * Renamed from eKE
 */
public abstract class eke_0
extends ekk_0 {
    public static final sy_0 w = new sy_0(new sx_0("Aura de tour de bulle de combat", new aqo_2[0]), new sx_0("Bordure bloquante", new aqo_2("Bloquante (1 = oui, 0 = non (defaut))")), new sx_0("Bordure invisible", new aqo_2("Bloquante (1 = oui, 0 = non (defaut))"), new aqo_2("Invisible (1 = oui, 0 = non (defaut))")));
    protected boolean x = false;
    protected boolean y = false;
    private final long[] I = new long[1];

    public sy_0 as() {
        return w;
    }

    protected eke_0() {
    }

    public eke_0(int n, BitSet bitSet, BitSet bitSet2, int n2, int n3, float[] fArray, float[] fArray2, boolean bl, boolean bl2, int n4) {
        super(n, null, bitSet, bitSet2, n2, n3, fArray, fArray2, bl, bl2, n4);
    }

    @Override
    public int w() {
        return ele_0.f.a();
    }

    @Override
    public void ar() {
        if (this.S() >= 1) {
            boolean bl = this.x = (int)this.c(0) == 1;
        }
        if (this.S() >= 2) {
            this.y = (int)this.c(0) == 1;
        }
    }

    @Override
    public boolean ab() {
        return this.x;
    }

    public boolean au() {
        return this.y;
    }

    @Override
    public void a(tg_0 tg_02) {
        this.i = new ekv_0(tg_02);
        if (this.x) {
            tg_02.y();
        }
    }

    @Override
    public void af() {
        if (this.i instanceof ekv_0) {
            this.v = ((ekv_0)this.i).j();
        } else {
            super.af();
        }
    }

    @Override
    public long[] c(apq_2 apq_22) {
        if (apq_22 != null) {
            this.I[0] = apb_2.a(apq_22.G(), apq_22.H(), apq_22.I());
            return this.I;
        }
        return null;
    }

    public ArrayList<apq_2> l(apq_2 apq_22) {
        ArrayList<apq_2> arrayList = new ArrayList<apq_2>();
        arrayList.add(apq_22);
        return arrayList;
    }

    @Override
    public boolean e(apq_2 apq_22) {
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

    @Override
    public /* synthetic */ List d(apq_2 apq_22) {
        return this.l(apq_22);
    }
}

