/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from cvY
 */
public class cvy_2
extends ps_0 {
    private byte a;
    private long b;
    private vf_2 c;

    public byte b() {
        return this.a;
    }

    public long c() {
        return this.b;
    }

    public vf_2 d() {
        return this.c;
    }

    @Override
    public boolean a(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.a = byteBuffer.get();
        if (this.a != 0) {
            return true;
        }
        this.b = byteBuffer.getLong();
        this.c = new vf_2();
        return this.c.b(byteBuffer);
    }

    @Override
    public int a() {
        return 13430;
    }
}

