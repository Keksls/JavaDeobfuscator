/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from coX
 */
public class cox_0
extends cpf_0 {
    private int a;
    private long b;
    private int c;
    private int d;

    @Override
    protected void a(ByteBuffer byteBuffer) {
        this.a = byteBuffer.getInt();
        this.b = byteBuffer.getLong();
        this.c = byteBuffer.getInt();
        this.d = byteBuffer.getInt();
    }

    @Override
    public int a() {
        return 12214;
    }

    public int b() {
        return this.a;
    }

    public long c() {
        return this.b;
    }

    public int d() {
        return this.c;
    }

    public int e() {
        return this.d;
    }
}

