/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from VL
 */
public abstract class vl_0
implements Wd {
    private Wf<vl_0> a;

    protected vl_0() {
    }

    public abstract long a();

    public boolean b() {
        return true;
    }

    @Override
    public void a(We we) {
        if (!this.b()) {
            return;
        }
        this.b(we);
    }

    protected abstract void b(We var1);

    protected abstract int c();

    protected abstract void a(ByteBuffer var1);

    protected abstract void a(vz_0 var1, ByteBuffer var2);

    public int d() {
        return vm_0.a(this.getClass()).a(this);
    }

    public void b(ByteBuffer byteBuffer) {
        vm_0.a(this.getClass()).a(this, byteBuffer);
    }

    public static vl_0 b(vz_0 vz_02, ByteBuffer byteBuffer) {
        vl_0 vl_02 = vm_0.a(byteBuffer);
        vl_02.a(vz_02, byteBuffer);
        return vl_02;
    }

    public void e() {
    }

    public void a(Wf<vl_0> wf) {
        this.a = wf;
    }

    public void f() {
        if (this.a != null) {
            this.a.a(this);
        }
    }
}

