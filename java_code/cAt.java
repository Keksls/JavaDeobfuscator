/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;
import java.util.HashSet;
import java.util.Set;

public class cAt
extends ps_0 {
    private final Set<eLo> a = new HashSet<eLo>();

    @Override
    public boolean a(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        int n = byteBuffer.get();
        eLu eLu2 = new eLu();
        for (int k = 0; k < n; ++k) {
            eLu2.b(byteBuffer);
            this.a.add(eLu2.f());
        }
        return true;
    }

    public Set<eLo> b() {
        return this.a;
    }

    @Override
    public int a() {
        return 1000;
    }
}

