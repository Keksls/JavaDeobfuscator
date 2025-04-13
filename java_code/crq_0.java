/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from crq
 */
public class crq_0
extends ps_0 {
    private fjv a;
    private long b;
    private long c;

    @Override
    public boolean a(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.a = fjv.a(byteBuffer.get());
        this.b = byteBuffer.getLong();
        this.c = byteBuffer.getLong();
        return true;
    }

    @Override
    public int a() {
        return 13653;
    }

    public fjv b() {
        return this.a;
    }

    public long c() {
        return this.b;
    }

    public long d() {
        return this.c;
    }
}

