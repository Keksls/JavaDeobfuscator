/*
 * Decompiled with CFR 0.152.
 */
import java.util.BitSet;

public class eFs
extends eFy
implements efp_0 {
    private final int m;
    private final float n;
    private boolean o;
    private boolean p;
    private final int q;
    private final float r;
    private boolean s;

    public eFs(int n, int n2, aqd_1 aqd_12, int[] nArray, int[] nArray2, int[] nArray3, int[] nArray4, int[] nArray5, int[] nArray6, int[] nArray7, long l, apt_2 apt_22, boolean bl, int n3, float f2, boolean bl2, boolean bl3, int n4, float f3, float[] fArray, float f4, float f5, boolean bl4, boolean bl5, boolean bl6, boolean bl7, int n5, int n6, apc_2 apc_22, short s2, float f6, byte by, boolean bl8, boolean bl9, boolean bl10, boolean bl11, aqd_1 aqd_13, boolean bl12, boolean bl13, boolean bl14, boolean bl15) {
        super(n, n2, aqd_12, nArray, nArray2, nArray3, nArray4, nArray5, nArray6, nArray7, l, apt_22, bl, fArray, f4, f5, bl4, bl5, bl6, bl7, n5, n6, apc_22, s2, f6, by, bl8, bl9, bl10, false, bl11, aqd_13, bl13, bl14, bl15);
        this.m = n3;
        this.n = f2;
        this.q = n4;
        this.r = f3;
        this.o = bl3;
        this.p = bl2;
        this.s = bl12;
    }

    private eFs(int n, int n2, aqd_1 aqd_12, BitSet bitSet, BitSet bitSet2, BitSet bitSet3, BitSet bitSet4, BitSet bitSet5, BitSet bitSet6, BitSet bitSet7, long l, apt_2 apt_22, boolean bl, int n3, float f2, boolean bl2, boolean bl3, int n4, float f3, float[] fArray, float f4, float f5, boolean bl4, boolean bl5, boolean bl6, boolean bl7, int n5, int n6, apc_2 apc_22, short s2, float f6, boolean bl8, boolean bl9, boolean bl10, boolean bl11, aqd_1 aqd_13, boolean bl12, boolean bl13, boolean bl14) {
        super(n, n2, aqd_12, bitSet, bitSet2, bitSet3, bitSet4, bitSet5, bitSet6, bitSet7, l, apt_22, bl, fArray, f4, f5, bl4, bl5, bl6, bl7, n5, n6, apc_22, s2, f6, bl8, bl9, false, bl10, bl11, aqd_13, bl12, bl13, bl14);
        this.m = n3;
        this.n = f2;
        this.q = n4;
        this.r = f3;
    }

    @Override
    public byte h() {
        return 2;
    }

    @Override
    public vx_0 c(short s2) {
        short s3 = (short)(this.m + (int)Math.floor(this.n * (float)s2));
        return vx_0.a(s3).a(this.p).b(this.o).a((short)(s3 + 1));
    }

    @Override
    public vx_0 d(short s2) {
        short s3 = (short)(this.q + (int)Math.floor(this.r * (float)s2));
        return vx_0.a(s3).a(this.p);
    }

    @Override
    public eFy ae() {
        float[] fArray = this.E();
        float[] fArray2 = new float[fArray.length];
        System.arraycopy(fArray, 0, fArray2, 0, fArray.length);
        eFs eFs2 = new eFs(this.i(), this.j(), this.u(), this.l(), this.m(), this.n(), this.o(), this.p(), this.q(), this.t(), this.w(), this.k(), this.v(), this.m, this.n, this.p, this.o, this.q, this.r, fArray2, this.R(), this.ag(), this.a(), this.d(), this.c(), this.e(), this.O(), this.P(), this.Q(), this.x(), this.V(), this.f(), this.L(), this.G(), this.af(), this.U(), this.H(), this.I(), this.J());
        eFs2.c = this.c;
        return eFs2;
    }

    @Override
    public boolean ad() {
        return this.s;
    }

    @Override
    public /* synthetic */ efh_0 K() {
        return this.ae();
    }

    @Override
    public /* synthetic */ Object clone() {
        return this.ae();
    }
}

