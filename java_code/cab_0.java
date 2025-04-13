/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from cAB
 */
public class cab_0
extends ps_0 {
    private byte a;
    private long b;
    private String c;

    @Override
    public boolean a(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.a = byteBuffer.get();
        this.b = byteBuffer.getLong();
        byte by = byteBuffer.get();
        byte[] byArray2 = new byte[by];
        byteBuffer.get(byArray2);
        this.c = Cz.a(byArray2);
        return true;
    }

    public byte b() {
        return this.a;
    }

    public long c() {
        return this.b;
    }

    public String d() {
        return this.c;
    }

    @Override
    public int a() {
        return 1092;
    }
}

