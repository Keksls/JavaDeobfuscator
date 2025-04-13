/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.iterator.TIntShortIterator
 *  gnu.trove.map.hash.TIntShortHashMap
 */
import gnu.trove.iterator.TIntShortIterator;
import gnu.trove.map.hash.TIntShortHashMap;
import java.nio.ByteBuffer;

public class cmr
extends Pw {
    private final long a;
    private final int b;
    private final byte c;
    private final TIntShortHashMap e = new TIntShortHashMap();

    public cmr(long l, int n, byte by) {
        this.a = l;
        this.b = n;
        this.c = by;
    }

    public void a(int n, short s2) {
        this.e.put(n, s2);
    }

    @Override
    public byte[] b() {
        ByteBuffer byteBuffer = ByteBuffer.allocate(13 + this.e.size() * 6);
        byteBuffer.putLong(this.a);
        byteBuffer.putInt(this.b);
        byteBuffer.put(this.c);
        TIntShortIterator tIntShortIterator = this.e.iterator();
        while (tIntShortIterator.hasNext()) {
            tIntShortIterator.advance();
            byteBuffer.putInt(tIntShortIterator.key());
            byteBuffer.putShort(tIntShortIterator.value());
        }
        return this.a((byte)3, byteBuffer.array());
    }

    @Override
    public int a() {
        return 12921;
    }
}

