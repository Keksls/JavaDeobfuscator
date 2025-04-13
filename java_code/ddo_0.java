/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import org.apache.log4j.Logger;

/*
 * Renamed from ddo
 */
public class ddo_0
implements ahr_1 {
    protected static final Logger a = Logger.getLogger(ddo_0.class);
    public static final ddo_0 b = new ddo_0();
    private ans_1 c;
    private bqx_1 d;

    @Override
    public void a(aav_2 aav_22, boolean bl) {
        if (!bl) {
            this.c = string -> {
                if (string.equals("stuffPreviewDialog")) {
                    azu_0.j().b(b);
                }
            };
            fis_1.a().a("stuffPreview", this.d);
            fpm_0.b().a(this.c);
            fpm_0.b().a("stuffPreviewDialog", cfi_0.a("stuffPreviewDialog"), 131073L, (short)10000);
            cdw_0.n().c(600012L);
            fpm_0.b().a("wakfu.stuffPreview", cjq_0.class);
        }
    }

    @Override
    public void b(aav_2 aav_22, boolean bl) {
        if (!bl) {
            cjq_0.setDraggedItemId(-1L);
            fpm_0.b().b(this.c);
            fpm_0.b().o("stuffPreviewDialog");
            fis_1.a().a("stuffPreview");
            cdw_0.n().c(600013L);
            fpm_0.b().e("wakfu.stuffPreview");
        }
    }

    @Override
    public boolean a(adt_1 adt_12) {
        switch (adt_12.a()) {
            case 17410: {
                dgL dgL2 = (dgL)adt_12;
                this.a(dgL2.o(), dgL2.b());
                return false;
            }
            case 18791: {
                dgL dgL3 = (dgL)adt_12;
                this.a(dgL3);
                return false;
            }
        }
        return true;
    }

    public bqv_1 a() {
        return this.d;
    }

    private void a(exk_2 exk_22, byte by) {
        this.d.a(exk_22, by);
    }

    private void a(dgL dgL2) {
        this.d.b(dgL2.b());
    }

    @Override
    public long a_() {
        return 0L;
    }

    @Override
    public void a(long l) {
    }

    public void a(bjw_1 bjw_12) {
        exk_2 exk_22 = new exk_2();
        exk_22.b(bjw_12);
        exk_22.a((short)1);
        this.a(exk_22);
    }

    public void a(exk_2 exk_22) {
        this.a(exk_22, azu_0.j().k());
    }

    public void a(exk_2 exk_23, bmr_1 bmr_12) {
        eyw_1 eyw_12;
        if (!azu_0.j().c(this)) {
            this.d = new bqx_1();
            this.d.a(bmr_12, bmr_12.cG(), new exh_2[0]);
            azu_0.j().a(this);
        }
        if ((eyw_12 = exk_23.T().p()) instanceof bjn_1 && ((bjn_1)eyw_12).h() == ft_1.c) {
            this.d.a(exk_23.aT_());
        }
        exq_1<?> exq_12 = exk_23.T().F();
        if (eyw_12 == null || eyw_12.f() != eyx_1.u) {
            Arrays.stream(exq_12.h()).forEach(exh_22 -> this.a(exk_23, (exh_2)exh_22));
            this.d.a();
            return;
        }
        List<exk_2> list = null;
        eZo eZo2 = exk_23.ap();
        if (eZo2 != null) {
            list = eZo2.b();
        }
        short s2 = ((bjf_2)eyw_12).g();
        bhd_1 bhd_12 = bhe_0.a().a(s2);
        if (bhd_12 != null && list == null) {
            int[] nArray = bhd_12.k();
            list = Arrays.stream(nArray).mapToObj(n -> eyo_1.g().d(n)).map(exi_2::new).collect(Collectors.toList());
        }
        if (list != null) {
            list.forEach(exk_22 -> Arrays.stream(exk_22.U().h()).forEach(exh_22 -> this.a((exk_2)exk_22, (exh_2)exh_22)));
            this.d.a();
        }
    }

    public void a(exk_2 exk_22, exh_2 exh_22) {
        byte by = exh_22.a();
        this.d.b(exk_22, by);
    }
}

