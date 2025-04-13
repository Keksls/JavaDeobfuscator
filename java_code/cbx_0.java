/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Map;

/*
 * Renamed from cBx
 */
public final class cbx_0
extends ps_0 {
    private int a;
    private int b;
    private int c;
    private int d;
    private int e;
    private int f;
    private final Map<Integer, Integer[]> g = new HashMap<Integer, Integer[]>();

    @Override
    public boolean a(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.a = byteBuffer.getInt();
        this.b = byteBuffer.getInt();
        this.c = byteBuffer.getInt();
        this.d = byteBuffer.getInt();
        this.e = byteBuffer.getInt();
        this.f = byteBuffer.getInt();
        int n = byteBuffer.getInt();
        for (int k = 0; k < n; ++k) {
            this.g.put(byteBuffer.getInt(), new Integer[]{byteBuffer.getInt(), byteBuffer.getInt()});
        }
        return true;
    }

    public int b() {
        return this.a;
    }

    public int c() {
        return this.b;
    }

    public int d() {
        return this.c;
    }

    public Map<Integer, Integer[]> e() {
        return this.g;
    }

    public int f() {
        return this.d;
    }

    public int g() {
        return this.e;
    }

    public int h() {
        return this.f;
    }

    @Override
    public int a() {
        return 23573;
    }
}

