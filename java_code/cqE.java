/*
 * Decompiled with CFR 0.152.
 */
public class cqE
extends Pw {
    private final long a;
    private final byte b;
    private final int c;

    public cqE(long l) {
        this.a = l;
        this.b = (byte)-1;
        this.c = -1;
    }

    public cqE(long l, byte by, int n) {
        this.a = l;
        this.b = by;
        this.c = n;
    }

    @Override
    public byte[] b() {
        abx_2 abx_22 = new abx_2();
        abx_22.a(this.a);
        abx_22.a(this.b);
        abx_22.a(this.c);
        return this.a((byte)3, abx_22.c());
    }

    @Override
    public int a() {
        return 12856;
    }

    @Override
    public String toString() {
        return "AddDeckRequestMessage{m_characterId=" + this.a + "}";
    }
}

