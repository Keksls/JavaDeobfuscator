/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from cwm
 */
public final class cwm_1
extends ps_0 {
    private long a;
    private String b;

    public long b() {
        return this.a;
    }

    public String c() {
        return this.b;
    }

    @Override
    public boolean a(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.a = byteBuffer.getLong();
        short s2 = byteBuffer.getShort();
        byte[] byArray2 = new byte[s2];
        byteBuffer.get(byArray2);
        this.b = Cz.a(byArray2);
        return true;
    }

    @Override
    public int a() {
        return 13560;
    }
}

