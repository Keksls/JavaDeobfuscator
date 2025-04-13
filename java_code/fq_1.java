/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import java.nio.ByteBuffer;
import java.util.ArrayList;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from fq
 */
class fq_1 {
    private static final int a = 10;
    private final int b;
    private final ArrayList<ByteBuffer> c = new ArrayList();
    private final ArrayList<ByteBuffer> d = new ArrayList();
    private final Object e = new Object();

    public fq_1(int n) {
        this.b = n;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Nullable
    public ByteBuffer a() {
        Object object = this.e;
        synchronized (object) {
            if (this.d.isEmpty()) {
                for (int k = 0; k < 10; ++k) {
                    this.d.add(ByteBuffer.allocate(this.b));
                }
            }
            if (this.d.isEmpty()) {
                return null;
            }
            ByteBuffer byteBuffer = this.d.remove(0);
            this.c.add(byteBuffer);
            return byteBuffer;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public boolean a(ByteBuffer byteBuffer) {
        if (byteBuffer == null) {
            throw new IllegalArgumentException("buffer = null");
        }
        Object object = this.e;
        synchronized (object) {
            if (!this.c.contains(byteBuffer)) {
                return false;
            }
            byteBuffer.clear();
            this.c.remove(byteBuffer);
            this.d.add(byteBuffer);
            return true;
        }
    }
}

