/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.iterator.TLongObjectIterator
 *  gnu.trove.map.hash.TLongObjectHashMap
 */
import gnu.trove.iterator.TLongObjectIterator;
import gnu.trove.map.hash.TLongObjectHashMap;
import java.nio.ByteBuffer;

class eLA
extends fo_1 {
    final /* synthetic */ eLu d;

    eLA(eLu eLu2) {
        this.d = eLu2;
    }

    @Override
    public void a(ByteBuffer byteBuffer) {
        TLongObjectHashMap<String> tLongObjectHashMap = this.d.b.r();
        byteBuffer.put(this.d.b.p());
        byteBuffer.put((byte)tLongObjectHashMap.size());
        TLongObjectIterator tLongObjectIterator = tLongObjectHashMap.iterator();
        while (tLongObjectIterator.hasNext()) {
            tLongObjectIterator.advance();
            byteBuffer.putLong(tLongObjectIterator.key());
            byte[] byArray = Cz.a((String)tLongObjectIterator.value());
            if (byArray.length > 127) {
                return;
            }
            byteBuffer.put((byte)byArray.length);
            byteBuffer.put(byArray);
        }
    }

    @Override
    public void a(ByteBuffer byteBuffer, int n) {
        this.d.b.d(byteBuffer.get());
        int n2 = byteBuffer.get();
        for (int k = 0; k < n2; ++k) {
            long l = byteBuffer.getLong();
            byte[] byArray = new byte[byteBuffer.get()];
            byteBuffer.get(byArray);
            this.d.b.b(l, Cz.a(byArray));
        }
    }

    @Override
    public int j() {
        int n = 2;
        TLongObjectHashMap<String> tLongObjectHashMap = this.d.b.r();
        TLongObjectIterator tLongObjectIterator = tLongObjectHashMap.iterator();
        while (tLongObjectIterator.hasNext()) {
            tLongObjectIterator.advance();
            byte[] byArray = Cz.a((String)tLongObjectIterator.value());
            if (byArray.length > 127) {
                return n;
            }
            n += 9 + byArray.length;
        }
        return n;
    }
}

