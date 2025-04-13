/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from fbU
 */
public abstract class fbu_0 {
    public static final fbu_0 b = new fbv_0();
    private final adi_1<fbx_0> a = new adi_1<fbx_0>(new fbw_0());

    public final boolean a(fbx_0 fbx_02) {
        return !this.a.c(fbx_02) && this.a.a(fbx_02);
    }

    public final void b(fbx_0 fbx_02) {
        this.a.b(fbx_02);
    }

    public void b() {
        this.a.a();
    }

    public abstract void a(ByteBuffer var1, int var2);

    public abstract void a(ByteBuffer var1);

    public abstract int bg_();
}

