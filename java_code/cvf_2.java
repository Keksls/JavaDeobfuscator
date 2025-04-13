/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;
import java.util.ArrayList;

/*
 * Renamed from cvf
 */
public class cvf_2
extends ps_0 {
    private boolean a = false;
    private final ArrayList<Long> b = new ArrayList();

    @Override
    public boolean a(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        if (byteBuffer.get() == 0) {
            this.a = true;
        }
        int n = byteBuffer.get();
        for (int k = 0; k < n; ++k) {
            this.b.add(byteBuffer.getLong());
        }
        return true;
    }

    @Override
    public int a() {
        return 13544;
    }

    public boolean b() {
        return this.a;
    }

    public ArrayList<Long> c() {
        return this.b;
    }
}

