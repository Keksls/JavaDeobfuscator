/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import org.jetbrains.annotations.Nullable;

public class bLg
implements ajh_1 {
    public static final String a = "name";
    public static final String b = "taxFactor";
    private final faO d;

    public bLg(faO faO2) {
        this.d = faO2;
    }

    @Override
    public String[] d() {
        return new String[]{a, b};
    }

    @Override
    @Nullable
    public Object b(String string) {
        if (string.equals(a)) {
            long l = this.d.b() / 3600000L;
            long l2 = l / 24L;
            long l3 = l % 24L;
            return bae.h().a("remainingDurationShortMonthDayHour", 0, l2, l3);
        }
        if (string.equals(b)) {
            return bae.h().a("desc.taxFactor", (int)(this.d.d() * 100.0));
        }
        return null;
    }

    public faO a() {
        return this.d;
    }
}

