/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from cvX
 */
public class cvx_2
extends ps_0 {
    private final wh_2 a = new wh_2();

    public wh_2 b() {
        return this.a;
    }

    @Override
    public boolean a(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.a.b(byteBuffer);
        return true;
    }

    @Override
    public int a() {
        return 13221;
    }
}

