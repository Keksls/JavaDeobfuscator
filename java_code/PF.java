/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public class PF
extends Pw {
    private String a;

    @Override
    public byte[] b() {
        byte[] byArray = new byte[]{};
        byArray = Cz.a(this.a);
        ByteBuffer byteBuffer = ByteBuffer.allocate(1 + byArray.length);
        byteBuffer.put((byte)byArray.length);
        byteBuffer.put(byArray);
        return this.a((byte)4, byteBuffer.array());
    }

    @Override
    public int a() {
        return 715;
    }

    public void a(String string) {
        this.a = string;
    }
}

