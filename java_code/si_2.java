/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;
import java.util.ArrayList;

/*
 * Renamed from sI
 */
final class si_2 {
    private byte[] b = null;
    private final ArrayList<sj_1> c = new ArrayList(0);
    private int d = 0;
    private int e = 0;
    final /* synthetic */ sg_2 a;

    si_2(sg_2 sg_22) {
        this.a = sg_22;
    }

    public void a() {
        this.a.c = this.b;
    }

    private boolean a(ByteBuffer byteBuffer) {
        int n = byteBuffer.getShort() & 0xFFFF;
        this.c.clear();
        this.c.ensureCapacity(n);
        for (int k = 0; k < n; ++k) {
            sj_1 sj_12 = new sj_1();
            boolean bl = sj_12.a(byteBuffer, 10043003);
            if (!bl) {
                return false;
            }
            this.c.add(sj_12);
        }
        return true;
    }

    private boolean b(ByteBuffer byteBuffer) {
        int n = byteBuffer.getShort() & 0xFFFF;
        this.c.clear();
        this.c.ensureCapacity(n);
        for (int k = 0; k < n; ++k) {
            sj_1 sj_12 = new sj_1();
            boolean bl = sj_12.a(byteBuffer, 10043006);
            if (!bl) {
                return false;
            }
            this.c.add(sj_12);
        }
        this.d = byteBuffer.getInt();
        return true;
    }

    private boolean c(ByteBuffer byteBuffer) {
        int n = byteBuffer.getShort() & 0xFFFF;
        this.c.clear();
        this.c.ensureCapacity(n);
        for (int k = 0; k < n; ++k) {
            sj_1 sj_12 = new sj_1();
            boolean bl = sj_12.a(byteBuffer, 10047000);
            if (!bl) {
                return false;
            }
            this.c.add(sj_12);
        }
        this.e = byteBuffer.getInt();
        return true;
    }

    public boolean a(ByteBuffer byteBuffer, int n) {
        if (n < 10043003) {
            return false;
        }
        if (n < 10043006) {
            boolean bl = this.a(byteBuffer);
            return bl;
        }
        if (n < 10047000) {
            boolean bl = this.b(byteBuffer);
            return bl;
        }
        if (n < 10056000) {
            boolean bl = this.c(byteBuffer);
            return bl;
        }
        return false;
    }
}

