/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from eCl
 */
public class ecl_0 {
    private final int a;
    private final int b;
    private final int c;
    private final int d;
    private final int e;
    private final int f;
    private final int g;
    private final float h;
    private final ecm_0 i;
    private final apc_2 j;

    protected ecl_0(int n, int n2, int n3, int n4, int n5, int n6, apc_2 apc_22, int n7, ecm_0 ecm_02, float f2) {
        this.a = n;
        this.c = n2;
        this.d = n3;
        this.e = n4;
        this.f = n6;
        this.j = apc_22;
        this.g = n5;
        this.b = n7;
        this.i = ecm_02;
        this.h = f2;
    }

    public int g() {
        return this.a;
    }

    public int h() {
        return this.f;
    }

    public apc_2 i() {
        return this.j;
    }

    public int j() {
        return this.e;
    }

    public int k() {
        return this.d;
    }

    public int l() {
        return this.c;
    }

    public int m() {
        return this.g;
    }

    public int n() {
        return this.b;
    }

    public boolean o() {
        return this.b == 0 || this.b == 16;
    }

    public <Info extends ecm_0> Info p() {
        return (Info)this.i;
    }

    public float q() {
        return this.h;
    }

    public String toString() {
        return "AbstractCollectAction{m_id=" + this.a + ", m_craftId=" + this.c + ", m_levelMin=" + this.d + ", m_nbPlayerMin=" + this.e + "}";
    }
}

