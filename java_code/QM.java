/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public class QM
extends ps_0 {
    private String a;

    @Override
    public boolean a(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        byte[] byArray2 = new byte[byteBuffer.get()];
        byteBuffer.get(byArray2);
        this.a = Cz.a(byArray2);
        return true;
    }

    public String b() {
        return this.a;
    }

    @Override
    public int a() {
        return 1071;
    }
}

