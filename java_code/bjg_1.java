/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import java.util.Optional;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bJG
 */
public final class bjg_1
extends bjc_1 {
    @NotNull
    private final eBt d;
    @Nullable
    private ezi_1 e;

    public bjg_1(eBt eBt2) {
        this.d = eBt2;
        exq_2 exq_22 = eBt2.h();
        for (exh_2 exh_22 : eBj.d) {
            exk_2 exk_22 = (exk_2)exq_22.e(exh_22.A);
            if (exk_22 != null) {
                this.a(exh_22, new bja_1(exh_22, exk_22));
                continue;
            }
            this.a(exh_22, new bja_1(exh_22));
        }
        this.c();
        this.a();
    }

    @Override
    public boolean a(long l) {
        return this.d.h().d(l);
    }

    @Override
    public void c() {
        Optional<ezi_1> optional = eBx.a(this.d);
        if (optional.isPresent()) {
            eZh.a(optional.get().a()).a().forEach((exh_22, n) -> {
                this.a((exh_2)exh_22).a(eBx.a(exh_22, n));
                fis_1.a().a((ajf_1)this.a((exh_2)exh_22), "item", "containerStyle");
            });
            this.e = optional.get();
        } else if (this.e != null) {
            eZh.a(this.e.a()).a().forEach((exh_22, n) -> {
                exk_2 exk_22 = this.a((exh_2)exh_22).h();
                if (exk_22 != null && exk_22.aT_() == n.intValue()) {
                    this.a((exh_2)exh_22).a(null);
                    fis_1.a().a((ajf_1)this.a((exh_2)exh_22), "item", "containerStyle");
                }
            });
            this.e = null;
        }
    }
}

