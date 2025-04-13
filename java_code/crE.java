/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public class crE
extends ps_0 {
    private long a;
    private aej_2 b;

    @Override
    public boolean a(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.a = byteBuffer.getLong();
        this.b = aej_2.a(byteBuffer.get());
        return true;
    }

    @Override
    public int a() {
        return 12579;
    }

    public long b() {
        return this.a;
    }

    public aej_2 c() {
        return this.b;
    }

    public int d() {
        return 0;
    }
}

