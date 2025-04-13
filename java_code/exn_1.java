/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from eXn
 */
public abstract class exn_1<SourceInventoryType extends tr_0<exk_2>, TargetInventoryType extends tr_0<exk_2>>
implements tu_0<exk_2, SourceInventoryType, TargetInventoryType> {
    protected static final boolean b = false;
    public static final int c = -1;
    public static final int d = 0;
    public static final int e = 1;
    protected static final Logger f = Logger.getLogger(exn_1.class);

    protected boolean a(exk_2 exk_22, exq_2 exq_22, short s2) {
        boolean bl;
        try {
            bl = exq_22.b(exk_22, s2);
            if (exk_22.T().F().j() != null) {
                for (exh_2 exh_22 : exk_22.T().F().j()) {
                    exk_2 exk_23 = exk_22.t();
                    bl &= exq_22.b(exk_23, exh_22.a());
                }
            }
        }
        catch (uc_0 uc_02) {
            ((TL)exq_22).b(exk_22);
            for (exh_2 exh_23 : exk_22.T().F().j()) {
                exk_2 exk_24 = (exk_2)exq_22.b(exh_23.a());
                if (exk_24 == null) continue;
                exk_24.release();
            }
            return false;
        }
        return bl;
    }

    protected boolean a(exk_2 exk_22, exq_2 exq_22) {
        boolean bl = ((TL)exq_22).b(exk_22);
        if (exk_22.T().F().j() != null) {
            for (exh_2 exh_22 : exk_22.T().F().j()) {
                exk_2 exk_23 = (exk_2)exq_22.b(exh_22.a());
                if (exk_23 == null) continue;
                exk_23.release();
            }
        }
        return bl;
    }
}

