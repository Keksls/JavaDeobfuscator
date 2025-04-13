/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import java.util.List;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from eXH
 */
public enum exh_2 implements aqk_2
{
    a(0, "desc.equipment.head", "equipHeadBackground", 134),
    b(1, "", ""),
    c(2, "", ""),
    d(3, "desc.equipment.shoulder", "equipShouldersBackground", 138),
    e(4, "desc.equipment.neck", "equipNeckBackground", 120),
    f(5, "desc.equipment.chest", "equipChestBackground", 136),
    g(6, "desc.equipment.arms", ""),
    h(7, "desc.equipment.leftHand", "equipLeftHandBackground", 103),
    i(8, "desc.equipment.rightHand", "equipRightHandBackground", 103),
    j(9, "desc.equipment.skirt", ""),
    k(10, "desc.equipment.belt", "equipBeltBackground", 133),
    l(11, "desc.equipment.trousers", ""),
    m(12, "desc.equipment.legs", "equipLegsBackground", 119),
    n(13, "desc.equipment.back", "equipBackBackground", 132),
    o(14, "", ""),
    p(15, "desc.equipment.firstWeapon", "equipFirstWeaponBackground", 100),
    q(16, "desc.equipment.secondWeapon", "equipSecondWeaponBackground", 100),
    r(17, "desc.equipment.accessory", "equipInsigneBackground", 646),
    s(18, "", ""),
    t(19, "", ""),
    u(20, "", ""),
    v(21, "", ""),
    w(22, "desc.equipment.pet", "equipPetBackground", 582),
    x(23, "desc.equipment.costume", "equipCostumeBackground"),
    y(24, "desc.equipment.mount", "equipMountBackground", 611);

    public static final List<exh_2> z;
    public final byte A;
    public final String B;
    public final String C;
    public final short D;

    private exh_2(int n2, String string2, String string3) {
        this(n2, string2, string3, -1);
    }

    private exh_2(int n2, String string2, String string3, int n3) {
        this.A = (byte)n2;
        this.B = string2;
        this.C = string3;
        this.D = (short)n3;
    }

    public byte a() {
        return this.A;
    }

    public short b() {
        return this.D;
    }

    public static byte c() {
        byte by = -1;
        for (exh_2 exh_22 : exh_2.values()) {
            if (exh_22.A <= by) continue;
            by = exh_22.A;
        }
        return (byte)(by + 1);
    }

    @Override
    public String d() {
        return this.toString();
    }

    @Override
    public String e() {
        return this.toString();
    }

    @Nullable
    public static exh_2 a(byte by) {
        for (exh_2 exh_22 : exh_2.values()) {
            if (exh_22.A != by) continue;
            return exh_22;
        }
        return null;
    }

    @Override
    public String f() {
        return this.e();
    }

    static {
        z = List.of(a, n, e, d, f, k, h, i, m, q, p, r, y, w);
    }
}

