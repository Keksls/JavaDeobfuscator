/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
import java.util.function.Consumer;
import javax.annotation.Nullable;

/*
 * Renamed from fJk
 */
public class fjk_2<T>
extends fjh_2<Float> {
    private Consumer<T> a;
    private final T o;

    public fjk_2(float f2, fvE fvE2, int n, fso fso2, @Nullable T t) {
        super(Float.valueOf(f2), Float.valueOf(0.0f), fvE2, 0, n, fjw_2.a);
        this.o = t;
        fqj fqj2 = fvE2.getAppearance();
        azj_2 azj_22 = fqj2.getModulationColor();
        azf_2 azf_22 = azj_22 == null ? new azf_2(azf_2.e) : (azj_22 instanceof azf_2 ? (azf_2)azj_22 : new azf_2(azj_22));
        azf_22.b(f2);
        fqj2.setModulationColor(azf_22);
    }

    @Override
    public boolean a(int n) {
        if (!super.a(n)) {
            return false;
        }
        if (this.c == null) {
            return true;
        }
        float f2 = this.c.a(((Float)this.j).floatValue(), ((Float)this.k).floatValue(), this.d, this.e);
        fqj fqj2 = this.c().getAppearance();
        azj_2 azj_22 = fqj2.getModulationColor();
        if (azj_22 instanceof azf_2) {
            ((azf_2)azj_22).b(f2);
        } else {
            fqj2.setModulationColor(new azf_2(azj_22.c(), azj_22.n(), azj_22.o(), f2));
        }
        return true;
    }

    public void b() {
        this.d = 0;
        this.a(0);
        this.a(true);
        this.c().removeTween(this);
    }

    @Override
    public void a() {
        super.a();
        if (this.a != null && this.o != null && !this.d()) {
            this.a.accept(this.o);
        }
    }

    @Override
    public void a(Consumer<T> consumer) {
        this.a = consumer;
    }
}

