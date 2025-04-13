/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from ckL
 */
public class ckl_1
extends Pw {
    private byte[] a = epj.j;

    public void a(byte[] byArray) {
        this.a = (byte[])byArray.clone();
    }

    @Override
    public byte[] b() {
        ByteBuffer byteBuffer = ByteBuffer.allocate(epj.j.length);
        byteBuffer.put(this.a);
        return this.a((byte)0, byteBuffer.array());
    }

    @Override
    public int a() {
        return 47;
    }
}

