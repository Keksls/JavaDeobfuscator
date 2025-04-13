/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bQn
 */
public class bqn_1
extends bqm_1<esa_1> {
    public static final String h = "quantity";
    @Nullable
    private final exk_2 i;

    public bqn_1(esa_1 esa_12) {
        super(esa_12);
        this.i = eyl_1.a(esa_12.c());
    }

    @Override
    public Object b(String string) {
        Object object = super.b(string);
        if (object != null) {
            return object;
        }
        if (string.equals(h)) {
            return ((esa_1)this.g).d();
        }
        return this.i != null ? this.i.b(string) : null;
    }

    public exk_2 b() {
        return this.i;
    }

    @Override
    protected int a() {
        return 0;
    }
}

