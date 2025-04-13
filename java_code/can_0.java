/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from cAN
 */
public class can_0
extends ps_0 {
    private String a;
    private long b;
    private long c;

    @Override
    public boolean a(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        byte[] byArray2 = new byte[byteBuffer.get()];
        byteBuffer.get(byArray2);
        this.a = Cz.a(byArray2);
        this.b = byteBuffer.getLong();
        this.c = byteBuffer.getLong();
        return false;
    }

    @Override
    public int a() {
        return 1187;
    }

    public String b() {
        return this.a;
    }

    public long c() {
        return this.b;
    }

    public long d() {
        return this.c;
    }
}

