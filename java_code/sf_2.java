/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from sf
 */
public class sf_2
extends go_1
implements gs_0 {
    public int c = 0;
    public int[] d = null;
    public short e = 0;
    public long f = 0L;
    public byte g = 0;
    public boolean h = false;
    public byte i = 0;
    public int j = 0;
    private final fo_1 k = new sg_1(this);

    @Override
    public fo_1 a() {
        return this.k;
    }

    @Override
    public boolean a(ByteBuffer byteBuffer) {
        byteBuffer.putInt(this.c);
        if (this.d != null) {
            if (this.d.length > 65535) {
                return false;
            }
            byteBuffer.putShort((short)this.d.length);
            for (int k = 0; k < this.d.length; ++k) {
                byteBuffer.putInt(this.d[k]);
            }
        } else {
            byteBuffer.putShort((short)0);
        }
        byteBuffer.putShort(this.e);
        byteBuffer.putLong(this.f);
        byteBuffer.put(this.g);
        byteBuffer.put(this.h ? (byte)1 : 0);
        byteBuffer.put(this.i);
        byteBuffer.putInt(this.j);
        return true;
    }

    @Override
    public boolean b(ByteBuffer byteBuffer) {
        this.c = byteBuffer.getInt();
        int n = byteBuffer.getShort() & 0xFFFF;
        if (n > 0) {
            this.d = new int[n];
            for (int k = 0; k < n; ++k) {
                this.d[k] = byteBuffer.getInt();
            }
        } else {
            this.d = null;
        }
        this.e = byteBuffer.getShort();
        this.f = byteBuffer.getLong();
        this.g = byteBuffer.get();
        this.h = byteBuffer.get() == 1;
        this.i = byteBuffer.get();
        this.j = byteBuffer.getInt();
        return true;
    }

    @Override
    public void c() {
        this.c = 0;
        this.d = null;
        this.e = 0;
        this.f = 0L;
        this.g = 0;
        this.h = false;
        this.i = 0;
        this.j = 0;
    }

    @Override
    public boolean a(ByteBuffer byteBuffer, int n) {
        if (n < 10081000) {
            sh_2 sh_22 = new sh_2(this);
            boolean bl = sh_22.a(byteBuffer, n);
            if (bl) {
                sh_22.a();
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
        n += 2;
        n += this.d != null ? this.d.length * 4 : 0;
        n += 2;
        n += 8;
        ++n;
        ++n;
        ++n;
        return n += 4;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        this.a(stringBuilder, "");
        return stringBuilder.toString();
    }

    public final void a(StringBuilder stringBuilder, String string) {
        stringBuilder.append(string).append("subscriptionLevel=").append(this.c).append('\n');
        stringBuilder.append(string).append("additionalRights=(").append(this.d.length).append(" bytes)\n");
        stringBuilder.append(string).append("characterMaxLevel=").append(this.e).append('\n');
        stringBuilder.append(string).append("betaReward=").append(this.f).append('\n');
        stringBuilder.append(string).append("pvpState=").append(this.g).append('\n');
        stringBuilder.append(string).append("pactInventoryIsEmpty=").append(this.h).append('\n');
        stringBuilder.append(string).append("languages=").append(this.i).append('\n');
        stringBuilder.append(string).append("accountCommunityId=").append(this.j).append('\n');
    }
}

