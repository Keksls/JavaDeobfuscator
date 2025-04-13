/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from cAy
 */
public class cay_0
extends ps_0 {
    private byte a;
    private eLo b;

    @Override
    public boolean a(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.a = byteBuffer.get();
        eLu eLu2 = new eLu();
        eLu2.b(byteBuffer);
        this.b = eLu2.f();
        return true;
    }

    public byte b() {
        return this.a;
    }

    public eLo c() {
        return this.b;
    }

    @Override
    public int a() {
        return 1051;
    }
}

