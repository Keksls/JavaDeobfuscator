/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import org.jetbrains.annotations.NotNull;

public class fgc
implements fgb {
    private final int a;
    private final int b;
    private final String c;
    private final int d;
    @NotNull
    private final fas_0 e;

    public static fgc a(int n, int n2, int n3, int n4, int n5) {
        return new fgc(n, n2, n3, n4, n5);
    }

    private fgc(int n, int n2, int n3, int n4, int n5) {
        this.a = n;
        this.b = n2;
        this.c = String.valueOf(n3);
        this.d = n4;
        this.e = fas_0.a((byte)n5);
    }

    @Override
    public int a() {
        return this.a;
    }

    @Override
    public int c() {
        return this.b;
    }

    @Override
    public String d() {
        return this.c;
    }

    @Override
    public int e() {
        return this.d;
    }

    @Override
    @NotNull
    public fas_0 b() {
        return this.e;
    }

    public String toString() {
        return "NewMountSkinDefinition{m_id=" + this.a + ", m_itemRefId=" + this.b + ", m_gfxId='" + this.c + "', m_particleId=" + this.d + ", m_mountBreed=" + this.e + "}";
    }
}

