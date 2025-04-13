/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from cxG
 */
public class cxg_2
extends ps_0 {
    private int a;
    private byte[] b;

    @Override
    public boolean a(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.a = byteBuffer.getInt();
        int n = byteBuffer.getShort() & 0xFFFF;
        this.b = new byte[n];
        byteBuffer.get(this.b);
        return true;
    }

    public int b() {
        return this.a;
    }

    public byte[] c() {
        return this.b;
    }

    @Override
    public int a() {
        return 13305;
    }
}

