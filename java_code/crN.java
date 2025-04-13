/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public class crN
extends ps_0 {
    private long a;
    private int b;
    private int c;
    private short d;
    private boolean e;
    private boolean f;

    @Override
    public boolean a(byte[] byArray) {
        if (!this.a(byArray.length, 20, true)) {
            return false;
        }
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.a = byteBuffer.getLong();
        this.b = byteBuffer.getInt();
        this.c = byteBuffer.getInt();
        this.d = byteBuffer.getShort();
        this.e = byteBuffer.get() == 1;
        this.f = byteBuffer.get() == 1;
        return true;
    }

    @Override
    public int a() {
        return 12564;
    }

    public long b() {
        return this.a;
    }

    public int c() {
        return this.b;
    }

    public int d() {
        return this.c;
    }

    public short e() {
        return this.d;
    }

    public boolean f() {
        return this.e;
    }

    public boolean g() {
        return this.f;
    }
}

