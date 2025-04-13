/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aMn
 */
public class amn_1
implements amk_1 {
    private long a;
    private final long b;
    private final float c;
    private final float d;
    private final int e;
    private final long f;
    private final long g;
    private int h = -1;
    private final alo_1 i;
    private final int j;
    private final boolean k;

    public amn_1(long l, long l2, float f2, float f3, int n, long l3, long l4, int n2) {
        this.a = l;
        this.b = l2;
        this.c = f2;
        this.d = f3;
        this.e = n;
        this.f = l3;
        this.g = l4;
        this.h = n2;
        this.i = null;
        this.j = -1;
        this.k = true;
    }

    public amn_1(long l, long l2, float f2, float f3, int n, long l3, long l4, int n2, alo_1 alo_12, int n3, boolean bl) {
        this.a = l;
        this.b = l2;
        this.c = f2;
        this.d = f3;
        this.e = n;
        this.f = l3;
        this.g = l4;
        this.h = n2;
        this.i = alo_12;
        this.j = n3;
        this.k = bl;
    }

    public long a() {
        return this.b;
    }

    public float c() {
        return this.c;
    }

    public float d() {
        return this.d;
    }

    public int e() {
        return this.e;
    }

    public long f() {
        return this.f;
    }

    public long g() {
        return this.g;
    }

    public int h() {
        return this.h;
    }

    public alo_1 i() {
        return this.i;
    }

    public int j() {
        return this.j;
    }

    public boolean k() {
        return this.k;
    }

    public void a(long l) {
        this.a = l;
    }

    @Override
    public long b() {
        return this.a;
    }
}

