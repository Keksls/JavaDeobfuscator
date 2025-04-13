/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import java.util.Iterator;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from fil
 */
public abstract class fil_0
implements efi_0 {
    public static final short a = 0;
    public static final short b = 0;
    public static final short c = 0;
    protected int d;
    protected short e;
    protected abc_2<efh_0> f = new abc_2();

    public static short a(int n) {
        return (short)(n & 0xFF);
    }

    @Override
    public short c() {
        return this.e;
    }

    protected fil_0() {
    }

    public fil_0(int n) {
        this.d = n;
    }

    public abstract fil_0 b(short var1);

    public int a() {
        return 0;
    }

    public int g() {
        return 0;
    }

    public int h() {
        return this.d;
    }

    public void a(efh_0 efh_02) {
        this.f.a(efh_02);
    }

    @Override
    @NotNull
    public Iterator<efh_0> iterator() {
        return this.f.iterator();
    }

    public int i() {
        return this.f.a();
    }

    public efh_0 b(int n) {
        return this.f.a(n);
    }

    @Override
    public int G_() {
        return 4;
    }

    @Override
    public long aS_() {
        return this.d;
    }

    @Override
    public short be_() {
        return 0;
    }

    @Override
    public short z_() {
        return 0;
    }

    @Override
    public short A_() {
        return 0;
    }
}

