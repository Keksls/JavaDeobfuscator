/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from cyJ
 */
public final class cyj_1
extends ps_0 {
    private ay_0 a;
    private int b;

    @Override
    public boolean a(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.b = byteBuffer.getInt();
        this.a = ay_0.b(byteBuffer.get());
        return false;
    }

    public ay_0 b() {
        return this.a;
    }

    public int c() {
        return this.b;
    }

    @Override
    public int a() {
        return 12660;
    }
}

