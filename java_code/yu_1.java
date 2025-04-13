/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;
import java.util.ArrayList;

/*
 * Renamed from yU
 */
final class yu_1 {
    private byte b = 0;
    private long c = 0L;
    private int d = 0;
    private short e = 0;
    private long f = 0L;
    private final ArrayList<yv_2> g = new ArrayList(0);
    final /* synthetic */ yt_2 a;

    yu_1(yt_2 yt_22) {
        this.a = yt_22;
    }

    public void a() {
        this.a.a = this.c;
        this.a.b = this.d;
        this.a.c = this.e;
    }

    private boolean a(ByteBuffer byteBuffer) {
        this.b = byteBuffer.get();
        this.c = byteBuffer.getLong();
        this.d = byteBuffer.getInt();
        this.e = byteBuffer.getShort();
        this.f = byteBuffer.getLong();
        int n = byteBuffer.get() & 0xFF;
        this.g.clear();
        this.g.ensureCapacity(n);
        for (int k = 0; k < n; ++k) {
            yv_2 yv_22 = new yv_2();
            boolean bl = yv_22.a(byteBuffer, 1);
            if (!bl) {
                return false;
            }
            this.g.add(yv_22);
        }
        return true;
    }

    private boolean b(ByteBuffer byteBuffer) {
        this.b = byteBuffer.get();
        this.c = byteBuffer.getLong();
        this.d = byteBuffer.getInt();
        this.e = byteBuffer.getShort();
        int n = byteBuffer.get() & 0xFF;
        this.g.clear();
        this.g.ensureCapacity(n);
        for (int k = 0; k < n; ++k) {
            yv_2 yv_22 = new yv_2();
            boolean bl = yv_22.a(byteBuffer, 10048002);
            if (!bl) {
                return false;
            }
            this.g.add(yv_22);
        }
        return true;
    }

    public boolean a(ByteBuffer byteBuffer, int n) {
        if (n < 1) {
            return false;
        }
        if (n < 10048002) {
            boolean bl = this.a(byteBuffer);
            return bl;
        }
        if (n < 10056001) {
            boolean bl = this.b(byteBuffer);
            return bl;
        }
        return false;
    }
}

