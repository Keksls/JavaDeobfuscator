/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from czX
 */
public class czx_1
extends Pw {
    private long a;
    private String b;

    public void a(String string) {
        this.b = string;
    }

    public void a(long l) {
        this.a = l;
    }

    @Override
    public byte[] b() {
        byte[] byArray = Cz.a(this.b);
        int n = byArray.length;
        ByteBuffer byteBuffer = ByteBuffer.allocate(12 + n);
        byteBuffer.putLong(this.a);
        byteBuffer.putInt(n);
        byteBuffer.put(byArray);
        return this.a((byte)6, byteBuffer.array());
    }

    @Override
    public int a() {
        return 15243;
    }
}

