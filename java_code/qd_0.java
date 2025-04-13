/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from Qd
 */
public class qd_0
extends ps_0 {
    private String a;
    private String b;
    private long c;

    @Override
    public boolean a(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        byte[] byArray2 = new byte[byteBuffer.get() & 0xFF];
        byteBuffer.get(byArray2);
        this.a = Cz.a(byArray2);
        byte[] byArray3 = new byte[byteBuffer.get() & 0xFF];
        byteBuffer.get(byArray3);
        this.b = Cz.a(byArray3);
        this.c = byteBuffer.getLong();
        return true;
    }

    @Override
    public int a() {
        return 625;
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

