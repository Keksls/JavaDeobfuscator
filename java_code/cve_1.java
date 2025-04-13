/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from cvE
 */
public class cve_1
extends ps_0 {
    private byte[] a;

    @Override
    public boolean a(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        int n = byteBuffer.getInt();
        this.a = new byte[n];
        byteBuffer.get(this.a);
        return true;
    }

    @Override
    public int a() {
        return 12376;
    }

    public byte[] b() {
        return this.a;
    }
}

