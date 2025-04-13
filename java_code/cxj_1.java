/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;
import java.util.HashSet;
import java.util.Set;

/*
 * Renamed from cxj
 */
public class cxj_1
extends ps_0 {
    private Set<Integer> a = new HashSet<Integer>();
    private boolean b;

    @Override
    public boolean a(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        int n = byteBuffer.getInt();
        for (int k = 0; k < n; ++k) {
            this.a.add(byteBuffer.getInt());
        }
        this.b = byteBuffer.get() == 1;
        return true;
    }

    @Override
    public int a() {
        return 12637;
    }

    public Set<Integer> b() {
        return this.a;
    }

    public boolean c() {
        return this.b;
    }
}

