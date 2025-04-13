/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from cxD
 */
public class cxd_2
extends ps_0 {
    private int a;
    private byte[] b;
    private byte[] c;

    @Override
    public boolean a(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.a = byteBuffer.getInt();
        int n = byteBuffer.getShort() & 0xFFFF;
        this.b = new byte[n];
        byteBuffer.get(this.b);
        n = byteBuffer.getShort() & 0xFFFF;
        if (n > 0) {
            this.c = new byte[n];
            byteBuffer.get(this.c);
        }
        return true;
    }

    public int b() {
        return this.a;
    }

    public byte[] c() {
        return this.b;
    }

    public byte[] d() {
        return this.c;
    }

    @Override
    public int a() {
        return 13371;
    }
}

