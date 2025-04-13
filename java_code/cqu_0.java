/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TByteObjectHashMap
 *  org.apache.commons.lang3.tuple.ImmutablePair
 *  org.apache.commons.lang3.tuple.Pair
 */
import gnu.trove.map.hash.TByteObjectHashMap;
import java.nio.ByteBuffer;
import org.apache.commons.lang3.tuple.ImmutablePair;
import org.apache.commons.lang3.tuple.Pair;

/*
 * Renamed from cqU
 */
public class cqu_0
extends ps_0 {
    private long a;
    private final TByteObjectHashMap<Pair<Integer, Integer>> b = new TByteObjectHashMap();

    @Override
    public boolean a(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.a = byteBuffer.getLong();
        byte by = byteBuffer.get();
        for (byte by2 = 0; by2 < by; by2 = (byte)(by2 + 1)) {
            byte by3 = byteBuffer.get();
            this.b.put(by3, (Object)new ImmutablePair((Object)byteBuffer.getInt(), (Object)byteBuffer.getInt()));
        }
        return true;
    }

    @Override
    public int a() {
        return 13396;
    }

    public TByteObjectHashMap<Pair<Integer, Integer>> b() {
        return this.b;
    }

    public long c() {
        return this.a;
    }
}

