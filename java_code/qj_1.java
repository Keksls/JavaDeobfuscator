/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from qj
 */
public class qj_1
extends go_1
implements gs_0 {
    public int c = 0;
    public boolean d = false;
    public boolean e = false;
    public boolean f = false;
    public boolean g = false;
    public byte h = (byte)-1;
    public qm_1 i = null;
    private final fo_1 j = new qk_2(this);

    @Override
    public fo_1 a() {
        return this.j;
    }

    @Override
    public boolean a(ByteBuffer byteBuffer) {
        byteBuffer.putInt(this.c);
        byteBuffer.put(this.d ? (byte)1 : 0);
        byteBuffer.put(this.e ? (byte)1 : 0);
        byteBuffer.put(this.f ? (byte)1 : 0);
        byteBuffer.put(this.g ? (byte)1 : 0);
        byteBuffer.put(this.h);
        if (this.i != null) {
            byteBuffer.put((byte)1);
            boolean bl = this.i.a(byteBuffer);
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
        this.c = byteBuffer.getInt();
        this.d = byteBuffer.get() == 1;
        this.e = byteBuffer.get() == 1;
        this.f = byteBuffer.get() == 1;
        this.g = byteBuffer.get() == 1;
        this.h = byteBuffer.get();
        boolean bl2 = bl = byteBuffer.get() == 1;
        if (bl) {
            this.i = new qm_1();
            boolean bl3 = this.i.b(byteBuffer);
            if (!bl3) {
                return false;
            }
        } else {
            this.i = null;
        }
        return true;
    }

    @Override
    public void c() {
        this.c = 0;
        this.d = false;
        this.e = false;
        this.f = false;
        this.g = false;
        this.h = (byte)-1;
        this.i = null;
    }

    @Override
    public boolean a(ByteBuffer byteBuffer, int n) {
        if (n < 10056001) {
            ql_1 ql_12 = new ql_1(this);
            boolean bl = ql_12.a(byteBuffer, n);
            if (bl) {
                ql_12.a();
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
        ++n;
        ++n;
        ++n;
        ++n;
        ++n;
        if (this.i != null) {
            n += this.i.b();
        }
        return n;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        this.a(stringBuilder, "");
        return stringBuilder.toString();
    }

    public final void a(StringBuilder stringBuilder, String string) {
        stringBuilder.append(string).append("currentFightId=").append(this.c).append('\n');
        stringBuilder.append(string).append("isKo=").append(this.d).append('\n');
        stringBuilder.append(string).append("isDead=").append(this.e).append('\n');
        stringBuilder.append(string).append("isSummoned=").append(this.f).append('\n');
        stringBuilder.append(string).append("isFleeing=").append(this.g).append('\n');
        stringBuilder.append(string).append("obstacleId=").append(this.h).append('\n');
        stringBuilder.append(string).append("SUMMONDATA=");
        if (this.i == null) {
            stringBuilder.append("{}").append('\n');
        } else {
            stringBuilder.append("...\n");
            this.i.a(stringBuilder, string + "  ");
        }
    }
}

