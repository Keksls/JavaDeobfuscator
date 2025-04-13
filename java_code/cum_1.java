/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.list.array.TIntArrayList
 */
import gnu.trove.list.array.TIntArrayList;
import java.nio.ByteBuffer;

/*
 * Renamed from cum
 */
public class cum_1
extends ps_0 {
    private final TIntArrayList a = new TIntArrayList();
    private final TIntArrayList b = new TIntArrayList();
    private final TIntArrayList c = new TIntArrayList();

    @Override
    public boolean a(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        int n = byteBuffer.get();
        for (int k = 0; k < n; ++k) {
            this.a.add(byteBuffer.getInt());
            this.b.add(byteBuffer.getInt());
            this.c.add(byteBuffer.getInt());
        }
        return true;
    }

    public TIntArrayList b() {
        return this.a;
    }

    public TIntArrayList c() {
        return this.b;
    }

    public TIntArrayList d() {
        return this.c;
    }

    @Override
    public int a() {
        return 12606;
    }
}

