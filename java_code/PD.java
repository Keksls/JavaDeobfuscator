/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public class PD
extends Pw {
    private String a;
    private String b;

    @Override
    public byte[] b() {
        byte[] byArray = Cz.a(this.a);
        byte[] byArray2 = Cz.a(this.b);
        ByteBuffer byteBuffer = ByteBuffer.allocate(1 + byArray.length + 1 + byArray2.length);
        byteBuffer.put((byte)byArray.length);
        byteBuffer.put(byArray);
        byteBuffer.put((byte)byArray2.length);
        byteBuffer.put(byArray2);
        return this.a((byte)4, byteBuffer.array());
    }

    @Override
    public int a() {
        return 791;
    }

    public void a(String string) {
        this.a = string;
    }

    public void b(String string) {
        this.b = string;
    }
}

