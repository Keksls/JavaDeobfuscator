/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aWF
 */
public class awf_0
extends aXj {
    public static final int a = 0;
    public static final int b = 1;
    public static final int c = 2;
    public static final int d = 3;
    private final int e;
    private final String[] f;

    public awf_0(int n, String ... stringArray) {
        this.e = n;
        this.f = (String[])stringArray.clone();
    }

    @Override
    public boolean a() {
        switch (this.e) {
            case 0: 
            case 3: {
                return this.f.length == 0;
            }
            case 1: 
            case 2: {
                return this.f.length == 1;
            }
        }
        return false;
    }

    @Override
    public void b() {
        aaw_2 aaw_22 = azu_0.j().K();
        if (aaw_22 == null) {
            aVo.a().d("You have to be connected to access these commands");
            return;
        }
        try {
            switch (this.e) {
                case 0: {
                    this.f();
                    break;
                }
                case 1: {
                    this.e();
                    break;
                }
                case 2: {
                    this.d();
                    break;
                }
                case 3: {
                    this.c();
                }
            }
        }
        catch (Exception exception) {
            aVo.a().d("An issue occurred during a command " + exception);
        }
    }

    private void c() {
        afc_0.a(1.0f);
        abc_0.a(1.0f);
        awf_0.a("Speed reset.");
    }

    private void d() {
        float f2 = Float.parseFloat(this.f[0]);
        abc_0.a(f2);
        awf_0.a("Animation Speed modified.");
    }

    private void e() {
        float f2 = Float.parseFloat(this.f[0]);
        afc_0.a(f2);
        awf_0.a("Movement Speed modified.");
    }

    private void f() {
        awf_0.a("globalSpeed (help | h) : displays commands descriptions");
        awf_0.a("globalSpeed (setMove | m) speedRatio : set global movement speed ratio (1 = unchanged)  ");
        awf_0.a("globalSpeed (setAnim | a ) speedRatio : set global animation speed ratio (1 = unchanged) ");
        awf_0.a("globalSpeed (resetAll | ra) : reset global movement and animation speed ratio");
    }
}

