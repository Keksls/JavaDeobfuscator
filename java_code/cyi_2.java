/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from cyI
 */
public class cyi_2
extends ps_0 {
    private fjj_0 a;
    private long b;

    @Override
    public boolean a(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.a = fjj_0.a(byteBuffer.get());
        this.b = byteBuffer.getLong();
        return false;
    }

    public fjj_0 b() {
        return this.a;
    }

    public long c() {
        return this.b;
    }

    @Override
    public int a() {
        return 13312;
    }
}

