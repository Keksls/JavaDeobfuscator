/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from cwg
 */
public class cwg_2
extends ps_0 {
    private long a;
    private int b;

    public long b() {
        return this.a;
    }

    public int c() {
        return this.b;
    }

    @Override
    public boolean a(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.a = byteBuffer.getInt();
        this.b = byteBuffer.getInt();
        return true;
    }

    @Override
    public int a() {
        return 13531;
    }
}

