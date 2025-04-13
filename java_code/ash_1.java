/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from ash
 */
public final class ash_1
implements asg_1 {
    private static final Logger a = Logger.getLogger(ash_1.class);
    private static final ash_1 b = new ash_1();

    public static ash_1 a() {
        return b;
    }

    @Override
    public void a(arm_1 arm_12, String string) {
        a.info((Object)("Changement de workspace, synchronis\u00e9 sur : " + string));
    }

    @Override
    public void a(arm_1 arm_12, ars_1 ars_12) {
        a.info((Object)("Enregistrement d'une entr\u00e9e : type " + ars_12.f() + ", id " + ars_12.G()));
    }

    @Override
    public void b(arm_1 arm_12, ars_1 ars_12) {
        a.info((Object)("Suppresion de la don\u00e9ne : type " + ars_12.f() + ", id " + ars_12.G()));
    }

    @Override
    public void a(arm_1 arm_12) {
        a.info((Object)"Arret d'un binary storage");
    }

    @Override
    public void c(arm_1 arm_12, ars_1 ars_12) {
        a.info((Object)("Restauration d'une entr\u00e9e : type " + ars_12.f() + ", id " + ars_12.G()));
    }
}

