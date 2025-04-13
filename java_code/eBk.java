/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.NotNull
 */
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;

public class eBk {
    private static final Logger b = Logger.getLogger(eBk.class);
    protected final eBt a;

    public eBk(@NotNull eBt eBt2) {
        this.a = eBt2;
    }

    public void a(long l) {
        this.a.c(l);
    }

    public void b(long l) {
        this.a.b(l);
    }

    public boolean a(String string) {
        if (!xu_0.a().a(string)) {
            return false;
        }
        if (string.equals(this.a.e())) {
            return false;
        }
        this.a.a(string);
        return true;
    }

    public boolean a(byte by, exq_2 exq_22, exk_2 exk_22) {
        boolean bl = false;
        try {
            exq_22.b(exk_22, by);
        }
        catch (uz_0 uz_02) {
            bl = true;
            b.error((Object)"Exception levee", (Throwable)uz_02);
        }
        catch (Uy uy) {
            bl = true;
            b.error((Object)"Exception levee", (Throwable)uy);
        }
        catch (uc_0 uc_02) {
            bl = true;
            b.error((Object)"Exception levee", (Throwable)uc_02);
        }
        if (bl) {
            ((TL)exq_22).b(exk_22);
            throw new eBn("Erreur lors de l'ajout de l'objet " + exk_22 + " \u00e0 la position donn\u00e9e " + by + " sur le companion " + this.a);
        }
        return bl;
    }

    public boolean a(@NotNull epq_2 epq_22, long l, @NotNull exg_2 exg_22, short s2) {
        exq_2 exq_22 = this.a.h();
        exk_2 exk_22 = (exk_2)exq_22.e(l);
        if (exk_22 == null) {
            throw new eBn("[Companion] Unknown item " + l + " to remove from companion equipment " + this.a);
        }
        if (!exg_22.b(exk_22, s2)) {
            throw new eBn("[Companion] Cannot add item " + exk_22 + " in bag " + exg_22 + " at position " + s2);
        }
        try {
            if (!((TL)exq_22).b(exk_22)) {
                throw new eBn("[COMPANION] Failed to remove item " + exk_22 + " from companion inventory " + this.a);
            }
            exg_22.c(exk_22, s2);
            ewd_1.a("FromCompanionEquipmentToInventory", ewf_1.a(this.a), ewf_1.a(epq_22), ewf_1.a((ts_0)exk_22, 1), ewf_1.f(epq_22.T_()));
        }
        catch (Uy | uc_0 | uz_0 ua_02) {
            b.fatal((Object)("[ITEM][COMPANION] We removed item " + exk_22 + " from inventory of companion " + this.a + " of account " + epq_22.U_() + ", but we cannot add it to player inventory. Item is lost. Item data: " + exk_22.aq()));
            throw new eBn("Error while adding item " + exk_22 + " at destination " + s2 + " in bag " + exg_22);
        }
        return true;
    }

    public String toString() {
        return "CompanionController{m_companionModel=" + this.a + "}";
    }

    protected boolean a() {
        return !this.a.i() && !eBC.a.b(this.a.a()) && this.a.h().m();
    }
}

