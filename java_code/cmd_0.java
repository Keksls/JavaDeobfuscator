/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/*
 * Renamed from cmD
 */
public class cmd_0
extends Pw {
    private final List<Long> a = new ArrayList<Long>();
    private long b;

    @Override
    public byte[] b() {
        int n = this.a.size() * 8 + 8 + 4;
        ByteBuffer byteBuffer = ByteBuffer.allocate(n);
        byteBuffer.putLong(this.b);
        byteBuffer.putInt(this.a.size());
        for (Long l : this.a) {
            byteBuffer.putLong(l);
        }
        return this.a((byte)3, byteBuffer.array());
    }

    @Override
    public int a() {
        return 13790;
    }

    public void a(long l) {
        this.b = l;
    }

    public void b(long l) {
        if (l != 0L) {
            this.a.add(l);
        }
    }
}

