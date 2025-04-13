/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;
import java.util.ArrayList;

/*
 * Renamed from uN
 */
final class un_1 {
    private int b = 0;
    private int c = 0;
    private byte[] d = null;
    private byte e = 0;
    private final yx_2 f = new yx_2();
    private final tw_2 g = new tw_2();
    private final ArrayList<um_1> h = new ArrayList(0);
    final /* synthetic */ ul_2 a;

    un_1(ul_2 ul_22) {
        this.a = ul_22;
    }

    public void a() {
        this.a.a = this.b;
        this.a.b = this.c;
        this.a.c = this.d;
        this.a.d = this.e;
        this.a.e.a.clear();
        this.a.e.a.ensureCapacity(this.f.a.size());
        this.a.e.a.addAll(this.f.a);
        this.a.f.a.clear();
        this.a.f.a.ensureCapacity(this.g.a.size());
        this.a.f.a.addAll(this.g.a);
        this.a.g.clear();
        this.a.g.ensureCapacity(this.h.size());
        this.a.g.addAll(this.h);
    }

    private boolean a(ByteBuffer byteBuffer) {
        this.b = byteBuffer.getInt();
        this.c = byteBuffer.getInt();
        int n = byteBuffer.getShort() & 0xFFFF;
        if (n > 0) {
            this.d = new byte[n];
            byteBuffer.get(this.d);
        } else {
            this.d = null;
        }
        this.e = byteBuffer.get();
        boolean bl = this.f.a(byteBuffer, 1);
        if (!bl) {
            return false;
        }
        boolean bl2 = this.g.a(byteBuffer, 1);
        if (!bl2) {
            return false;
        }
        int n2 = byteBuffer.getShort() & 0xFFFF;
        this.h.clear();
        this.h.ensureCapacity(n2);
        for (int k = 0; k < n2; ++k) {
            um_1 um_12 = new um_1();
            boolean bl3 = um_12.a(byteBuffer, 1);
            if (!bl3) {
                return false;
            }
            this.h.add(um_12);
        }
        return true;
    }

    private boolean b(ByteBuffer byteBuffer) {
        this.b = byteBuffer.getInt();
        this.c = byteBuffer.getInt();
        int n = byteBuffer.getShort() & 0xFFFF;
        if (n > 0) {
            this.d = new byte[n];
            byteBuffer.get(this.d);
        } else {
            this.d = null;
        }
        this.e = byteBuffer.get();
        boolean bl = this.f.a(byteBuffer, 0x992323);
        if (!bl) {
            return false;
        }
        boolean bl2 = this.g.a(byteBuffer, 0x992323);
        if (!bl2) {
            return false;
        }
        int n2 = byteBuffer.getShort() & 0xFFFF;
        this.h.clear();
        this.h.ensureCapacity(n2);
        for (int k = 0; k < n2; ++k) {
            um_1 um_12 = new um_1();
            boolean bl3 = um_12.a(byteBuffer, 0x992323);
            if (!bl3) {
                return false;
            }
            this.h.add(um_12);
        }
        return true;
    }

    private boolean c(ByteBuffer byteBuffer) {
        this.b = byteBuffer.getInt();
        this.c = byteBuffer.getInt();
        int n = byteBuffer.getShort() & 0xFFFF;
        if (n > 0) {
            this.d = new byte[n];
            byteBuffer.get(this.d);
        } else {
            this.d = null;
        }
        this.e = byteBuffer.get();
        boolean bl = this.f.a(byteBuffer, 10048002);
        if (!bl) {
            return false;
        }
        boolean bl2 = this.g.a(byteBuffer, 10048002);
        if (!bl2) {
            return false;
        }
        int n2 = byteBuffer.getShort() & 0xFFFF;
        this.h.clear();
        this.h.ensureCapacity(n2);
        for (int k = 0; k < n2; ++k) {
            um_1 um_12 = new um_1();
            boolean bl3 = um_12.a(byteBuffer, 10048002);
            if (!bl3) {
                return false;
            }
            this.h.add(um_12);
        }
        return true;
    }

    public boolean a(ByteBuffer byteBuffer, int n) {
        if (n < 1) {
            return false;
        }
        if (n < 0x992323) {
            boolean bl = this.a(byteBuffer);
            return bl;
        }
        if (n < 10048002) {
            boolean bl = this.b(byteBuffer);
            return bl;
        }
        if (n < 10056001) {
            boolean bl = this.c(byteBuffer);
            return bl;
        }
        return false;
    }
}

