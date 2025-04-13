/*
 * Decompiled with CFR 0.152.
 */
public class fgk
implements fgj {
    private final int a;
    private final int b;
    private final String c;
    private final int d;

    public static fgk a(int n, int n2, int n3, int n4) {
        return new fgk(n, n2, n3, n4);
    }

    private fgk(int n, int n2, int n3, int n4) {
        this.a = n;
        this.b = n2;
        this.c = String.valueOf(n3);
        this.d = n4;
    }

    @Override
    public int a() {
        return this.a;
    }

    @Override
    public int b() {
        return this.b;
    }

    @Override
    public String c() {
        return this.c;
    }

    @Override
    public int d() {
        return this.d;
    }

    public String toString() {
        return "PetSkinDefinitionImpl{m_id=" + this.a + ", m_itemRefId=" + this.b + ", m_gfxId='" + this.c + "', m_petBaseItemId=" + this.d + "}";
    }
}

