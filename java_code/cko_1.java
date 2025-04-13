/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from ckO
 */
public class cko_1
extends Pw {
    private int a;
    private long b;

    @Override
    public byte[] b() {
        abx_2 abx_22 = new abx_2();
        abx_22.a(this.a);
        abx_22.a(this.b);
        return this.a((byte)8, abx_22.c());
    }

    @Override
    public int a() {
        return 539;
    }

    public void b(int n) {
        this.a = n;
    }

    public void a(long l) {
        this.b = l;
    }

    @Override
    public String toString() {
        return "GameAuthenticationTokenRequestMessage{m_serverId=" + this.a + "}";
    }
}

