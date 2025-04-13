/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TIntObjectHashMap
 */
import gnu.trove.map.hash.TIntObjectHashMap;

/*
 * Renamed from bWA
 */
public final class bwa_2
extends bwy_2 {
    public static final bwa_2 X = new bwa_2();
    private int Y = -1;
    private final TIntObjectHashMap<aeo_2> Z = new TIntObjectHashMap();

    private bwa_2() {
    }

    @Override
    public void a(int n) {
        if (n == this.Y) {
            return;
        }
        this.l();
        if (n == -1) {
            fis_1.a().a("protector", (Object)null);
            return;
        }
        this.Y = n;
        this.a();
        fis_1.a().a("protector", X);
    }

    @Override
    public void l() {
        super.l();
        this.Y = -1;
        this.Z.clear();
        fgV.a.b(this);
    }

    @Override
    public void a(bmr_0 bmr_02) {
    }

    @Override
    public Object b(String string) {
        if (string.equals("animation")) {
            return this.a(this.Y, bnm_0.a);
        }
        if (string.equals("name")) {
            return bae.h().a(String.format("staticProtector.%d", this.Y), new Object[0]);
        }
        if (string.equals("description")) {
            anf_2 anf_22 = new anf_2();
            return anf_22.i().a(bmi_0.b.w()).j();
        }
        return super.b(string);
    }

    @Override
    public int b() {
        return this.Y;
    }

    @Override
    public boolean c() {
        return true;
    }

    public void a(int n, aeo_2 aeo_22) {
        this.Z.put(n, (Object)aeo_22);
    }

    public aeo_2 b(int n) {
        return (aeo_2)this.Z.get(n);
    }

    @Override
    public bmf_0 g() {
        return null;
    }
}

