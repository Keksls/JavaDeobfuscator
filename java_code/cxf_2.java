/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from cxF
 */
public class cxf_2
extends ps_0 {
    private int a;
    private byte b;

    @Override
    public boolean a(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.a = byteBuffer.getInt();
        this.b = byteBuffer.get();
        return true;
    }

    @Override
    public int a() {
        return 13715;
    }

    public int b() {
        return this.a;
    }

    public byte c() {
        return this.b;
    }
}

