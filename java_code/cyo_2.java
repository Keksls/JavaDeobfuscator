/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from cyO
 */
public class cyo_2
extends ps_0 {
    private byte[] a;

    @Override
    public boolean a(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        int n = byteBuffer.getShort() & 0xFFFF;
        if (n > 0) {
            this.a = new byte[n];
            byteBuffer.get(this.a);
        }
        return true;
    }

    public byte[] b() {
        return this.a;
    }

    @Override
    public int a() {
        return 12140;
    }
}

