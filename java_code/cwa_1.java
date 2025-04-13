/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from cwA
 */
public class cwa_1
extends ps_0 {
    private String a;
    private fcu_0 b;
    private int c;
    private long d;

    public String b() {
        return this.a;
    }

    public fcu_0 c() {
        return this.b;
    }

    public int d() {
        return this.c;
    }

    public long e() {
        return this.d;
    }

    @Override
    public boolean a(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.d = byteBuffer.getLong();
        this.b = fcu_0.a(byteBuffer.getLong());
        this.c = byteBuffer.getInt();
        byte[] byArray2 = new byte[byteBuffer.remaining()];
        byteBuffer.get(byArray2);
        this.a = Cz.a(byArray2);
        return true;
    }

    @Override
    public int a() {
        return 14799;
    }
}

