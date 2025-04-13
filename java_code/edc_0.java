/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import java.util.ArrayList;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from eDC
 */
public class edc_0
extends eDq<Sm<efh_0>> {
    private final ezr_0 k;
    private final exk_2 l;
    private final boolean m;

    public edc_0(ezr_0 ezr_02, exk_2 exk_22, eDx eDx2) {
        this(ezr_02, exk_22, exk_22 != null ? exk_22.c() : ezr_02.G(), eDx2);
    }

    public edc_0(ezr_0 ezr_02, exk_2 exk_22, short s2, eDx eDx2) {
        super(eDx2.a(ezr_02, exk_22), 0, s2, true, null, null, eDx2.b(), 0);
        this.k = ezr_02;
        this.l = exk_22;
        this.m = eDx2.a();
    }

    @Override
    public void a(@NotNull ArrayList<String> arrayList) {
    }

    @Override
    public String a(@NotNull String string, @NotNull efh_0 efh_02) {
        if (this.m && efh_02.L() || !this.m && !efh_02.L()) {
            return "";
        }
        return string;
    }

    public exk_2 m() {
        return this.l;
    }
}

