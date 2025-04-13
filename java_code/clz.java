/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.iterator.TIntObjectIterator
 *  gnu.trove.list.array.TIntArrayList
 *  gnu.trove.map.hash.TIntObjectHashMap
 */
import gnu.trove.iterator.TIntObjectIterator;
import gnu.trove.list.array.TIntArrayList;
import gnu.trove.map.hash.TIntObjectHashMap;
import java.nio.ByteBuffer;

public class clz
extends Pw {
    private final long a;
    private TIntArrayList b = new TIntArrayList();
    private TIntObjectHashMap<boq_0> c = new TIntObjectHashMap();

    public clz(long l) {
        this.a = l;
    }

    @Override
    public byte[] b() {
        ByteBuffer byteBuffer = ByteBuffer.allocate(8 + (this.b != null ? this.b.size() : 0) * 4 + 2 + 21 * (this.c != null ? this.c.size() : 0) + 2);
        byteBuffer.putLong(this.a);
        if (this.b != null) {
            byteBuffer.putShort((short)this.b.size());
            for (int k = 0; k < this.b.size(); ++k) {
                byteBuffer.putInt(this.b.get(k));
            }
            this.b = null;
        } else {
            byteBuffer.putShort((short)0);
        }
        if (this.c != null) {
            byteBuffer.putShort((short)this.c.size());
            TIntObjectIterator tIntObjectIterator = this.c.iterator();
            while (tIntObjectIterator.hasNext()) {
                tIntObjectIterator.advance();
                byteBuffer.putInt(tIntObjectIterator.key());
                yp_2 yp_22 = new yp_2();
                ((boq_0)tIntObjectIterator.value()).b(yp_22);
                yp_22.a(byteBuffer);
            }
            this.c = null;
        } else {
            byteBuffer.putShort((short)0);
        }
        return this.a((byte)3, byteBuffer.array());
    }

    @Override
    public int a() {
        return 13435;
    }

    public void a(byte by, byte by2, byte by3, boq_0 boq_02) {
        int n = this.b(by, by2, by3);
        this.c.put(n, (Object)boq_02);
    }

    public void a(byte by, byte by2, byte by3) {
        this.b.add(this.b(by, by2, by3));
    }

    private int b(byte by, byte by2, byte by3) {
        return (by << 16) + (by2 << 8) + by3;
    }
}

