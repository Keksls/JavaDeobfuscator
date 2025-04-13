/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public class Qu
extends Pw {
    public boolean a = true;
    private byte b;
    private boolean c;
    private String e;
    private String f;
    private long g = -1L;

    @Override
    public byte[] b() {
        byte[] byArray = Cz.a(this.e);
        byte[] byArray2 = Cz.a(this.f);
        int n = 3 + byArray.length + 1 + byArray2.length + 8;
        ByteBuffer byteBuffer = ByteBuffer.allocate(n);
        byteBuffer.put(this.b);
        byteBuffer.put((byte)(this.c ? 1 : 0));
        byteBuffer.put((byte)byArray.length);
        byteBuffer.put(byArray);
        byteBuffer.put((byte)byArray2.length);
        byteBuffer.put(byArray2);
        byteBuffer.putLong(this.g);
        if (this.a) {
            return this.a((byte)6, byteBuffer.array());
        }
        return this.a((byte)2, byteBuffer.array());
    }

    @Override
    public final int a() {
        return 1041;
    }

    public void a(byte by) {
        this.b = by;
    }

    public void a(boolean bl) {
        this.c = bl;
    }

    public void a(String string) {
        this.e = string;
    }

    public void a(long l) {
        this.g = l;
    }

    public void b(String string) {
        this.f = string;
    }

    public void b(boolean bl) {
        this.a = bl;
    }
}

