/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.list.array.TLongArrayList
 */
import gnu.trove.list.array.TLongArrayList;
import java.nio.ByteBuffer;

/*
 * Renamed from crB
 */
public class crb_0
extends ps_0 {
    private TLongArrayList a;

    @Override
    public boolean a(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        int n = byteBuffer.get();
        this.a = new TLongArrayList(n);
        for (int k = 0; k < n; ++k) {
            this.a.add(byteBuffer.getLong());
        }
        return true;
    }

    @Override
    public int a() {
        return 13121;
    }

    public TLongArrayList b() {
        return this.a;
    }
}

