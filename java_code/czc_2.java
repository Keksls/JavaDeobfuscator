/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.list.array.TIntArrayList
 */
import gnu.trove.list.array.TIntArrayList;
import java.nio.ByteBuffer;

/*
 * Renamed from czc
 */
public class czc_2
extends ps_0 {
    private final TIntArrayList a = new TIntArrayList();
    private final TIntArrayList b = new TIntArrayList();

    @Override
    public boolean a(byte[] byArray) {
        if (byArray.length < 2) {
            return false;
        }
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        int n = byteBuffer.getShort() & 0xFFFF;
        if (byteBuffer.remaining() != n * 8) {
            return false;
        }
        for (int k = 0; k < n; ++k) {
            this.a.add(byteBuffer.getInt());
            this.b.add(byteBuffer.getInt());
        }
        return true;
    }

    @Override
    public int a() {
        return 13063;
    }

    public final int b() {
        return this.a.size();
    }

    public final int b(int n) {
        return this.a.get(n);
    }

    public final int c(int n) {
        return this.b.get(n);
    }
}

