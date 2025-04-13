/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from czD
 */
public class czd_2
extends Pw {
    private final String a;
    private final long b;

    public czd_2(String string, long l) {
        this.a = string;
        this.b = l;
    }

    @Override
    public byte[] b() {
        byte[] byArray = Cz.a(this.a);
        ByteBuffer byteBuffer = ByteBuffer.allocate(1 + byArray.length + 8);
        byteBuffer.put((byte)byArray.length);
        byteBuffer.put(byArray);
        byteBuffer.putLong(this.b);
        return this.a((byte)6, byteBuffer.array());
    }

    @Override
    public int a() {
        return 14109;
    }
}

