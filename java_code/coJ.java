/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Map;

public class coJ
extends Pw {
    private long a;
    private final Map<Long, Cm<Long, Integer>> b = new HashMap<Long, Cm<Long, Integer>>();

    @Override
    public byte[] b() {
        ByteBuffer byteBuffer = ByteBuffer.allocate(10 + this.b.size() * 20);
        byteBuffer.putLong(this.a);
        byteBuffer.putShort((short)this.b.size());
        this.b.forEach((l, cm) -> {
            byteBuffer.putLong((long)l);
            byteBuffer.putLong((Long)cm.a());
            byteBuffer.putInt((Integer)cm.b());
        });
        return this.a((byte)3, byteBuffer.array());
    }

    public void a(long l, long l2, int n) {
        this.b.put(l2, new Cm<Long, Integer>(l, n));
    }

    @Override
    public int a() {
        return 12784;
    }

    public void a(long l) {
        this.a = l;
    }
}

