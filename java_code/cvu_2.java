/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from cvU
 */
public class cvu_2
extends ps_0 {
    private int a;
    private int b;
    private wu_0 c;
    private long d;

    @Override
    public boolean a(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.a = byteBuffer.getInt();
        this.b = byteBuffer.getInt();
        this.c = wt_0.b(byteBuffer.getLong());
        this.d = byteBuffer.getLong();
        return true;
    }

    public int b() {
        return this.b;
    }

    public wu_0 c() {
        return this.c;
    }

    public int d() {
        return this.a;
    }

    public long e() {
        return this.d;
    }

    @Override
    public int a() {
        return 12900;
    }
}

