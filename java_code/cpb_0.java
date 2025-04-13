/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.iterator.TIntIntIterator
 *  gnu.trove.map.hash.TIntIntHashMap
 *  gnu.trove.procedure.TIntIntProcedure
 *  org.apache.log4j.Logger
 */
import gnu.trove.iterator.TIntIntIterator;
import gnu.trove.map.hash.TIntIntHashMap;
import gnu.trove.procedure.TIntIntProcedure;
import java.nio.ByteBuffer;
import org.apache.log4j.Logger;

/*
 * Renamed from cpB
 */
public class cpb_0
extends Pw {
    private static final Logger a = Logger.getLogger(cpb_0.class);
    private final TIntIntProcedure b = new cpc_0(this);
    final TIntIntHashMap c = new TIntIntHashMap();
    private long e = 0L;

    public void a(TIntIntHashMap tIntIntHashMap) {
        tIntIntHashMap.forEachEntry(this.b);
    }

    public void a(long l) {
        this.e = l;
    }

    @Override
    public byte[] b() {
        ByteBuffer byteBuffer = ByteBuffer.allocate(8 + this.c.size() * 8);
        byteBuffer.putLong(this.e);
        TIntIntIterator tIntIntIterator = this.c.iterator();
        while (tIntIntIterator.hasNext()) {
            tIntIntIterator.advance();
            byteBuffer.putInt(tIntIntIterator.key());
            byteBuffer.putInt(tIntIntIterator.value());
        }
        return this.a((byte)3, byteBuffer.array());
    }

    @Override
    public int a() {
        return 13278;
    }
}

