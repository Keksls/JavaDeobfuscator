/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/*
 * Renamed from cnU
 */
public class cnu_0
extends cnO {
    private long f;
    private long g;
    private List<Long> h = new ArrayList<Long>();

    @Override
    public byte[] b() {
        short s2 = (short)this.h.size();
        int n = 18 + s2 * 8;
        ByteBuffer byteBuffer = ByteBuffer.allocate(n);
        byteBuffer.putLong(this.f);
        byteBuffer.putLong(this.g);
        byteBuffer.putShort(s2);
        for (long l : this.h) {
            byteBuffer.putLong(l);
        }
        return this.a((byte)3, byteBuffer.array());
    }

    @Override
    public int a() {
        return 12463;
    }

    public List<Long> c() {
        return this.h;
    }

    public void a(List<Long> list) {
        this.h = list;
    }

    public long d() {
        return this.f;
    }

    public cnu_0 a(long l) {
        this.f = l;
        return this;
    }

    public long e() {
        return this.g;
    }

    public cnu_0 g(long l) {
        this.g = l;
        return this;
    }
}

