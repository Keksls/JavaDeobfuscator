/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from cBU
 */
public final class cbu_0
extends ps_0 {
    public static final byte a = 0;
    public static final byte b = 1;
    private String c;
    private byte d = (byte)-1;

    @Override
    public boolean a(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.d = byteBuffer.get();
        short s2 = byteBuffer.getShort();
        byte[] byArray2 = new byte[s2];
        byteBuffer.get(byArray2);
        this.c = Cz.a(byArray2);
        return true;
    }

    @Override
    public int a() {
        return 22283;
    }

    public String b() {
        return this.c;
    }

    public byte c() {
        return this.d;
    }
}

