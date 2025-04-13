/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.list.array.TLongArrayList
 */
import gnu.trove.list.array.TLongArrayList;
import java.nio.ByteBuffer;

/*
 * Renamed from cuP
 */
public class cup_2
extends ps_0 {
    private final TLongArrayList a = new TLongArrayList();

    public final TLongArrayList b() {
        return this.a;
    }

    @Override
    public boolean a(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        int n = byteBuffer.getShort();
        this.a.resetQuick();
        this.a.ensureCapacity(n);
        for (int k = 0; k < n; ++k) {
            long l = byteBuffer.getLong();
            this.a.add(l);
        }
        return true;
    }

    @Override
    public final int a() {
        return 13849;
    }
}

