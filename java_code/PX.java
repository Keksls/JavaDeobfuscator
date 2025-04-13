/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public class PX
extends ps_0 {
    private String a;
    private String b;
    private long c;

    @Override
    public boolean a(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.c = byteBuffer.getLong();
        byte[] byArray2 = new byte[byteBuffer.get() & 0xFF];
        byteBuffer.get(byArray2);
        this.a = Cz.a(byArray2);
        byte[] byArray3 = new byte[byteBuffer.get() & 0xFF];
        byteBuffer.get(byArray3);
        this.b = Cz.a(byArray3);
        return true;
    }

    @Override
    public int a() {
        return 711;
    }

    public String b() {
        return this.a;
    }

    public String c() {
        return this.b;
    }

    public long d() {
        return this.c;
    }
}

