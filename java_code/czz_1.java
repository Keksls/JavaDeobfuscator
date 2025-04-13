/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.iterator.TLongIterator
 *  gnu.trove.set.hash.TLongHashSet
 */
import gnu.trove.iterator.TLongIterator;
import gnu.trove.set.hash.TLongHashSet;
import java.nio.ByteBuffer;

/*
 * Renamed from czZ
 */
public class czz_1
extends Pw {
    private TLongHashSet a;

    public void a(TLongHashSet tLongHashSet) {
        this.a = tLongHashSet;
    }

    @Override
    public byte[] b() {
        int n = this.a.size();
        ByteBuffer byteBuffer = ByteBuffer.allocate(2 + 8 * n);
        byteBuffer.putShort((short)n);
        TLongIterator tLongIterator = this.a.iterator();
        while (tLongIterator.hasNext()) {
            byteBuffer.putLong(tLongIterator.next());
        }
        return this.a((byte)6, byteBuffer.array());
    }

    @Override
    public int a() {
        return 15661;
    }
}

