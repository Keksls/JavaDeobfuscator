/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from ckY
 */
public class cky_0
extends ps_0 {
    private byte a;
    private String b;

    @Override
    public boolean a(byte[] byArray) {
        if (!this.a(byArray.length, 1, false)) {
            return false;
        }
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.a = byteBuffer.get();
        byte[] byArray2 = new byte[byteBuffer.getInt()];
        byteBuffer.get(byArray2);
        this.b = Cz.a(byArray2);
        return true;
    }

    @Override
    public int a() {
        return 431;
    }

    public byte b() {
        return this.a;
    }

    public String c() {
        return this.b;
    }
}

