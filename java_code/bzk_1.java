/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bzk
 */
public final class bzk_1
implements ajh_1 {
    public static final String a = "isLevelTooHigh";
    @NotNull
    final ble_0 d;
    private final boolean e;
    final /* synthetic */ bzj_2 b;

    public bzk_1(@NotNull bzj_2 bzj_22, ble_0 ble_02) {
        this.b = bzj_22;
        this.d = ble_02;
        this.e = bzj_22.f == bzl_2.a ? this.a(ble_02, bzj_22.g) : this.a(bzj_22.g, ble_02);
    }

    private boolean a(ble_0 ble_02, ble_0 ble_03) {
        return ble_03.b().c() < ezp_1.a((epq_2)cZI.D(), ble_02.c());
    }

    @Override
    @Nullable
    public Object b(String string) {
        if (a.equals(string)) {
            return this.e;
        }
        return this.d.b(string);
    }

    @Override
    public String[] d() {
        return this.d.d();
    }

    @NotNull
    public ble_0 a() {
        return this.d;
    }

    public boolean b() {
        return this.e;
    }
}

