/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from uc
 */
public class uc_2
implements gs_0 {
    public int a = 0;
    public boolean b = true;
    public int c = 0;
    public int d = 0;
    public short e = 0;
    public int[] f = null;

    @Override
    public boolean a(ByteBuffer byteBuffer) {
        byteBuffer.putInt(this.a);
        byteBuffer.put(this.b ? (byte)1 : 0);
        byteBuffer.putInt(this.c);
        byteBuffer.putInt(this.d);
        byteBuffer.putShort(this.e);
        if (this.f != null) {
            if (this.f.length > 65535) {
                return false;
            }
            byteBuffer.putShort((short)this.f.length);
            for (int k = 0; k < this.f.length; ++k) {
                byteBuffer.putInt(this.f[k]);
            }
        } else {
            byteBuffer.putShort((short)0);
        }
        return true;
    }

    @Override
    public boolean b(ByteBuffer byteBuffer) {
        this.a = byteBuffer.getInt();
        this.b = byteBuffer.get() == 1;
        this.c = byteBuffer.getInt();
        this.d = byteBuffer.getInt();
        this.e = byteBuffer.getShort();
        int n = byteBuffer.getShort() & 0xFFFF;
        if (n > 0) {
            this.f = new int[n];
            for (int k = 0; k < n; ++k) {
                this.f[k] = byteBuffer.getInt();
            }
        } else {
            this.f = null;
        }
        return true;
    }

    @Override
    public void c() {
        this.a = 0;
        this.b = true;
        this.c = 0;
        this.d = 0;
        this.e = 0;
        this.f = null;
    }

    @Override
    public boolean a(ByteBuffer byteBuffer, int n) {
        if (n < 10084000) {
            ud_1 ud_12 = new ud_1(this);
            boolean bl = ud_12.a(byteBuffer, n);
            if (bl) {
                ud_12.a();
                return true;
            }
            return false;
        }
        return this.b(byteBuffer);
    }

    @Override
    public int b() {
        int n = 0;
        n += 4;
        ++n;
        n += 4;
        n += 4;
        n += 2;
        n += 2;
        return n += this.f != null ? this.f.length * 4 : 0;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        this.a(stringBuilder, "");
        return stringBuilder.toString();
    }

    public final void a(StringBuilder stringBuilder, String string) {
        stringBuilder.append(string).append("activeCosmeticRefId=").append(this.a).append('\n');
        stringBuilder.append(string).append("hatVisible=").append(this.b).append('\n');
        stringBuilder.append(string).append("activeSprintRefId=").append(this.c).append('\n');
        stringBuilder.append(string).append("activeAuraRefId=").append(this.d).append('\n');
        stringBuilder.append(string).append("activeTitleRefId=").append(this.e).append('\n');
        stringBuilder.append(string).append("activeFinisherRefIds=(").append(this.f.length).append(" bytes)\n");
    }
}

