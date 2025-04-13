/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

public final class csk
extends ps_0 {
    private final List<eBt> a = new ArrayList<eBt>();
    private boolean b;

    @Override
    public boolean a(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        int n = byteBuffer.get();
        for (int k = 0; k < n; ++k) {
            this.a.add(eBv.a(byteBuffer));
        }
        this.b = byteBuffer.get() == 1;
        return true;
    }

    public List<eBt> b() {
        return this.a;
    }

    public boolean c() {
        return this.b;
    }

    @Override
    public int a() {
        return 12632;
    }
}

