/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Map;

/*
 * Renamed from cAR
 */
public class car_0
extends ps_0 {
    private Map<Integer, Boolean> a;
    private long b;
    private ery_1 c;

    @Override
    public boolean a(byte ... byArray) {
        int n;
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        int n2 = byteBuffer.getInt();
        this.a = new HashMap<Integer, Boolean>(n2);
        for (n = 0; n < n2; ++n) {
            this.a.put(byteBuffer.getInt(), byteBuffer.get() != 0);
        }
        this.b = byteBuffer.getLong();
        n = byteBuffer.remaining();
        byte[] byArray2 = new byte[n];
        byteBuffer.get(byArray2);
        this.c = new ery_1();
        this.c.a(byArray2);
        return true;
    }

    public Map<Integer, Boolean> b() {
        return this.a;
    }

    public long c() {
        return this.b;
    }

    public ery_1 d() {
        return this.c;
    }

    @Override
    public int a() {
        return 15751;
    }
}

