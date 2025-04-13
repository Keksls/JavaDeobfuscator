/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TLongObjectHashMap
 */
import gnu.trove.map.hash.TLongObjectHashMap;
import java.nio.ByteBuffer;

/*
 * Renamed from cuR
 */
public class cur_1
extends ps_0 {
    private final TLongObjectHashMap<byte[]> a = new TLongObjectHashMap();

    public TLongObjectHashMap<byte[]> b() {
        return this.a;
    }

    @Override
    public boolean a(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        int n = byteBuffer.getShort();
        for (int k = 0; k < n; ++k) {
            long l = byteBuffer.getLong();
            short s2 = byteBuffer.getShort();
            byte[] byArray2 = new byte[s2];
            byteBuffer.get(byArray2);
            this.a.put(l, (Object)byArray2);
        }
        return true;
    }

    @Override
    public int a() {
        return 13494;
    }
}

