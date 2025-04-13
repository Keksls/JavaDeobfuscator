/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from eLb
 */
public class elb_0
extends st_0 {
    private final long a;
    private final short b;
    private final aej_2 c;
    private byte d = (byte)-1;

    public elb_0(long l, int n, int n2, short s2, So so, long l2, Su su, short s3, aej_2 aej_22) {
        super(l, n, n2, s2, so, su);
        this.a = l2;
        this.b = s3;
        this.c = aej_22;
    }

    public long g() {
        return this.a;
    }

    public short h() {
        return this.b;
    }

    public aej_2 i() {
        return this.c;
    }

    public void a(byte by) {
        this.d = by;
    }

    public byte j() {
        return this.d;
    }
}

