/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from cwi
 */
public class cwi_2
extends ps_0 {
    private long a;
    private int b;
    private long c;

    @Override
    public boolean a(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.b = byteBuffer.getInt();
        this.a = byteBuffer.getLong();
        this.c = byteBuffer.getLong();
        return true;
    }

    @Override
    public int a() {
        return 12799;
    }

    public int b() {
        return this.b;
    }

    public long c() {
        return this.a;
    }

    public long d() {
        return this.c;
    }
}

