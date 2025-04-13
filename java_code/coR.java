/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public class coR
extends cpf_0 {
    private int a;
    private int b;
    private int c;
    private int d;
    private long e;

    @Override
    protected void a(ByteBuffer byteBuffer) {
        this.a = byteBuffer.getInt();
        this.b = byteBuffer.getInt();
        this.c = byteBuffer.getInt();
        this.d = byteBuffer.getInt();
        this.e = byteBuffer.getLong();
    }

    @Override
    public int a() {
        return 13787;
    }

    public int b() {
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

    public long f() {
        return this.e;
    }
}

