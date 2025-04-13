/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class crO
extends ps_0 {
    private final HashMap<Long, Byte> a = new HashMap();

    @Override
    public boolean a(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        for (int k = byteBuffer.get() - 1; k >= 0; --k) {
            long l = byteBuffer.getLong();
            byte by = byteBuffer.get();
            this.a.put(l, by);
        }
        return true;
    }

    @Override
    public int a() {
        return 13965;
    }

    public Iterator<Map.Entry<Long, Byte>> b() {
        return this.a.entrySet().iterator();
    }
}

