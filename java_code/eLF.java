/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;
import java.util.Set;

class eLF
extends fo_1 {
    final /* synthetic */ eLD d;

    eLF(eLD eLD2) {
        this.d = eLD2;
    }

    @Override
    public void a(ByteBuffer byteBuffer) {
        Set<eLo> set = this.d.a.b();
        byteBuffer.putInt(set.size());
        eLu eLu2 = eLu.b();
        for (eLo eLo2 : set) {
            eLu2.a(eLo2);
            eLu2.a(byteBuffer);
        }
        eLu2.c();
    }

    @Override
    public void a(ByteBuffer byteBuffer, int n) {
        this.d.a.d();
        int n2 = byteBuffer.getInt();
        eLu eLu2 = eLu.b();
        for (int k = 0; k < n2; ++k) {
            eLu2.b(byteBuffer);
            this.d.a.a(eLu2.f());
            eLu2.a((eLo)null);
        }
        eLu2.c();
    }

    @Override
    public int j() {
        if (this.d.a == null) {
            return 0;
        }
        Set<eLo> set = this.d.a.b();
        int n = 0;
        eLu eLu2 = eLu.b();
        for (eLo eLo2 : set) {
            eLu2.a(eLo2);
            n += eLu2.g();
        }
        eLu2.c();
        return 4 + n;
    }
}

