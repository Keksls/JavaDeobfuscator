/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

public class crJ
extends ps_0 {
    private boolean a;
    private final List<crK> b = new ArrayList<crK>();

    @Override
    public boolean a(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.a = byteBuffer.get() == 1;
        int n = byteBuffer.get() & 0xFF;
        for (int k = 0; k < n; ++k) {
            byte by = byteBuffer.get();
            long l = byteBuffer.getLong();
            int n2 = byteBuffer.getShort() & 0xFFFF;
            byte[] byArray2 = new byte[n2];
            byteBuffer.get(byArray2);
            crK crK2 = new crK(by, l, byArray2);
            this.b.add(crK2);
        }
        return true;
    }

    @Override
    public int a() {
        return 13765;
    }

    public boolean b() {
        return this.a;
    }

    public List<crK> c() {
        return this.b;
    }
}

