/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public class PH
extends Pw {
    private final String a;

    public PH(String string) {
        this.a = string;
    }

    @Override
    public byte[] b() {
        String string = this.a;
        byte[] byArray = Cz.a(string);
        ByteBuffer byteBuffer = ByteBuffer.allocate(1 + byArray.length);
        byteBuffer.put((byte)byArray.length);
        byteBuffer.put(byArray);
        return this.a((byte)4, byteBuffer.array());
    }

    @Override
    public int a() {
        return 722;
    }
}

