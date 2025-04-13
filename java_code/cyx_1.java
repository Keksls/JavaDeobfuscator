/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from cyx
 */
public class cyx_1
extends ps_0 {
    private int a;
    private short b;

    @Override
    public boolean a(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.a = byteBuffer.getInt();
        this.b = byteBuffer.getShort();
        return true;
    }

    public int b() {
        return this.a;
    }

    public short c() {
        return this.b;
    }

    @Override
    public int a() {
        return 13540;
    }
}

