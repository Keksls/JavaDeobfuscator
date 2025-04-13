/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from ccd
 */
final class ccd_2
extends adj_0 {
    ccd_2() {
        super(aNM.a() + "proximityThunder.cgfx", "test");
    }

    @Override
    public void a(int n) {
        super.a(n);
    }

    @NotNull
    private static ava_1 b() {
        ava_1 ava_12 = new ava_1(new aut_1("gStrength", auu_1.a), new aut_1("camera", auu_1.c));
        abY abY2 = ans_0.D().c().b();
        ava_12.a("gStrength", 0.0f);
        ava_12.a("camera", abY2.g_() / 1024.0f, abY2.h_() / 1024.0f, abY2.f());
        return ava_12;
    }
}

