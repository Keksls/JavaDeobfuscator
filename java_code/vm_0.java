/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from VM
 */
abstract class vm_0
extends Enum<vm_0> {
    public static final /* enum */ vm_0 a = new vn_0(0, VY.class);
    public static final /* enum */ vm_0 b = new vo_0(1, VZ.class);
    public static final /* enum */ vm_0 c = new vp_0(2, vq_0.class);
    final byte d;
    final Class<? extends vl_0> e;
    private static final /* synthetic */ vm_0[] f;

    public static vm_0[] values() {
        return (vm_0[])f.clone();
    }

    public static vm_0 valueOf(String string) {
        return Enum.valueOf(vm_0.class, string);
    }

    vm_0(byte by, Class<? extends vl_0> clazz) {
        this.d = by;
        this.e = clazz;
    }

    static vm_0 a(Class<? extends vl_0> clazz) {
        for (vm_0 vm_02 : vm_0.values()) {
            if (vm_02.e != clazz) continue;
            return vm_02;
        }
        throw new IllegalArgumentException("Pas s\u00e9rialisable: " + clazz.getSimpleName());
    }

    static vm_0 a(byte by) {
        for (vm_0 vm_02 : vm_0.values()) {
            if (vm_02.d != by) continue;
            return vm_02;
        }
        throw new IllegalArgumentException("Pas s\u00e9rialisable: id " + by);
    }

    public void a(vl_0 vl_02, ByteBuffer byteBuffer) {
        if (vl_02.getClass() != this.e) {
            throw new IllegalArgumentException();
        }
        byteBuffer.put(this.d);
        vl_02.a(byteBuffer);
    }

    public int a(vl_0 vl_02) {
        return 1 + vl_02.c();
    }

    abstract vl_0 a();

    public static vl_0 a(ByteBuffer byteBuffer) {
        return vm_0.a(byteBuffer.get()).a();
    }

    static {
        f = new vm_0[]{a, b, c};
    }
}

