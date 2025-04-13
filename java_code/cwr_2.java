/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.iterator.TIntObjectIterator
 *  gnu.trove.map.hash.TIntObjectHashMap
 */
import gnu.trove.iterator.TIntObjectIterator;
import gnu.trove.map.hash.TIntObjectHashMap;
import java.nio.ByteBuffer;

/*
 * Renamed from cwr
 */
public class cwr_2
extends ps_0 {
    private final TIntObjectHashMap<byte[]> a = new TIntObjectHashMap();

    public TIntObjectIterator<byte[]> b() {
        return this.a.iterator();
    }

    @Override
    public boolean a(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        while (byteBuffer.hasRemaining()) {
            int n = byteBuffer.getInt();
            int n2 = byteBuffer.getInt();
            byte[] byArray2 = new byte[n2];
            byteBuffer.get(byArray2);
            this.a.put(n, (Object)byArray2);
        }
        return true;
    }

    @Override
    public int a() {
        return 15494;
    }
}

