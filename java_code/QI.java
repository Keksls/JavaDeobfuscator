/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.list.array.TLongArrayList
 */
import gnu.trove.list.array.TLongArrayList;
import java.nio.ByteBuffer;

public class QI
extends ps_0 {
    private long a;
    private final TLongArrayList b = new TLongArrayList();

    @Override
    public boolean a(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.a = byteBuffer.getLong();
        while (byteBuffer.hasRemaining()) {
            this.b.add(byteBuffer.getLong());
        }
        return true;
    }

    @Override
    public int a() {
        return 1193;
    }

    public long b() {
        return this.a;
    }

    public TLongArrayList c() {
        return this.b;
    }
}

