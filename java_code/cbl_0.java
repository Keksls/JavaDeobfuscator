/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from cBL
 */
public final class cbl_0
extends ps_0 {
    private String a;
    private String b;

    @Override
    public boolean a(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.a = this.a(byteBuffer);
        this.b = this.a(byteBuffer);
        return false;
    }

    public String b() {
        return this.a;
    }

    public String c() {
        return this.b;
    }

    private String a(ByteBuffer byteBuffer) {
        byte[] byArray = new byte[byteBuffer.getInt()];
        byteBuffer.get(byArray);
        return Cz.a(byArray);
    }

    @Override
    public int a() {
        return 22666;
    }
}

