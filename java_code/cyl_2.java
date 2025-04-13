/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from cyL
 */
public final class cyl_2
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
        return 12726;
    }

    public long b() {
        return this.a;
    }

    public String c() {
        return this.b;
    }
}

