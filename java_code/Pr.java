/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public class Pr
extends ps_0 {
    public static final byte a = 0;
    public static final byte b = 1;
    public static final byte c = 2;
    private byte d;
    private String e;

    @Override
    public boolean a(byte[] byArray) {
        if (!this.a(byArray.length, 3, false)) {
            return false;
        }
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.d = byteBuffer.get();
        Short s2 = byteBuffer.getShort();
        byte[] byArray2 = new byte[s2 & 0xFFFF];
        byteBuffer.get(byArray2);
        this.e = Cz.a(byArray2);
        return true;
    }

    @Override
    public int a() {
        return 360;
    }

    public byte b() {
        return this.d;
    }

    public String c() {
        return this.e;
    }
}

