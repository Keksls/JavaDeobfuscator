/*
 * Decompiled with CFR 0.152.
 */
import java.util.BitSet;

/*
 * Renamed from eFB
 */
public class efb_0
extends eFy
implements eFA {
    private final int m;
    private final float n;

    public efb_0(int n, int n2, aqd_1 aqd_12, int[] nArray, int[] nArray2, int[] nArray3, int[] nArray4, int[] nArray5, int[] nArray6, int[] nArray7, long l, apt_2 apt_22, boolean bl, int n3, float f2, float[] fArray, float f3, float f4, boolean bl2, boolean bl3, boolean bl4, boolean bl5, int n4, int n5, apc_2 apc_22, short s2, float f5, byte by, boolean bl6, boolean bl7, boolean bl8, boolean bl9, aqd_1 aqd_13, boolean bl10, boolean bl11, boolean bl12) {
        super(n, n2, aqd_12, nArray, nArray2, nArray3, nArray4, nArray5, nArray6, nArray7, l, apt_22, bl, fArray, f3, f4, bl2, bl3, bl4, bl5, n4, n5, apc_22, s2, f5, by, bl6, bl7, false, bl8, bl9, aqd_13, bl10, bl11, bl12);
        this.m = n3;
        this.n = f2;
    }

    private efb_0(int n, int n2, aqd_1 aqd_12, BitSet bitSet, BitSet bitSet2, BitSet bitSet3, BitSet bitSet4, BitSet bitSet5, BitSet bitSet6, BitSet bitSet7, long l, apt_2 apt_22, boolean bl, int n3, float f2, float[] fArray, float f3, float f4, boolean bl2, boolean bl3, boolean bl4, boolean bl5, int n4, int n5, apc_2 apc_22, short s2, float f5, boolean bl6, boolean bl7, boolean bl8, boolean bl9, aqd_1 aqd_13, boolean bl10, boolean bl11, boolean bl12) {
        super(n, n2, aqd_12, bitSet, bitSet2, bitSet3, bitSet4, bitSet5, bitSet6, bitSet7, l, apt_22, bl, fArray, f3, f4, bl2, bl3, bl4, bl5, n4, n5, apc_22, s2, s2, bl6, false, bl7, bl8, bl9, aqd_13, bl10, bl11, bl12);
        this.m = n3;
        this.n = f2;
    }

    @Override
    public byte h() {
        return 1;
    }

    @Override
    public int a(short s2) {
        return this.m + (int)Math.floor(this.n * (float)s2);
    }

    public efb_0 ad() {
        float[] fArray = this.E();
        float[] fArray2 = new float[fArray.length];
        System.arraycopy(fArray, 0, fArray2, 0, fArray.length);
        efb_0 efb_02 = new efb_0(this.i(), this.j(), this.u(), this.l(), this.m(), this.n(), this.o(), this.p(), this.q(), this.t(), this.w(), this.k(), this.v(), this.m, this.n, fArray2, this.R(), this.ag(), this.a(), this.d(), this.c(), this.e(), this.O(), this.P(), this.Q(), this.x(), this.V(), this.f(), this.L(), this.G(), this.af(), this.U(), this.H(), this.I(), this.J());
        efb_02.c = this.c;
        return efb_02;
    }

    @Override
    public /* synthetic */ eFy ae() {
        return this.ad();
    }

    @Override
    public /* synthetic */ efh_0 K() {
        return this.ad();
    }

    @Override
    public /* synthetic */ Object clone() {
        return this.ad();
    }
}

