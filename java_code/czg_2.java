/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from czG
 */
public class czg_2
extends Pw {
    private final long a;
    private final long b;
    private final String c;

    public czg_2(long l, long l2, String string) {
        this.a = l;
        this.b = l2;
        this.c = string;
    }

    @Override
    public byte[] b() {
        byte[] byArray = Cz.a(this.c);
        ByteBuffer byteBuffer = ByteBuffer.allocate(17 + byArray.length);
        byteBuffer.putLong(this.a);
        byteBuffer.putLong(this.b);
        byteBuffer.put((byte)byArray.length);
        byteBuffer.put(byArray);
        return this.a((byte)6, byteBuffer.array());
    }

    @Override
    public int a() {
        return 14602;
    }
}

