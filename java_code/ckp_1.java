/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from ckP
 */
public class ckp_1
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
        return 593;
    }

    public byte[] b() {
        return (byte[])this.a.clone();
    }
}

