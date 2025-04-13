/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from cwf
 */
public class cwf_2
extends ps_0 {
    private long a;
    private short b;
    private int c;
    private fev_0 d;

    public long b() {
        return this.a;
    }

    public short c() {
        return this.b;
    }

    public int d() {
        return this.c;
    }

    public fev_0 e() {
        return this.d;
    }

    @Override
    public boolean a(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.a = byteBuffer.getLong();
        this.b = byteBuffer.getShort();
        this.c = byteBuffer.getInt();
        this.d = fev_0.a(byteBuffer.getShort());
        return true;
    }

    @Override
    public int a() {
        return 12609;
    }
}

