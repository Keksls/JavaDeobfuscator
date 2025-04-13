/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from civ
 */
class civ_2 {
    private static final Logger a = Logger.getLogger(cie_1.class);

    civ_2() {
    }

    protected void a(emq_1 emq_12) {
        String string = null;
        switch (emq_12) {
            case F: {
                string = bae.h().a("fight.protector.already.ended", new Object[0]);
                break;
            }
            case G: {
                string = bae.h().a("attacked.protector.joinInFight", new Object[0]);
                break;
            }
            case H: {
                string = bae.h().a("attacked.protector.joinInFight", new Object[0]);
            }
        }
        if (string != null) {
            this.a(string);
        }
    }

    private void a(String string) {
        fpm_0.b().a(string, cfn_0.a(1), 3L, 102, 1);
    }

    protected void b(emq_1 emq_12) {
        aul_0.a().b(this.c(emq_12));
    }

    protected String c(emq_1 emq_12) {
        String string;
        switch (emq_12) {
            case k: {
                string = bae.h().a("fight.impossible.battleground.creation", new Object[0]);
                break;
            }
            case v: 
            case u: 
            case t: {
                string = bae.h().a("systemNotification.instanceConfig.cannotFight", new Object[0]);
                break;
            }
            case s: {
                string = bae.h().a("systemNotification.moderatedZone.cannotFight", new Object[0]);
                break;
            }
            case z: {
                string = bae.h().a("fight.creation.no.path.between.fighters", new Object[0]);
                break;
            }
            case e: 
            case r: {
                string = bae.h().a("fight.creation.target.busy", new Object[0]);
                break;
            }
            default: {
                string = bae.h().a("fight.creation.error", new Object[0]);
                a.info((Object)("Cr\u00e9ation du combat impossible : " + emq_12));
            }
        }
        return string;
    }
}

