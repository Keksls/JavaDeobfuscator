/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.iterator.TIntIntIterator
 *  gnu.trove.iterator.TIntObjectIterator
 *  gnu.trove.map.hash.TIntIntHashMap
 *  gnu.trove.map.hash.TIntObjectHashMap
 */
import gnu.trove.iterator.TIntIntIterator;
import gnu.trove.iterator.TIntObjectIterator;
import gnu.trove.map.hash.TIntIntHashMap;
import gnu.trove.map.hash.TIntObjectHashMap;
import java.nio.ByteBuffer;

public class cAZ
extends ps_0 {
    private final TIntObjectHashMap<byte[]> a = new TIntObjectHashMap();
    private final TIntIntHashMap b = new TIntIntHashMap();

    public TIntObjectIterator<byte[]> b() {
        return this.a.iterator();
    }

    public TIntIntIterator c() {
        return this.b.iterator();
    }

    @Override
    public boolean a(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        while (byteBuffer.hasRemaining()) {
            int n = byteBuffer.getInt();
            byte[] byArray2 = new byte[byteBuffer.getInt()];
            byteBuffer.get(byArray2);
            ByteBuffer byteBuffer2 = ByteBuffer.wrap(byArray2);
            this.b.put(n, byteBuffer2.getInt());
            byte[] byArray3 = new byte[byteBuffer2.getInt()];
            byteBuffer2.get(byArray3);
            this.a.put(n, (Object)byArray3);
        }
        return true;
    }

    @Override
    public int a() {
        return 15201;
    }
}

