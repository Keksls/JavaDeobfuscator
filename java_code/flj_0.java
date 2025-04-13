/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from flj
 */
public class flj_0 {
    private final int b;
    private final flk_0 c;
    static final int a = 14;

    flj_0(int n, flk_0 flk_02) {
        this.b = n;
        this.c = flk_02;
    }

    public int a() {
        return this.b;
    }

    public flk_0 b() {
        return this.c;
    }

    void a(ByteBuffer byteBuffer) {
        byteBuffer.putInt(this.b);
        flf_0.a(this.c, byteBuffer);
    }

    static flj_0 b(ByteBuffer byteBuffer) {
        int n = byteBuffer.getInt();
        flk_0 flk_02 = flf_0.c(byteBuffer);
        return new flj_0(n, flk_02);
    }
}

