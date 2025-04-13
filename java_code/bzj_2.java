/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bzj
 */
public class bzj_2
implements ajh_1 {
    public static final String a = "buildSheetList";
    public static final String b = "isDirectionToOther";
    public static final String d = "canCopyBuild";
    private static final String[] e = new String[]{"buildSheetList", "isDirectionToOther", "canCopyBuild"};
    @NotNull
    final bzl_2 f;
    final ble_0 g;
    private final List<bzk_1> h;
    @Nullable
    private List<bzk_1> i = null;
    private boolean j = false;
    @Nullable
    private Integer k;
    @Nullable
    private String l;
    @Nullable
    private ble_0 m;
    private final bzm_2 n = new bzm_2();

    public bzj_2(bld_0 bld_02, boolean bl) {
        this.g = bld_02.i();
        this.f = bl ? bzl_2.b : bzl_2.a;
        this.h = bld_02.j().stream().map(ble_02 -> new bzk_1(this, (ble_0)ble_02)).collect(Collectors.toList());
    }

    @Override
    @Nullable
    public Object b(String string) {
        switch (string) {
            case "buildSheetList": {
                return this.i != null ? this.i : this.h;
            }
            case "isDirectionToOther": {
                return this.f == bzl_2.b;
            }
            case "canCopyBuild": {
                return this.b();
            }
        }
        return null;
    }

    public void a() {
        fpm_0.b().a("heroBuildCopyBuildDialog", cfi_0.a("heroBuildCopyBuildDialog"), 33025L, (short)10000);
        fis_1.a().a((ajf_1)this, a);
    }

    public void a(@Nullable String string) {
        this.l = string == null || string.isEmpty() ? null : Cz.e(string);
        this.h();
    }

    public void a(@Nullable Integer n) {
        this.k = n;
        this.h();
    }

    private void h() {
        if (this.k == null && this.l == null) {
            this.i = null;
        } else {
            Stream<Object> stream = this.h.stream();
            if (this.k != null) {
                stream = stream.filter(bzk_12 -> bzk_12.d.b().c() == this.k.intValue());
            }
            if (this.l != null) {
                stream = stream.filter(bzk_12 -> Cz.e(bzk_12.d.e()).contains(this.l));
            }
            this.i = stream.collect(Collectors.toList());
        }
        fis_1.a().a((ajf_1)this, a);
    }

    public void a(boolean bl) {
        this.j = bl;
    }

    public void a(@Nullable ble_0 ble_02) {
        this.m = ble_02;
        fis_1.a().a((ajf_1)this, d);
    }

    public void b(boolean bl) {
        this.n.a = bl;
        fis_1.a().a((ajf_1)this, d);
    }

    public void c(boolean bl) {
        this.n.b = bl;
        fis_1.a().a((ajf_1)this, d);
    }

    public void d(boolean bl) {
        this.n.c = bl;
        fis_1.a().a((ajf_1)this, d);
    }

    public boolean b() {
        return this.m != null && this.n.d();
    }

    @Override
    public String[] d() {
        return e;
    }

    @NotNull
    public bzl_2 c() {
        return this.f;
    }

    public boolean e() {
        return this.j;
    }

    @Nullable
    public ble_0 f() {
        return this.m;
    }

    public bzm_2 g() {
        return this.n;
    }
}

