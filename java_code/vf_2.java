/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from vF
 */
public class vf_2
implements gs_0 {
    public long a = 0L;
    public int b = 0;
    public short c = 0;
    public vr_2 d = null;
    public wa_2 e = null;
    public vw_1 f = null;
    public vi_1 g = null;
    public vg_2 h = null;
    public vk_1 i = null;
    public vo_2 j = null;
    public vq_1 k = null;

    @Override
    public boolean a(ByteBuffer byteBuffer) {
        boolean bl;
        byteBuffer.putLong(this.a);
        byteBuffer.putInt(this.b);
        byteBuffer.putShort(this.c);
        if (this.d != null) {
            byteBuffer.put((byte)1);
            bl = this.d.a(byteBuffer);
            if (!bl) {
                return false;
            }
        } else {
            byteBuffer.put((byte)0);
        }
        if (this.e != null) {
            byteBuffer.put((byte)1);
            bl = this.e.a(byteBuffer);
            if (!bl) {
                return false;
            }
        } else {
            byteBuffer.put((byte)0);
        }
        if (this.f != null) {
            byteBuffer.put((byte)1);
            bl = this.f.a(byteBuffer);
            if (!bl) {
                return false;
            }
        } else {
            byteBuffer.put((byte)0);
        }
        if (this.g != null) {
            byteBuffer.put((byte)1);
            bl = this.g.a(byteBuffer);
            if (!bl) {
                return false;
            }
        } else {
            byteBuffer.put((byte)0);
        }
        if (this.h != null) {
            byteBuffer.put((byte)1);
            bl = this.h.a(byteBuffer);
            if (!bl) {
                return false;
            }
        } else {
            byteBuffer.put((byte)0);
        }
        if (this.i != null) {
            byteBuffer.put((byte)1);
            bl = this.i.a(byteBuffer);
            if (!bl) {
                return false;
            }
        } else {
            byteBuffer.put((byte)0);
        }
        if (this.j != null) {
            byteBuffer.put((byte)1);
            bl = this.j.a(byteBuffer);
            if (!bl) {
                return false;
            }
        } else {
            byteBuffer.put((byte)0);
        }
        if (this.k != null) {
            byteBuffer.put((byte)1);
            bl = this.k.a(byteBuffer);
            if (!bl) {
                return false;
            }
        } else {
            byteBuffer.put((byte)0);
        }
        return true;
    }

    @Override
    public boolean b(ByteBuffer byteBuffer) {
        boolean bl;
        boolean bl2;
        boolean bl3;
        boolean bl4;
        boolean bl5;
        boolean bl6;
        boolean bl7;
        boolean bl8;
        this.a = byteBuffer.getLong();
        this.b = byteBuffer.getInt();
        this.c = byteBuffer.getShort();
        boolean bl9 = bl8 = byteBuffer.get() == 1;
        if (bl8) {
            this.d = new vr_2();
            bl7 = this.d.b(byteBuffer);
            if (!bl7) {
                return false;
            }
        } else {
            this.d = null;
        }
        boolean bl10 = bl7 = byteBuffer.get() == 1;
        if (bl7) {
            this.e = new wa_2();
            bl6 = this.e.b(byteBuffer);
            if (!bl6) {
                return false;
            }
        } else {
            this.e = null;
        }
        boolean bl11 = bl6 = byteBuffer.get() == 1;
        if (bl6) {
            this.f = new vw_1();
            bl5 = this.f.b(byteBuffer);
            if (!bl5) {
                return false;
            }
        } else {
            this.f = null;
        }
        boolean bl12 = bl5 = byteBuffer.get() == 1;
        if (bl5) {
            this.g = new vi_1();
            bl4 = this.g.b(byteBuffer);
            if (!bl4) {
                return false;
            }
        } else {
            this.g = null;
        }
        boolean bl13 = bl4 = byteBuffer.get() == 1;
        if (bl4) {
            this.h = new vg_2();
            bl3 = this.h.b(byteBuffer);
            if (!bl3) {
                return false;
            }
        } else {
            this.h = null;
        }
        boolean bl14 = bl3 = byteBuffer.get() == 1;
        if (bl3) {
            this.i = new vk_1();
            bl2 = this.i.b(byteBuffer);
            if (!bl2) {
                return false;
            }
        } else {
            this.i = null;
        }
        boolean bl15 = bl2 = byteBuffer.get() == 1;
        if (bl2) {
            this.j = new vo_2();
            bl = this.j.b(byteBuffer);
            if (!bl) {
                return false;
            }
        } else {
            this.j = null;
        }
        boolean bl16 = bl = byteBuffer.get() == 1;
        if (bl) {
            this.k = new vq_1();
            boolean bl17 = this.k.b(byteBuffer);
            if (!bl17) {
                return false;
            }
        } else {
            this.k = null;
        }
        return true;
    }

    @Override
    public void c() {
        this.a = 0L;
        this.b = 0;
        this.c = 0;
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = null;
        this.h = null;
        this.i = null;
        this.j = null;
        this.k = null;
    }

    @Override
    public boolean a(ByteBuffer byteBuffer, int n) {
        if (n < 10069001) {
            vt_1 vt_12 = new vt_1(this);
            boolean bl = vt_12.a(byteBuffer, n);
            if (bl) {
                vt_12.a();
                return true;
            }
            return false;
        }
        return this.b(byteBuffer);
    }

    @Override
    public int b() {
        int n = 0;
        n += 8;
        n += 4;
        n += 2;
        ++n;
        if (this.d != null) {
            n += this.d.b();
        }
        ++n;
        if (this.e != null) {
            n += this.e.b();
        }
        ++n;
        if (this.f != null) {
            n += this.f.b();
        }
        ++n;
        if (this.g != null) {
            n += this.g.b();
        }
        ++n;
        if (this.h != null) {
            n += this.h.b();
        }
        ++n;
        if (this.i != null) {
            n += this.i.b();
        }
        ++n;
        if (this.j != null) {
            n += this.j.b();
        }
        ++n;
        if (this.k != null) {
            n += this.k.b();
        }
        return n;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        this.a(stringBuilder, "");
        return stringBuilder.toString();
    }

    public final void a(StringBuilder stringBuilder, String string) {
        stringBuilder.append(string).append("uniqueId=").append(this.a).append('\n');
        stringBuilder.append(string).append("refId=").append(this.b).append('\n');
        stringBuilder.append(string).append("quantity=").append(this.c).append('\n');
        stringBuilder.append(string).append("pet=");
        if (this.d == null) {
            stringBuilder.append("{}").append('\n');
        } else {
            stringBuilder.append("...\n");
            this.d.a(stringBuilder, string + "  ");
        }
        stringBuilder.append(string).append("xp=");
        if (this.e == null) {
            stringBuilder.append("{}").append('\n');
        } else {
            stringBuilder.append("...\n");
            this.e.a(stringBuilder, string + "  ");
        }
        stringBuilder.append(string).append("shard=");
        if (this.f == null) {
            stringBuilder.append("{}").append('\n');
        } else {
            stringBuilder.append("...\n");
            this.f.a(stringBuilder, string + "  ");
        }
        stringBuilder.append(string).append("companionInfo=");
        if (this.g == null) {
            stringBuilder.append("{}").append('\n');
        } else {
            stringBuilder.append("...\n");
            this.g.a(stringBuilder, string + "  ");
        }
        stringBuilder.append(string).append("bind=");
        if (this.h == null) {
            stringBuilder.append("{}").append('\n');
        } else {
            stringBuilder.append("...\n");
            this.h.a(stringBuilder, string + "  ");
        }
        stringBuilder.append(string).append("elements=");
        if (this.i == null) {
            stringBuilder.append("{}").append('\n');
        } else {
            stringBuilder.append("...\n");
            this.i.a(stringBuilder, string + "  ");
        }
        stringBuilder.append(string).append("mergedItems=");
        if (this.j == null) {
            stringBuilder.append("{}").append('\n');
        } else {
            stringBuilder.append("...\n");
            this.j.a(stringBuilder, string + "  ");
        }
        stringBuilder.append(string).append("mimiSymbic=");
        if (this.k == null) {
            stringBuilder.append("{}").append('\n');
        } else {
            stringBuilder.append("...\n");
            this.k.a(stringBuilder, string + "  ");
        }
    }
}

