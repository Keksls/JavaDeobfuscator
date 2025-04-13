/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.list.array.TIntArrayList
 */
import gnu.trove.list.array.TIntArrayList;
import java.nio.ByteBuffer;

/*
 * Renamed from cye
 */
public class cye_2
extends ps_0 {
    private int a;
    private TIntArrayList b;
    private long c;
    private acx_2 d;

    @Override
    public boolean a(byte[] byArray) {
        int n;
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.a = byteBuffer.getInt();
        int n2 = byteBuffer.get();
        this.b = new TIntArrayList(n2);
        for (n = 0; n < n2; n = (int)((byte)(n + 1))) {
            this.b.add(byteBuffer.getInt());
        }
        if (byteBuffer.get() == 1) {
            this.c = byteBuffer.getInt();
        }
        if ((n = byteBuffer.getInt()) != 0) {
            this.d = new acx_2(n);
            for (int k = 0; k < n; ++k) {
                this.d.a(byteBuffer.get(), byteBuffer.getLong());
            }
        }
        return true;
    }

    @Override
    public int a() {
        return 13495;
    }

    public int b() {
        return this.a;
    }

    public TIntArrayList c() {
        return this.b;
    }

    public long d() {
        return this.c;
    }

    public acx_2 e() {
        return this.d;
    }
}

