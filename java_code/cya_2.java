/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from cya
 */
public class cya_2
extends ps_0 {
    private byte[] a;

    @Override
    public boolean a(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.a = new byte[byteBuffer.getInt()];
        byteBuffer.get(this.a);
        return true;
    }

    @Override
    public int a() {
        return 13958;
    }

    public byte[] b() {
        return this.a;
    }
}

