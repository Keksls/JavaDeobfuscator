/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Map;

/*
 * Renamed from cvP
 */
public class cvp_1
extends ps_0 {
    private fhy a;
    private final Map<Integer, Integer> b = new HashMap<Integer, Integer>();

    @Override
    public boolean a(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.a = fhy.a(byteBuffer.get());
        if (this.a.b()) {
            return true;
        }
        int n = byteBuffer.getInt();
        for (int k = 0; k < n; ++k) {
            this.b.put(byteBuffer.getInt(), byteBuffer.getInt());
        }
        return true;
    }

    @Override
    public int a() {
        return 13766;
    }

    public fhy b() {
        return this.a;
    }

    public Map<Integer, Integer> c() {
        return this.b;
    }
}

