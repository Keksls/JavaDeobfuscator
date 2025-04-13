/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from qm
 */
public class qm_1
implements gs_0 {
    public final wf_1 a = new wf_1();

    @Override
    public boolean a(ByteBuffer byteBuffer) {
        boolean bl = this.a.a(byteBuffer);
        return bl;
    }

    @Override
    public boolean b(ByteBuffer byteBuffer) {
        boolean bl = this.a.b(byteBuffer);
        return bl;
    }

    @Override
    public void c() {
        this.a.c();
    }

    @Override
    public boolean a(ByteBuffer byteBuffer, int n) {
        if (n < 10056001) {
            qn_2 qn_22 = new qn_2(this);
            boolean bl = qn_22.a(byteBuffer, n);
            if (bl) {
                qn_22.a();
                return true;
            }
            return false;
        }
        return this.b(byteBuffer);
    }

    @Override
    public int b() {
        int n = 0;
        return n += this.a.b();
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        this.a(stringBuilder, "");
        return stringBuilder.toString();
    }

    public final void a(StringBuilder stringBuilder, String string) {
        stringBuilder.append(string).append("summon=...\n");
        this.a.a(stringBuilder, string + "  ");
    }
}

