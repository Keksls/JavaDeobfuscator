/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from adn
 */
public abstract class adn_0
implements auh_1 {
    protected static final float b = 43.0f;
    protected static final float c = 21.5f;
    protected static final float d = 10.0f;
    private static int a = 1;
    private final int f = adn_0.e();
    private boolean g;
    protected ahq_0 e;
    private adN h;

    static int e() {
        if (a == Integer.MAX_VALUE) {
            a = 0;
        }
        return a++;
    }

    public adn_0() {
        this.i();
    }

    @Override
    public final int f() {
        return this.f;
    }

    public float g() {
        return this.h.a();
    }

    @Override
    public void a(boolean bl) {
        this.g = bl;
    }

    @Override
    public boolean h() {
        return this.g;
    }

    public void a(ahq_0 ahq_02) {
        this.e = ahq_02;
    }

    @Override
    public abstract void a();

    @Override
    public void i() {
        this.h = new adN(1.0f);
    }

    @Override
    public void a(int n) {
        if (!this.h.a(n)) {
            this.a(false);
        }
    }

    @Override
    public abstract void a(aui_2 var1);

    public void a(@NotNull adN adN2) {
        this.h = adN2;
        this.a(true);
    }

    @Override
    public void b(int n) {
        this.h = new adL(n, this.g());
    }

    @Override
    public int j() {
        return 0;
    }
}

