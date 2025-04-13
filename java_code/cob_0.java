/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from cob
 */
public class cob_0
extends cnO {
    private short f;
    private short g;
    private byte h;

    public cob_0() {
        this.a = -1L;
        this.c = -1L;
        this.h = (byte)-1;
        this.f = (short)-1;
        this.g = (short)-1;
    }

    @Override
    public byte[] b() {
        int n = 21;
        ByteBuffer byteBuffer = ByteBuffer.allocate(21);
        byteBuffer.putLong(this.a);
        byteBuffer.putShort(this.g);
        byteBuffer.put(this.h);
        byteBuffer.putLong(this.b);
        byteBuffer.putShort(this.f);
        return this.a((byte)3, byteBuffer.array());
    }

    @Override
    public int a() {
        return 12883;
    }

    public void a(short s2) {
        this.f = s2;
    }

    public void b(short s2) {
        this.g = s2;
    }

    public void a(byte by) {
        this.h = by;
    }

    @Override
    public void f(long l) {
        A.warn((Object)"On essaie d'indiquer une source pour un message provenant forc\u00e9ment de l'inventaire temporaire");
    }
}

