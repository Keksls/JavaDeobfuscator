/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from cyK
 */
public final class cyk_2
extends ps_0 {
    private long a;
    private String b;

    @Override
    public boolean a(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.a = byteBuffer.getLong();
        byte[] byArray2 = new byte[byteBuffer.getInt()];
        byteBuffer.get(byArray2);
        this.b = Cz.a(byArray2);
        return true;
    }

    @Override
    public int a() {
        return 13158;
    }

    public long b() {
        return this.a;
    }

    public String c() {
        return this.b;
    }
}

