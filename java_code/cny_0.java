/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from cny
 */
public class cny_0
extends Pw {
    private final int a;
    private final evn_2 b;

    public cny_0(int n, evn_2 evn_22) {
        this.a = n;
        this.b = evn_22;
    }

    @Override
    public byte[] b() {
        ByteBuffer byteBuffer = ByteBuffer.allocate(5 + this.b.a());
        byteBuffer.putInt(this.a);
        byteBuffer.put((byte)this.b.b().ordinal());
        this.b.a(byteBuffer);
        return this.a((byte)3, byteBuffer.array());
    }

    @Override
    public int a() {
        return 12452;
    }
}

