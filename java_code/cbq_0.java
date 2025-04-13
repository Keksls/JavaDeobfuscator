/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from cBQ
 */
public class cbq_0
extends ps_0 {
    private final flu_0 a = new flu_0();

    @Override
    public boolean a(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.a.a(byteBuffer);
        return false;
    }

    @Override
    public int a() {
        return 22588;
    }

    public flu_0 b() {
        return this.a;
    }
}

