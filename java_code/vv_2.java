/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from vv
 */
public class vv_2
implements gs_0 {
    public long a = 0L;
    public int b = 0;
    public short c = 0;
    public short d = 0;
    public short e = 0;
    public long f = 0L;
    public long g = 0L;
    public long h = 0L;
    public byte[] i = null;
    public int j = 0;

    @Override
    public boolean a(ByteBuffer byteBuffer) {
        byteBuffer.putLong(this.a);
        byteBuffer.putInt(this.b);
        byteBuffer.putShort(this.c);
        byteBuffer.putShort(this.d);
        byteBuffer.putShort(this.e);
        byteBuffer.putLong(this.f);
        byteBuffer.putLong(this.g);
        byteBuffer.putLong(this.h);
        if (this.i != null) {
            if (this.i.length > 65535) {
                return false;
            }
            byteBuffer.putShort((short)this.i.length);
            byteBuffer.put(this.i);
        } else {
            byteBuffer.putShort((short)0);
        }
        byteBuffer.putInt(this.j);
        return true;
    }

    @Override
    public boolean b(ByteBuffer byteBuffer) {
        this.a = byteBuffer.getLong();
        this.b = byteBuffer.getInt();
        this.c = byteBuffer.getShort();
        this.d = byteBuffer.getShort();
        this.e = byteBuffer.getShort();
        this.f = byteBuffer.getLong();
        this.g = byteBuffer.getLong();
        this.h = byteBuffer.getLong();
        int n = byteBuffer.getShort() & 0xFFFF;
        if (n > 0) {
            this.i = new byte[n];
            byteBuffer.get(this.i);
        } else {
            this.i = null;
        }
        this.j = byteBuffer.getInt();
        return true;
    }

    @Override
    public void c() {
        this.a = 0L;
        this.b = 0;
        this.c = 0;
        this.d = 0;
        this.e = 0;
        this.f = 0L;
        this.g = 0L;
        this.h = 0L;
        this.i = null;
        this.j = 0;
    }

    @Override
    public boolean a(ByteBuffer byteBuffer, int n) {
        return this.b(byteBuffer);
    }

    @Override
    public int b() {
        int n = 0;
        n += 8;
        n += 4;
        n += 2;
        n += 2;
        n += 2;
        n += 8;
        n += 8;
        n += 8;
        n += 2;
        n += this.i != null ? this.i.length : 0;
        return n += 4;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        this.a(stringBuilder, "");
        return stringBuilder.toString();
    }

    public final void a(StringBuilder stringBuilder, String string) {
        stringBuilder.append(string).append("uid=").append(this.a).append('\n');
        stringBuilder.append(string).append("modelId=").append(this.b).append('\n');
        stringBuilder.append(string).append("x=").append(this.c).append('\n');
        stringBuilder.append(string).append("y=").append(this.d).append('\n');
        stringBuilder.append(string).append("z=").append(this.e).append('\n');
        stringBuilder.append(string).append("creationDate=").append(this.f).append('\n');
        stringBuilder.append(string).append("ownerId=").append(this.g).append('\n');
        stringBuilder.append(string).append("buildingUid=").append(this.h).append('\n');
        stringBuilder.append(string).append("data=(").append(this.i != null ? this.i.length : 0).append(" bytes)\n");
        stringBuilder.append(string).append("version=").append(this.j).append('\n');
    }
}

