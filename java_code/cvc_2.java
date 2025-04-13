/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TLongObjectHashMap
 */
import gnu.trove.map.hash.TLongObjectHashMap;
import java.nio.ByteBuffer;

/*
 * Renamed from cvc
 */
public class cvc_2
extends ps_0 {
    private final TLongObjectHashMap<eZR> a = new TLongObjectHashMap();
    private byte b;
    private long c;

    @Override
    public boolean a(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.b = byteBuffer.get();
        this.c = byteBuffer.getLong();
        while (byteBuffer.hasRemaining()) {
            long l = byteBuffer.getLong();
            byte by = byteBuffer.get();
            eZR eZR2 = eZR.a(by);
            eZR2.a(byteBuffer);
            if (eZR2.e() == 0) {
                ((ezq_0)eZR2).a(true);
            } else if (eZR2.e() == 2) {
                ((ezu_0)eZR2).a(true);
            }
            this.a.put(l, (Object)eZR2);
        }
        return true;
    }

    public long b() {
        return this.c;
    }

    public byte c() {
        return this.b;
    }

    public TLongObjectHashMap<eZR> d() {
        return this.a;
    }

    @Override
    public int a() {
        return 13239;
    }
}

