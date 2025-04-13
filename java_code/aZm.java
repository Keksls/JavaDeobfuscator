/*
 * Decompiled with CFR 0.152.
 */
import com.ankamagames.wakfu.client.console.command.debug.HideEntitiesCommand;

public class aZm
implements aut_2 {
    final /* synthetic */ HideEntitiesCommand a;

    public aZm(HideEntitiesCommand hideEntitiesCommand) {
        this.a = hideEntitiesCommand;
    }

    @Override
    public boolean a(Object object) {
        if (!(object instanceof biI)) {
            return false;
        }
        blx_1 blx_12 = ((biI)object).bI();
        if ((HideEntitiesCommand.a & 1) == 1 && blx_12 instanceof bmv_1) {
            return true;
        }
        if ((HideEntitiesCommand.a & 2) == 2 && blx_12 instanceof bnh_1 && !blx_12.bo()) {
            return true;
        }
        return (HideEntitiesCommand.a & 4) == 4 && blx_12.bo();
    }
}

