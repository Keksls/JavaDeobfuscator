/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from tv
 */
public class tv_1
implements gs_0 {
    public tx_2 a = null;

    @Override
    public boolean a(ByteBuffer byteBuffer) {
        if (this.a != null) {
            byteBuffer.put((byte)1);
            boolean bl = this.a.a(byteBuffer);
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
        boolean bl2 = bl = byteBuffer.get() == 1;
        if (bl) {
            this.a = new tx_2();
            boolean bl3 = this.a.b(byteBuffer);
            if (!bl3) {
                return false;
            }
        } else {
            this.a = null;
        }
        return true;
    }

    @Override
    public void c() {
        this.a = null;
    }

    @Override
    public boolean a(ByteBuffer byteBuffer, int n) {
        if (n < 1) {
            tw_1 tw_12 = new tw_1(this);
            boolean bl = tw_12.a(byteBuffer, n);
            if (bl) {
                tw_12.a();
                return true;
            }
            return false;
        }
        return this.b(byteBuffer);
    }

    @Override
    public int b() {
        int n = 0;
        ++n;
        if (this.a != null) {
            n += this.a.b();
        }
        return n;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        this.a(stringBuilder, "");
        return stringBuilder.toString();
    }

    public final void a(StringBuilder stringBuilder, String string) {
        stringBuilder.append(string).append("spawnedCharacter=");
        if (this.a == null) {
            stringBuilder.append("{}").append('\n');
        } else {
            stringBuilder.append("...\n");
            this.a.a(stringBuilder, string + "  ");
        }
    }
}

