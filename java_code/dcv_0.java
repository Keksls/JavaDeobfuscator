/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from dcV
 */
public class dcv_0
implements ahr_1 {
    protected static final Logger a = Logger.getLogger(dcv_0.class);
    private static final dcv_0 b = new dcv_0();
    private ans_1 c;

    public static dcv_0 a() {
        return b;
    }

    @Override
    public void a(aav_2 aav_22, boolean bl) {
        if (!bl) {
            this.c = new dcw_0(this);
            fpm_0.b().a(this.c);
            fpm_0.b().a("slotMachineDialog", cfi_0.a("slotMachineDialog"), 17L, (short)10000);
            fpm_0.b().a("wakfu.slotMachine", cJC.class);
        }
    }

    @Override
    public void b(aav_2 aav_22, boolean bl) {
        if (!bl) {
            fpm_0.b().e("wakfu.slotMachine");
            fpm_0.b().b(this.c);
            if (fpm_0.b().q("slotMachineDialog")) {
                fpm_0.b().o("slotMachineDialog");
            }
        }
    }

    @Override
    public boolean a(adt_1 adt_12) {
        switch (adt_12.a()) {
            case 19126: {
                dfc dfc2 = (dfc)adt_12;
                return false;
            }
        }
        return true;
    }

    @Override
    public long a_() {
        return 12L;
    }

    @Override
    public void a(long l) {
    }
}

