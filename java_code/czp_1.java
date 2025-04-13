/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from czp
 */
public class czp_1
extends Pw {
    private long a;
    private String b;

    public void a(long l) {
        this.a = l;
    }

    public void a(String string) {
        this.b = string;
    }

    @Override
    public byte[] b() {
        byte[] byArray = Cz.a(this.b);
        ByteBuffer byteBuffer = ByteBuffer.allocate(9 + byArray.length);
        byteBuffer.putLong(this.a);
        if (byArray.length < 127) {
            byteBuffer.put((byte)byArray.length);
            byteBuffer.put(byArray);
        }
        return this.a((byte)6, byteBuffer.array());
    }

    @Override
    public int a() {
        return 1047;
    }
}

