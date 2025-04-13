/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from bJf
 */
public class bjf_2
extends big_1 {
    private static final Logger a = Logger.getLogger(bjf_2.class);
    private short g;

    public bjf_2(int n) {
        super(n);
    }

    @Override
    public void a(String[] stringArray) {
        this.g = Short.parseShort(stringArray[0]);
    }

    @Override
    public boolean a(exk_2 exk_22) {
        bmr_1 bmr_12 = (bmr_1)euu_2.c(azu_0.j().k().U_(), exk_22.a());
        if (bmr_12.da().i(exk_22.a()) == null) {
            a.error((Object)"[ItemAction] On essaye de lancer une action avec un item qui n'est pas dans les bags");
            return false;
        }
        bhd_1 bhd_12 = bhe_0.a().a(this.g);
        if (bhd_12 == null) {
            a.warn((Object)("[ItemAction] SplitItemSetItemAction : la panoplie est inexistante id=" + this.g));
            return false;
        }
        eyb_1 eyb_12 = eya_2.a((epq_2)bmr_12, (exo_2<? extends ezr_0>)bhd_12, exk_22);
        switch (eyb_12) {
            case a: {
                this.a(exk_22.a());
                break;
            }
            case c: {
                aUh.a("error.impossibleDuringExchange", new Object[0]);
                return false;
            }
            case b: {
                aUh.a("error.itemSetSplit.notEnoughSpaceInInventory", new Object[0]);
                return false;
            }
        }
        return true;
    }

    @Override
    public void c() {
    }

    public short g() {
        return this.g;
    }

    @Override
    public eyx_1 f() {
        return eyx_1.u;
    }
}

