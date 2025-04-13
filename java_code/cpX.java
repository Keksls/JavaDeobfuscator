/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public class cpX
extends Pw {
    private String a;

    public void a(String string) {
        this.a = string;
    }

    @Override
    public byte[] b() {
        byte[] byArray = Cz.a(this.a);
        ByteBuffer byteBuffer = ByteBuffer.allocate(1 + byArray.length);
        byteBuffer.put((byte)byArray.length);
        byteBuffer.put(byArray);
        return this.a((byte)3, byteBuffer.array());
    }

    @Override
    public int a() {
        return 13881;
    }
}

