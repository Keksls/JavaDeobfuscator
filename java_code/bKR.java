/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.lang3.ArrayUtils
 *  org.jetbrains.annotations.NotNull
 */
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import org.apache.commons.lang3.ArrayUtils;
import org.jetbrains.annotations.NotNull;

public class bKR
extends bKH {
    private static final List<faL> b = Collections.nCopies(4, faL.g);
    public static final String a = "fixedOrder";
    @NotNull
    private final List<faL> d;
    private final boolean e;

    public bKR(@NotNull List<faL> list, boolean bl, Runnable runnable) {
        super(runnable);
        this.d = list;
        this.e = bl;
    }

    public static bKR g() {
        return new bKR(b, false, () -> {});
    }

    @Override
    public bKG aV_() {
        return bKG.i;
    }

    @Override
    public void a(faC faC2) {
        faC2.c(this.d).e(this.e);
    }

    @Override
    protected void b(faC faC2) {
        faC2.w().clear();
    }

    @Override
    public boolean a() {
        if (this.d.isEmpty()) {
            return false;
        }
        return !this.d.equals(b);
    }

    @Override
    public String b() {
        String string = this.d.stream().map(bLh::a).collect(Collectors.joining(", "));
        if (this.e) {
            return string + " - " + bae.h().a("market.slots.fixed.order", new Object[0]);
        }
        return string;
    }

    @Override
    public Object b(String string) {
        if (a.equals(string)) {
            return this.e;
        }
        return super.b(string);
    }

    @Override
    public String[] d() {
        return (String[])ArrayUtils.addAll((Object[])super.d(), (Object[])new String[]{a});
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || this.getClass() != object.getClass()) {
            return false;
        }
        bKR bKR2 = (bKR)object;
        return this.e == bKR2.e && Objects.equals(this.d, bKR2.d);
    }
}

