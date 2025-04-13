/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from cAS
 */
public class cas_0
extends ps_0 {
    private long a;
    private km_0 b;

    @Override
    public boolean a(byte ... byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.a = byteBuffer.getLong();
        int n = byteBuffer.getInt();
        byte[] byArray2 = new byte[n];
        this.b = km_0.a(byArray2);
        return true;
    }

    public long b() {
        return this.a;
    }

    public km_0 c() {
        return this.b;
    }

    @Override
    public int a() {
        return 15705;
    }
}

