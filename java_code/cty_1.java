/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TLongObjectHashMap
 */
import gnu.trove.map.hash.TLongObjectHashMap;
import java.nio.ByteBuffer;

/*
 * Renamed from cty
 */
public final class cty_1
extends csy_2 {
    final TLongObjectHashMap<aff_1> b = new TLongObjectHashMap();
    private boolean c;

    @Override
    public boolean a(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.a(byteBuffer);
        int n = byteBuffer.getShort();
        for (int k = 0; k < n; ++k) {
            long l = byteBuffer.getLong();
            aff_1 aff_12 = new aff_1(byteBuffer.getInt(), byteBuffer.getInt(), byteBuffer.getShort());
            this.b.put(l, (Object)aff_12);
        }
        this.c = byteBuffer.get() == 1;
        return false;
    }

    public boolean b() {
        return this.c;
    }

    public TLongObjectHashMap<aff_1> c() {
        return this.b;
    }

    @Override
    public int a() {
        return 13307;
    }
}

