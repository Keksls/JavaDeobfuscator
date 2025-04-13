/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from ciH
 */
final class cih_1
extends chd_1<ctl_2, bvw_2> {
    cih_1() {
    }

    @Override
    public boolean a(ctl_2 ctl_22) {
        String string;
        switch (ctl_22.b()) {
            case 3: {
                string = "fight.invitation.cancel.anotherInvitation";
                break;
            }
            case 7: {
                string = "fight.invitation.cancel.fightCreationImpossible";
                break;
            }
            case 4: {
                string = "fight.invitation.cancel.initiatorCancelled";
                break;
            }
            case 6: {
                string = "fight.invitation.cancel.initiatorNotAvailable";
                break;
            }
            case 5: {
                string = "fight.invitation.cancel.noPendingFight";
                break;
            }
            case 2: {
                string = "fight.invitation.cancel.playerNotFound";
                break;
            }
            case 1: {
                string = "fight.invitation.cancel.playerRefused";
                break;
            }
            case 0: {
                string = "fight.invitation.cancel.unknownError";
                break;
            }
            default: {
                return false;
            }
        }
        aUh.a(string, new Object[0]);
        return false;
    }
}

