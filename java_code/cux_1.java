/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TLongObjectHashMap
 */
import gnu.trove.map.hash.TLongObjectHashMap;
import java.nio.ByteBuffer;

/*
 * Renamed from cuX
 */
public class cux_1
extends ps_0 {
    private long a;
    private final TLongObjectHashMap<eZR> b = new TLongObjectHashMap();
    private final tc_2 c = new tc_2();

    @Override
    public boolean a(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.a = byteBuffer.getLong();
        byte[] byArray2 = new byte[byteBuffer.getInt()];
        byteBuffer.get(byArray2);
        this.c.b(ByteBuffer.wrap(byArray2));
        while (byteBuffer.hasRemaining()) {
            long l = byteBuffer.getLong();
            byte by = byteBuffer.get();
            eZR eZR2 = eZR.a(by);
            eZR2.a(byteBuffer);
            this.b.put(l, (Object)eZR2);
        }
        return true;
    }

    public TLongObjectHashMap<eZR> b() {
        return this.b;
    }

    public tc_2 c() {
        return this.c;
    }

    public long d() {
        return this.a;
    }

    @Override
    public int a() {
        return 13155;
    }
}

