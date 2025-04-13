/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from fld
 */
public class fld_0
implements Iterable<flj_0> {
    private final long a;
    private final flk_0 b;
    private final List<flj_0> c = new ArrayList<flj_0>();

    public static fld_0 a(long l) {
        return new fle_0(l, flk_0.a.get());
    }

    public fld_0(long l, flk_0 flk_02) {
        this.a = l;
        this.b = flk_02;
    }

    public long a() {
        return this.a;
    }

    public flk_0 b() {
        return this.b;
    }

    public int c() {
        return this.c.size();
    }

    @Override
    @NotNull
    public Iterator<flj_0> iterator() {
        return this.c.iterator();
    }

    int d() {
        return 19 + this.c.size() * 14;
    }

    void a(ByteBuffer byteBuffer) {
        byteBuffer.putLong(this.a);
        flf_0.a(this.b, byteBuffer);
        byteBuffer.put((byte)this.c.size());
        for (int k = 0; k < this.c.size(); ++k) {
            flj_0 flj_02 = this.c.get(k);
            flj_02.a(byteBuffer);
        }
    }

    static fld_0 b(ByteBuffer byteBuffer) {
        long l = byteBuffer.getLong();
        flk_0 flk_02 = flf_0.c(byteBuffer);
        return new fld_0(l, flk_02).c(byteBuffer);
    }

    private fld_0 c(ByteBuffer byteBuffer) {
        int n = byteBuffer.get();
        for (int k = 0; k < n; ++k) {
            this.c.add(flj_0.b(byteBuffer));
        }
        return this;
    }

    public void a(int n, flk_0 flk_02) {
        this.c.add(new flj_0(n, flk_02));
    }
}

