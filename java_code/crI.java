/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public class crI
extends ps_0 {
    private long a;
    private int b;
    private int c;
    private int d;
    private byte e;
    private byte f;
    private long g;

    @Override
    public boolean a(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.a = byteBuffer.getLong();
        this.b = byteBuffer.getInt();
        this.c = byteBuffer.getInt();
        this.d = byteBuffer.getInt();
        this.e = byteBuffer.get();
        this.f = byteBuffer.get();
        this.g = byteBuffer.getLong();
        return true;
    }

    @Override
    public int a() {
        return 12619;
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

    public int e() {
        return this.d;
    }

    public boolean f() {
        return this.e == 1;
    }

    public boolean g() {
        return this.f == 1;
    }

    public long h() {
        return this.g;
    }
}

