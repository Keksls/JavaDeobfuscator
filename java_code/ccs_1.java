/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.iterator.TLongObjectIterator
 *  gnu.trove.list.array.TLongArrayList
 *  gnu.trove.map.hash.TLongObjectHashMap
 */
import gnu.trove.iterator.TLongObjectIterator;
import gnu.trove.list.array.TLongArrayList;
import gnu.trove.map.hash.TLongObjectHashMap;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/*
 * Renamed from ccs
 */
public class ccs_1
extends fjw_0 {
    private final TLongObjectHashMap<cct_1> b = new TLongObjectHashMap();

    private ccs_1() {
    }

    public static ccs_1 a() {
        return (ccs_1)a;
    }

    protected static fjw_0 b() {
        return new ccs_1();
    }

    public void a(String string) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(gg_0.b(string));
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        int n2 = byteBuffer.getShort();
        for (int k = 0; k < n2; ++k) {
            cct_1 cct_12 = new cct_1(byteBuffer);
            this.b.put(cct_12.a, (Object)cct_12);
            cct_12.x.forEachEntry((n, ccu_12) -> {
                for (ccv_2 ccv_22 : ccu_12.e()) {
                    for (int n2 : ccv_22.a()) {
                        ccw_1.a.a(n2, ccu_12.a);
                    }
                    for (int n2 : ccv_22.b()) {
                        ccw_1.a.b(n2, ccu_12.a);
                    }
                }
                return true;
            });
        }
    }

    public cct_1 a(long l) {
        boolean bl;
        boolean bl2 = bl = l < 0L;
        if (bl && !this.b.containsKey(l)) {
            cct_1 cct_12 = (cct_1)this.b.get(375L);
            this.b.put(l, (Object)cct_12.a(l, cct_12));
        }
        return (cct_1)this.b.get(l);
    }

    public TLongArrayList b(long l) {
        TLongArrayList tLongArrayList = new TLongArrayList();
        TLongObjectIterator tLongObjectIterator = this.b.iterator();
        while (tLongObjectIterator.hasNext()) {
            tLongObjectIterator.advance();
            if (((cct_1)tLongObjectIterator.value()).c != l) continue;
            tLongArrayList.add(tLongObjectIterator.key());
        }
        return tLongArrayList;
    }

    public static void c() {
        a = new ccs_1();
    }

    public TLongObjectHashMap<cct_1> d() {
        return this.b;
    }

    @Override
    public /* synthetic */ fjv_0 c(long l) {
        return this.a(l);
    }
}

