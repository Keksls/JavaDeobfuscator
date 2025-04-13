/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from cqh
 */
public class cqh_0
extends Pw {
    private long a;
    private String b;

    @Override
    public byte[] b() {
        byte[] byArray = Cz.a(this.b);
        ByteBuffer byteBuffer = ByteBuffer.allocate(8 + byArray.length);
        byteBuffer.putLong(this.a);
        byteBuffer.put(byArray);
        return this.a((byte)3, byteBuffer.array());
    }

    @Override
    public int a() {
        return 12974;
    }

    public void a(long l) {
        this.a = l;
    }

    public void a(String string) {
        this.b = string;
    }
}

