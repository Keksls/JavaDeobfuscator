/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ckv
extends ps_0 {
    private final ArrayList<Long> a = new ArrayList();
    private final HashMap<Long, Byte> b = new HashMap();
    private final HashMap<Long, Byte> c = new HashMap();

    @Override
    public boolean a(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        int n = byteBuffer.getShort();
        for (int k = 0; k < n; ++k) {
            long l = byteBuffer.getLong();
            this.a.add(l);
            this.b.put(l, byteBuffer.get());
            this.c.put(l, byteBuffer.get());
        }
        return true;
    }

    public List<Long> b() {
        return this.a;
    }

    public List<Ow> a(long l) {
        return Ow.c(this.b.get(l));
    }

    public xz_0 b(long l) {
        if (!this.c.containsKey(l)) {
            return xz_0.a;
        }
        return xz_0.a(this.c.get(l).byteValue());
    }

    @Override
    public int a() {
        return 769;
    }
}

