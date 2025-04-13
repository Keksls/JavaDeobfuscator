/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import org.jetbrains.annotations.Nullable;

public enum aPw implements ajh_1
{
    a(0, null),
    b(1, new aPp(new fyr_0(elw_1.bR), new fyr_0(elw_1.bS), new fyr_0(elw_1.bT), new fyr_0(elw_1.bQ), new fyr_0(elw_1.bL), new fyr_0(elw_1.bM))),
    d(2, new aPp(new fyr_0(elw_1.bN), new fyr_0(elw_1.bO), new fyr_0(elw_1.bP), new fyr_0(elw_1.bK), new fyr_0(elw_1.bL), new fyr_0(elw_1.bM)));

    public static final String e = "name";
    public static final String f = "description";
    public static final String[] g;
    private final byte h;
    private final aPp i;

    private aPw(byte by, aPp aPp2) {
        this.h = by;
        this.i = aPp2;
    }

    public byte a() {
        return this.h;
    }

    public aPp b() {
        return this.i;
    }

    public static aPw a(byte by) {
        for (aPw aPw2 : aPw.values()) {
            if (aPw2.h != by) continue;
            return aPw2;
        }
        return null;
    }

    public aPw c() {
        aPw[] aPwArray = aPw.values();
        return aPwArray[(this.ordinal() + 1) % aPwArray.length];
    }

    @Override
    public String[] d() {
        return g;
    }

    @Override
    @Nullable
    public Object b(String string) {
        if (e.equals(string)) {
            return bae.h().a("tacticalView.mode." + this.h, new Object[0]);
        }
        if (f.equals(string)) {
            any_1 any_12 = aZG.e().a("switchTacticalView");
            return bae.h().a(azq_0.UQ + this.h, any_12 != null ? new aZF(any_12).a() : "Unknown shortcut");
        }
        return null;
    }

    static {
        g = new String[]{e, f};
    }
}

