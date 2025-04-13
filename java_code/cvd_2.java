/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TLongObjectHashMap
 */
import gnu.trove.map.hash.TLongObjectHashMap;
import java.nio.ByteBuffer;

/*
 * Renamed from cvd
 */
public class cvd_2
extends ps_0 {
    private final TLongObjectHashMap<eZR> a = new TLongObjectHashMap();
    private final vf_2 b = new vf_2();
    private byte c;
    private long d;

    @Override
    public boolean a(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.d = byteBuffer.getLong();
        this.c = byteBuffer.get();
        this.b.b(byteBuffer);
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
        return this.d;
    }

    public byte c() {
        return this.c;
    }

    public exk_2 d() {
        return bhb_0.d().a(this.b);
    }

    public TLongObjectHashMap<eZR> e() {
        return this.a;
    }

    @Override
    public int a() {
        return 12950;
    }
}

