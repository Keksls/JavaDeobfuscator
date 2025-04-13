/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TLongObjectHashMap
 */
import gnu.trove.map.hash.TLongObjectHashMap;
import java.nio.ByteBuffer;

/*
 * Renamed from cuO
 */
public class cuo_1
extends ps_0 {
    private final TLongObjectHashMap<abp_2<Long, byte[], Long>> a = new TLongObjectHashMap();

    public TLongObjectHashMap<abp_2<Long, byte[], Long>> b() {
        return this.a;
    }

    @Override
    public boolean a(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        int n = byteBuffer.getShort();
        for (int k = 0; k < n; ++k) {
            long l = byteBuffer.getLong();
            long l2 = byteBuffer.getLong();
            short s2 = byteBuffer.getShort();
            byte[] byArray2 = new byte[s2];
            byteBuffer.get(byArray2);
            long l3 = byteBuffer.getLong();
            this.a.put(l, new abp_2<Long, byte[], Long>(l2, byArray2, l3));
        }
        return true;
    }

    @Override
    public int a() {
        return 13052;
    }
}

