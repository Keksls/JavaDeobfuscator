/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from fIV
 */
public class fiv_1 {
    final fix_1<fyo> a;
    Object b;
    @NotNull
    final fiw_1 c;

    protected fiv_1(fix_1<fyo> fix_12, Object object, @NotNull fiw_1 fiw_12) {
        this.a = fix_12;
        this.a.a(this);
        this.b = this.a.f() == null ? object : this.a.f().getResult(object);
        this.c = fiw_12;
    }
}

