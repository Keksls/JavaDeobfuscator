/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/*
 * Renamed from cBP
 */
public class cbp_0
extends ps_0 {
    private final List<flu_0> a = new ArrayList<flu_0>();

    @Override
    public boolean a(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        int n = byteBuffer.get();
        for (int k = 0; k < n; ++k) {
            this.a.add(new flu_0());
            this.a.get(k).a(byteBuffer);
        }
        return false;
    }

    @Override
    public int a() {
        return 23427;
    }

    public List<flu_0> b() {
        return this.a;
    }
}

