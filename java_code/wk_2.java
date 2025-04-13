/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Charsets
 */
import com.google.common.base.Charsets;
import java.nio.ByteBuffer;

/*
 * Renamed from wk
 */
final class wk_2 {
    private short b = 0;
    private String c = null;
    private int d = 0;
    private long e = 0L;
    private short f = 0;
    private byte g = 0;
    private wg_2 h = null;
    private wi_1 i = null;
    private int j = 0;
    private long k = 0L;
    private boolean l = false;
    final /* synthetic */ wf_1 a;

    wk_2(wf_1 wf_12) {
        this.a = wf_12;
    }

    public void a() {
        this.a.a = this.b;
        this.a.b = this.c;
        this.a.c = this.d;
        this.a.d = this.e;
        this.a.e = this.f;
        this.a.f = this.g;
        this.a.g = this.h;
        this.a.h = this.i;
        this.a.i = this.j;
        this.a.j = this.k;
        this.a.k = this.l;
    }

    private boolean a(ByteBuffer byteBuffer) {
        return true;
    }

    private boolean b(ByteBuffer byteBuffer) {
        boolean bl;
        boolean bl2;
        this.b = byteBuffer.getShort();
        int n = byteBuffer.getShort() & 0xFFFF;
        byte[] byArray = new byte[n];
        byteBuffer.get(byArray);
        this.c = new String(byArray, Charsets.UTF_8);
        this.d = byteBuffer.getInt();
        this.e = byteBuffer.getLong();
        this.f = byteBuffer.getShort();
        this.g = byteBuffer.get();
        boolean bl3 = bl2 = byteBuffer.get() == 1;
        if (bl2) {
            this.h = new wg_2();
            bl = this.h.a(byteBuffer, 1);
            if (!bl) {
                return false;
            }
        } else {
            this.h = null;
        }
        boolean bl4 = bl = byteBuffer.get() == 1;
        if (bl) {
            this.i = new wi_1();
            boolean bl5 = this.i.a(byteBuffer, 1);
            if (!bl5) {
                return false;
            }
        } else {
            this.i = null;
        }
        this.j = byteBuffer.getInt();
        this.k = byteBuffer.getLong();
        this.l = byteBuffer.get() == 1;
        return true;
    }

    private boolean c(ByteBuffer byteBuffer) {
        boolean bl;
        boolean bl2;
        this.b = byteBuffer.getShort();
        int n = byteBuffer.getShort() & 0xFFFF;
        byte[] byArray = new byte[n];
        byteBuffer.get(byArray);
        this.c = new String(byArray, Charsets.UTF_8);
        this.d = byteBuffer.getInt();
        this.e = byteBuffer.getLong();
        this.f = byteBuffer.getShort();
        this.g = byteBuffer.get();
        boolean bl3 = bl2 = byteBuffer.get() == 1;
        if (bl2) {
            this.h = new wg_2();
            bl = this.h.a(byteBuffer, 0x992323);
            if (!bl) {
                return false;
            }
        } else {
            this.h = null;
        }
        boolean bl4 = bl = byteBuffer.get() == 1;
        if (bl) {
            this.i = new wi_1();
            boolean bl5 = this.i.a(byteBuffer, 0x992323);
            if (!bl5) {
                return false;
            }
        } else {
            this.i = null;
        }
        this.j = byteBuffer.getInt();
        this.k = byteBuffer.getLong();
        this.l = byteBuffer.get() == 1;
        return true;
    }

    private boolean d(ByteBuffer byteBuffer) {
        boolean bl;
        boolean bl2;
        this.b = byteBuffer.getShort();
        int n = byteBuffer.getShort() & 0xFFFF;
        byte[] byArray = new byte[n];
        byteBuffer.get(byArray);
        this.c = new String(byArray, Charsets.UTF_8);
        this.d = byteBuffer.getInt();
        this.e = byteBuffer.getLong();
        this.f = byteBuffer.getShort();
        this.g = byteBuffer.get();
        boolean bl3 = bl2 = byteBuffer.get() == 1;
        if (bl2) {
            this.h = new wg_2();
            bl = this.h.a(byteBuffer, 10048002);
            if (!bl) {
                return false;
            }
        } else {
            this.h = null;
        }
        boolean bl4 = bl = byteBuffer.get() == 1;
        if (bl) {
            this.i = new wi_1();
            boolean bl5 = this.i.a(byteBuffer, 10048002);
            if (!bl5) {
                return false;
            }
        } else {
            this.i = null;
        }
        this.j = byteBuffer.getInt();
        this.k = byteBuffer.getLong();
        this.l = byteBuffer.get() == 1;
        return true;
    }

    public boolean a(ByteBuffer byteBuffer, int n) {
        if (n < 0) {
            return false;
        }
        if (n < 1) {
            boolean bl = this.a(byteBuffer);
            return bl;
        }
        if (n < 0x992323) {
            boolean bl = this.b(byteBuffer);
            return bl;
        }
        if (n < 10048002) {
            boolean bl = this.c(byteBuffer);
            return bl;
        }
        if (n < 10056001) {
            boolean bl = this.d(byteBuffer);
            return bl;
        }
        return false;
    }
}

