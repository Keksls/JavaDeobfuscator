/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from Qc
 */
public class qc_0
extends ps_0 {
    private String a;
    private long b;

    @Override
    public boolean a(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        byte[] byArray2 = new byte[byteBuffer.get() & 0xFF];
        byteBuffer.get(byArray2);
        this.a = Cz.a(byArray2);
        this.b = byteBuffer.getLong();
        return true;
    }

    @Override
    public int a() {
        return 739;
    }

    public String b() {
        return this.a;
    }

    public long c() {
        return this.b;
    }
}

