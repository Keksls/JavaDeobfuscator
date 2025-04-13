/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TLongObjectHashMap
 */
import gnu.trove.map.hash.TLongObjectHashMap;
import java.nio.ByteBuffer;

/*
 * Renamed from cuY
 */
public class cuy_1
extends ps_0 {
    private final TLongObjectHashMap<eZR> a = new TLongObjectHashMap();
    private boolean b;

    @Override
    public boolean a(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        boolean bl = this.b = byteBuffer.get() == 1;
        while (byteBuffer.hasRemaining()) {
            long l = byteBuffer.getLong();
            byte by = byteBuffer.get();
            eZR eZR2 = eZR.a(by);
            eZR2.a(byteBuffer);
            this.a.put(l, (Object)eZR2);
        }
        return true;
    }

    public TLongObjectHashMap<eZR> b() {
        return this.a;
    }

    public boolean c() {
        return this.b;
    }

    @Override
    public int a() {
        return 13660;
    }
}

