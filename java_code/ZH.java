/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TIntIntHashMap
 *  gnu.trove.map.hash.TIntObjectHashMap
 *  org.jetbrains.annotations.NotNull
 */
import gnu.trove.map.hash.TIntIntHashMap;
import gnu.trove.map.hash.TIntObjectHashMap;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import org.jetbrains.annotations.NotNull;

public class ZH {
    private static final ZH a = new ZH();
    private ByteBuffer b;
    private final TIntIntHashMap c = new TIntIntHashMap();
    private ZV d;
    private final TIntObjectHashMap<ZL> e = new TIntObjectHashMap();

    public static ZH a() {
        return a;
    }

    private ZH() {
    }

    public void a(String string, @NotNull ZV zV) {
        this.d = zV;
        this.a(string);
    }

    private void a(String string) {
        this.b = this.b(string);
        this.e();
    }

    private void e() {
        this.b.position(0);
        this.c.clear();
        this.e.clear();
        int n = this.b.getInt();
        for (int k = 0; k < n; ++k) {
            int n2 = this.b.getInt();
            int n3 = this.b.getInt();
            this.c.put(n2, n3);
        }
    }

    public final ZL a(int n) {
        try {
            this.a(new int[]{n});
        }
        catch (Exception exception) {
            // empty catch block
        }
        return (ZL)this.e.get(n);
    }

    public final void a(int ... nArray) {
        this.e.clear();
        for (int n : nArray) {
            this.e.put(n, (Object)this.a(this.b, n));
        }
    }

    public final void b() {
        this.a(this.c.keys());
    }

    private ZL a(ByteBuffer byteBuffer, int n) {
        int n2 = this.c.get(n);
        if (n2 > 0) {
            byteBuffer.position(n2);
            ZL zL = new ZL(n);
            zL.a(byteBuffer, this.d);
            return zL;
        }
        return null;
    }

    public void a(ZV zV, ByteBuffer byteBuffer) {
        this.d = zV;
        this.b = byteBuffer;
        this.e();
        this.a(this.c.keys());
    }

    private ByteBuffer b(String string) {
        byte[] byArray = gg_0.b(string);
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        return byteBuffer;
    }

    public final int c() {
        return this.c.size();
    }

    public final int d() {
        return this.e.size();
    }

    public final void a(int n, ByteBuffer byteBuffer, ZV zV) {
        ZL zL = (ZL)this.e.get(n);
        if (zL != null) {
            zL.a(byteBuffer, zV);
        }
    }
}

