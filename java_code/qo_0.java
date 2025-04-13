/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from QO
 */
public class qo_0
extends ps_0 {
    private long a;
    private String b;

    @Override
    public boolean a(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        byte[] byArray2 = new byte[byteBuffer.get()];
        byteBuffer.get(byArray2);
        this.b = Cz.a(byArray2);
        this.a = byteBuffer.getLong();
        return true;
    }

    public String b() {
        return this.b;
    }

    public long c() {
        return this.a;
    }

    @Override
    public int a() {
        return 1131;
    }
}

