/*
 * Decompiled with CFR 0.152.
 */
import java.util.Arrays;
import java.util.BitSet;

/*
 * Renamed from aHG
 */
public class ahg_1
extends ahd_1 {
    public static final int e = 0;
    public static final int f = 1;
    public static final int g = 2;
    public static final int h = 3;
    public static final int i = 4;
    public static final int j = 5;
    public static final int k = 6;
    public static final int l = 7;
    public static final int m = 10;
    private BitSet n;
    private long[] o;
    private long p;
    private long q;
    private long[] r;
    private long[] s;

    public ahg_1() {
        this.a(new BitSet(8));
    }

    public ahg_1(BitSet bitSet) {
        this.a(bitSet);
    }

    @Override
    public void a(BitSet bitSet) {
        this.n = bitSet;
        if (this.n.get(4)) {
            this.r = new long[10];
            this.s = new long[10];
        }
        this.o = new long[7];
        this.e();
    }

    @Override
    void e() {
        this.o[0] = 0L;
        this.o[1] = Long.MAX_VALUE;
        this.o[2] = Long.MIN_VALUE;
        this.o[5] = 0L;
        this.o[3] = 0L;
        this.o[6] = 0L;
        this.o[4] = 0L;
        this.q = 0L;
        this.p = 0L;
        if (this.n.get(4)) {
            for (int k = 9; k >= 0; --k) {
                this.r[k] = Long.MAX_VALUE;
                this.s[k] = Long.MIN_VALUE;
            }
        }
    }

    @Override
    public void h() {
        long l = this.o[0];
        if (l > 0L) {
            this.o[3] = this.o[5] / l;
            if (this.n.get(6)) {
                this.o[6] = this.q / l - this.o[3] * this.o[3];
            }
            if (this.n.get(4)) {
                this.o[4] = l != 20L ? this.p / (l - 20L) : Long.MAX_VALUE;
            }
        }
    }

    public void i() {
        this.o[0] = this.o[0] + 1L;
    }

    public void c(long l) {
        this.o[0] = this.o[0] + 1L;
        if (l < this.o[1]) {
            this.o[1] = l;
        }
        if (l > this.o[2]) {
            this.o[2] = l;
        }
        this.o[5] = this.o[5] + l;
        if (this.n.get(4) && this.o[0] > 100L) {
            if (l < this.r[9]) {
                long l2 = this.r[9];
                this.r[9] = l;
                this.p += l - l2;
                Arrays.sort(this.r);
            } else if (l > this.s[0]) {
                long l3 = this.s[0];
                this.r[0] = l;
                this.p += l - l3;
                Arrays.sort(this.r);
            }
        }
        if (this.n.get(6)) {
            this.q += l * l;
        }
    }

    @Override
    protected String a(String string) {
        StringBuilder stringBuilder = new StringBuilder();
        if (this.a() != null) {
            stringBuilder.append(this.a());
        }
        for (int k = 0; k < 7; ++k) {
            if (!this.n.get(k)) continue;
            if (stringBuilder.length() != 0) {
                stringBuilder.append(string);
            }
            if (this.o[k] != Long.MAX_VALUE && this.o[k] != Long.MIN_VALUE) {
                stringBuilder.append(this.o[k]);
                continue;
            }
            stringBuilder.append(0);
        }
        return stringBuilder.toString();
    }
}

