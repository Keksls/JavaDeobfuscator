/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from cwp
 */
public class cwp_2
extends ps_0 {
    private long a;
    private byte[] b;

    public void a(long l) {
        this.a = l;
    }

    public void b(byte[] byArray) {
        this.b = byArray;
    }

    public long b() {
        return this.a;
    }

    public byte[] c() {
        return this.b;
    }

    @Override
    public boolean a(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.a = byteBuffer.getLong();
        this.b = new byte[byteBuffer.getShort()];
        byteBuffer.get(this.b);
        return true;
    }

    @Override
    public int a() {
        return 15686;
    }
}

