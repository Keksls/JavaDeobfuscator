/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from cwk
 */
public class cwk_1
extends ps_0 {
    private long a;
    private int b;
    private short c;

    @Override
    public boolean a(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.b = byteBuffer.getInt();
        this.a = byteBuffer.getLong();
        this.c = byteBuffer.getShort();
        return true;
    }

    @Override
    public int a() {
        return 12671;
    }

    public long b() {
        return this.a;
    }

    public int c() {
        return this.b;
    }

    public short d() {
        return this.c;
    }
}

