/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from cBz
 */
public class cbz_0
extends ps_0 {
    private byte a;

    @Override
    public boolean a(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.a = byteBuffer.get();
        return true;
    }

    @Override
    public int a() {
        return 22985;
    }

    public byte b() {
        return this.a;
    }
}

