/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.iterator.TLongByteIterator
 *  gnu.trove.map.hash.TLongByteHashMap
 */
import gnu.trove.iterator.TLongByteIterator;
import gnu.trove.map.hash.TLongByteHashMap;
import java.nio.ByteBuffer;

public class fch {
    private static final byte b = 2;
    final TLongByteHashMap a = new TLongByteHashMap();
    private final fcm c;

    public fch(fcm fcm2) {
        this.c = fcm2;
    }

    public void a(long l) {
        this.a.put(l, (byte)2);
        this.c();
    }

    public boolean b(long l) {
        return this.a.get(l) != 0;
    }

    public void a() {
        TLongByteIterator tLongByteIterator = this.a.iterator();
        while (tLongByteIterator.hasNext()) {
            tLongByteIterator.advance();
            byte by = tLongByteIterator.value();
            if (by == 1) {
                tLongByteIterator.remove();
            }
            tLongByteIterator.setValue((byte)(by - 1));
        }
        this.c();
    }

    private void c() {
        this.c.a();
    }

    public void a(ByteBuffer byteBuffer) {
        byteBuffer.putShort((short)this.a.size());
        TLongByteIterator tLongByteIterator = this.a.iterator();
        while (tLongByteIterator.hasNext()) {
            tLongByteIterator.advance();
            byteBuffer.putLong(tLongByteIterator.key());
            byteBuffer.put(tLongByteIterator.value());
        }
    }

    public void b(ByteBuffer byteBuffer) {
        this.a.clear();
        short s2 = byteBuffer.getShort();
        for (short s3 = 0; s3 < s2; s3 = (short)(s3 + 1)) {
            this.a.put(byteBuffer.getLong(), byteBuffer.get());
        }
    }

    public int b() {
        return 2 + this.a.size() * 9;
    }
}

