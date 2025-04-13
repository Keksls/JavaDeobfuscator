/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;
import java.util.ArrayList;

/*
 * Renamed from yO
 */
final class yo_1 {
    private final ArrayList<ym_2> b = new ArrayList(0);
    private final ArrayList<yl_1> c = new ArrayList(0);
    private int d = 0;
    private int e = 0;
    private byte f = 0;
    private byte g = 0;
    private byte h = 0;
    private byte i = 0;
    private byte j = (byte)-1;
    final /* synthetic */ yk_1 a;

    yo_1(yk_1 yk_12) {
        this.a = yk_12;
    }

    public void a() {
        this.a.a.clear();
        this.a.a.ensureCapacity(this.b.size());
        this.a.a.addAll(this.b);
        this.a.b.clear();
        this.a.b.ensureCapacity(this.c.size());
        this.a.b.addAll(this.c);
        this.a.c = this.d;
        this.a.d = this.e;
        this.a.e = this.j;
    }

    private boolean a(ByteBuffer byteBuffer) {
        int n = byteBuffer.getShort() & 0xFFFF;
        this.b.clear();
        this.b.ensureCapacity(n);
        for (int k = 0; k < n; ++k) {
            ym_2 ym_22 = new ym_2();
            boolean bl = ym_22.a(byteBuffer, 1);
            if (!bl) {
                return false;
            }
            this.b.add(ym_22);
        }
        return true;
    }

    private boolean b(ByteBuffer byteBuffer) {
        int n;
        int n2 = byteBuffer.getShort() & 0xFFFF;
        this.b.clear();
        this.b.ensureCapacity(n2);
        for (n = 0; n < n2; ++n) {
            ym_2 ym_22 = new ym_2();
            boolean bl = ym_22.a(byteBuffer, 10055001);
            if (!bl) {
                return false;
            }
            this.b.add(ym_22);
        }
        n = byteBuffer.getShort() & 0xFFFF;
        this.c.clear();
        this.c.ensureCapacity(n);
        for (int k = 0; k < n; ++k) {
            yl_1 yl_12 = new yl_1();
            boolean bl = yl_12.a(byteBuffer, 10055001);
            if (!bl) {
                return false;
            }
            this.c.add(yl_12);
        }
        return true;
    }

    private boolean c(ByteBuffer byteBuffer) {
        int n;
        int n2 = byteBuffer.getShort() & 0xFFFF;
        this.b.clear();
        this.b.ensureCapacity(n2);
        for (n = 0; n < n2; ++n) {
            ym_2 ym_22 = new ym_2();
            boolean bl = ym_22.a(byteBuffer, 10064001);
            if (!bl) {
                return false;
            }
            this.b.add(ym_22);
        }
        n = byteBuffer.getShort() & 0xFFFF;
        this.c.clear();
        this.c.ensureCapacity(n);
        for (int k = 0; k < n; ++k) {
            yl_1 yl_12 = new yl_1();
            boolean bl = yl_12.a(byteBuffer, 10064001);
            if (!bl) {
                return false;
            }
            this.c.add(yl_12);
        }
        this.d = byteBuffer.getInt();
        this.e = byteBuffer.getInt();
        this.f = byteBuffer.get();
        this.g = byteBuffer.get();
        this.h = byteBuffer.get();
        this.i = byteBuffer.get();
        this.j = byteBuffer.get();
        return true;
    }

    public boolean a(ByteBuffer byteBuffer, int n) {
        if (n < 1) {
            return false;
        }
        if (n < 10055001) {
            boolean bl = this.a(byteBuffer);
            return bl;
        }
        if (n < 10064001) {
            boolean bl = this.b(byteBuffer);
            return bl;
        }
        if (n < 10069001) {
            boolean bl = this.c(byteBuffer);
            return bl;
        }
        return false;
    }
}

