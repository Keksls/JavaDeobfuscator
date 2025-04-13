/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from brw
 */
public class brw_1
extends ecl_0 {
    private final int a;
    private final int b;
    private final boolean c;
    private final byte d;
    private final boolean e;
    private final int[] f;

    public brw_1(int n, int n2, int n3, int n4, int n5, int n6, int n7, int n8, apc_2 apc_22, boolean bl, int n9, byte by, ecm_0 ecm_02, boolean bl2, int[] nArray, float f2) {
        super(n, n3, n4, n5, n6, n8, apc_22, n9, ecm_02, f2);
        this.a = n2;
        this.b = n7;
        this.c = bl;
        this.d = by;
        this.e = bl2;
        this.f = nArray;
    }

    public int a() {
        return this.a;
    }

    public byte b() {
        return this.d;
    }

    public int c() {
        return this.b;
    }

    public boolean d() {
        return this.e;
    }

    public int[] e() {
        return this.f;
    }

    public boolean f() {
        return this.c;
    }

    @Override
    public String toString() {
        return "CollectAction{" + super.toString() + "m_resourceStep=" + this.a + ", m_collectItemId=" + this.b + "}";
    }
}

