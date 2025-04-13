/*
 * Decompiled with CFR 0.152.
 */
import java.util.Collections;

/*
 * Renamed from aPG
 */
public class apg_0
extends apq_0
implements ape_0 {
    private static final String g = "AreaZoneEffect";
    private static final String h = "AreaZoneAdditionalEffect";
    private static final apg_0 i = new apg_0();

    public static apg_0 a() {
        return i;
    }

    private apg_0() {
        super(null, null, g, anr_0.K, h, anr_0.L, null, null, null, null, null, null);
    }

    public void a(ekk_0 ekk_02, blx_1 blx_12) {
        this.a(Collections.singletonList(ekk_02), blx_12, new aff_1(ekk_02.G(), ekk_02.H(), ekk_02.I()));
    }

    public void a(ekk_0 ekk_02, blx_1 blx_12, aff_1 aff_12) {
        this.a(Collections.singletonList(ekk_02), blx_12, aff_12);
    }

    @Override
    protected aps_0 a(aff_1 aff_12, blx_1 blx_12) {
        return aps_0.e;
    }

    @Override
    public void b() {
    }
}

