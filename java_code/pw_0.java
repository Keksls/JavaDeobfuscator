/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from PW
 */
public class pw_0
extends ps_0 {
    private Long a;
    private String b;

    @Override
    public boolean a(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.a = byteBuffer.getLong();
        byte[] byArray2 = new byte[byteBuffer.get() & 0xFF];
        byteBuffer.get(byArray2);
        this.b = Cz.a(byArray2);
        return true;
    }

    @Override
    public int a() {
        return 700;
    }

    public String b() {
        return this.b;
    }

    public Long c() {
        return this.a;
    }
}

