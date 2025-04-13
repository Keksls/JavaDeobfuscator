/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Charsets
 */
import com.google.common.base.Charsets;
import java.nio.ByteBuffer;

/*
 * Renamed from vl
 */
public class vl_2
implements gs_0 {
    public String a = null;
    public long b = 0L;
    public short c = 0;
    public final vf_2 d = new vf_2();

    @Override
    public boolean a(ByteBuffer byteBuffer) {
        if (this.a != null) {
            byte[] byArray = this.a.getBytes(Charsets.UTF_8);
            if (byArray.length > 65535) {
                return false;
            }
            byteBuffer.putShort((short)byArray.length);
            byteBuffer.put(byArray);
        } else {
            byteBuffer.putShort((short)0);
        }
        byteBuffer.putLong(this.b);
        byteBuffer.putShort(this.c);
        boolean bl = this.d.a(byteBuffer);
        return bl;
    }

    @Override
    public boolean b(ByteBuffer byteBuffer) {
        int n = byteBuffer.getShort() & 0xFFFF;
        byte[] byArray = new byte[n];
        byteBuffer.get(byArray);
        this.a = new String(byArray, Charsets.UTF_8);
        this.b = byteBuffer.getLong();
        this.c = byteBuffer.getShort();
        boolean bl = this.d.b(byteBuffer);
        return bl;
    }

    @Override
    public void c() {
        this.a = null;
        this.b = 0L;
        this.c = 0;
        this.d.c();
    }

    @Override
    public boolean a(ByteBuffer byteBuffer, int n) {
        if (n < 10069001) {
            vm_2 vm_22 = new vm_2(this);
            boolean bl = vm_22.a(byteBuffer, n);
            if (bl) {
                vm_22.a();
                return true;
            }
            return false;
        }
        return this.b(byteBuffer);
    }

    @Override
    public int b() {
        int n = 0;
        n += 2;
        n += this.a != null ? this.a.getBytes(Charsets.UTF_8).length : 0;
        n += 8;
        n += 2;
        return n += this.d.b();
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        this.a(stringBuilder, "");
        return stringBuilder.toString();
    }

    public final void a(StringBuilder stringBuilder, String string) {
        stringBuilder.append(string).append("memberName=").append(this.a).append('\n');
        stringBuilder.append(string).append("date=").append(this.b).append('\n');
        stringBuilder.append(string).append("qty=").append(this.c).append('\n');
        stringBuilder.append(string).append("item=...\n");
        this.d.a(stringBuilder, string + "  ");
    }
}

