/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;
import java.security.InvalidParameterException;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/*
 * Renamed from eKT
 */
public abstract class ekt_0
extends ekk_0 {
    public static final sy_0 w = new sy_0(new sx_0("Warp standard", new aqo_2[0]));
    protected aff_1 x;
    protected aff_1 y;
    protected boolean I;
    private final long[] J = new long[1];

    @Override
    public aqr_2 c_() {
        return w;
    }

    protected ekt_0() {
    }

    protected ekt_0(int n, aqd_1 aqd_12, BitSet bitSet, BitSet bitSet2, int n2, int n3, float[] fArray, float[] fArray2, boolean bl, boolean bl2, int n4) {
        super(n, aqd_12, bitSet, bitSet2, n2, n3, fArray, fArray2, bl, bl2, n4);
    }

    @Override
    public ekk_0 b(elb_0 elb_02) {
        ekt_0 ekt_02 = (ekt_0)super.b(elb_02);
        if (this.x != null) {
            ekt_02.x = new aff_1(this.x);
        }
        if (this.y != null) {
            ekt_02.y = new aff_1(this.y);
        }
        return ekt_02;
    }

    @Override
    public void ar() {
        if (this.I) {
            return;
        }
        Iterable<int[]> iterable = this.l != null ? this.P().a(this.h.d(), this.h.e(), this.h.f(), this.l.G(), this.l.H(), this.l.I(), this.l.F()) : this.P().a(this.h.d(), this.h.e(), this.h.f(), this.h.d(), this.h.e(), this.h.f(), this.F());
        Iterator<int[]> iterator = iterable.iterator();
        if (!iterator.hasNext()) {
            throw new InvalidParameterException("Un warp doit avoir une zone d'effet de deux poins uniquement");
        }
        this.x = new aff_1(iterator.next());
        if (!iterator.hasNext()) {
            throw new InvalidParameterException("Un warp doit avoir une zone d'effet de deux poins uniquement");
        }
        this.y = new aff_1(iterator.next());
        if (iterator.hasNext()) {
            throw new InvalidParameterException("Un warp doit avoir une zone d'effet de deux poins uniquement");
        }
    }

    @Override
    public int w() {
        return ele_0.i.a();
    }

    @Override
    public long[] c(apq_2 apq_22) {
        if (apq_22 != null) {
            this.J[0] = apb_2.a(apq_22.G(), apq_22.H(), apq_22.I());
            return this.J;
        }
        return null;
    }

    @Override
    public List<apq_2> d(apq_2 apq_22) {
        return Collections.emptyList();
    }

    @Override
    public boolean e(apq_2 apq_22) {
        return true;
    }

    @Override
    public byte[] I_() {
        abx_2 abx_22 = new abx_2();
        abx_22.a(apb_2.a(this.x.d(), this.x.e(), this.x.f()));
        abx_22.a(apb_2.a(this.y.d(), this.y.e(), this.y.f()));
        return abx_22.c();
    }

    @Override
    public void b(ByteBuffer byteBuffer) {
        this.x = apb_2.a(byteBuffer.getLong());
        this.y = apb_2.a(byteBuffer.getLong());
        this.I = true;
    }

    public Iterable<int[]> au() {
        ArrayList<int[]> arrayList = new ArrayList<int[]>();
        arrayList.add(this.x.g());
        arrayList.add(this.y.g());
        return arrayList;
    }

    @Override
    public /* synthetic */ sr_0 a(st_0 st_02) {
        return this.b((elb_0)st_02);
    }
}

