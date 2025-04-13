/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from sh
 */
final class sh_2 {
    private int b = 0;
    private int[] c = null;
    private int d = 0;
    private short e = 0;
    private long f = 0L;
    private byte g = 0;
    private boolean h = false;
    private byte i = 0;
    private int j = 0;
    final /* synthetic */ sf_2 a;

    sh_2(sf_2 sf_22) {
        this.a = sf_22;
    }

    public void a() {
        this.a.c = this.b;
        this.a.d = this.c;
        this.a.e = this.e;
        this.a.f = this.f;
        this.a.g = this.g;
        this.a.h = this.h;
        this.a.i = this.i;
        this.a.j = this.j;
    }

    private boolean a(ByteBuffer byteBuffer) {
        this.b = byteBuffer.getInt();
        int n = byteBuffer.getShort() & 0xFFFF;
        if (n > 0) {
            this.c = new int[n];
            for (int k = 0; k < n; ++k) {
                this.c[k] = byteBuffer.getInt();
            }
        } else {
            this.c = null;
        }
        this.d = byteBuffer.getInt();
        this.e = byteBuffer.getShort();
        return true;
    }

    private boolean b(ByteBuffer byteBuffer) {
        this.b = byteBuffer.getInt();
        int n = byteBuffer.getShort() & 0xFFFF;
        if (n > 0) {
            this.c = new int[n];
            for (int k = 0; k < n; ++k) {
                this.c[k] = byteBuffer.getInt();
            }
        } else {
            this.c = null;
        }
        this.d = byteBuffer.getInt();
        this.e = byteBuffer.getShort();
        this.f = byteBuffer.getLong();
        return true;
    }

    private boolean c(ByteBuffer byteBuffer) {
        this.b = byteBuffer.getInt();
        int n = byteBuffer.getShort() & 0xFFFF;
        if (n > 0) {
            this.c = new int[n];
            for (int k = 0; k < n; ++k) {
                this.c[k] = byteBuffer.getInt();
            }
        } else {
            this.c = null;
        }
        this.e = byteBuffer.getShort();
        this.f = byteBuffer.getLong();
        return true;
    }

    private boolean d(ByteBuffer byteBuffer) {
        this.b = byteBuffer.getInt();
        int n = byteBuffer.getShort() & 0xFFFF;
        if (n > 0) {
            this.c = new int[n];
            for (int k = 0; k < n; ++k) {
                this.c[k] = byteBuffer.getInt();
            }
        } else {
            this.c = null;
        }
        this.e = byteBuffer.getShort();
        this.f = byteBuffer.getLong();
        this.g = byteBuffer.get();
        return true;
    }

    private boolean e(ByteBuffer byteBuffer) {
        this.b = byteBuffer.getInt();
        int n = byteBuffer.getShort() & 0xFFFF;
        if (n > 0) {
            this.c = new int[n];
            for (int k = 0; k < n; ++k) {
                this.c[k] = byteBuffer.getInt();
            }
        } else {
            this.c = null;
        }
        this.e = byteBuffer.getShort();
        this.f = byteBuffer.getLong();
        this.g = byteBuffer.get();
        this.h = byteBuffer.get() == 1;
        return true;
    }

    public boolean a(ByteBuffer byteBuffer, int n) {
        if (n < 1) {
            return false;
        }
        if (n < 10051001) {
            boolean bl = this.a(byteBuffer);
            return bl;
        }
        if (n < 10054000) {
            boolean bl = this.b(byteBuffer);
            return bl;
        }
        if (n < 10072000) {
            boolean bl = this.c(byteBuffer);
            return bl;
        }
        if (n < 10073000) {
            boolean bl = this.d(byteBuffer);
            return bl;
        }
        if (n < 10081000) {
            boolean bl = this.e(byteBuffer);
            return bl;
        }
        return false;
    }
}

