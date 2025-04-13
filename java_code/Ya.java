/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.set.hash.TIntHashSet
 *  org.apache.log4j.Logger
 */
import gnu.trove.set.hash.TIntHashSet;
import java.nio.ByteBuffer;
import org.apache.log4j.Logger;

public class Ya {
    private static final Logger b = Logger.getLogger(Ya.class);
    private final TIntHashSet c = new TIntHashSet();

    public void a(String string, long l) {
        try {
            assert (this.c.isEmpty());
            byte[] byArray = arl_1.b(String.format(string, l));
            ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
            int n = byArray.length / 4;
            for (int k = 0; k < n; ++k) {
                this.c.add(byteBuffer.getInt());
            }
        }
        catch (Throwable throwable) {
            b.error((Object)("probl\u00e8me de lecture des coordonn\u00e9es de maps valides worldId=" + l), throwable);
        }
    }

    public boolean a(int n, int n2) {
        return this.c.contains(Hw.d(n, n2));
    }

    public void a() {
        this.c.clear();
    }

    public void a(short s2, short s3) {
        this.c.add(Hw.d(s2, s3));
    }
}

