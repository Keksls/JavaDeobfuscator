/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;
import java.util.HashSet;
import java.util.Set;

public class cAr
extends ps_0 {
    private final Set<eLo> a = new HashSet<eLo>();

    @Override
    public boolean a(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        int n = byteBuffer.get();
        eLu eLu2 = new eLu();
        for (int k = 0; k < n; ++k) {
            eLu2.c.a(byteBuffer, epj.k);
            eLu2.e.a(byteBuffer, epj.k);
            this.a.add(eLu2.f());
            eLu2.a((eLo)null);
        }
        return true;
    }

    public Set<eLo> b() {
        return this.a;
    }

    @Override
    public int a() {
        return 1160;
    }
}

